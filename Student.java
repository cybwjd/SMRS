package srms;

public class Student extends Person {
    private double gpa;
    private Department department;

    // Constructor for Student class, takes the student's info
    public Student(String id, String name, double gpa, Department department) {
        super(id, name); // calling Person constructor to set id and name
        this.gpa = gpa;
        this.department = department; // saving the department as an object
    }

    public double getGpa() {
        return gpa; // return the student's GPA
    }

    public Department getDepartment() {
        return department; // return the department object
    }

    public void setGpa(double gpa) {
        this.gpa = gpa; // update GPA if needed
    }

    public void setDepartment(Department department) {
        this.department = department; // change the student's department
    }

    @Override
    public void display() {
        super.display(); // prints ID and name from Person
        System.out.println("GPA: " + gpa); // print the student's GPA
        System.out.println("Department: " + department.getDeptname()); // print department name
    }
}
