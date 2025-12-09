package srms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students;

    // Constructor: just creates the ArrayList so we can store students in it
    public StudentManager() {
        students = new ArrayList<>();
    }

    // Add a student to the list
    public void addStudent(Student s) {
        students.add(s); // simply push the student into the ArrayList
    }

    // Remove student by ID
    public boolean removeStudent(String id) {
        // looping through all students to find the one with this ID
        for (Student s : students) {
            if (s.getId().equals(id)) {
                students.remove(s); // remove the student once we find them
                return true;        // return true meaning it worked
            }
        }
        return false; // if we reach here, student wasn't found
    }

    // Find a student using ID
    public Student findStudent(String id) {
        // same idea as remove but we return the student instead
        for (Student s : students) {
            if (s.getId().equals(id)) {
                return s;
            }
        }
        return null; // if not found
    }

    // Update student information (name, gpa, department)
    public boolean updateStudent(String id, String newName, double newGpa, Department newDepartment) {
        Student s = findStudent(id); // first we try to locate the student
        if (s != null) {
            // then we update their data
            s.setName(newName);
            s.setGpa(newGpa);
            s.setDepartment(newDepartment);
            return true;
        }
        return false; // update failed if student doesn't exist
    }

    // Display all students in the system
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found."); // nothing to print
            return;
        }

        // looping and printing each student info
        for (Student s : students) {
            s.display();
            System.out.println("-----------------------"); // just a separator for better view
        }
    }

    // Returns the whole list (useful for file saving)
    public ArrayList<Student> getAllStudents() {
        return students;
    }

    // Load students from a file (this is extra, makes importing easier)
    public void addStudentsFromFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            // reading each line from the file (each line = one student)
            while ((line = br.readLine()) != null) {
                String[] data = line.split(","); // split using commas

                String id = data[0];
                String name = data[1];
                double gpa = Double.parseDouble(data[2]);
                String deptName = data[3];

                // create a department for the student
                Department dept = new Department(deptName, 100);

                // make the student object
                Student s = new Student(id, name, gpa, dept);

                addStudent(s); // save it into our list
            }

            System.out.println("Students added from file!");
        } catch (Exception e) {
            // if file not found or something went wrong
            System.out.println("Error loading file: " + e.getMessage());
        }
    }
}
