
package com.google.api.ads.adwords.jaxws.v201605.o;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Use this service to generate new keyword ideas based on the
 *       parameters specified in the selector. See the {@link TargetingIdeaSelector}
 *       documentation for more details.
 *       
 *       <p>You can also use this service to retrieve statistics for existing keyword
 *       ideas by setting the selector's {@code requestType} to {@link RequestType#STATS}
 *       and passing in the appropriate search parameters.</p>
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "TargetingIdeaServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/o/v201605")
@XmlSeeAlso({
    com.google.api.ads.adwords.jaxws.v201605.cm.ObjectFactory.class,
    com.google.api.ads.adwords.jaxws.v201605.o.ObjectFactory.class
})
public interface TargetingIdeaServiceInterface {


    /**
     * 
     *         Returns a page of ideas that match the query described by the specified
     *         {@link TargetingIdeaSelector}.
     *         
     *         <p>The selector must specify a {@code paging} value, with {@code numberResults} set to 800 or
     *         less.  Large result sets must be composed through multiple calls to this method, advancing the
     *         paging {@code startIndex} value by {@code numberResults} with each call.</p>
     *         
     *         @param selector Query describing the types of results to return when
     *         finding matches (similar keyword ideas).
     *         @return A {@link TargetingIdeaPage} of results, that is a subset of the
     *         list of possible ideas meeting the criteria of the
     *         {@link TargetingIdeaSelector}.
     *         @throws ApiException If problems occurred while querying for ideas.
     *       
     * 
     * @param selector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201605.o.TargetingIdeaPage
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/o/v201605")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/o/v201605", className = "com.google.api.ads.adwords.jaxws.v201605.o.TargetingIdeaServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/o/v201605", className = "com.google.api.ads.adwords.jaxws.v201605.o.TargetingIdeaServiceInterfacegetResponse")
    public TargetingIdeaPage get(
        @WebParam(name = "selector", targetNamespace = "https://adwords.google.com/api/adwords/o/v201605")
        TargetingIdeaSelector selector)
        throws ApiException
    ;

}
