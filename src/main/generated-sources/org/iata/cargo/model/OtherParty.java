
package org.iata.cargo.model;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import cz.cvut.kbss.jopa.model.annotations.Id;
import cz.cvut.kbss.jopa.model.annotations.OWLAnnotationProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLDataProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLObjectProperty;
import cz.cvut.kbss.jopa.model.annotations.Properties;
import cz.cvut.kbss.jopa.model.annotations.Types;
import cz.cvut.kbss.jopa.vocabulary.RDFS;
import org.iata.cargo.Vocabulary;


/**
 * Company details
 * 
 * This class was generated by OWL2Java 0.13.3
 * 
 */
@OWLClass(iri = Vocabulary.s_c_OtherParty)
public class OtherParty
    implements Serializable
{

    @Id(generated = true)
    protected String id;
    @OWLAnnotationProperty(iri = RDFS.LABEL)
    protected String name;
    @OWLAnnotationProperty(iri = cz.cvut.kbss.jopa.vocabulary.DC.Elements.DESCRIPTION)
    protected String description;
    @Types
    protected Set<String> types;
    @Properties
    protected Map<String, Set<String>> properties;
    /**
     * Company details
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_companyDetails)
    protected Set<Company> companyDetails;
    /**
     * Role of other party - e.g. Notify party, Nominated agent, Customs broker, Manufacturer, Importer, Payer, Payee, ShipTo, ShipFrom, BillTo, BillFrom, RemitTo, RemitFrom 
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_roleName)
    protected Set<String> roleName;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setTypes(Set<String> types) {
        this.types = types;
    }

    public Set<String> getTypes() {
        return types;
    }

    public void setProperties(Map<String, Set<String>> properties) {
        this.properties = properties;
    }

    public Map<String, Set<String>> getProperties() {
        return properties;
    }

    @Override
    public String toString() {
        return ((((("OtherParty {"+ name)+"<")+ id)+">")+"}");
    }

    public void setCompanyDetails(Set<Company> companyDetails) {
        this.companyDetails = companyDetails;
    }

    public Set<Company> getCompanyDetails() {
        return companyDetails;
    }

    public void setRoleName(Set<String> roleName) {
        this.roleName = roleName;
    }

    public Set<String> getRoleName() {
        return roleName;
    }

}
