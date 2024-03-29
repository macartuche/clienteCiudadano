
package ec.gob.msp.infociudadano;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ConsultarCiudadanoPortService", targetNamespace = "http://msp.gob.ec/infociudadano", wsdlLocation = "https://bse.msp.gob.ec/cxf/MSP/SWConsultar_CiudadanoV2?wsdl")
public class ConsultarCiudadanoPortService
    extends Service
{

    private final static URL CONSULTARCIUDADANOPORTSERVICE_WSDL_LOCATION;
    private final static WebServiceException CONSULTARCIUDADANOPORTSERVICE_EXCEPTION;
    private final static QName CONSULTARCIUDADANOPORTSERVICE_QNAME = new QName("http://msp.gob.ec/infociudadano", "ConsultarCiudadanoPortService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://bse.msp.gob.ec/cxf/MSP/SWConsultar_CiudadanoV2?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONSULTARCIUDADANOPORTSERVICE_WSDL_LOCATION = url;
        CONSULTARCIUDADANOPORTSERVICE_EXCEPTION = e;
    }

    public ConsultarCiudadanoPortService() {
        super(__getWsdlLocation(), CONSULTARCIUDADANOPORTSERVICE_QNAME);
    }

    public ConsultarCiudadanoPortService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONSULTARCIUDADANOPORTSERVICE_QNAME, features);
    }

    public ConsultarCiudadanoPortService(URL wsdlLocation) {
        super(wsdlLocation, CONSULTARCIUDADANOPORTSERVICE_QNAME);
    }

    public ConsultarCiudadanoPortService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONSULTARCIUDADANOPORTSERVICE_QNAME, features);
    }

    public ConsultarCiudadanoPortService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConsultarCiudadanoPortService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ConsultarCiudadanoPort
     */
    @WebEndpoint(name = "ConsultarCiudadanoPortSoap11")
    public ConsultarCiudadanoPort getConsultarCiudadanoPortSoap11() {
        return super.getPort(new QName("http://msp.gob.ec/infociudadano", "ConsultarCiudadanoPortSoap11"), ConsultarCiudadanoPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultarCiudadanoPort
     */
    @WebEndpoint(name = "ConsultarCiudadanoPortSoap11")
    public ConsultarCiudadanoPort getConsultarCiudadanoPortSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("http://msp.gob.ec/infociudadano", "ConsultarCiudadanoPortSoap11"), ConsultarCiudadanoPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONSULTARCIUDADANOPORTSERVICE_EXCEPTION!= null) {
            throw CONSULTARCIUDADANOPORTSERVICE_EXCEPTION;
        }
        return CONSULTARCIUDADANOPORTSERVICE_WSDL_LOCATION;
    }

}
