//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.02 at 10:11:22 AM IST 
//


package com.mycardsolutions.webservice.soapdto;

import java.math.BigDecimal;
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
 *         &lt;element name="sourceCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="destinationCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sourceBarcodeNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="destinationBarcodeNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transferAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="insertChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProfileCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "sourceCardNo",
    "destinationCardNo",
    "sourceBarcodeNo",
    "destinationBarcodeNo",
    "transferAmount",
    "insertChannel",
    "profileCode"
})
@XmlRootElement(name = "BalanceTransferOnlyHost")
public class BalanceTransferOnlyHost {

    protected String sourceCardNo;
    protected String destinationCardNo;
    protected String sourceBarcodeNo;
    protected String destinationBarcodeNo;
    @XmlElement(required = true)
    protected BigDecimal transferAmount;
    protected String insertChannel;
    @XmlElement(name = "ProfileCode")
    protected String profileCode;

    /**
     * Gets the value of the sourceCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceCardNo() {
        return sourceCardNo;
    }

    /**
     * Sets the value of the sourceCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceCardNo(String value) {
        this.sourceCardNo = value;
    }

    /**
     * Gets the value of the destinationCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCardNo() {
        return destinationCardNo;
    }

    /**
     * Sets the value of the destinationCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCardNo(String value) {
        this.destinationCardNo = value;
    }

    /**
     * Gets the value of the sourceBarcodeNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceBarcodeNo() {
        return sourceBarcodeNo;
    }

    /**
     * Sets the value of the sourceBarcodeNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceBarcodeNo(String value) {
        this.sourceBarcodeNo = value;
    }

    /**
     * Gets the value of the destinationBarcodeNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationBarcodeNo() {
        return destinationBarcodeNo;
    }

    /**
     * Sets the value of the destinationBarcodeNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationBarcodeNo(String value) {
        this.destinationBarcodeNo = value;
    }

    /**
     * Gets the value of the transferAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTransferAmount() {
        return transferAmount;
    }

    /**
     * Sets the value of the transferAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTransferAmount(BigDecimal value) {
        this.transferAmount = value;
    }

    /**
     * Gets the value of the insertChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsertChannel() {
        return insertChannel;
    }

    /**
     * Sets the value of the insertChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsertChannel(String value) {
        this.insertChannel = value;
    }

    /**
     * Gets the value of the profileCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileCode() {
        return profileCode;
    }

    /**
     * Sets the value of the profileCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileCode(String value) {
        this.profileCode = value;
    }

}
