package ec.gob.salud.clienteConsultaCiudadano;


import ec.gob.msp.infociudadano.BusquedaPorNombreRequest;
import ec.gob.msp.infociudadano.BusquedaPorNombreResponse;
import ec.gob.msp.infociudadano.BusquedaPorNuiRequest;
import ec.gob.msp.infociudadano.BusquedaPorNuiResponse;
import ec.gob.msp.infociudadano.ConsultarCiudadanoPort;
import ec.gob.msp.infociudadano.ConsultarCiudadanoPortService; 
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;
import java.nio.charset.StandardCharsets;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import javax.xml.ws.Binding;
import javax.xml.ws.handler.Handler;
/**
 *
 * @author macartuche
 */
public class Proveedor {

    private static Proveedor singleton;

    private Proveedor() {
    }

    public static Proveedor getProveedor() {
        if (singleton == null) {
            XTrustProvider.install();
            singleton = new Proveedor();
        }
        return singleton;
    }

    /**
     * Inicializar el puerto en conjunto con las credenciales
     * @return
     */
    private ConsultarCiudadanoPort initPort() {
        ConsultarCiudadanoPortService service = new ConsultarCiudadanoPortService();
        ConsultarCiudadanoPort port = service.getConsultarCiudadanoPortSoap11();
	

	Binding binding = ((BindingProvider) port ).getBinding();
        List<Handler> handlerChain = binding.getHandlerChain();
        handlerChain.add(new ManejadorPeticion());
        binding.setHandlerChain(handlerChain);

	return port;
    }

   
    /**
     * Busqueda por nombre 
     * @param request
     * @return 
     */
    public BusquedaPorNombreResponse busquedaPorNombre(BusquedaPorNombreRequest request)   {
        return initPort().busquedaPorNombre(request);
    }
    
    
    /**
     * 
     * @param request
     * @return
     * @throws Exception 
     */
    public  BusquedaPorNuiResponse busquedaPorNui(BusquedaPorNuiRequest request) throws Exception {
       System.out.println(request.toString());
	    return initPort().busquedaPorNui(request);
    }

    
}
