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
 *         &lt;element name="GetCustomerGroupsResult" type="{Smartsoft.Integration.Services}GetCustomerGroupListResponse" minOccurs="0"/&gt;
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
    "getCustomerGroupsResult"
})
@XmlRootElement(name = "GetCustomerGroupsResponse")
public class GetCustomerGroupsResponse {

    @XmlElement(name = "GetCustomerGroupsResult")
    protected GetCustomerGroupListResponse getCustomerGroupsResult;

    /**
     * Gets the value of the getCustomerGroupsResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetCustomerGroupListResponse }
     *     
     */
    public GetCustomerGroupListResponse getGetCustomerGroupsResult() {
        return getCustomerGroupsResult;
    }

    /**
     * Sets the value of the getCustomerGroupsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCustomerGroupListResponse }
     *     
     */
    public void setGetCustomerGroupsResult(GetCustomerGroupListResponse value) {
        this.getCustomerGroupsResult = value;
    }

}
