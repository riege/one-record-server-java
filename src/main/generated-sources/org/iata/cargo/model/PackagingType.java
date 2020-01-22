
package org.iata.cargo.model;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import cz.cvut.kbss.jopa.model.annotations.Id;
import cz.cvut.kbss.jopa.model.annotations.OWLAnnotationProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLDataProperty;
import cz.cvut.kbss.jopa.model.annotations.Properties;
import cz.cvut.kbss.jopa.model.annotations.Types;
import cz.cvut.kbss.jopa.vocabulary.RDFS;
import org.iata.cargo.Vocabulary;


/**
 * Packaging details 
 * 
 * This class was generated by OWL2Java 0.13.3
 * 
 */
@OWLClass(iri = Vocabulary.s_c_PackagingType)
public class PackagingType
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
     * Packaging type identifier as per UNECE Rec 21 Annex V and VI e.g. 1A - Drum, steel
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_code_A_A_A_A)
    protected Set<String> code;
    /**
     * If no Code provided, packaging type description
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_description_A_A)
    protected Set<String> description1;

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
        return ((((("PackagingType {"+ name)+"<")+ id)+">")+"}");
    }

    public void setCode(Set<String> code) {
        this.code = code;
    }

    public Set<String> getCode() {
        return code;
    }

    public void setDescription1(Set<String> description1) {
        this.description1 = description1;
    }

    public Set<String> getDescription1() {
        return description1;
    }

}
