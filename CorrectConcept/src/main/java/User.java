/**
 * Created by artemkopytok on 03.06.16.
 */
public class User {

    Integer id;
    String name;
    String lastName;
    Rolesss rolesss;
    BusyStatus status;

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Rolesss getRolesss() {
        return rolesss;
    }

    public void setRolesss(Rolesss rolesss) {
        this.rolesss = rolesss;
    }

    public BusyStatus getStatus() {
        return status;
    }

    public void setStatus(BusyStatus status) {
        this.status = status;
    }
}
