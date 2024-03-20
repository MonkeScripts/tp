package seedu.duke;
import java.util.HashMap;
import java.util.ArrayList;

public class Group {
    protected String name;
    protected ArrayList<User> users;
    public static final HashMap<String, Group> groups = new HashMap<>();

    public Group(String name) {
        this.name = name;
        this.users = new ArrayList<>();
    }

    public static Group getOrCreateGroup(String groupName) {
        Group group = groups.get(groupName);
        if (group == null) {
            group = new Group(groupName);
            groups.put(groupName, group);
            System.out.println("Created New Group: " + groupName);
        } else {
            System.out.println("Entering group: " + groupName);
        }
        return group;
    }

    public void addUsers(User user) {
        users.add(user);
        System.out.println("User " + user.getName() + " added to group " + this.name);
    }
}
