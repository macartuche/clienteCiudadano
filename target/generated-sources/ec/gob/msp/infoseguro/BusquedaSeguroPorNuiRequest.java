
package ec.gob.msp.infoseguro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NUI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaCobertura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "nui",
    "fechaCobertura"
})
@XmlRootElement(name = "BusquedaSeguroPorNuiRequest")
public class BusquedaSeguroPorNuiRequest {

    @XmlElement(name = "NUI")
    protected String nui;
    @XmlElement(name = "FechaCobertura")
    protected String fechaCobertura;

    /**
     * Obtiene el valor de la propiedad nui.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUI() {
        return nui;
    }

    /**
     * Define el valor de la propiedad nui.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUI(String value) {
        this.nui = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaCobertura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaCobertura() {
        return fechaCobertura;
    }

    /**
     * Define el valor de la propiedad fechaCobertura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaCobertura(String value) {
        this.fechaCobertura = value;
    }

}
