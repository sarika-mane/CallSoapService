//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.29 at 09:00:37 AM IST 
//


package com.mycardsolutions.webservice.soapdto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCardTxnFeeProfileInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCardTxnFeeProfileInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CardTxnFeeProfileInfo" type="{Smartsoft.Integration.Services}CardTxnFeeProfileInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCardTxnFeeProfileInfo", propOrder = {
    "cardTxnFeeProfileInfo"
})
public class ArrayOfCardTxnFeeProfileInfo {

    @XmlElement(name = "CardTxnFeeProfileInfo", nillable = true)
    protected List<CardTxnFeeProfileInfo> cardTxnFeeProfileInfo;

    /**
     * Gets the value of the cardTxnFeeProfileInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardTxnFeeProfileInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardTxnFeeProfileInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardTxnFeeProfileInfo }
     * 
     * 
     */
    public List<CardTxnFeeProfileInfo> getCardTxnFeeProfileInfo() {
        if (cardTxnFeeProfileInfo == null) {
            cardTxnFeeProfileInfo = new ArrayList<CardTxnFeeProfileInfo>();
        }
        return this.cardTxnFeeProfileInfo;
    }

}
