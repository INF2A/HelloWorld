package main.java;

import org.json.JSONObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/")
public class HelloWorld {
    //LOCALHOST:8080/helloworld
    @Path("/helloworld")
    @GET
    @Produces("application/json")
    public Response sayHello()
    {
        JSONObject obj = new JSONObject();  //Instantiate new JSONObject
        obj.put("HelloWorld", "Hello World");   //Put value in JSONObject
        return Response.status(200).entity(obj.toString()).build(); /* Return HTTP status code (2xx = OK,
                                                                                                3xx = Redirection,
                                                                                                4xx = client errors,
                                                                                                5xx = server errors )
                                                                                                with JSONObject to string as entity to be printed out. */
    }

    //LOCALHOST:8080/hello/{NAME}
    @Path("/hello/{n}")
    @GET
    @Produces("application/json")
    public Response sayHello(@PathParam("n") String s) {
        JSONObject obj = new JSONObject();  //Instantiate new JSONObject
        obj.put("Hello",s); //Put value in JSONObject
        return Response.ok(obj.toString()).build(); /* Return HTTP status code (2xx = OK,
                                                                                3xx = Redirection,
                                                                                4xx = client errors,
                                                                                5xx = server errors )
                                                                                with JSONObject to string as entity to be printed out. */
    }
}