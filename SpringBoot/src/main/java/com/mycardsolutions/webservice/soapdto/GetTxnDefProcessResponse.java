//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.02 at 10:11:22 AM IST 
//


package com.mycardsolutions.webservice.soapdto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetTxnDefProcessResult" type="{Smartsoft.Integration.Services}GetTxnDefResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getTxnDefProcessResult"
})
@XmlRootElement(name = "GetTxnDefProcessResponse")
public class GetTxnDefProcessResponse {

    @XmlElement(name = "GetTxnDefProcessResult")
    protected GetTxnDefResponse getTxnDefProcessResult;

    /**
     * Gets the value of the getTxnDefProcessResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetTxnDefResponse }
     *     
     */
    public GetTxnDefResponse getGetTxnDefProcessResult() {
        return getTxnDefProcessResult;
    }

    /**
     * Sets the value of the getTxnDefProcessResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTxnDefResponse }
     *     
     */
    public void setGetTxnDefProcessResult(GetTxnDefResponse value) {
        this.getTxnDefProcessResult = value;
    }

}
