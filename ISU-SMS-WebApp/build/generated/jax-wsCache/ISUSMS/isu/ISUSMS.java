
package isu;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ISUSMS", targetNamespace = "http://ISU/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ISUSMS {


    /**
     * 
     * @param number
     * @param password
     * @param provider
     * @param message
     * @param username
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sendSMSISU", targetNamespace = "http://ISU/", className = "isu.SendSMSISU")
    @ResponseWrapper(localName = "sendSMSISUResponse", targetNamespace = "http://ISU/", className = "isu.SendSMSISUResponse")
    @Action(input = "http://ISU/ISUSMS/sendSMSISURequest", output = "http://ISU/ISUSMS/sendSMSISUResponse")
    public String sendSMSISU(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "provider", targetNamespace = "")
        String provider,
        @WebParam(name = "number", targetNamespace = "")
        String number,
        @WebParam(name = "message", targetNamespace = "")
        String message);

    /**
     * 
     * @param number
     * @param provider
     * @param message
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sendSMS", targetNamespace = "http://ISU/", className = "isu.SendSMS")
    @ResponseWrapper(localName = "sendSMSResponse", targetNamespace = "http://ISU/", className = "isu.SendSMSResponse")
    @Action(input = "http://ISU/ISUSMS/sendSMSRequest", output = "http://ISU/ISUSMS/sendSMSResponse")
    public String sendSMS(
        @WebParam(name = "provider", targetNamespace = "")
        String provider,
        @WebParam(name = "number", targetNamespace = "")
        String number,
        @WebParam(name = "message", targetNamespace = "")
        String message);

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCarriers", targetNamespace = "http://ISU/", className = "isu.GetCarriers")
    @ResponseWrapper(localName = "getCarriersResponse", targetNamespace = "http://ISU/", className = "isu.GetCarriersResponse")
    @Action(input = "http://ISU/ISUSMS/getCarriersRequest", output = "http://ISU/ISUSMS/getCarriersResponse")
    public List<String> getCarriers();

}
