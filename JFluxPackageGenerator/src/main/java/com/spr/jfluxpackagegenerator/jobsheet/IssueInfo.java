//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.03 at 05:30:01 PM MSK 
//


package com.spr.jfluxpackagegenerator.jobsheet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}IssueIDStart"/>
 *         &lt;element ref="{}IssueIDEnd"/>
 *         &lt;element ref="{}IssueTitle"/>
 *         &lt;element ref="{}IssueArticleCount"/>
 *         &lt;element ref="{}IssueHistory"/>
 *         &lt;element ref="{}IssueCopyright"/>
 *       &lt;/sequence>
 *       &lt;attribute name="IssueType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="OutputMedium" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TocLevels" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "issueIDStart",
    "issueIDEnd",
    "issueTitle",
    "issueArticleCount",
    "issueHistory",
    "issueCopyright"
})
@XmlRootElement(name = "IssueInfo")
public class IssueInfo {

    @XmlElement(name = "IssueIDStart", required = true)
    protected String issueIDStart;
    @XmlElement(name = "IssueIDEnd", required = true)
    protected String issueIDEnd;
    @XmlElement(name = "IssueTitle", required = true)
    protected IssueTitle issueTitle;
    @XmlElement(name = "IssueArticleCount", required = true)
    protected String issueArticleCount;
    @XmlElement(name = "IssueHistory", required = true)
    protected IssueHistory issueHistory;
    @XmlElement(name = "IssueCopyright", required = true)
    protected IssueCopyright issueCopyright;
    @XmlAttribute(name = "IssueType", required = true)
    protected String issueType;
    @XmlAttribute(name = "OutputMedium", required = true)
    protected String outputMedium;
    @XmlAttribute(name = "TocLevels", required = true)
    protected String tocLevels;

    /**
     * Gets the value of the issueIDStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueIDStart() {
        return issueIDStart;
    }

    /**
     * Sets the value of the issueIDStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueIDStart(String value) {
        this.issueIDStart = value;
    }

    /**
     * Gets the value of the issueIDEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueIDEnd() {
        return issueIDEnd;
    }

    /**
     * Sets the value of the issueIDEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueIDEnd(String value) {
        this.issueIDEnd = value;
    }

    /**
     * Gets the value of the issueTitle property.
     * 
     * @return
     *     possible object is
     *     {@link IssueTitle }
     *     
     */
    public IssueTitle getIssueTitle() {
        return issueTitle;
    }

    /**
     * Sets the value of the issueTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueTitle }
     *     
     */
    public void setIssueTitle(IssueTitle value) {
        this.issueTitle = value;
    }

    /**
     * Gets the value of the issueArticleCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueArticleCount() {
        return issueArticleCount;
    }

    /**
     * Sets the value of the issueArticleCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueArticleCount(String value) {
        this.issueArticleCount = value;
    }

    /**
     * Gets the value of the issueHistory property.
     * 
     * @return
     *     possible object is
     *     {@link IssueHistory }
     *     
     */
    public IssueHistory getIssueHistory() {
        return issueHistory;
    }

    /**
     * Sets the value of the issueHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueHistory }
     *     
     */
    public void setIssueHistory(IssueHistory value) {
        this.issueHistory = value;
    }

    /**
     * Gets the value of the issueCopyright property.
     * 
     * @return
     *     possible object is
     *     {@link IssueCopyright }
     *     
     */
    public IssueCopyright getIssueCopyright() {
        return issueCopyright;
    }

    /**
     * Sets the value of the issueCopyright property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueCopyright }
     *     
     */
    public void setIssueCopyright(IssueCopyright value) {
        this.issueCopyright = value;
    }

    /**
     * Gets the value of the issueType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueType() {
        return issueType;
    }

    /**
     * Sets the value of the issueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueType(String value) {
        this.issueType = value;
    }

    /**
     * Gets the value of the outputMedium property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputMedium() {
        return outputMedium;
    }

    /**
     * Sets the value of the outputMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputMedium(String value) {
        this.outputMedium = value;
    }

    /**
     * Gets the value of the tocLevels property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTocLevels() {
        return tocLevels;
    }

    /**
     * Sets the value of the tocLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTocLevels(String value) {
        this.tocLevels = value;
    }

}
