package srms;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileHandler {

    public static void saveStudents(StudentManager manager, String fileName) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {

            for (Student s : manager.getAllStudents()) {
                writer.println(
                    s.getId() + "," +
                    s.getName() + "," +
                    s.getGpa() + "," +
                    s.getDepartment().getDeptname() 
                );
            }
            System.out.println("Data saved successfully!");

        } catch (IOException e) {
            System.out.println("Error saving: " + e.getMessage());
        }
    }

    public static void loadStudents(StudentManager manager, String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                String id = data[0];
                String name = data[1];
                double gpa = Double.parseDouble(data[2]);
                String deptName = data[3];

              
                Department dept = new Department(deptName, 100);

                Student student = new Student(id, name, gpa, dept);

                manager.addStudent(student);
            }
            System.out.println("Data loaded successfully!");

        } catch (IOException e) {
            System.out.println("Error loading: " + e.getMessage());
        }
    }
}
