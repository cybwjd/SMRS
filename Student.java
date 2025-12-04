package srms;

public class Student {
    private String id;
    private String name;
    private double gpa;
    private Department department;

    public Student(String id, String name, double gpa, Department department) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.department = department;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public double getGpa() { return gpa; }
    public Department getDepartment() { return department; }

    public void setId(String id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setGpa(double gpa) { this.gpa = gpa; }
    public void setDepartment(Department department) { this.department = department; }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("GPA: " + gpa);
        System.out.println("Department: " + department.getDeptname());
    }
}
