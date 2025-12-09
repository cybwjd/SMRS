package srms;

public class Department {

    private String deptname;
    private Student[] students;
    private int studentCount;

    // Constructor for the department
    // here we pass the department name + the max number of students it can hold
    public Department(String deptname, int maxStudents) {
        this.deptname = deptname;

        // creating the student array based on max size
        this.students = new Student[maxStudents];

        // at the beginning the department has 0 students
        this.studentCount = 0;
    }

    public void setDeptname(String deptname) { 
        // updating the department name if needed
        this.deptname = deptname; 
    }

    public void setStudentCount(int studentCount) { 
        // honestly we usually don't change this manually but it's here anyway
        this.studentCount = studentCount; 
    }

    public String getDeptname() { 
        return deptname; 
    }

    public int getStudentCount() { 
        return studentCount; 
    }

    public Student[] getStudents() { 
        // returns the whole array (including some null spots maybe)
        return students; 
    }

    // This method adds a student to the department
    public boolean addStudent(Student student) {
        // checking if there is free space in the array
        if (studentCount < students.length) {
            // put the student in the next free index
            students[studentCount] = student;

            // increase count because we added a student
            studentCount++;

            return true;
        } else {
            // department is full (no more space)
            System.out.println("Department is full");
            return false;
        }
    }

    // Method to remove a student by ID
    public boolean removeStudent(String id) {
        // looping through the valid students only
        for (int i = 0; i < studentCount; i++) {

            // if we find the student with the same ID
            if (students[i].getId().equals(id)) {

                // replace the removed student with the last student in the list
                students[i] = students[studentCount - 1];

                // remove the last student spot by setting it to null
                students[studentCount - 1] = null;

                // decrease the count since one student is removed
                studentCount--;

                return true;
            }
        }
        // if we finish the loop and found nothing
        return false;
    }

    // Simple method that prints all students' names in this department
    public void printStudents() {
        System.out.println("Students in " + getDeptname() + ": ");

        // print only students within the valid number (ignore empty/null spots)
        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i].getName());
        }
    }
}
