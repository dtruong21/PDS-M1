//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.24 at 01:06:36 AM CEST 
//


package metier.webapp.presentation.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Error complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Error">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isOk" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="messageError" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Error", namespace = "http://www.pds2015.org/I2M", propOrder = {
    "isOk",
    "messageError"
})
public class Error {

    @XmlElement(namespace = "http://www.pds2015.org/I2M")
    protected boolean isOk;
    @XmlElement(namespace = "http://www.pds2015.org/I2M", required = true)
    protected String messageError;

    /**
     * Gets the value of the isOk property.
     * 
     */
    public boolean isIsOk() {
        return isOk;
    }

    /**
     * Sets the value of the isOk property.
     * 
     */
    public void setIsOk(boolean value) {
        this.isOk = value;
    }

    /**
     * Gets the value of the messageError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageError() {
        return messageError;
    }

    /**
     * Sets the value of the messageError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageError(String value) {
        this.messageError = value;
    }

}
