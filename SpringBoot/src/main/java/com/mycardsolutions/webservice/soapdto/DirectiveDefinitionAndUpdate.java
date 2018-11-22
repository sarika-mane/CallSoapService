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
 *         &lt;element name="CardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BarcodeNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DirectiveUseFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DirectiveType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DirectiveDebitAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DirectiveCreditCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DirectiveHostAmount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="DirectiveMinHostAmount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="DirectiveOfflineAmount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="DirectiveMinOfflineAmount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
    "cardNo",
    "barcodeNo",
    "directiveUseFlag",
    "directiveType",
    "directiveDebitAccount",
    "directiveCreditCardNo",
    "directiveHostAmount",
    "directiveMinHostAmount",
    "directiveOfflineAmount",
    "directiveMinOfflineAmount"
})
@XmlRootElement(name = "DirectiveDefinitionAndUpdate")
public class DirectiveDefinitionAndUpdate {

    @XmlElement(name = "CardNo")
    protected String cardNo;
    @XmlElement(name = "BarcodeNo")
    protected String barcodeNo;
    @XmlElement(name = "DirectiveUseFlag")
    protected String directiveUseFlag;
    @XmlElement(name = "DirectiveType")
    protected String directiveType;
    @XmlElement(name = "DirectiveDebitAccount")
    protected String directiveDebitAccount;
    @XmlElement(name = "DirectiveCreditCardNo")
    protected String directiveCreditCardNo;
    @XmlElement(name = "DirectiveHostAmount", required = true, type = Long.class, nillable = true)
    protected Long directiveHostAmount;
    @XmlElement(name = "DirectiveMinHostAmount", required = true, type = Long.class, nillable = true)
    protected Long directiveMinHostAmount;
    @XmlElement(name = "DirectiveOfflineAmount", required = true, type = Long.class, nillable = true)
    protected Long directiveOfflineAmount;
    @XmlElement(name = "DirectiveMinOfflineAmount", required = true, type = Long.class, nillable = true)
    protected Long directiveMinOfflineAmount;

    /**
     * Gets the value of the cardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * Sets the value of the cardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNo(String value) {
        this.cardNo = value;
    }

    /**
     * Gets the value of the barcodeNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarcodeNo() {
        return barcodeNo;
    }

    /**
     * Sets the value of the barcodeNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarcodeNo(String value) {
        this.barcodeNo = value;
    }

    /**
     * Gets the value of the directiveUseFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectiveUseFlag() {
        return directiveUseFlag;
    }

    /**
     * Sets the value of the directiveUseFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectiveUseFlag(String value) {
        this.directiveUseFlag = value;
    }

    /**
     * Gets the value of the directiveType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectiveType() {
        return directiveType;
    }

    /**
     * Sets the value of the directiveType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectiveType(String value) {
        this.directiveType = value;
    }

    /**
     * Gets the value of the directiveDebitAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectiveDebitAccount() {
        return directiveDebitAccount;
    }

    /**
     * Sets the value of the directiveDebitAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectiveDebitAccount(String value) {
        this.directiveDebitAccount = value;
    }

    /**
     * Gets the value of the directiveCreditCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectiveCreditCardNo() {
        return directiveCreditCardNo;
    }

    /**
     * Sets the value of the directiveCreditCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectiveCreditCardNo(String value) {
        this.directiveCreditCardNo = value;
    }

    /**
     * Gets the value of the directiveHostAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDirectiveHostAmount() {
        return directiveHostAmount;
    }

    /**
     * Sets the value of the directiveHostAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDirectiveHostAmount(Long value) {
        this.directiveHostAmount = value;
    }

    /**
     * Gets the value of the directiveMinHostAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDirectiveMinHostAmount() {
        return directiveMinHostAmount;
    }

    /**
     * Sets the value of the directiveMinHostAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDirectiveMinHostAmount(Long value) {
        this.directiveMinHostAmount = value;
    }

    /**
     * Gets the value of the directiveOfflineAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDirectiveOfflineAmount() {
        return directiveOfflineAmount;
    }

    /**
     * Sets the value of the directiveOfflineAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDirectiveOfflineAmount(Long value) {
        this.directiveOfflineAmount = value;
    }

    /**
     * Gets the value of the directiveMinOfflineAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDirectiveMinOfflineAmount() {
        return directiveMinOfflineAmount;
    }

    /**
     * Sets the value of the directiveMinOfflineAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDirectiveMinOfflineAmount(Long value) {
        this.directiveMinOfflineAmount = value;
    }

}
