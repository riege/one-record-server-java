
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
 * Waybill details
 * 
 * This class was generated by OWL2Java 0.15.0
 * 
 */
@OWLClass(iri = Vocabulary.s_c_Waybill)
public class Waybill
    extends LogisticsObject
    implements Serializable
{

    @Types
    @JsonProperty("@type")
    @ApiModelProperty(allowableValues = Vocabulary.s_c_Waybill)
    protected Set<String> types;

    /**
     * Refers to the Booking 
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_bookingRef_A)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_bookingRef_A)
    protected Booking bookingRef;
    /**
     * Refers to the Waybill(s) contained
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_containedWaybill)
    @JsonProperty(Vocabulary.s_p_containedWaybill)
    protected Set<Waybill> containedWaybill;
    /**
     * House or Master Waybill unique identifier
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_waybillNumber_A_A)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#long", min = 1, max = -1),
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#long", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_waybillNumber_A_A)
    protected Long waybillNumber;
    /**
     * Prefix used for the Waybill Number
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_waybillPrefix)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#integer", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_waybillPrefix)
    protected Integer waybillPrefix;
    /**
     * Type of the Waybill: House or Master
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_waybillType)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/1999/02/22-rdf-syntax-ns#PlainLiteral", min = 1, max = -1),
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/1999/02/22-rdf-syntax-ns#PlainLiteral", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_waybillType)
    protected String waybillType;

    public void setBookingRef(Booking bookingRef) {
        this.bookingRef = bookingRef;
    }

    public Booking getBookingRef() {
        return bookingRef;
    }

    public void setContainedWaybill(Set<Waybill> containedWaybill) {
        this.containedWaybill = containedWaybill;
    }

    public Set<Waybill> getContainedWaybill() {
        return containedWaybill;
    }

    public void setWaybillNumber(Long waybillNumber) {
        this.waybillNumber = waybillNumber;
    }

    public Long getWaybillNumber() {
        return waybillNumber;
    }

    public void setWaybillPrefix(Integer waybillPrefix) {
        this.waybillPrefix = waybillPrefix;
    }

    public Integer getWaybillPrefix() {
        return waybillPrefix;
    }

    public void setWaybillType(String waybillType) {
        this.waybillType = waybillType;
    }

    public String getWaybillType() {
        return waybillType;
    }

    public Set<String> getTypes() {
        return types;
    }

    public void setTypes(Set<String> types) {
        this.types = types;
    }

}
