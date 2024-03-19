
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
 *         &lt;element name="return" type="{http://msp.gob.ec/consultaseguros}busquedaPorNuiSeguroReturn"/>
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
    "_return"
})
@XmlRootElement(name = "BusquedaSeguroPorNuiResponse")
public class BusquedaSeguroPorNuiResponse {

    @XmlElement(name = "return", required = true)
    protected BusquedaPorNuiSeguroReturn _return;

    /**
     * Obtiene el valor de la propiedad return.
     * 
     * @return
     *     possible object is
     *     {@link BusquedaPorNuiSeguroReturn }
     *     
     */
    public BusquedaPorNuiSeguroReturn getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     * 
     * @param value
     *     allowed object is
     *     {@link BusquedaPorNuiSeguroReturn }
     *     
     */
    public void setReturn(BusquedaPorNuiSeguroReturn value) {
        this._return = value;
    }

}
