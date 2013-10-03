package dk.kyuff.service.actions;

import com.fasterxml.jackson.annotation.JsonView;
import dk.kyuff.service.Version;
import dk.kyuff.service.model.Person;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * User: swi
 * Date: 03/10/13
 * Time: 18.55
 */
@Path("/person")
public class PersonResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}/1")
    @JsonView(Version.V1.class)
    public Person read1(@PathParam("id")int id) {
        return getPerson(id);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}/2")
    @JsonView(Version.V2.class)
    public Person read2(@PathParam("id")int id) {
        return getPerson(id);
    }

    private Person getPerson(int id) {
        Person person = new Person();
        person.setId(id);
        person.setFirstName("Per");
        person.setLastName("Hansen");
        return person;
    }
}
