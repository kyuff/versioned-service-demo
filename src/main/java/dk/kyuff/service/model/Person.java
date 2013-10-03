package dk.kyuff.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonView;
import dk.kyuff.service.Version;

import javax.persistence.Entity;

/**
 * User: swi
 * Date: 03/10/13
 * Time: 19.30
 */
@Entity
public class Person {

    private int id;
    private String firstName;
    private String lastName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @JsonView({Version.V1.class})
    public String getFirstName() {
        return firstName==null?"":firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonView({Version.V1.class})
    public String getLastName() {
        return lastName==null?"":lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonView({Version.V2.class})
    public String getFullName() {
        return (getFirstName() + " " + getLastName()).trim();
    }

    @JsonView({Version.V2.class})
    public void setFullName(String fullName) {
        if( fullName == null || fullName.isEmpty()) {
            setFirstName("");
            setLastName("");
            return;
        }
        int firstSpace = fullName.indexOf(" ");
        if(firstSpace < 0) {
            setFirstName(fullName);
            setLastName("");
            return;
        }

        setFirstName(fullName.substring(0, firstSpace));
        setLastName(fullName.substring(firstSpace).trim());

    }
}
