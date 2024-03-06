
package ec.gob.msp.infociudadano;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para busquedaPorNombreReturn complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="busquedaPorNombreReturn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoMensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ciudadanos" type="{http://msp.gob.ec/infociudadano}ciudadanos" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "busquedaPorNombreReturn", propOrder = {
    "codigoMensaje",
    "mensaje",
    "ciudadanos"
})
public class BusquedaPorNombreReturn {

    @XmlElement(name = "CodigoMensaje")
    protected String codigoMensaje;
    @XmlElement(name = "Mensaje")
    protected String mensaje;
    @XmlElement(name = "Ciudadanos")
    protected Ciudadanos ciudadanos;

    /**
     * Obtiene el valor de la propiedad codigoMensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoMensaje() {
        return codigoMensaje;
    }

    /**
     * Define el valor de la propiedad codigoMensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoMensaje(String value) {
        this.codigoMensaje = value;
    }

    /**
     * Obtiene el valor de la propiedad mensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Define el valor de la propiedad mensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensaje(String value) {
        this.mensaje = value;
    }

    /**
     * Obtiene el valor de la propiedad ciudadanos.
     * 
     * @return
     *     possible object is
     *     {@link Ciudadanos }
     *     
     */
    public Ciudadanos getCiudadanos() {
        return ciudadanos;
    }

    /**
     * Define el valor de la propiedad ciudadanos.
     * 
     * @param value
     *     allowed object is
     *     {@link Ciudadanos }
     *     
     */
    public void setCiudadanos(Ciudadanos value) {
        this.ciudadanos = value;
    }

}
