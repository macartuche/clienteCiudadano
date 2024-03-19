package ec.gob.salud.clienteConsultaCiudadano;


import ec.gob.msp.infoseguro.BusquedaSeguroPorNuiRequest;
import ec.gob.msp.infoseguro.BusquedaSeguroPorNuiResponse;
import ec.gob.msp.infoseguro.ConsultarSegurosPort;
import ec.gob.msp.infoseguro.ConsultarSegurosPortService;
import java.util.List;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Binding;
import javax.xml.ws.handler.Handler;
/**
 *
 * @author macartuche
 */
public class ProveedorSeguro {

    private static ProveedorSeguro singleton;

    private ProveedorSeguro() {
    }

    public static ProveedorSeguro getProveedor() {
        if (singleton == null) {
            XTrustProvider.install();
            singleton = new ProveedorSeguro();
        }
        return singleton;
    }

    /**
     * Inicializar el puerto en conjunto con las credenciales
     * @return
     */
    private ConsultarSegurosPort initPort() {
        ConsultarSegurosPortService service = new ConsultarSegurosPortService();
        ConsultarSegurosPort port = service.getConsultarSegurosPortSoap11();
	

	Binding binding = ((BindingProvider) port ).getBinding();
        List<Handler> handlerChain = binding.getHandlerChain();
        handlerChain.add(new ManejadorPeticionSeguro());
        binding.setHandlerChain(handlerChain);

	return port;
    }

   
    /**
     * Busqueda por nombre 
     * @param request
     * @return 
     */
    public BusquedaSeguroPorNuiResponse busquedaPorNiu(BusquedaSeguroPorNuiRequest request)   {
        return initPort().busquedaSeguroPorNui(request);
    }
    
}

