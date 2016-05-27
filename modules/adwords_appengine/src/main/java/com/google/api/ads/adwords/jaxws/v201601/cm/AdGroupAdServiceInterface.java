
package com.google.api.ads.adwords.jaxws.v201601.cm;

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
 *       Use this service to manage ads. Available ad types are subclasses of the base
 *       {@link Ad} type and are shown in the {@link AdGroupAd#ad AdGroupAd.ad}
 *       documentation.  Here are some of the commonly used ad types:
 *       <dl>
 *       <dt>{@linkplain TextAd Text Ad}</dt>
 *       <dd>The primary ad type used on both the search and display networks. A
 *       text ad contains a headline, two lines of text, and a destination URL.</dd>
 *       <dt>{@linkplain ImageAd Image Ad}</dt>
 *       <dd>A standard image ad.</dd>
 *       <dt>{@linkplain TemplateAd Template Ad} (<span class="deem">AdWords
 *       Display Ad Builder</span>)</dt>
 *       <dd>A flexible ad type that supports various <a
 *       href="/adwords/api/docs/appendix/templateads">Template Ad formats</a>.</dd>
 *       </dl>
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "AdGroupAdServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AdGroupAdServiceInterface {


    /**
     * 
     *         Returns a list of AdGroupAds.
     *         AdGroupAds that had been removed are not returned by default.
     *         
     *         @param serviceSelector The selector specifying the {@link AdGroupAd}s to return.
     *         @return The page containing the AdGroupAds that meet the criteria specified by the selector.
     *         @throws ApiException when there is at least one error with the request.
     *       
     * 
     * @param serviceSelector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201601.cm.AdGroupAdPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601", className = "com.google.api.ads.adwords.jaxws.v201601.cm.AdGroupAdServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601", className = "com.google.api.ads.adwords.jaxws.v201601.cm.AdGroupAdServiceInterfacegetResponse")
    public AdGroupAdPage get(
        @WebParam(name = "serviceSelector", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601")
        Selector serviceSelector)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Applies the list of mutate operations (ie. add, set, remove):
     *         <p>Add - Creates a new {@linkplain AdGroupAd ad group ad}. The
     *         {@code adGroupId} must
     *         reference an existing ad group. The child {@code Ad} must be sufficiently
     *         specified by constructing a concrete ad type (such as {@code TextAd})
     *         and setting its fields accordingly.</p>
     *         <p>Set - Updates an ad group ad. Except for {@code status},
     *         ad group ad fields are not mutable. Status updates are
     *         straightforward - the status of the ad group ad is updated as
     *         specified. If any other field has changed, it will be ignored. If
     *         you want to change any of the fields other than status, you must
     *         make a new ad and then remove the old one.</p>
     *         <p>Remove - Removes the link between the specified AdGroup and
     *         Ad.</p>
     *         @param operations The operations to apply.
     *         @return A list of AdGroupAds where each entry in the list is the result of
     *         applying the operation in the input list with the same index. For an
     *         add/set operation, the return AdGroupAd will be what is saved to the db.
     *         In the case of the remove operation, the return AdGroupAd will simply be
     *         an AdGroupAd containing an Ad with the id set to the Ad being removed from
     *         the AdGroup.
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201601.cm.AdGroupAdReturnValue
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601", className = "com.google.api.ads.adwords.jaxws.v201601.cm.AdGroupAdServiceInterfacemutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601", className = "com.google.api.ads.adwords.jaxws.v201601.cm.AdGroupAdServiceInterfacemutateResponse")
    public AdGroupAdReturnValue mutate(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601")
        List<AdGroupAdOperation> operations)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Adds labels to the AdGroupAd or removes labels from the AdGroupAd.
     *         <p>Add - Apply an existing label to an existing {@linkplain AdGroupAd ad group ad}. The
     *         {@code adGroupId} and {@code adId} must reference an existing
     *         {@linkplain AdGroupAd ad group ad}. The {@code labelId} must reference an existing
     *         {@linkplain Label label}.
     *         <p>Remove - Removes the link between the specified {@linkplain AdGroupAd ad group ad} and
     *         {@linkplain Label label}.
     *         @param operations The operations to apply.
     *         @return A list of AdGroupAdLabel where each entry in the list is the result of
     *         applying the operation in the input list with the same index. For an
     *         add operation, the returned AdGroupAdLabel contains the AdGroupId, AdId and the LabelId.
     *         In the case of a remove operation, the returned AdGroupAdLabel will only have AdGroupId and
     *         AdId.
     *         @throws ApiException when there are one or more errors with the request.
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201601.cm.AdGroupAdLabelReturnValue
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601")
    @RequestWrapper(localName = "mutateLabel", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601", className = "com.google.api.ads.adwords.jaxws.v201601.cm.AdGroupAdServiceInterfacemutateLabel")
    @ResponseWrapper(localName = "mutateLabelResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601", className = "com.google.api.ads.adwords.jaxws.v201601.cm.AdGroupAdServiceInterfacemutateLabelResponse")
    public AdGroupAdLabelReturnValue mutateLabel(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601")
        List<AdGroupAdLabelOperation> operations)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns a list of AdGroupAds based on the query.
     *         
     *         @param query The SQL-like AWQL query string.
     *         @return A list of AdGroupAds.
     *         @throws ApiException if problems occur while parsing the query or fetching AdGroupAds.
     *       
     * 
     * @param query
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201601.cm.AdGroupAdPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601")
    @RequestWrapper(localName = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601", className = "com.google.api.ads.adwords.jaxws.v201601.cm.AdGroupAdServiceInterfacequery")
    @ResponseWrapper(localName = "queryResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601", className = "com.google.api.ads.adwords.jaxws.v201601.cm.AdGroupAdServiceInterfacequeryResponse")
    public AdGroupAdPage query(
        @WebParam(name = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601")
        String query)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Upgrades the url for a set of ads.
     *         @param operations The list of upgrades to apply.
     *         @return The list of Ads that were upgraded.
     *       
     * 
     * @param operations
     * @return
     *     returns java.util.List<com.google.api.ads.adwords.jaxws.v201601.cm.Ad>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601")
    @RequestWrapper(localName = "upgradeUrl", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601", className = "com.google.api.ads.adwords.jaxws.v201601.cm.AdGroupAdServiceInterfaceupgradeUrl")
    @ResponseWrapper(localName = "upgradeUrlResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601", className = "com.google.api.ads.adwords.jaxws.v201601.cm.AdGroupAdServiceInterfaceupgradeUrlResponse")
    public List<Ad> upgradeUrl(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601")
        List<AdUrlUpgrade> operations)
        throws ApiException_Exception
    ;

}
