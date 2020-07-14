
package org.iata.cargo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLDataProperty;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraint;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraints;
import cz.cvut.kbss.jopa.model.annotations.Types;
import io.swagger.annotations.ApiModelProperty;
import org.iata.cargo.Vocabulary;

import java.io.Serializable;
import java.util.Set;


/**
 * Carrier product details
 * 
 * This class was generated by OWL2Java 0.14.6
 * 
 */
@OWLClass(iri = Vocabulary.s_c_CarrierProduct)
public class CarrierProduct
    extends LogisticsObject
    implements Serializable
{

    @Types
    @JsonProperty("@type")
    @ApiModelProperty(allowableValues = Vocabulary.s_c_CarrierProduct)
    protected Set<String> types;

    /**
     * Carrier's product code
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_productCode)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_productCode)
    protected String productCode;
    /**
     * Carrier's product description
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_productDescription)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_productDescription)
    protected String productDescription;

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductDescription() {
        return productDescription;
    }


    public Set<String> getTypes() {
        return types;
    }


    public void setTypes(Set<String> types) {
        this.types = types;
    }

}