
package edu.ilstu.it;

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
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "TextSenderService", targetNamespace = "http://it.ilstu.edu/", wsdlLocation = "http://gfish.ad.ilstu.edu:8080/ISUTextSMS2/TextSenderService?WSDL")
public class TextSenderService
    extends Service
{

    private final static URL TEXTSENDERSERVICE_WSDL_LOCATION;
    private final static WebServiceException TEXTSENDERSERVICE_EXCEPTION;
    private final static QName TEXTSENDERSERVICE_QNAME = new QName("http://it.ilstu.edu/", "TextSenderService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://gfish.ad.ilstu.edu:8080/ISUTextSMS2/TextSenderService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TEXTSENDERSERVICE_WSDL_LOCATION = url;
        TEXTSENDERSERVICE_EXCEPTION = e;
    }

    public TextSenderService() {
        super(__getWsdlLocation(), TEXTSENDERSERVICE_QNAME);
    }

    public TextSenderService(WebServiceFeature... features) {
        super(__getWsdlLocation(), TEXTSENDERSERVICE_QNAME, features);
    }

    public TextSenderService(URL wsdlLocation) {
        super(wsdlLocation, TEXTSENDERSERVICE_QNAME);
    }

    public TextSenderService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TEXTSENDERSERVICE_QNAME, features);
    }

    public TextSenderService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TextSenderService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TextSender
     */
    @WebEndpoint(name = "TextSenderPort")
    public TextSender getTextSenderPort() {
        return super.getPort(new QName("http://it.ilstu.edu/", "TextSenderPort"), TextSender.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TextSender
     */
    @WebEndpoint(name = "TextSenderPort")
    public TextSender getTextSenderPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://it.ilstu.edu/", "TextSenderPort"), TextSender.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TEXTSENDERSERVICE_EXCEPTION!= null) {
            throw TEXTSENDERSERVICE_EXCEPTION;
        }
        return TEXTSENDERSERVICE_WSDL_LOCATION;
    }

}