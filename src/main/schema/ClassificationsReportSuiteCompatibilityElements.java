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
 * <p>Java class for classifications_report_suite_compatibility_elements complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="classifications_report_suite_compatibility_elements">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="rsid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="site_title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="compatibility_elements" type="{http://marketing.adobe.com/analytics/2015/04/16}classifications_compatibility_element" maxOccurs="unbounded"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "classifications_report_suite_compatibility_elements", propOrder = {

})
public class ClassificationsReportSuiteCompatibilityElements {

    @XmlElement(required = true)
    protected String rsid;
    @XmlElement(name = "site_title", required = true)
    protected String siteTitle;
    @XmlElement(name = "compatibility_elements", required = true)
    protected List<ClassificationsCompatibilityElement> compatibilityElements;

    /**
     * Gets the value of the rsid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsid() {
        return rsid;
    }

    /**
     * Sets the value of the rsid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsid(String value) {
        this.rsid = value;
    }

    /**
     * Gets the value of the siteTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteTitle() {
        return siteTitle;
    }

    /**
     * Sets the value of the siteTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteTitle(String value) {
        this.siteTitle = value;
    }

    /**
     * Gets the value of the compatibilityElements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compatibilityElements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompatibilityElements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificationsCompatibilityElement }
     * 
     * 
     */
    public List<ClassificationsCompatibilityElement> getCompatibilityElements() {
        if (compatibilityElements == null) {
            compatibilityElements = new ArrayList<ClassificationsCompatibilityElement>();
        }
        return this.compatibilityElements;
    }

}