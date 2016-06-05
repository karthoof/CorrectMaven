import java.util.List;

/**
 * Created by artemkopytok on 03.06.16.
 */
public class Project {

    private Long id;
    private String name;
    private String description;
    private List<User> users; //GENERIC Содержательно Юзеров, реализация через Arraylist
    private List<Task> tasks;

    public Project() {

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
