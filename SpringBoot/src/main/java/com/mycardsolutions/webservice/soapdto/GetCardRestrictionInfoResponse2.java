//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.29 at 09:00:37 AM IST 
//


package com.mycardsolutions.webservice.soapdto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCardRestrictionInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCardRestrictionInfoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{Smartsoft.Integration.Services}ServiceResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CardRestrictionInfoList" type="{Smartsoft.Integration.Services}ArrayOfGetCardRestrictionInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCardRestrictionInfoResponse", propOrder = {
    "cardRestrictionInfoList"
})
public class GetCardRestrictionInfoResponse2
    extends ServiceResponse
{

    @XmlElement(name = "CardRestrictionInfoList")
    protected ArrayOfGetCardRestrictionInfo cardRestrictionInfoList;

    /**
     * Gets the value of the cardRestrictionInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGetCardRestrictionInfo }
     *     
     */
    public ArrayOfGetCardRestrictionInfo getCardRestrictionInfoList() {
        return cardRestrictionInfoList;
    }

    /**
     * Sets the value of the cardRestrictionInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGetCardRestrictionInfo }
     *     
     */
    public void setCardRestrictionInfoList(ArrayOfGetCardRestrictionInfo value) {
        this.cardRestrictionInfoList = value;
    }

}
