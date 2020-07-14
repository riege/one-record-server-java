
package org.iata.cargo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLDataProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLObjectProperty;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraint;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraints;
import cz.cvut.kbss.jopa.model.annotations.Types;
import io.swagger.annotations.ApiModelProperty;
import org.iata.cargo.Vocabulary;

import java.io.Serializable;
import java.util.Set;


/**
 * Quote request details
 * 
 * This class was generated by OWL2Java 0.14.6
 * 
 */
@OWLClass(iri = Vocabulary.s_c_QuoteRequest)
public class QuoteRequest
    extends LogisticsObject
    implements Serializable
{

    @Types
    @JsonProperty("@type")
    @ApiModelProperty(allowableValues = Vocabulary.s_c_QuoteRequest)
    protected Set<String> types;

    /**
     * Reference to the product and commodity details of the pieces in the shipment
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_commodity_A)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_commodity_A)
    protected Product commodity;
    /**
     * Reference to the Dangerous Goods specific details of the shipment if applicable or requested
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_dangerousGoods_A)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_dangerousGoods_A)
    protected DangerousGoods dangerousGoods;
    /**
     * Parties involved if known
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_parties)
    @JsonProperty(Vocabulary.s_p_parties)
    protected Set<OtherParty> parties;
    /**
     * Ratings preferences of the request
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_ratingsPreference)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_ratingsPreference)
    protected Ratings ratingsPreference;
    /**
     * Routing details that are part of the request, these details will be used to determine if the offer is a perfect match
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_routingPreferences)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_routingPreferences)
    protected Routing routingPreferences;
    /**
     * Reference to the Service requests of the quote request
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_serviceRequest_A_A)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_serviceRequest_A_A)
    protected ServiceRequest serviceRequest;
    /**
     * Details of the shipement that is to be shipped
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_shipmentDetails_A)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_shipmentDetails_A)
    protected Shipment shipmentDetails;
    /**
     * Special handling details
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_specialHandling_A_A)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_specialHandling_A_A)
    protected SpecialHandling specialHandling;
    /**
     * Transport segment linked to the request, including the Departure and Arrival locations requested
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_transportMovement_A)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_transportMovement_A)
    protected TransportSegment transportMovement;
    /**
     * Unit preferences of the request (e.g. kg or cm)
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_unitsPreference)
    @JsonProperty(Vocabulary.s_p_unitsPreference)
    protected Set<Value> unitsPreference;
    /**
     * Indicate the secruty state of the shipment, screened or not
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_shipmentSecurityStatus)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_shipmentSecurityStatus)
    protected String shipmentSecurityStatus;

    public void setCommodity(Product commodity) {
        this.commodity = commodity;
    }

    public Product getCommodity() {
        return commodity;
    }

    public void setDangerousGoods(DangerousGoods dangerousGoods) {
        this.dangerousGoods = dangerousGoods;
    }

    public DangerousGoods getDangerousGoods() {
        return dangerousGoods;
    }

    public void setParties(Set<OtherParty> parties) {
        this.parties = parties;
    }

    public Set<OtherParty> getParties() {
        return parties;
    }

    public void setRatingsPreference(Ratings ratingsPreference) {
        this.ratingsPreference = ratingsPreference;
    }

    public Ratings getRatingsPreference() {
        return ratingsPreference;
    }

    public void setRoutingPreferences(Routing routingPreferences) {
        this.routingPreferences = routingPreferences;
    }

    public Routing getRoutingPreferences() {
        return routingPreferences;
    }

    public void setServiceRequest(ServiceRequest serviceRequest) {
        this.serviceRequest = serviceRequest;
    }

    public ServiceRequest getServiceRequest() {
        return serviceRequest;
    }

    public void setShipmentDetails(Shipment shipmentDetails) {
        this.shipmentDetails = shipmentDetails;
    }

    public Shipment getShipmentDetails() {
        return shipmentDetails;
    }

    public void setSpecialHandling(SpecialHandling specialHandling) {
        this.specialHandling = specialHandling;
    }

    public SpecialHandling getSpecialHandling() {
        return specialHandling;
    }

    public void setTransportMovement(TransportSegment transportMovement) {
        this.transportMovement = transportMovement;
    }

    public TransportSegment getTransportMovement() {
        return transportMovement;
    }

    public void setUnitsPreference(Set<Value> unitsPreference) {
        this.unitsPreference = unitsPreference;
    }

    public Set<Value> getUnitsPreference() {
        return unitsPreference;
    }

    public void setShipmentSecurityStatus(String shipmentSecurityStatus) {
        this.shipmentSecurityStatus = shipmentSecurityStatus;
    }

    public String getShipmentSecurityStatus() {
        return shipmentSecurityStatus;
    }


    public Set<String> getTypes() {
        return types;
    }


    public void setTypes(Set<String> types) {
        this.types = types;
    }

}