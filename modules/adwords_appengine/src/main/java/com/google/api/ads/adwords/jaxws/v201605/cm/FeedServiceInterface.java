
package com.google.api.ads.adwords.jaxws.v201605.cm;

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
 *       Service used to get and mutate Feeds.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "FeedServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201605")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface FeedServiceInterface {


    /**
     * 
     *         Returns a list of Feeds that meet the selector criteria.
     *         
     *         @param selector Determines which Feeds to return. If empty all
     *         Feeds are returned.
     *         @return The list of Feeds.
     *         @throws ApiException Indicates a problem with the request.
     *       
     * 
     * @param selector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201605.cm.FeedPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201605")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201605", className = "com.google.api.ads.adwords.jaxws.v201605.cm.FeedServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201605", className = "com.google.api.ads.adwords.jaxws.v201605.cm.FeedServiceInterfacegetResponse")
    public FeedPage get(
        @WebParam(name = "selector", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201605")
        Selector selector)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Add, remove, and set Feeds.
     *         
     *         @param operations The operations to apply.
     *         @return The resulting Feeds.
     *         @throws ApiException Indicates a problem with the request.
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201605.cm.FeedReturnValue
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201605")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201605", className = "com.google.api.ads.adwords.jaxws.v201605.cm.FeedServiceInterfacemutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201605", className = "com.google.api.ads.adwords.jaxws.v201605.cm.FeedServiceInterfacemutateResponse")
    public FeedReturnValue mutate(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201605")
        List<FeedOperation> operations)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns the list of Feed that match the query.
     *         
     *         @param query The SQL-like AWQL query string.
     *         @returns A list of Feed.
     *         @throws ApiException if problems occur while parsing the query or fetching Feed.
     *       
     * 
     * @param query
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201605.cm.FeedPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201605")
    @RequestWrapper(localName = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201605", className = "com.google.api.ads.adwords.jaxws.v201605.cm.FeedServiceInterfacequery")
    @ResponseWrapper(localName = "queryResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201605", className = "com.google.api.ads.adwords.jaxws.v201605.cm.FeedServiceInterfacequeryResponse")
    public FeedPage query(
        @WebParam(name = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201605")
        String query)
        throws ApiException_Exception
    ;

}
