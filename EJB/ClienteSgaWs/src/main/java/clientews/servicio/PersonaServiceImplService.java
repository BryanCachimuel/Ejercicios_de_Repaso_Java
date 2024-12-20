
package clientews.servicio;

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
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "PersonaServiceImplService", targetNamespace = "http://servicio.sga.ib.com.ec/", wsdlLocation = "http://localhost:8095/PersonaServiceImplService/PersonaServiceImpl?wsdl")
public class PersonaServiceImplService
    extends Service
{

    private final static URL PERSONASERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException PERSONASERVICEIMPLSERVICE_EXCEPTION;
    private final static QName PERSONASERVICEIMPLSERVICE_QNAME = new QName("http://servicio.sga.ib.com.ec/", "PersonaServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8095/PersonaServiceImplService/PersonaServiceImpl?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PERSONASERVICEIMPLSERVICE_WSDL_LOCATION = url;
        PERSONASERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public PersonaServiceImplService() {
        super(__getWsdlLocation(), PERSONASERVICEIMPLSERVICE_QNAME);
    }

    public PersonaServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PERSONASERVICEIMPLSERVICE_QNAME, features);
    }

    public PersonaServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, PERSONASERVICEIMPLSERVICE_QNAME);
    }

    public PersonaServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PERSONASERVICEIMPLSERVICE_QNAME, features);
    }

    public PersonaServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PersonaServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PersonaServiceWs
     */
    @WebEndpoint(name = "PersonaServiceImplPort")
    public PersonaServiceWs getPersonaServiceImplPort() {
        return super.getPort(new QName("http://servicio.sga.ib.com.ec/", "PersonaServiceImplPort"), PersonaServiceWs.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PersonaServiceWs
     */
    @WebEndpoint(name = "PersonaServiceImplPort")
    public PersonaServiceWs getPersonaServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://servicio.sga.ib.com.ec/", "PersonaServiceImplPort"), PersonaServiceWs.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PERSONASERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw PERSONASERVICEIMPLSERVICE_EXCEPTION;
        }
        return PERSONASERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
