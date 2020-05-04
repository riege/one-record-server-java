
package org.iata.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import cz.cvut.kbss.jopa.model.annotations.Id;
import cz.cvut.kbss.jopa.model.annotations.OWLAnnotationProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLDataProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLObjectProperty;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraint;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraints;
import cz.cvut.kbss.jopa.model.annotations.Properties;
import cz.cvut.kbss.jopa.model.annotations.Types;
import cz.cvut.kbss.jopa.vocabulary.RDFS;
import org.iata.api.Vocabulary;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;


/**
 * Subscription information sent to the publisher
 * 
 * This class was generated by OWL2Java 0.14.1
 * 
 */
@OWLClass(iri = Vocabulary.s_c_Subscription)
@Document(collection = "subscriptions")
public class Subscription
    implements Serializable
{

    @Id(generated = true)
@JsonProperty("@id")
    protected String id;
    @JsonIgnore
    @OWLAnnotationProperty(iri = RDFS.LABEL)
    protected String name;
    @JsonIgnore
    @OWLAnnotationProperty(iri = cz.cvut.kbss.jopa.vocabulary.DC.Elements.DESCRIPTION)
    protected String description;
    @Types
@JsonProperty("@type")
    protected Set<String> types;
    @Properties
    @JsonIgnore
    protected Map<String, Set<String>> properties;

    /**
     * Non mandatory error details
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_error_A_A)
    protected Set<Error> error;
    /**
     * Duration of the period to cache the subscription information in seconds
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_cacheFor)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String cacheFor;
    /**
     * Callback URL of the Client Subscription API where the subscriber receives Logistics Objects
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_callbackUrl)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", min = 1, max = -1),
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String callbackUrl;
    /**
     * Content type that the subscriber wants to receive in the notifications
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_contentType)
    protected Set<String> contentType;
    /**
     * Either a secret or API Key that ensures that only companies with this subscription information can POST to the subscriber callback endpoint
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_secret)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String secret;
    /**
     * Flag specifying if the publisher should send the whole logistics object or not in the notification object
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_sendLogisticsObjectBody)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#boolean", max = 1)
    })
    protected Boolean sendLogisticsObjectBody;
    /**
     * Flag specifying if the subscriber wants to receive updates for a Logistics Object
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_subscribeToStatusUpdates)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#boolean", max = 1)
    })
    protected Boolean subscribeToStatusUpdates;
    /**
     * Company Identifier of the company the subscriber wants to subscribe to (delegation scenario).
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_subscribedTo)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", min = 1, max = -1),
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String subscribedTo;
    /**
     * The Logistics Object type to which the subscriber wants subscribe to
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_topic_A)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", min = 1, max = -1)
    })
    protected Set<String> topic;

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
        return ((((("Subscription {"+ name)+"<")+ id)+">")+"}");
    }

    public void setError(Set<Error> error) {
        this.error = error;
    }

    public Set<Error> getError() {
        return error;
    }

    public void setCacheFor(String cacheFor) {
        this.cacheFor = cacheFor;
    }

    public String getCacheFor() {
        return cacheFor;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setContentType(Set<String> contentType) {
        this.contentType = contentType;
    }

    public Set<String> getContentType() {
        return contentType;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getSecret() {
        return secret;
    }

    public void setSendLogisticsObjectBody(Boolean sendLogisticsObjectBody) {
        this.sendLogisticsObjectBody = sendLogisticsObjectBody;
    }

    public Boolean getSendLogisticsObjectBody() {
        return sendLogisticsObjectBody;
    }

    public void setSubscribeToStatusUpdates(Boolean subscribeToStatusUpdates) {
        this.subscribeToStatusUpdates = subscribeToStatusUpdates;
    }

    public Boolean getSubscribeToStatusUpdates() {
        return subscribeToStatusUpdates;
    }

    public void setSubscribedTo(String subscribedTo) {
        this.subscribedTo = subscribedTo;
    }

    public String getSubscribedTo() {
        return subscribedTo;
    }

    public void setTopic(Set<String> topic) {
        this.topic = topic;
    }

    public Set<String> getTopic() {
        return topic;
    }

}
