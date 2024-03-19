
package ec.gob.msp.infoseguro;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ec.gob.msp.infoseguro package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ec.gob.msp.infoseguro
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BusquedaSeguroPorNuiRequest }
     * 
     */
    public BusquedaSeguroPorNuiRequest createBusquedaSeguroPorNuiRequest() {
        return new BusquedaSeguroPorNuiRequest();
    }

    /**
     * Create an instance of {@link BusquedaSeguroPorNuiResponse }
     * 
     */
    public BusquedaSeguroPorNuiResponse createBusquedaSeguroPorNuiResponse() {
        return new BusquedaSeguroPorNuiResponse();
    }

    /**
     * Create an instance of {@link BusquedaPorNuiSeguroReturn }
     * 
     */
    public BusquedaPorNuiSeguroReturn createBusquedaPorNuiSeguroReturn() {
        return new BusquedaPorNuiSeguroReturn();
    }

    /**
     * Create an instance of {@link Coberturasalud }
     * 
     */
    public Coberturasalud createCoberturasalud() {
        return new Coberturasalud();
    }

    /**
     * Create an instance of {@link Coberturasegurossalud }
     * 
     */
    public Coberturasegurossalud createCoberturasegurossalud() {
        return new Coberturasegurossalud();
    }

}
