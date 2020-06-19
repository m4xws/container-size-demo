package de.maxwell.container_size_demo.application.greet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.RequestScoped;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("greet")
@Produces(MediaType.APPLICATION_JSON)
@RequestScoped
public class GreetResource {
  private static final Logger LOG = LoggerFactory.getLogger(GreetResource.class);

  @GET
  public Response getGreet() {

    JsonObject jsonResponse = Json
        .createObjectBuilder()
        .add("greeting", "hello")
        .build();

    LOG.info("Hello");

    return Response
        .ok(jsonResponse)
        .build();
  }
}
