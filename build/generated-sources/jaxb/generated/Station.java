//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2017.10.26 � 04:22:27 PM CEST 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="available" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="free" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ticket" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="open" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="updated" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="connected" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "available",
    "free",
    "total",
    "ticket",
    "open",
    "updated",
    "connected"
})
@XmlRootElement(name = "station")
public class Station {

    protected int available;
    protected int free;
    protected int total;
    protected int ticket;
    protected int open;
    protected int updated;
    protected int connected;

    /**
     * Obtient la valeur de la propri�t� available.
     * 
     */
    public int getAvailable() {
        return available;
    }

    /**
     * D�finit la valeur de la propri�t� available.
     * 
     */
    public void setAvailable(int value) {
        this.available = value;
    }

    /**
     * Obtient la valeur de la propri�t� free.
     * 
     */
    public int getFree() {
        return free;
    }

    /**
     * D�finit la valeur de la propri�t� free.
     * 
     */
    public void setFree(int value) {
        this.free = value;
    }

    /**
     * Obtient la valeur de la propri�t� total.
     * 
     */
    public int getTotal() {
        return total;
    }

    /**
     * D�finit la valeur de la propri�t� total.
     * 
     */
    public void setTotal(int value) {
        this.total = value;
    }

    /**
     * Obtient la valeur de la propri�t� ticket.
     * 
     */
    public int getTicket() {
        return ticket;
    }

    /**
     * D�finit la valeur de la propri�t� ticket.
     * 
     */
    public void setTicket(int value) {
        this.ticket = value;
    }

    /**
     * Obtient la valeur de la propri�t� open.
     * 
     */
    public int getOpen() {
        return open;
    }

    /**
     * D�finit la valeur de la propri�t� open.
     * 
     */
    public void setOpen(int value) {
        this.open = value;
    }

    /**
     * Obtient la valeur de la propri�t� updated.
     * 
     */
    public int getUpdated() {
        return updated;
    }

    /**
     * D�finit la valeur de la propri�t� updated.
     * 
     */
    public void setUpdated(int value) {
        this.updated = value;
    }

    /**
     * Obtient la valeur de la propri�t� connected.
     * 
     */
    public int getConnected() {
        return connected;
    }

    /**
     * D�finit la valeur de la propri�t� connected.
     * 
     */
    public void setConnected(int value) {
        this.connected = value;
    }

}
