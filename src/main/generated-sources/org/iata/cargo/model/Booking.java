
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
import java.time.Duration;
import java.util.Date;
import java.util.Set;


/**
 * Booking details
 * 
 * This class was generated by OWL2Java 0.15.0
 * 
 */
@OWLClass(iri = Vocabulary.s_c_Booking)
public class Booking
    extends LogisticsObject
    implements Serializable
{

    @Types
    @JsonProperty("@type")
    @ApiModelProperty(allowableValues = Vocabulary.s_c_Booking)
    protected Set<String> types;

    /**
     * Carrier details
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_carrier)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, min = 1, max = -1)
    })
    @JsonProperty(Vocabulary.s_p_carrier)
    protected Set<Company> carrier;
    /**
     * Reference to the Carrier products included in the offer
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_carrierProductInfo)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_carrierProductInfo)
    protected CarrierProduct carrierProductInfo;
    /**
     * Consignee details
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_consignee)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_consignee)
    protected Company consignee;
    /**
     * Freight Forwarder details
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_freightForwarder)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, min = 1, max = -1)
    })
    @JsonProperty(Vocabulary.s_p_freightForwarder)
    protected Set<Company> freightForwarder;
    /**
     * Other parties to be notified of the booking evolution
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_notifyParty)
    @JsonProperty(Vocabulary.s_p_notifyParty)
    protected Set<Company> notifyParty;
    /**
     * Price of the Booking (if different from the offer)
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_price)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_price)
    protected Price price;
    /**
     * Reference to the Request
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_requestRef)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_requestRef)
    protected Request requestRef;
    /**
     * Routing details of the offer, to be compared with routing preferences of the quote request
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_routing)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_routing)
    protected Routing routing;
    /**
     * Details of the shipement that is to be shipped
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_shipmentDetails)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_shipmentDetails)
    protected Shipment shipmentDetails;
    /**
     * Shipper information
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_shipper)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_shipper)
    protected Company shipper;
    /**
     * Transport segment linked to the offer, including the Departure and Arrival locations
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_transportMovement)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_transportMovement)
    protected TransportSegment transportMovement;
    /**
     * House or Master Waybill unique identifier
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_waybillNumber)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_waybillNumber)
    protected Waybill waybillNumber;
    /**
     * Status of the Booking with regards to the step in the Quote & Book process: Quoted, Booked
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_bookingStatus)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/1999/02/22-rdf-syntax-ns#PlainLiteral", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_bookingStatus)
    protected String bookingStatus;
    /**
     * Latest Acceptance time as per CargoIQ definition
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_latestAcceptanceTime)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#dateTime", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_latestAcceptanceTime)
    protected Date latestAcceptanceTime;
    /**
     * Indicates if the offer is a perfect match to the quote request (boolean)
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_requestMatchInd)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#boolean", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_requestMatchInd)
    protected Boolean requestMatchInd;
    /**
     * Indicate the secruty state of the shipment, screened or not
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_shipmentSecurityStatus)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/1999/02/22-rdf-syntax-ns#PlainLiteral", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_shipmentSecurityStatus)
    protected String shipmentSecurityStatus;
    /**
     * Time of availability of the shipment as per CargoIQ definition
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_timeOfAvailability)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#dateTime", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_timeOfAvailability)
    protected Date timeOfAvailability;
    /**
     * Total transit time as per CargoIQ definition
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_totalTransitTime)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/1999/02/22-rdf-syntax-ns#PlainLiteral", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_totalTransitTime)
    protected Duration totalTransitTime;

    public void setCarrier(Set<Company> carrier) {
        this.carrier = carrier;
    }

    public Set<Company> getCarrier() {
        return carrier;
    }

    public void setCarrierProductInfo(CarrierProduct carrierProductInfo) {
        this.carrierProductInfo = carrierProductInfo;
    }

    public CarrierProduct getCarrierProductInfo() {
        return carrierProductInfo;
    }

    public void setConsignee(Company consignee) {
        this.consignee = consignee;
    }

    public Company getConsignee() {
        return consignee;
    }

    public void setFreightForwarder(Set<Company> freightForwarder) {
        this.freightForwarder = freightForwarder;
    }

    public Set<Company> getFreightForwarder() {
        return freightForwarder;
    }

    public void setNotifyParty(Set<Company> notifyParty) {
        this.notifyParty = notifyParty;
    }

    public Set<Company> getNotifyParty() {
        return notifyParty;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Price getPrice() {
        return price;
    }

    public void setRequestRef(Request requestRef) {
        this.requestRef = requestRef;
    }

    public Request getRequestRef() {
        return requestRef;
    }

    public void setRouting(Routing routing) {
        this.routing = routing;
    }

    public Routing getRouting() {
        return routing;
    }

    public void setShipmentDetails(Shipment shipmentDetails) {
        this.shipmentDetails = shipmentDetails;
    }

    public Shipment getShipmentDetails() {
        return shipmentDetails;
    }

    public void setShipper(Company shipper) {
        this.shipper = shipper;
    }

    public Company getShipper() {
        return shipper;
    }

    public void setTransportMovement(TransportSegment transportMovement) {
        this.transportMovement = transportMovement;
    }

    public TransportSegment getTransportMovement() {
        return transportMovement;
    }

    public void setWaybillNumber(Waybill waybillNumber) {
        this.waybillNumber = waybillNumber;
    }

    public Waybill getWaybillNumber() {
        return waybillNumber;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setLatestAcceptanceTime(Date latestAcceptanceTime) {
        this.latestAcceptanceTime = latestAcceptanceTime;
    }

    public Date getLatestAcceptanceTime() {
        return latestAcceptanceTime;
    }

    public void setRequestMatchInd(Boolean requestMatchInd) {
        this.requestMatchInd = requestMatchInd;
    }

    public Boolean getRequestMatchInd() {
        return requestMatchInd;
    }

    public void setShipmentSecurityStatus(String shipmentSecurityStatus) {
        this.shipmentSecurityStatus = shipmentSecurityStatus;
    }

    public String getShipmentSecurityStatus() {
        return shipmentSecurityStatus;
    }

    public void setTimeOfAvailability(Date timeOfAvailability) {
        this.timeOfAvailability = timeOfAvailability;
    }

    public Date getTimeOfAvailability() {
        return timeOfAvailability;
    }

    public void setTotalTransitTime(Duration totalTransitTime) {
        this.totalTransitTime = totalTransitTime;
    }

    public Duration getTotalTransitTime() {
        return totalTransitTime;
    }

    public Set<String> getTypes() {
        return types;
    }

    public void setTypes(Set<String> types) {
        this.types = types;
    }

}
