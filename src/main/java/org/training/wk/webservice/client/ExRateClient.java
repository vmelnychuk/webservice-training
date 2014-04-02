package org.training.wk.webservice.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.training.wk.webservice.service.ExRateService;
import org.training.wk.webservice.service.GenericException;

public class ExRateClient {
	public static void main(String args[]) {
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

		factory.setServiceClass(ExRateService.class);
		factory.setAddress("http://localhost:8080/exrateservice-0.1/exratesoap?wsdl");
		factory.getInInterceptors().add(new LoggingInInterceptor());
		factory.getOutInterceptors().add(new LoggingOutInterceptor());
		System.out.print("Enter currency abbr: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String userCurrency = null;
		try {
			userCurrency = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		ExRateService client = (ExRateService) factory.create();
		String exRateValue = null;
		try {
			exRateValue = client.getExRate(userCurrency);
		} catch (GenericException e) {
			System.out.println("oh! we had trouble");
			e.getMessage();
		}
		System.out.println(userCurrency + " : " + exRateValue);
	}
}