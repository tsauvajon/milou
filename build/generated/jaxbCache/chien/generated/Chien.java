//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2017.10.26 � 04:22:26 PM CEST 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="maitre" type="{}personne"/>
 *         &lt;element name="puces" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "nom",
    "maitre",
    "puces"
})
@XmlRootElement(name = "chien")
public class Chien {

    @XmlElement(required = true)
    protected String nom;
    @XmlElement(required = true)
    protected Personne maitre;
    protected int puces;

    /**
     * Obtient la valeur de la propri�t� nom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNom() {
        return nom;
    }

    /**
     * D�finit la valeur de la propri�t� nom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNom(String value) {
        this.nom = value;
    }

    /**
     * Obtient la valeur de la propri�t� maitre.
     * 
     * @return
     *     possible object is
     *     {@link Personne }
     *     
     */
    public Personne getMaitre() {
        return maitre;
    }

    /**
     * D�finit la valeur de la propri�t� maitre.
     * 
     * @param value
     *     allowed object is
     *     {@link Personne }
     *     
     */
    public void setMaitre(Personne value) {
        this.maitre = value;
    }

    /**
     * Obtient la valeur de la propri�t� puces.
     * 
     */
    public int getPuces() {
        return puces;
    }

    /**
     * D�finit la valeur de la propri�t� puces.
     * 
     */
    public void setPuces(int value) {
        this.puces = value;
    }

}
