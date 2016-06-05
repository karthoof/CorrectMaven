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
}
