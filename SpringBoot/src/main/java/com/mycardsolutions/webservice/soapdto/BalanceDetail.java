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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BalanceDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalHostBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="TotalChipBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceDetail", propOrder = {
    "totalHostBalance",
    "totalChipBalance",
    "currencyCode"
})
public class BalanceDetail {

    @XmlElement(name = "TotalHostBalance", required = true)
    protected BigDecimal totalHostBalance;
    @XmlElement(name = "TotalChipBalance", required = true)
    protected BigDecimal totalChipBalance;
    @XmlElement(name = "CurrencyCode")
    protected short currencyCode;

    /**
     * Gets the value of the totalHostBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalHostBalance() {
        return totalHostBalance;
    }

    /**
     * Sets the value of the totalHostBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalHostBalance(BigDecimal value) {
        this.totalHostBalance = value;
    }

    /**
     * Gets the value of the totalChipBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalChipBalance() {
        return totalChipBalance;
    }

    /**
     * Sets the value of the totalChipBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalChipBalance(BigDecimal value) {
        this.totalChipBalance = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     */
    public short getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     */
    public void setCurrencyCode(short value) {
        this.currencyCode = value;
    }

}
