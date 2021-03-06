//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.08 at 11:03:57 AM CEST 
//


package com.adobe.analytics.domain;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deliveryParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deliveryParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="emailTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="emailFrom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="publishingList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="emailSubject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="emailNotes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ftpHost" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ftpUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ftpPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ftpPort" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ftpPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="locale" type="{http://marketing.adobe.com/analytics/2015/04/16}reportDefinitionLocale"/>
 *         &lt;element name="fileFormat" type="{http://marketing.adobe.com/analytics/2015/04/16}scheduleFileFormat"/>
 *         &lt;element name="deliveryType" type="{http://marketing.adobe.com/analytics/2015/04/16}scheduleDeliveryType"/>
 *         &lt;element name="isCompressed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hideUnsubscribe" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deliveryParameters", propOrder = {

})
public class DeliveryParameters {

    @XmlElement(required = true)
    protected String emailTo;
    @XmlElement(required = true)
    protected String emailFrom;
    @XmlElement(required = true)
    protected List<String> publishingList;
    @XmlElement(required = true)
    protected String emailSubject;
    @XmlElement(required = true)
    protected String emailNotes;
    @XmlElement(required = true)
    protected String ftpHost;
    @XmlElement(required = true)
    protected String ftpUser;
    @XmlElement(required = true)
    protected String ftpPassword;
    @XmlElement(required = true)
    protected String ftpPort;
    @XmlElement(required = true)
    protected String ftpPath;
    @XmlElement(required = true)
    protected ReportDefinitionLocale locale;
    @XmlElement(required = true)
    protected ScheduleFileFormat fileFormat;
    @XmlElement(required = true)
    protected ScheduleDeliveryType deliveryType;
    protected boolean isCompressed;
    protected boolean hideUnsubscribe;

    /**
     * Gets the value of the emailTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailTo() {
        return emailTo;
    }

    /**
     * Sets the value of the emailTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailTo(String value) {
        this.emailTo = value;
    }

    /**
     * Gets the value of the emailFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailFrom() {
        return emailFrom;
    }

    /**
     * Sets the value of the emailFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailFrom(String value) {
        this.emailFrom = value;
    }

    /**
     * Gets the value of the publishingList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publishingList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublishingList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPublishingList() {
        if (publishingList == null) {
            publishingList = new ArrayList<String>();
        }
        return this.publishingList;
    }

    /**
     * Gets the value of the emailSubject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailSubject() {
        return emailSubject;
    }

    /**
     * Sets the value of the emailSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailSubject(String value) {
        this.emailSubject = value;
    }

    /**
     * Gets the value of the emailNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailNotes() {
        return emailNotes;
    }

    /**
     * Sets the value of the emailNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailNotes(String value) {
        this.emailNotes = value;
    }

    /**
     * Gets the value of the ftpHost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFtpHost() {
        return ftpHost;
    }

    /**
     * Sets the value of the ftpHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFtpHost(String value) {
        this.ftpHost = value;
    }

    /**
     * Gets the value of the ftpUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFtpUser() {
        return ftpUser;
    }

    /**
     * Sets the value of the ftpUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFtpUser(String value) {
        this.ftpUser = value;
    }

    /**
     * Gets the value of the ftpPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFtpPassword() {
        return ftpPassword;
    }

    /**
     * Sets the value of the ftpPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFtpPassword(String value) {
        this.ftpPassword = value;
    }

    /**
     * Gets the value of the ftpPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFtpPort() {
        return ftpPort;
    }

    /**
     * Sets the value of the ftpPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFtpPort(String value) {
        this.ftpPort = value;
    }

    /**
     * Gets the value of the ftpPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFtpPath() {
        return ftpPath;
    }

    /**
     * Sets the value of the ftpPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFtpPath(String value) {
        this.ftpPath = value;
    }

    /**
     * Gets the value of the locale property.
     * 
     * @return
     *     possible object is
     *     {@link ReportDefinitionLocale }
     *     
     */
    public ReportDefinitionLocale getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportDefinitionLocale }
     *     
     */
    public void setLocale(ReportDefinitionLocale value) {
        this.locale = value;
    }

    /**
     * Gets the value of the fileFormat property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleFileFormat }
     *     
     */
    public ScheduleFileFormat getFileFormat() {
        return fileFormat;
    }

    /**
     * Sets the value of the fileFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleFileFormat }
     *     
     */
    public void setFileFormat(ScheduleFileFormat value) {
        this.fileFormat = value;
    }

    /**
     * Gets the value of the deliveryType property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleDeliveryType }
     *     
     */
    public ScheduleDeliveryType getDeliveryType() {
        return deliveryType;
    }

    /**
     * Sets the value of the deliveryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleDeliveryType }
     *     
     */
    public void setDeliveryType(ScheduleDeliveryType value) {
        this.deliveryType = value;
    }

    /**
     * Gets the value of the isCompressed property.
     * 
     */
    public boolean isIsCompressed() {
        return isCompressed;
    }

    /**
     * Sets the value of the isCompressed property.
     * 
     */
    public void setIsCompressed(boolean value) {
        this.isCompressed = value;
    }

    /**
     * Gets the value of the hideUnsubscribe property.
     * 
     */
    public boolean isHideUnsubscribe() {
        return hideUnsubscribe;
    }

    /**
     * Sets the value of the hideUnsubscribe property.
     * 
     */
    public void setHideUnsubscribe(boolean value) {
        this.hideUnsubscribe = value;
    }

}
