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
 * <p>Java class for GetCustomerCardsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCustomerCardsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{Smartsoft.Integration.Services}ServiceResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerCardList" type="{Smartsoft.Integration.Services}ArrayOfCustomerCardList" minOccurs="0"/&gt;
 *         &lt;element name="CustomerNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BankingCustomerNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MobileNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustomerCardsResponse", propOrder = {
    "customerCardList",
    "customerNo",
    "bankingCustomerNo",
    "mobileNo"
})
public class GetCustomerCardsResponse
    extends ServiceResponse
{

    @XmlElement(name = "CustomerCardList")
    protected ArrayOfCustomerCardList customerCardList;
    @XmlElement(name = "CustomerNo")
    protected String customerNo;
    @XmlElement(name = "BankingCustomerNo")
    protected String bankingCustomerNo;
    @XmlElement(name = "MobileNo")
    protected String mobileNo;

    /**
     * Gets the value of the customerCardList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCustomerCardList }
     *     
     */
    public ArrayOfCustomerCardList getCustomerCardList() {
        return customerCardList;
    }

    /**
     * Sets the value of the customerCardList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCustomerCardList }
     *     
     */
    public void setCustomerCardList(ArrayOfCustomerCardList value) {
        this.customerCardList = value;
    }

    /**
     * Gets the value of the customerNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerNo() {
        return customerNo;
    }

    /**
     * Sets the value of the customerNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerNo(String value) {
        this.customerNo = value;
    }

    /**
     * Gets the value of the bankingCustomerNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankingCustomerNo() {
        return bankingCustomerNo;
    }

    /**
     * Sets the value of the bankingCustomerNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankingCustomerNo(String value) {
        this.bankingCustomerNo = value;
    }

    /**
     * Gets the value of the mobileNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileNo() {
        return mobileNo;
    }

    /**
     * Sets the value of the mobileNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileNo(String value) {
        this.mobileNo = value;
    }

}
