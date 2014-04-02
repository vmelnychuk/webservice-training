package org.training.wk.nbrbservice.client;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import by.nbrb.ExRates;
import by.nbrb.ExRatesDailyResponse.ExRatesDailyResult;
import by.nbrb.ExRatesSoap;

public class NbrbClient {
	public static void main(String[] args) {
		NbrbClient client = new NbrbClient("USD");
		System.out.println(client.getCurrentExRate());
	}
	public NbrbClient(String currencyName) {
		URL wsdlURL = ExRates.WSDL_LOCATION;
		GregorianCalendar today = new GregorianCalendar();
		ExRates ss = new ExRates(wsdlURL, SERVICE_NAME);
		ExRatesSoap port = ss.getExRatesSoap();
		javax.xml.datatype.XMLGregorianCalendar exRatesonDate;
		String exrateValue = null;
		try {
			exRatesonDate = DatatypeFactory
					.newInstance().newXMLGregorianCalendar(today);
			ExRatesDailyResult exRatesDailyResult = port
					.exRatesDaily(exRatesonDate);
			Object obj = exRatesDailyResult.getAny();
			Node node = ((Node) obj).getOwnerDocument();
			String xml = documentToString(node);
			try {
				exrateValue = getCurrencyValue(xml, currencyName);
			} catch (SAXException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ParserConfigurationException e) {
				e.printStackTrace();
			}
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		this.exRate = exrateValue;
	}

	private String exRate;
	
	public String getCurrentExRate() {
		return exRate;
	}

	private static final QName SERVICE_NAME = new QName("http://www.nbrb.by/",
			"ExRates");

	protected static String documentToString(final Node doc) {
		try {
			StringWriter sw = new StringWriter();
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer transformer = tf.newTransformer();
			transformer
					.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
			transformer.setOutputProperty(OutputKeys.METHOD, "xml");
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");

			transformer.transform(new DOMSource(doc), new StreamResult(sw));
			return sw.toString();
		} catch (Exception ex) {
			throw new RuntimeException("Error converting to String", ex);
		}
	}

	public static String getCurrencyValue(String xmlContent,
			String currencyName) throws SAXException, IOException,
			ParserConfigurationException {
		String result = null;
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(new InputSource(new StringReader(
				xmlContent)));
		doc.getDocumentElement().normalize();
		NodeList nodes = doc.getElementsByTagName("DailyExRatesOnDate");

		for (int i = 0; i < nodes.getLength(); i++) {
			Node node = nodes.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				String currentCurrency = element.getElementsByTagName("Cur_Abbreviation").item(0).getTextContent();
				if (currentCurrency.equals(currencyName)){
					result = element.getElementsByTagName("Cur_OfficialRate").item(0).getTextContent();
					break;
				}
			}
		}
		return result;
	}
}
