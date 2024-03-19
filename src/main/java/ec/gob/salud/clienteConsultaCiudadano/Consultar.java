package ec.gob.salud.clienteConsultaCiudadano;

import ec.gob.msp.infociudadano.BusquedaPorNombreRequest;
import ec.gob.msp.infociudadano.BusquedaPorNombreResponse;
import ec.gob.msp.infociudadano.BusquedaPorNuiRequest;
import ec.gob.msp.infociudadano.BusquedaPorNuiResponse;
import ec.gob.msp.infociudadano.Ciudadano;
import ec.gob.msp.infoseguro.BusquedaSeguroPorNuiRequest;
import ec.gob.msp.infoseguro.BusquedaSeguroPorNuiResponse;
import ec.gob.msp.infoseguro.Coberturasalud;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Consultar {

    public static void main(String[] args) {
        
        
        try {
            System.out.println("==============BusquedaPorNui================");
            BusquedaPorNuiRequest nui = new BusquedaPorNuiRequest();
            nui.setNUI("1104336860");
            BusquedaPorNuiResponse respuestaNui = Proveedor.getProveedor().busquedaPorNui(nui);
            System.out.println("CodigoMensaje: "+respuestaNui.getReturn().getCodigoMensaje());
            System.out.println("Mensaje: "+respuestaNui.getReturn().getMensaje());
            System.out.println(""+respuestaNui.getReturn().getCiudadano().getNombres());
            
            
            BusquedaSeguroPorNuiRequest seguroNui = new BusquedaSeguroPorNuiRequest();
            seguroNui.setNUI("1104336860");
            seguroNui.setFechaCobertura("19/01/2019");

	    BusquedaSeguroPorNuiResponse respuestaSeguro = ProveedorSeguro.getProveedor().busquedaPorNiu(seguroNui);
            for(Coberturasalud cobertura: respuestaSeguro.getReturn().getCoberturaSeguros().getAseguradora()){
                System.out.println("=>"+cobertura.getCoberturaSalud());
                System.out.println("=>"+cobertura.getEstadoCobertura());
                System.out.println("=>"+cobertura.getEstadoOperacion());
            }
            //System.out.println("==============BusquedaPorNombre================");
            /*
            BusquedaPorNombreRequest nombrereq = new BusquedaPorNombreRequest();
            nombrereq.setApellido1("CARTUCHE");
            nombrereq.setApellido2("FLORES");
            nombrereq.setNombre1("MANUEL");
            nombrereq.setNombre2("ALBERTO");
            
            BusquedaPorNombreResponse respuestaNombre = Proveedor.getProveedor().busquedaPorNombre(nombrereq);
            System.out.println("CodigoMensaje: "+respuestaNombre.getReturn().getCodigoMensaje());
            System.out.println("Mensaje: "+respuestaNombre.getReturn().getMensaje());
            
            List<Ciudadano> ciudadanos = respuestaNombre.getReturn().getCiudadanos().getPersona();
            for (Ciudadano ciudadano : ciudadanos) {
                System.out.println("nombres: "+ciudadano.getNombres());   
                System.out.println("nui: "+ciudadano.getNUI());   
            }*/
            
        } catch (Exception ex) {
            Logger.getLogger(Consultar.class.getName()).log(Level.SEVERE, null, ex);
        	 System.out.println(ex);
	}
	
    }

}




