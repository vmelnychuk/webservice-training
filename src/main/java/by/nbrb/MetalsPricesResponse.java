
package by.nbrb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MetalsPricesResult" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any minOccurs="2"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "metalsPricesResult"
})
@XmlRootElement(name = "MetalsPricesResponse")
public class MetalsPricesResponse {

    @XmlElement(name = "MetalsPricesResult")
    protected MetalsPricesResponse.MetalsPricesResult metalsPricesResult;

    /**
     * Gets the value of the metalsPricesResult property.
     * 
     * @return
     *     possible object is
     *     {@link MetalsPricesResponse.MetalsPricesResult }
     *     
     */
    public MetalsPricesResponse.MetalsPricesResult getMetalsPricesResult() {
        return metalsPricesResult;
    }

    /**
     * Sets the value of the metalsPricesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetalsPricesResponse.MetalsPricesResult }
     *     
     */
    public void setMetalsPricesResult(MetalsPricesResponse.MetalsPricesResult value) {
        this.metalsPricesResult = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;any minOccurs="2"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class MetalsPricesResult {

        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * Gets the value of the any property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

    }

}
