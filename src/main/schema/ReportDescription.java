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
 * <p>Java class for reportDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reportDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="reportSuiteID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateFrom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateGranularity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="metrics" type="{http://marketing.adobe.com/analytics/2015/04/16}report" maxOccurs="unbounded"/>
 *         &lt;element name="sortBy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="elements" type="{http://marketing.adobe.com/analytics/2015/04/16}report" maxOccurs="unbounded"/>
 *         &lt;element name="segments" type="{http://marketing.adobe.com/analytics/2015/04/16}report" maxOccurs="unbounded"/>
 *         &lt;element name="locale" type="{http://marketing.adobe.com/analytics/2015/04/16}reportDescriptionLocale"/>
 *         &lt;element name="currentData" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="anomalyDetection" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="expedite" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="elementDataEncoding" type="{http://marketing.adobe.com/analytics/2015/04/16}reportDescriptionElementDataEncoding"/>
 *         &lt;element name="sortMethod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="source" type="{http://marketing.adobe.com/analytics/2015/04/16}reportDescriptionSource"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reportDescription", propOrder = {

})
public class ReportDescription {

    @XmlElement(required = true, nillable = true)
    protected String reportSuiteID;
    @XmlElement(required = true, nillable = true)
    protected String date;
    @XmlElement(required = true, nillable = true)
    protected String dateFrom;
    @XmlElement(required = true, nillable = true)
    protected String dateTo;
    @XmlElement(required = true, nillable = true)
    protected String dateGranularity;
    @XmlElement(required = true, nillable = true)
    protected List<Report> metrics;
    @XmlElement(required = true, nillable = true)
    protected String sortBy;
    @XmlElement(required = true, nillable = true)
    protected List<Report> elements;
    @XmlElement(required = true, nillable = true)
    protected List<Report> segments;
    @XmlElement(required = true, nillable = true)
    protected ReportDescriptionLocale locale;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean currentData;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean anomalyDetection;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean expedite;
    @XmlElement(required = true, nillable = true)
    protected ReportDescriptionElementDataEncoding elementDataEncoding;
    @XmlElement(required = true, nillable = true)
    protected String sortMethod;
    @XmlElement(required = true, nillable = true)
    protected ReportDescriptionSource source;

    /**
     * Gets the value of the reportSuiteID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportSuiteID() {
        return reportSuiteID;
    }

    /**
     * Sets the value of the reportSuiteID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportSuiteID(String value) {
        this.reportSuiteID = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the dateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFrom() {
        return dateFrom;
    }

    /**
     * Sets the value of the dateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFrom(String value) {
        this.dateFrom = value;
    }

    /**
     * Gets the value of the dateTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTo() {
        return dateTo;
    }

    /**
     * Sets the value of the dateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTo(String value) {
        this.dateTo = value;
    }

    /**
     * Gets the value of the dateGranularity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateGranularity() {
        return dateGranularity;
    }

    /**
     * Sets the value of the dateGranularity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateGranularity(String value) {
        this.dateGranularity = value;
    }

    /**
     * Gets the value of the metrics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metrics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetrics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Report }
     * 
     * 
     */
    public List<Report> getMetrics() {
        if (metrics == null) {
            metrics = new ArrayList<Report>();
        }
        return this.metrics;
    }

    /**
     * Gets the value of the sortBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortBy() {
        return sortBy;
    }

    /**
     * Sets the value of the sortBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortBy(String value) {
        this.sortBy = value;
    }

    /**
     * Gets the value of the elements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Report }
     * 
     * 
     */
    public List<Report> getElements() {
        if (elements == null) {
            elements = new ArrayList<Report>();
        }
        return this.elements;
    }

    /**
     * Gets the value of the segments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Report }
     * 
     * 
     */
    public List<Report> getSegments() {
        if (segments == null) {
            segments = new ArrayList<Report>();
        }
        return this.segments;
    }

    /**
     * Gets the value of the locale property.
     * 
     * @return
     *     possible object is
     *     {@link ReportDescriptionLocale }
     *     
     */
    public ReportDescriptionLocale getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportDescriptionLocale }
     *     
     */
    public void setLocale(ReportDescriptionLocale value) {
        this.locale = value;
    }

    /**
     * Gets the value of the currentData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCurrentData() {
        return currentData;
    }

    /**
     * Sets the value of the currentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCurrentData(Boolean value) {
        this.currentData = value;
    }

    /**
     * Gets the value of the anomalyDetection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnomalyDetection() {
        return anomalyDetection;
    }

    /**
     * Sets the value of the anomalyDetection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnomalyDetection(Boolean value) {
        this.anomalyDetection = value;
    }

    /**
     * Gets the value of the expedite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpedite() {
        return expedite;
    }

    /**
     * Sets the value of the expedite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpedite(Boolean value) {
        this.expedite = value;
    }

    /**
     * Gets the value of the elementDataEncoding property.
     * 
     * @return
     *     possible object is
     *     {@link ReportDescriptionElementDataEncoding }
     *     
     */
    public ReportDescriptionElementDataEncoding getElementDataEncoding() {
        return elementDataEncoding;
    }

    /**
     * Sets the value of the elementDataEncoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportDescriptionElementDataEncoding }
     *     
     */
    public void setElementDataEncoding(ReportDescriptionElementDataEncoding value) {
        this.elementDataEncoding = value;
    }

    /**
     * Gets the value of the sortMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortMethod() {
        return sortMethod;
    }

    /**
     * Sets the value of the sortMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortMethod(String value) {
        this.sortMethod = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link ReportDescriptionSource }
     *     
     */
    public ReportDescriptionSource getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportDescriptionSource }
     *     
     */
    public void setSource(ReportDescriptionSource value) {
        this.source = value;
    }

}
