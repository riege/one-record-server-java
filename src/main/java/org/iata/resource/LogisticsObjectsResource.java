package org.iata.resource;

import cz.cvut.kbss.jsonld.JsonLd;
import io.swagger.annotations.Api;
import org.iata.model.LogisticsObject;
import org.iata.service.LogisticsObjectsService;
import org.iata.util.RestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import javax.validation.Valid;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.PATCH;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping(value = "/", produces = "application/json")
@Validated
@Api(value = "ONE Record Server")
public class LogisticsObjectsResource {

  private static final Logger LOG = LoggerFactory.getLogger(LogisticsObjectsResource.class);

  private final LogisticsObjectsService logisticsObjectsService;

  @Inject
  public LogisticsObjectsResource(LogisticsObjectsService logisticsObjectsService) {
    this.logisticsObjectsService = logisticsObjectsService;
  }

  @RequestMapping(method = POST, value = "/companies/{companyId}/los", consumes = {JsonLd.MEDIA_TYPE, MediaType.APPLICATION_JSON_VALUE})
  @ResponseStatus(HttpStatus.CREATED)
  public ResponseEntity<Void> addLogisticsObject(@Valid @RequestBody LogisticsObject logisticsObject) {
    final HttpHeaders headers = RestUtils.createLocationHeaderFromCurrentUri("/{loId}", "TODO"); //TODO
    return new ResponseEntity<>(headers, HttpStatus.CREATED);
  }

  @RequestMapping(method = GET, value = "/companies/{companyId}/los", produces={JsonLd.MEDIA_TYPE, MediaType.APPLICATION_JSON_VALUE})
  public ResponseEntity<List<LogisticsObject>> getLogisticsObjects(@PathVariable("companyId") String companyId) {
    return new ResponseEntity<>(logisticsObjectsService.findByCompanyId(companyId), HttpStatus.OK);
  }

  @RequestMapping(method = GET, value = "/companies/{companyId}/los/{loId}", produces={JsonLd.MEDIA_TYPE, MediaType.APPLICATION_JSON_VALUE})
  public ResponseEntity<LogisticsObject> getLogisticsObject(@PathVariable("companyId") String companyId, @PathVariable("loId") String loiId) {
    return null;
  }

  @RequestMapping(method = PATCH, value = "/companies/{companyId}/los/{loId}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  // TODO PATCH body must match the spec
  public ResponseEntity updateLogisticsObject(@PathVariable("companyId") String companyId, @PathVariable("loId") String loiId, @RequestBody LogisticsObject logisticsObject) {
    return null;
  }

}
