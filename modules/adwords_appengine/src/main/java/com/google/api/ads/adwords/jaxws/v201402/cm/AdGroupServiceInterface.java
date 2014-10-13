
package com.google.api.ads.adwords.jaxws.v201402.cm;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Use this service to manage ad groups. An {@linkplain AdGroup ad group}
 *       organizes a set of ads and criteria together, and also provides the
 *       {@linkplain AdGroup#bids default bid} for its criteria. One or more ad groups
 *       belong to a campaign.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebService(name = "AdGroupServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AdGroupServiceInterface {


    /**
     * 
     *         Returns a list of all the ad groups specified by the selector
     *         from the target customer's account.
     *         
     *         @param serviceSelector The selector specifying the {@link AdGroup}s to return.
     *         @return List of adgroups identified by the selector.
     *         @throws ApiException when there is at least one error with the request.
     *       
     * 
     * @param serviceSelector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201402.cm.AdGroupPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402", className = "com.google.api.ads.adwords.jaxws.v201402.cm.AdGroupServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402", className = "com.google.api.ads.adwords.jaxws.v201402.cm.AdGroupServiceInterfacegetResponse")
    public AdGroupPage get(
        @WebParam(name = "serviceSelector", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402")
        Selector serviceSelector)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Adds, updates, or removes ad groups.
     *         <p class="note"><b>Note:</b> {@link AdGroupOperation} does not support the
     *         {@code REMOVE} operator. To remove an ad group, set its
     *         {@link AdGroup#status status} to {@code REMOVED}.</p>
     *         
     *         @param operations List of unique operations. The same ad group cannot be
     *         specified in more than one operation.
     *         @return The updated adgroups.
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201402.cm.AdGroupReturnValue
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402", className = "com.google.api.ads.adwords.jaxws.v201402.cm.AdGroupServiceInterfacemutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402", className = "com.google.api.ads.adwords.jaxws.v201402.cm.AdGroupServiceInterfacemutateResponse")
    public AdGroupReturnValue mutate(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402")
        List<AdGroupOperation> operations)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns the list of ad groups that match the query.
     *         
     *         @param query The SQL-like AWQL query string
     *         @return A list of adgroups
     *         @throws ApiException
     *       
     * 
     * @param query
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201402.cm.AdGroupPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402")
    @RequestWrapper(localName = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402", className = "com.google.api.ads.adwords.jaxws.v201402.cm.AdGroupServiceInterfacequery")
    @ResponseWrapper(localName = "queryResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402", className = "com.google.api.ads.adwords.jaxws.v201402.cm.AdGroupServiceInterfacequeryResponse")
    public AdGroupPage query(
        @WebParam(name = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402")
        String query)
        throws ApiException_Exception
    ;

}