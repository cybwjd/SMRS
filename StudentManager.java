
package srms;

import java.util.ArrayList; //مكتبه التخزين

public class StudentManager {

    private ArrayList<Student> students;

    // Constructor EZ
    public StudentManager() {
        students = new ArrayList<>();
    }

    // Add a student فنكشن الادنق
    public void addStudent(Student s) {
        students.add(s);
    }

    /* Remove a student by ID 
   لوب يمر على كل الطلاب بالليست ثم ندخل الاف ونشوف الرقم
    يساوي المطلوب اولا نسويله ريموف ترو اذا تم وفولس اذا ما لقيناه */
    public boolean removeStudent(String id) {
        for (Student s : students) {
            if (s.getId().equals(id)) {
                students.remove(s);
                return true;
            }
        }
        return false;
    }

    /*Find a student by ID
    نفس الريموف بس سيرش
    */
    public Student findStudent(String id) {
        for (Student s : students) {
            if (s.getId().equals(id)) {
                return s;
            }
        }
        return null;
    }

    //Update student data :
    public boolean updateStudent(String id, String newName, double newGpa, Department newDepartment) {
        Student s = findStudent(id); // find by id 
        if (s != null) { // اذا لقت الطالب تحدث بياناته من عند السيتر ترو اذا تم وفولس اذا ما لقته
            s.setName(newName);
            s.setGpa(newGpa);
            s.setDepartment(newDepartment);
            return true;
        }
        return false;
    }

    // Display all students
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for (Student s : students) {
            s.display();  // نستخدم display() من الكلاس Student
        }
    }

    // Getter for all students توصلني للاراي ليست اسهل
    public ArrayList<Student> getAllStudents() {
        return students;
    }
}
