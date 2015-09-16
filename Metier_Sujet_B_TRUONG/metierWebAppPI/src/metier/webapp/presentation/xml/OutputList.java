//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.24 at 01:06:36 AM CEST 
//


package metier.webapp.presentation.xml;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="output" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="stylesheet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="stylesheetIE6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="header" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="doctype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element name="javascript" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "output"
})
@XmlRootElement(name = "outputList")
public class OutputList {

    @XmlElement(required = true)
    protected List<OutputList.Output> output;

    /**
     * Gets the value of the output property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the output property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutputList.Output }
     * 
     * 
     */
    public List<OutputList.Output> getOutput() {
        if (output == null) {
            output = new ArrayList<OutputList.Output>();
        }
        return this.output;
    }


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
     *         &lt;element name="stylesheet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="stylesheetIE6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="header" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="doctype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         &lt;element name="javascript" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "stylesheet",
        "stylesheetIE6",
        "header",
        "doctype",
        "action",
        "javascript"
    })
    public static class Output {

        protected String stylesheet;
        protected String stylesheetIE6;
        protected List<Object> header;
        protected String doctype;
        protected Object action;
        protected String javascript;
        @XmlAttribute(name = "id", required = true)
        protected String id;

        /**
         * Gets the value of the stylesheet property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStylesheet() {
            return stylesheet;
        }

        /**
         * Sets the value of the stylesheet property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStylesheet(String value) {
            this.stylesheet = value;
        }

        /**
         * Gets the value of the stylesheetIE6 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStylesheetIE6() {
            return stylesheetIE6;
        }

        /**
         * Sets the value of the stylesheetIE6 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStylesheetIE6(String value) {
            this.stylesheetIE6 = value;
        }

        /**
         * Gets the value of the header property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the header property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHeader().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getHeader() {
            if (header == null) {
                header = new ArrayList<Object>();
            }
            return this.header;
        }

        /**
         * Gets the value of the doctype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDoctype() {
            return doctype;
        }

        /**
         * Sets the value of the doctype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDoctype(String value) {
            this.doctype = value;
        }

        /**
         * Gets the value of the action property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAction() {
            return action;
        }

        /**
         * Sets the value of the action property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAction(Object value) {
            this.action = value;
        }

        /**
         * Gets the value of the javascript property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJavascript() {
            return javascript;
        }

        /**
         * Sets the value of the javascript property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJavascript(String value) {
            this.javascript = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

    }

}
