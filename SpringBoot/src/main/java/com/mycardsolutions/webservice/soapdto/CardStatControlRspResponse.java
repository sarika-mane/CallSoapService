//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.21 at 09:26:50 PM IST 
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
 *         &lt;element name="CardStatControlRspResult" type="{Smartsoft.Integration.Services}CardStatControlResponse" minOccurs="0"/&gt;
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
    "cardStatControlRspResult"
})
@XmlRootElement(name = "CardStatControlRspResponse")
public class CardStatControlRspResponse {

    @XmlElement(name = "CardStatControlRspResult")
    protected CardStatControlResponse cardStatControlRspResult;

    /**
     * Gets the value of the cardStatControlRspResult property.
     * 
     * @return
     *     possible object is
     *     {@link CardStatControlResponse }
     *     
     */
    public CardStatControlResponse getCardStatControlRspResult() {
        return cardStatControlRspResult;
    }

    /**
     * Sets the value of the cardStatControlRspResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardStatControlResponse }
     *     
     */
    public void setCardStatControlRspResult(CardStatControlResponse value) {
        this.cardStatControlRspResult = value;
    }

}
