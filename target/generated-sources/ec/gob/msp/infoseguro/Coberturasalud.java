
package ec.gob.msp.infoseguro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para coberturasalud complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="coberturasalud">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NombreInstitucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EstadoOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CoberturaSalud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MensajeServicioExterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoSeguro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EstadoCobertura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NUI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coberturasalud", propOrder = {
    "nombreInstitucion",
    "estadoOperacion",
    "coberturaSalud",
    "mensajeServicioExterno",
    "nombre",
    "tipoSeguro",
    "estadoCobertura",
    "nui"
})
public class Coberturasalud {

    @XmlElement(name = "NombreInstitucion")
    protected String nombreInstitucion;
    @XmlElement(name = "EstadoOperacion")
    protected String estadoOperacion;
    @XmlElement(name = "CoberturaSalud")
    protected String coberturaSalud;
    @XmlElement(name = "MensajeServicioExterno")
    protected String mensajeServicioExterno;
    @XmlElement(name = "Nombre")
    protected String nombre;
    @XmlElement(name = "TipoSeguro")
    protected String tipoSeguro;
    @XmlElement(name = "EstadoCobertura")
    protected String estadoCobertura;
    @XmlElement(name = "NUI")
    protected String nui;

    /**
     * Obtiene el valor de la propiedad nombreInstitucion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreInstitucion() {
        return nombreInstitucion;
    }

    /**
     * Define el valor de la propiedad nombreInstitucion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreInstitucion(String value) {
        this.nombreInstitucion = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoOperacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoOperacion() {
        return estadoOperacion;
    }

    /**
     * Define el valor de la propiedad estadoOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoOperacion(String value) {
        this.estadoOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad coberturaSalud.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoberturaSalud() {
        return coberturaSalud;
    }

    /**
     * Define el valor de la propiedad coberturaSalud.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoberturaSalud(String value) {
        this.coberturaSalud = value;
    }

    /**
     * Obtiene el valor de la propiedad mensajeServicioExterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensajeServicioExterno() {
        return mensajeServicioExterno;
    }

    /**
     * Define el valor de la propiedad mensajeServicioExterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensajeServicioExterno(String value) {
        this.mensajeServicioExterno = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoSeguro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoSeguro() {
        return tipoSeguro;
    }

    /**
     * Define el valor de la propiedad tipoSeguro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoSeguro(String value) {
        this.tipoSeguro = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoCobertura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoCobertura() {
        return estadoCobertura;
    }

    /**
     * Define el valor de la propiedad estadoCobertura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoCobertura(String value) {
        this.estadoCobertura = value;
    }

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

}
