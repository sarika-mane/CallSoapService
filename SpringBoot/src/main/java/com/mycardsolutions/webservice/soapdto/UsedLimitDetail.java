//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.21 at 09:26:50 PM IST 
//


package com.mycardsolutions.webservice.soapdto;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UsedLimitDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UsedLimitDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LimitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UsedDailyAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="UsedWeeklyAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="UsedMonthlyAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="UsedYearlyAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="UsedDailyCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="UsedWeeklyCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="UsedMonthlyCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="UsedYearlyCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsedLimitDetail", propOrder = {
    "limitType",
    "usedDailyAmount",
    "usedWeeklyAmount",
    "usedMonthlyAmount",
    "usedYearlyAmount",
    "usedDailyCount",
    "usedWeeklyCount",
    "usedMonthlyCount",
    "usedYearlyCount"
})
public class UsedLimitDetail {

    @XmlElement(name = "LimitType")
    protected String limitType;
    @XmlElement(name = "UsedDailyAmount", required = true)
    protected BigDecimal usedDailyAmount;
    @XmlElement(name = "UsedWeeklyAmount", required = true)
    protected BigDecimal usedWeeklyAmount;
    @XmlElement(name = "UsedMonthlyAmount", required = true)
    protected BigDecimal usedMonthlyAmount;
    @XmlElement(name = "UsedYearlyAmount", required = true)
    protected BigDecimal usedYearlyAmount;
    @XmlElement(name = "UsedDailyCount")
    protected int usedDailyCount;
    @XmlElement(name = "UsedWeeklyCount")
    protected int usedWeeklyCount;
    @XmlElement(name = "UsedMonthlyCount")
    protected int usedMonthlyCount;
    @XmlElement(name = "UsedYearlyCount")
    protected int usedYearlyCount;

    /**
     * Gets the value of the limitType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitType() {
        return limitType;
    }

    /**
     * Sets the value of the limitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitType(String value) {
        this.limitType = value;
    }

    /**
     * Gets the value of the usedDailyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUsedDailyAmount() {
        return usedDailyAmount;
    }

    /**
     * Sets the value of the usedDailyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUsedDailyAmount(BigDecimal value) {
        this.usedDailyAmount = value;
    }

    /**
     * Gets the value of the usedWeeklyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUsedWeeklyAmount() {
        return usedWeeklyAmount;
    }

    /**
     * Sets the value of the usedWeeklyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUsedWeeklyAmount(BigDecimal value) {
        this.usedWeeklyAmount = value;
    }

    /**
     * Gets the value of the usedMonthlyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUsedMonthlyAmount() {
        return usedMonthlyAmount;
    }

    /**
     * Sets the value of the usedMonthlyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUsedMonthlyAmount(BigDecimal value) {
        this.usedMonthlyAmount = value;
    }

    /**
     * Gets the value of the usedYearlyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUsedYearlyAmount() {
        return usedYearlyAmount;
    }

    /**
     * Sets the value of the usedYearlyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUsedYearlyAmount(BigDecimal value) {
        this.usedYearlyAmount = value;
    }

    /**
     * Gets the value of the usedDailyCount property.
     * 
     */
    public int getUsedDailyCount() {
        return usedDailyCount;
    }

    /**
     * Sets the value of the usedDailyCount property.
     * 
     */
    public void setUsedDailyCount(int value) {
        this.usedDailyCount = value;
    }

    /**
     * Gets the value of the usedWeeklyCount property.
     * 
     */
    public int getUsedWeeklyCount() {
        return usedWeeklyCount;
    }

    /**
     * Sets the value of the usedWeeklyCount property.
     * 
     */
    public void setUsedWeeklyCount(int value) {
        this.usedWeeklyCount = value;
    }

    /**
     * Gets the value of the usedMonthlyCount property.
     * 
     */
    public int getUsedMonthlyCount() {
        return usedMonthlyCount;
    }

    /**
     * Sets the value of the usedMonthlyCount property.
     * 
     */
    public void setUsedMonthlyCount(int value) {
        this.usedMonthlyCount = value;
    }

    /**
     * Gets the value of the usedYearlyCount property.
     * 
     */
    public int getUsedYearlyCount() {
        return usedYearlyCount;
    }

    /**
     * Sets the value of the usedYearlyCount property.
     * 
     */
    public void setUsedYearlyCount(int value) {
        this.usedYearlyCount = value;
    }

}
