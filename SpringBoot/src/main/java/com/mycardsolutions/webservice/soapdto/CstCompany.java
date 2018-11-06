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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CstCompany complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CstCompany"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{Smartsoft.Integration.Services}SWDbObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GUID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="MbrId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AnnualCardFeeFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CompanyBankingCustomerNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompanyLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompanyNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MainCompanyNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContactPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InsertDatetime" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="InsertUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IssuingCardFeeFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsAllowedPayWithPoint" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsAllowedVirtualCardCreate" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="RestrictionProfileId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RestrictionWorkingType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SystemEntryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UpdateDateTime" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="UpdateUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsMasterBranch" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="LimitProfileId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MasterBranchId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="CompanyTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompanyBrandName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdentityNo" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="TaxOffice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TaxNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FirmClassId" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="SodexhoRegionId" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="NBranchCount" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="FAccBlackList" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="FFirmBlockage" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="FHead" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="CityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StatCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CstCompany", propOrder = {
    "guid",
    "status",
    "lastUpdated",
    "mbrId",
    "annualCardFeeFlag",
    "companyBankingCustomerNo",
    "companyLevel",
    "companyName",
    "companyNo",
    "mainCompanyNo",
    "contactPerson",
    "insertDatetime",
    "insertUser",
    "issuingCardFeeFlag",
    "isAllowedPayWithPoint",
    "isAllowedVirtualCardCreate",
    "restrictionProfileId",
    "restrictionWorkingType",
    "systemEntryType",
    "updateDateTime",
    "updateUser",
    "isActive",
    "isMasterBranch",
    "limitProfileId",
    "masterBranchId",
    "companyTitle",
    "companyBrandName",
    "identityNo",
    "taxOffice",
    "taxNo",
    "countryCode",
    "firmClassId",
    "sodexhoRegionId",
    "nBranchCount",
    "fAccBlackList",
    "fFirmBlockage",
    "fHead",
    "cityCode",
    "statCode"
})
public class CstCompany
    extends SWDbObject
{

    @XmlElement(name = "GUID")
    protected long guid;
    @XmlElement(name = "Status")
    protected short status;
    @XmlElement(name = "LastUpdated")
    protected long lastUpdated;
    @XmlElement(name = "MbrId")
    protected int mbrId;
    @XmlElement(name = "AnnualCardFeeFlag")
    protected boolean annualCardFeeFlag;
    @XmlElement(name = "CompanyBankingCustomerNo")
    protected String companyBankingCustomerNo;
    @XmlElement(name = "CompanyLevel")
    protected String companyLevel;
    @XmlElement(name = "CompanyName")
    protected String companyName;
    @XmlElement(name = "CompanyNo")
    protected String companyNo;
    @XmlElement(name = "MainCompanyNo")
    protected String mainCompanyNo;
    @XmlElement(name = "ContactPerson")
    protected String contactPerson;
    @XmlElement(name = "InsertDatetime")
    protected long insertDatetime;
    @XmlElement(name = "InsertUser")
    protected String insertUser;
    @XmlElement(name = "IssuingCardFeeFlag")
    protected boolean issuingCardFeeFlag;
    @XmlElement(name = "IsAllowedPayWithPoint")
    protected boolean isAllowedPayWithPoint;
    @XmlElement(name = "IsAllowedVirtualCardCreate")
    protected boolean isAllowedVirtualCardCreate;
    @XmlElement(name = "RestrictionProfileId")
    protected int restrictionProfileId;
    @XmlElement(name = "RestrictionWorkingType")
    protected int restrictionWorkingType;
    @XmlElement(name = "SystemEntryType")
    protected String systemEntryType;
    @XmlElement(name = "UpdateDateTime")
    protected long updateDateTime;
    @XmlElement(name = "UpdateUser")
    protected String updateUser;
    @XmlElement(name = "IsActive")
    protected boolean isActive;
    @XmlElement(name = "IsMasterBranch")
    protected boolean isMasterBranch;
    @XmlElement(name = "LimitProfileId")
    protected int limitProfileId;
    @XmlElement(name = "MasterBranchId", required = true, type = Long.class, nillable = true)
    protected Long masterBranchId;
    @XmlElement(name = "CompanyTitle")
    protected String companyTitle;
    @XmlElement(name = "CompanyBrandName")
    protected String companyBrandName;
    @XmlElement(name = "IdentityNo", required = true, type = Long.class, nillable = true)
    protected Long identityNo;
    @XmlElement(name = "TaxOffice")
    protected String taxOffice;
    @XmlElement(name = "TaxNo")
    protected String taxNo;
    @XmlElement(name = "CountryCode")
    protected String countryCode;
    @XmlElement(name = "FirmClassId")
    protected short firmClassId;
    @XmlElement(name = "SodexhoRegionId")
    protected short sodexhoRegionId;
    @XmlElement(name = "NBranchCount", required = true, type = Short.class, nillable = true)
    protected Short nBranchCount;
    @XmlElement(name = "FAccBlackList", required = true, type = Short.class, nillable = true)
    protected Short fAccBlackList;
    @XmlElement(name = "FFirmBlockage", required = true, type = Short.class, nillable = true)
    protected Short fFirmBlockage;
    @XmlElement(name = "FHead", required = true, type = Short.class, nillable = true)
    protected Short fHead;
    @XmlElement(name = "CityCode")
    protected String cityCode;
    @XmlElement(name = "StatCode")
    protected String statCode;

    /**
     * Gets the value of the guid property.
     * 
     */
    public long getGUID() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     */
    public void setGUID(long value) {
        this.guid = value;
    }

    /**
     * Gets the value of the status property.
     * 
     */
    public short getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     */
    public void setStatus(short value) {
        this.status = value;
    }

    /**
     * Gets the value of the lastUpdated property.
     * 
     */
    public long getLastUpdated() {
        return lastUpdated;
    }

    /**
     * Sets the value of the lastUpdated property.
     * 
     */
    public void setLastUpdated(long value) {
        this.lastUpdated = value;
    }

    /**
     * Gets the value of the mbrId property.
     * 
     */
    public int getMbrId() {
        return mbrId;
    }

    /**
     * Sets the value of the mbrId property.
     * 
     */
    public void setMbrId(int value) {
        this.mbrId = value;
    }

    /**
     * Gets the value of the annualCardFeeFlag property.
     * 
     */
    public boolean isAnnualCardFeeFlag() {
        return annualCardFeeFlag;
    }

    /**
     * Sets the value of the annualCardFeeFlag property.
     * 
     */
    public void setAnnualCardFeeFlag(boolean value) {
        this.annualCardFeeFlag = value;
    }

    /**
     * Gets the value of the companyBankingCustomerNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyBankingCustomerNo() {
        return companyBankingCustomerNo;
    }

    /**
     * Sets the value of the companyBankingCustomerNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyBankingCustomerNo(String value) {
        this.companyBankingCustomerNo = value;
    }

    /**
     * Gets the value of the companyLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyLevel() {
        return companyLevel;
    }

    /**
     * Sets the value of the companyLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyLevel(String value) {
        this.companyLevel = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the companyNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyNo() {
        return companyNo;
    }

    /**
     * Sets the value of the companyNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyNo(String value) {
        this.companyNo = value;
    }

    /**
     * Gets the value of the mainCompanyNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainCompanyNo() {
        return mainCompanyNo;
    }

    /**
     * Sets the value of the mainCompanyNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainCompanyNo(String value) {
        this.mainCompanyNo = value;
    }

    /**
     * Gets the value of the contactPerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPerson() {
        return contactPerson;
    }

    /**
     * Sets the value of the contactPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPerson(String value) {
        this.contactPerson = value;
    }

    /**
     * Gets the value of the insertDatetime property.
     * 
     */
    public long getInsertDatetime() {
        return insertDatetime;
    }

    /**
     * Sets the value of the insertDatetime property.
     * 
     */
    public void setInsertDatetime(long value) {
        this.insertDatetime = value;
    }

    /**
     * Gets the value of the insertUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsertUser() {
        return insertUser;
    }

    /**
     * Sets the value of the insertUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsertUser(String value) {
        this.insertUser = value;
    }

    /**
     * Gets the value of the issuingCardFeeFlag property.
     * 
     */
    public boolean isIssuingCardFeeFlag() {
        return issuingCardFeeFlag;
    }

    /**
     * Sets the value of the issuingCardFeeFlag property.
     * 
     */
    public void setIssuingCardFeeFlag(boolean value) {
        this.issuingCardFeeFlag = value;
    }

    /**
     * Gets the value of the isAllowedPayWithPoint property.
     * 
     */
    public boolean isIsAllowedPayWithPoint() {
        return isAllowedPayWithPoint;
    }

    /**
     * Sets the value of the isAllowedPayWithPoint property.
     * 
     */
    public void setIsAllowedPayWithPoint(boolean value) {
        this.isAllowedPayWithPoint = value;
    }

    /**
     * Gets the value of the isAllowedVirtualCardCreate property.
     * 
     */
    public boolean isIsAllowedVirtualCardCreate() {
        return isAllowedVirtualCardCreate;
    }

    /**
     * Sets the value of the isAllowedVirtualCardCreate property.
     * 
     */
    public void setIsAllowedVirtualCardCreate(boolean value) {
        this.isAllowedVirtualCardCreate = value;
    }

    /**
     * Gets the value of the restrictionProfileId property.
     * 
     */
    public int getRestrictionProfileId() {
        return restrictionProfileId;
    }

    /**
     * Sets the value of the restrictionProfileId property.
     * 
     */
    public void setRestrictionProfileId(int value) {
        this.restrictionProfileId = value;
    }

    /**
     * Gets the value of the restrictionWorkingType property.
     * 
     */
    public int getRestrictionWorkingType() {
        return restrictionWorkingType;
    }

    /**
     * Sets the value of the restrictionWorkingType property.
     * 
     */
    public void setRestrictionWorkingType(int value) {
        this.restrictionWorkingType = value;
    }

    /**
     * Gets the value of the systemEntryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemEntryType() {
        return systemEntryType;
    }

    /**
     * Sets the value of the systemEntryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemEntryType(String value) {
        this.systemEntryType = value;
    }

    /**
     * Gets the value of the updateDateTime property.
     * 
     */
    public long getUpdateDateTime() {
        return updateDateTime;
    }

    /**
     * Sets the value of the updateDateTime property.
     * 
     */
    public void setUpdateDateTime(long value) {
        this.updateDateTime = value;
    }

    /**
     * Gets the value of the updateUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * Sets the value of the updateUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateUser(String value) {
        this.updateUser = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     */
    public boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     */
    public void setIsActive(boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the isMasterBranch property.
     * 
     */
    public boolean isIsMasterBranch() {
        return isMasterBranch;
    }

    /**
     * Sets the value of the isMasterBranch property.
     * 
     */
    public void setIsMasterBranch(boolean value) {
        this.isMasterBranch = value;
    }

    /**
     * Gets the value of the limitProfileId property.
     * 
     */
    public int getLimitProfileId() {
        return limitProfileId;
    }

    /**
     * Sets the value of the limitProfileId property.
     * 
     */
    public void setLimitProfileId(int value) {
        this.limitProfileId = value;
    }

    /**
     * Gets the value of the masterBranchId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMasterBranchId() {
        return masterBranchId;
    }

    /**
     * Sets the value of the masterBranchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMasterBranchId(Long value) {
        this.masterBranchId = value;
    }

    /**
     * Gets the value of the companyTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyTitle() {
        return companyTitle;
    }

    /**
     * Sets the value of the companyTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyTitle(String value) {
        this.companyTitle = value;
    }

    /**
     * Gets the value of the companyBrandName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyBrandName() {
        return companyBrandName;
    }

    /**
     * Sets the value of the companyBrandName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyBrandName(String value) {
        this.companyBrandName = value;
    }

    /**
     * Gets the value of the identityNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdentityNo() {
        return identityNo;
    }

    /**
     * Sets the value of the identityNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdentityNo(Long value) {
        this.identityNo = value;
    }

    /**
     * Gets the value of the taxOffice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxOffice() {
        return taxOffice;
    }

    /**
     * Sets the value of the taxOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxOffice(String value) {
        this.taxOffice = value;
    }

    /**
     * Gets the value of the taxNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxNo() {
        return taxNo;
    }

    /**
     * Sets the value of the taxNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxNo(String value) {
        this.taxNo = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the firmClassId property.
     * 
     */
    public short getFirmClassId() {
        return firmClassId;
    }

    /**
     * Sets the value of the firmClassId property.
     * 
     */
    public void setFirmClassId(short value) {
        this.firmClassId = value;
    }

    /**
     * Gets the value of the sodexhoRegionId property.
     * 
     */
    public short getSodexhoRegionId() {
        return sodexhoRegionId;
    }

    /**
     * Sets the value of the sodexhoRegionId property.
     * 
     */
    public void setSodexhoRegionId(short value) {
        this.sodexhoRegionId = value;
    }

    /**
     * Gets the value of the nBranchCount property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNBranchCount() {
        return nBranchCount;
    }

    /**
     * Sets the value of the nBranchCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNBranchCount(Short value) {
        this.nBranchCount = value;
    }

    /**
     * Gets the value of the fAccBlackList property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getFAccBlackList() {
        return fAccBlackList;
    }

    /**
     * Sets the value of the fAccBlackList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setFAccBlackList(Short value) {
        this.fAccBlackList = value;
    }

    /**
     * Gets the value of the fFirmBlockage property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getFFirmBlockage() {
        return fFirmBlockage;
    }

    /**
     * Sets the value of the fFirmBlockage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setFFirmBlockage(Short value) {
        this.fFirmBlockage = value;
    }

    /**
     * Gets the value of the fHead property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getFHead() {
        return fHead;
    }

    /**
     * Sets the value of the fHead property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setFHead(Short value) {
        this.fHead = value;
    }

    /**
     * Gets the value of the cityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * Sets the value of the cityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityCode(String value) {
        this.cityCode = value;
    }

    /**
     * Gets the value of the statCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatCode() {
        return statCode;
    }

    /**
     * Sets the value of the statCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatCode(String value) {
        this.statCode = value;
    }

}
