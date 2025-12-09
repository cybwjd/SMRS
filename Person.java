package srms;

public class Person {
    protected String id;
    protected String name;

    // Constructor: just saving the basic info for the person
    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter: returns the ID
    public String getId() {
        return id;
    }

    // Getter: returns the name
    public String getName() {
        return name;
    }

    // Setter: change the ID if needed
    public void setId(String id) {
        this.id = id;
    }

    // Setter: change the name
    public void setName(String name) {
        this.name = name;
    }

    // Just prints the person info on the screen
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}
