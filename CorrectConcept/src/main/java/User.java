/**
 * Created by artemkopytok on 03.06.16.
 */
public class User {

    private Long id;
    private String name;
    private String lastName;
    private Role roles;
    private BusyStatus status;

    public User() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Role getRoles() {
        return roles;
    }

    public void setRoles(Role roles) {
        this.roles = roles;
    }

    public BusyStatus getStatus() {
        return status;
    }

    public void setStatus(BusyStatus status) {
        this.status = status;
    }
}
