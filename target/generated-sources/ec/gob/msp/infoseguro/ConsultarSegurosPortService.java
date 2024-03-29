
package ec.gob.msp.infoseguro;

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
@WebServiceClient(name = "ConsultarSegurosPortService", targetNamespace = "http://msp.gob.ec/consultaseguros", wsdlLocation = "https://bse.msp.gob.ec/cxf/MSP/SWConsultar_Seguros_XID?wsdl")
public class ConsultarSegurosPortService
    extends Service
{

    private final static URL CONSULTARSEGUROSPORTSERVICE_WSDL_LOCATION;
    private final static WebServiceException CONSULTARSEGUROSPORTSERVICE_EXCEPTION;
    private final static QName CONSULTARSEGUROSPORTSERVICE_QNAME = new QName("http://msp.gob.ec/consultaseguros", "ConsultarSegurosPortService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://bse.msp.gob.ec/cxf/MSP/SWConsultar_Seguros_XID?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONSULTARSEGUROSPORTSERVICE_WSDL_LOCATION = url;
        CONSULTARSEGUROSPORTSERVICE_EXCEPTION = e;
    }

    public ConsultarSegurosPortService() {
        super(__getWsdlLocation(), CONSULTARSEGUROSPORTSERVICE_QNAME);
    }

    public ConsultarSegurosPortService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONSULTARSEGUROSPORTSERVICE_QNAME, features);
    }

    public ConsultarSegurosPortService(URL wsdlLocation) {
        super(wsdlLocation, CONSULTARSEGUROSPORTSERVICE_QNAME);
    }

    public ConsultarSegurosPortService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONSULTARSEGUROSPORTSERVICE_QNAME, features);
    }

    public ConsultarSegurosPortService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConsultarSegurosPortService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ConsultarSegurosPort
     */
    @WebEndpoint(name = "ConsultarSegurosPortSoap11")
    public ConsultarSegurosPort getConsultarSegurosPortSoap11() {
        return super.getPort(new QName("http://msp.gob.ec/consultaseguros", "ConsultarSegurosPortSoap11"), ConsultarSegurosPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultarSegurosPort
     */
    @WebEndpoint(name = "ConsultarSegurosPortSoap11")
    public ConsultarSegurosPort getConsultarSegurosPortSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("http://msp.gob.ec/consultaseguros", "ConsultarSegurosPortSoap11"), ConsultarSegurosPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONSULTARSEGUROSPORTSERVICE_EXCEPTION!= null) {
            throw CONSULTARSEGUROSPORTSERVICE_EXCEPTION;
        }
        return CONSULTARSEGUROSPORTSERVICE_WSDL_LOCATION;
    }

}
