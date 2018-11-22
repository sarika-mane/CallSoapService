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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSLoginResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSLoginResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UserLocked" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MustChangePwd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SessionGuid" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="IsLoginSucceeded" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MaxLoginCountExceeded" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsAdminMbrUser" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MbrCrrCode" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="MbrCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BranchId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ResponseMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastLoginTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastLoginDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Roles" type="{Smartsoft.Integration.Services}ArrayOfLong" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSLoginResponse", propOrder = {
    "userLocked",
    "mustChangePwd",
    "sessionGuid",
    "isLoginSucceeded",
    "maxLoginCountExceeded",
    "isAdminMbrUser",
    "mbrCrrCode",
    "mbrCountryCode",
    "branchId",
    "responseMessage",
    "lastLoginTime",
    "lastLoginDate",
    "roles"
})
public class WSLoginResponse {

    @XmlElement(name = "UserLocked")
    protected boolean userLocked;
    @XmlElement(name = "MustChangePwd")
    protected boolean mustChangePwd;
    @XmlElement(name = "SessionGuid")
    protected long sessionGuid;
    @XmlElement(name = "IsLoginSucceeded")
    protected boolean isLoginSucceeded;
    @XmlElement(name = "MaxLoginCountExceeded")
    protected boolean maxLoginCountExceeded;
    @XmlElement(name = "IsAdminMbrUser")
    protected boolean isAdminMbrUser;
    @XmlElement(name = "MbrCrrCode")
    protected short mbrCrrCode;
    @XmlElement(name = "MbrCountryCode")
    protected String mbrCountryCode;
    @XmlElement(name = "BranchId")
    protected int branchId;
    @XmlElement(name = "ResponseMessage")
    protected String responseMessage;
    @XmlElement(name = "LastLoginTime")
    protected String lastLoginTime;
    @XmlElement(name = "LastLoginDate")
    protected String lastLoginDate;
    @XmlElement(name = "Roles")
    protected ArrayOfLong roles;

    /**
     * Gets the value of the userLocked property.
     * 
     */
    public boolean isUserLocked() {
        return userLocked;
    }

    /**
     * Sets the value of the userLocked property.
     * 
     */
    public void setUserLocked(boolean value) {
        this.userLocked = value;
    }

    /**
     * Gets the value of the mustChangePwd property.
     * 
     */
    public boolean isMustChangePwd() {
        return mustChangePwd;
    }

    /**
     * Sets the value of the mustChangePwd property.
     * 
     */
    public void setMustChangePwd(boolean value) {
        this.mustChangePwd = value;
    }

    /**
     * Gets the value of the sessionGuid property.
     * 
     */
    public long getSessionGuid() {
        return sessionGuid;
    }

    /**
     * Sets the value of the sessionGuid property.
     * 
     */
    public void setSessionGuid(long value) {
        this.sessionGuid = value;
    }

    /**
     * Gets the value of the isLoginSucceeded property.
     * 
     */
    public boolean isIsLoginSucceeded() {
        return isLoginSucceeded;
    }

    /**
     * Sets the value of the isLoginSucceeded property.
     * 
     */
    public void setIsLoginSucceeded(boolean value) {
        this.isLoginSucceeded = value;
    }

    /**
     * Gets the value of the maxLoginCountExceeded property.
     * 
     */
    public boolean isMaxLoginCountExceeded() {
        return maxLoginCountExceeded;
    }

    /**
     * Sets the value of the maxLoginCountExceeded property.
     * 
     */
    public void setMaxLoginCountExceeded(boolean value) {
        this.maxLoginCountExceeded = value;
    }

    /**
     * Gets the value of the isAdminMbrUser property.
     * 
     */
    public boolean isIsAdminMbrUser() {
        return isAdminMbrUser;
    }

    /**
     * Sets the value of the isAdminMbrUser property.
     * 
     */
    public void setIsAdminMbrUser(boolean value) {
        this.isAdminMbrUser = value;
    }

    /**
     * Gets the value of the mbrCrrCode property.
     * 
     */
    public short getMbrCrrCode() {
        return mbrCrrCode;
    }

    /**
     * Sets the value of the mbrCrrCode property.
     * 
     */
    public void setMbrCrrCode(short value) {
        this.mbrCrrCode = value;
    }

    /**
     * Gets the value of the mbrCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMbrCountryCode() {
        return mbrCountryCode;
    }

    /**
     * Sets the value of the mbrCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMbrCountryCode(String value) {
        this.mbrCountryCode = value;
    }

    /**
     * Gets the value of the branchId property.
     * 
     */
    public int getBranchId() {
        return branchId;
    }

    /**
     * Sets the value of the branchId property.
     * 
     */
    public void setBranchId(int value) {
        this.branchId = value;
    }

    /**
     * Gets the value of the responseMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseMessage() {
        return responseMessage;
    }

    /**
     * Sets the value of the responseMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseMessage(String value) {
        this.responseMessage = value;
    }

    /**
     * Gets the value of the lastLoginTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * Sets the value of the lastLoginTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastLoginTime(String value) {
        this.lastLoginTime = value;
    }

    /**
     * Gets the value of the lastLoginDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastLoginDate() {
        return lastLoginDate;
    }

    /**
     * Sets the value of the lastLoginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastLoginDate(String value) {
        this.lastLoginDate = value;
    }

    /**
     * Gets the value of the roles property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLong }
     *     
     */
    public ArrayOfLong getRoles() {
        return roles;
    }

    /**
     * Sets the value of the roles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLong }
     *     
     */
    public void setRoles(ArrayOfLong value) {
        this.roles = value;
    }

}
