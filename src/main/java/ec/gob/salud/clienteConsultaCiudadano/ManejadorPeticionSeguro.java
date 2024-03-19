package ec.gob.salud.clienteConsultaCiudadano;


import java.io.PrintStream; 
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPFactory;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import javax.xml.soap.SOAPException;
/*
 * This simple SOAPHandler will output the contents of incoming
 * and outgoing messages.
 */
public class ManejadorPeticionSeguro implements SOAPHandler<SOAPMessageContext> {

    // change this to redirect output if desired
    private static PrintStream out = System.out;

    public Set<QName> getHeaders() {
        return null;
    }

    public boolean handleMessage(SOAPMessageContext smc) {
        logToSystemOut(smc);
        return true;
    }

    public boolean handleFault(SOAPMessageContext smc) {
        logToSystemOut(smc);
        return true;
    }

    // nothing to clean up
    public void close(MessageContext messageContext) {
    }

    /*
     * Check the MESSAGE_OUTBOUND_PROPERTY in the context
     * to see if this is an outgoing or incoming message.
     * Write a brief message to the print stream and
     * output the message. The writeTo() method can throw
     * SOAPException or IOException
     */

     private void logToSystemOut(SOAPMessageContext smc) {
        Boolean outboundProperty = (Boolean)
            smc.get (MessageContext.MESSAGE_OUTBOUND_PROPERTY);


        if (outboundProperty) {
            try {
		SOAPEnvelope envelope = smc.getMessage().getSOAPPart().getEnvelope();
                if (envelope.getHeader() != null) {
                    envelope.getHeader().detachNode();
                }
                
                SOAPMessage message = smc.getMessage();
                
                SOAPHeader header = envelope.addHeader();
                SOAPElement ele = header.addChildElement( new QName("http://msp.gob.ec/consultaseguros", "usr" ) );
                ele.addTextNode( "usr_prosalud_frontera_sur" );
                ele = header.addChildElement( new QName("http://msp.gob.ec/consultaseguros", "pass" ) );
                ele.addTextNode( "ldpRRR4821*-ue-1458-2023-12" );
                message.saveChanges();
		    System.out.println(header);
            } catch (SOAPException e) {
                System.out.println(e);
            }
            out.println("\nOutbound message:");
        } else {
            out.println("\nInbound message:");
        }

        SOAPMessage message = smc.getMessage();
        try {
            message.writeTo(out);
            out.println("");   // just to add a newline
        } catch (Exception e) {
            out.println("Exception in handler: " + e);
        }
    }
}

