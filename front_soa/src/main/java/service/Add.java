
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for add complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="add">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="dateCreation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="solde" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="MDP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "add", propOrder = {
    "code",
    "dateCreation",
    "solde",
    "mdp"
})
public class Add {

    protected Long code;
    protected String dateCreation;
    protected Double solde;
    @XmlElement(name = "MDP")
    protected String mdp;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCode(Long value) {
        this.code = value;
    }

    /**
     * Gets the value of the dateCreation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateCreation() {
        return dateCreation;
    }

    /**
     * Sets the value of the dateCreation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateCreation(String value) {
        this.dateCreation = value;
    }

    /**
     * Gets the value of the solde property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSolde() {
        return solde;
    }

    /**
     * Sets the value of the solde property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSolde(Double value) {
        this.solde = value;
    }

    /**
     * Gets the value of the mdp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDP() {
        return mdp;
    }

    /**
     * Sets the value of the mdp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDP(String value) {
        this.mdp = value;
    }

}
