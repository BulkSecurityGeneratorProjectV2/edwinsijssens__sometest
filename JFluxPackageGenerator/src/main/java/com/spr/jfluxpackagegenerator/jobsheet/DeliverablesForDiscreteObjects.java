//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.12 at 07:28:45 PM MSK 
//


package com.spr.jfluxpackagegenerator.jobsheet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="XMLWithBody" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="XMLWithBodyRefsOnly" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="OnlinePDF" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PrintPDF" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="eBookPDF" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TEX" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="OnlineMediaObjects" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PrintMediaObjects" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ReferencePDF" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AuthorFeedbackPDF" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DeltaPDF" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CopyrightTransfer" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="OpenAccessStatement" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="OffprintOrder" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Pit-Stop-Reports" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PRS-Metadata" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Manuscript" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EpsilonPDF" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CorrectionSheet" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PeerReviewPDFs" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "DeliverablesForDiscreteObjects")
public class DeliverablesForDiscreteObjects {

    @XmlAttribute(name = "XMLWithBody", required = true)
    protected String xmlWithBody;
    @XmlAttribute(name = "XMLWithBodyRefsOnly", required = true)
    protected String xmlWithBodyRefsOnly;
    @XmlAttribute(name = "OnlinePDF", required = true)
    protected String onlinePDF;
    @XmlAttribute(name = "PrintPDF", required = true)
    protected String printPDF;
    @XmlAttribute(name = "eBookPDF", required = true)
    protected String eBookPDF;
    @XmlAttribute(name = "TEX", required = true)
    protected String tex;
    @XmlAttribute(name = "OnlineMediaObjects", required = true)
    protected String onlineMediaObjects;
    @XmlAttribute(name = "PrintMediaObjects", required = true)
    protected String printMediaObjects;
    @XmlAttribute(name = "ReferencePDF", required = true)
    protected String referencePDF;
    @XmlAttribute(name = "AuthorFeedbackPDF", required = true)
    protected String authorFeedbackPDF;
    @XmlAttribute(name = "DeltaPDF", required = true)
    protected String deltaPDF;
    @XmlAttribute(name = "CopyrightTransfer", required = true)
    protected String copyrightTransfer;
    @XmlAttribute(name = "OpenAccessStatement", required = true)
    protected String openAccessStatement;
    @XmlAttribute(name = "OffprintOrder", required = true)
    protected String offprintOrder;
    @XmlAttribute(name = "Pit-Stop-Reports", required = true)
    protected String pitStopReports;
    @XmlAttribute(name = "PRS-Metadata", required = true)
    protected String prsMetadata;
    @XmlAttribute(name = "Manuscript", required = true)
    protected String manuscript;
    @XmlAttribute(name = "EpsilonPDF", required = true)
    protected String epsilonPDF;
    @XmlAttribute(name = "CorrectionSheet", required = true)
    protected String correctionSheet;
    @XmlAttribute(name = "PeerReviewPDFs", required = true)
    protected String peerReviewPDFs;

    /**
     * Gets the value of the xmlWithBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMLWithBody() {
        return xmlWithBody;
    }

    /**
     * Sets the value of the xmlWithBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMLWithBody(String value) {
        this.xmlWithBody = value;
    }

    /**
     * Gets the value of the xmlWithBodyRefsOnly property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMLWithBodyRefsOnly() {
        return xmlWithBodyRefsOnly;
    }

    /**
     * Sets the value of the xmlWithBodyRefsOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMLWithBodyRefsOnly(String value) {
        this.xmlWithBodyRefsOnly = value;
    }

    /**
     * Gets the value of the onlinePDF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnlinePDF() {
        return onlinePDF;
    }

    /**
     * Sets the value of the onlinePDF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnlinePDF(String value) {
        this.onlinePDF = value;
    }

    /**
     * Gets the value of the printPDF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintPDF() {
        return printPDF;
    }

    /**
     * Sets the value of the printPDF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintPDF(String value) {
        this.printPDF = value;
    }

    /**
     * Gets the value of the eBookPDF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEBookPDF() {
        return eBookPDF;
    }

    /**
     * Sets the value of the eBookPDF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEBookPDF(String value) {
        this.eBookPDF = value;
    }

    /**
     * Gets the value of the tex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEX() {
        return tex;
    }

    /**
     * Sets the value of the tex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEX(String value) {
        this.tex = value;
    }

    /**
     * Gets the value of the onlineMediaObjects property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnlineMediaObjects() {
        return onlineMediaObjects;
    }

    /**
     * Sets the value of the onlineMediaObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnlineMediaObjects(String value) {
        this.onlineMediaObjects = value;
    }

    /**
     * Gets the value of the printMediaObjects property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintMediaObjects() {
        return printMediaObjects;
    }

    /**
     * Sets the value of the printMediaObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintMediaObjects(String value) {
        this.printMediaObjects = value;
    }

    /**
     * Gets the value of the referencePDF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencePDF() {
        return referencePDF;
    }

    /**
     * Sets the value of the referencePDF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencePDF(String value) {
        this.referencePDF = value;
    }

    /**
     * Gets the value of the authorFeedbackPDF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorFeedbackPDF() {
        return authorFeedbackPDF;
    }

    /**
     * Sets the value of the authorFeedbackPDF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorFeedbackPDF(String value) {
        this.authorFeedbackPDF = value;
    }

    /**
     * Gets the value of the deltaPDF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeltaPDF() {
        return deltaPDF;
    }

    /**
     * Sets the value of the deltaPDF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeltaPDF(String value) {
        this.deltaPDF = value;
    }

    /**
     * Gets the value of the copyrightTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyrightTransfer() {
        return copyrightTransfer;
    }

    /**
     * Sets the value of the copyrightTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyrightTransfer(String value) {
        this.copyrightTransfer = value;
    }

    /**
     * Gets the value of the openAccessStatement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenAccessStatement() {
        return openAccessStatement;
    }

    /**
     * Sets the value of the openAccessStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenAccessStatement(String value) {
        this.openAccessStatement = value;
    }

    /**
     * Gets the value of the offprintOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffprintOrder() {
        return offprintOrder;
    }

    /**
     * Sets the value of the offprintOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffprintOrder(String value) {
        this.offprintOrder = value;
    }

    /**
     * Gets the value of the pitStopReports property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPitStopReports() {
        return pitStopReports;
    }

    /**
     * Sets the value of the pitStopReports property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPitStopReports(String value) {
        this.pitStopReports = value;
    }

    /**
     * Gets the value of the prsMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRSMetadata() {
        return prsMetadata;
    }

    /**
     * Sets the value of the prsMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRSMetadata(String value) {
        this.prsMetadata = value;
    }

    /**
     * Gets the value of the manuscript property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManuscript() {
        return manuscript;
    }

    /**
     * Sets the value of the manuscript property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManuscript(String value) {
        this.manuscript = value;
    }

    /**
     * Gets the value of the epsilonPDF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEpsilonPDF() {
        return epsilonPDF;
    }

    /**
     * Sets the value of the epsilonPDF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEpsilonPDF(String value) {
        this.epsilonPDF = value;
    }

    /**
     * Gets the value of the correctionSheet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrectionSheet() {
        return correctionSheet;
    }

    /**
     * Sets the value of the correctionSheet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrectionSheet(String value) {
        this.correctionSheet = value;
    }

    /**
     * Gets the value of the peerReviewPDFs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeerReviewPDFs() {
        return peerReviewPDFs;
    }

    /**
     * Sets the value of the peerReviewPDFs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeerReviewPDFs(String value) {
        this.peerReviewPDFs = value;
    }

}
