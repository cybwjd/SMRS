package srms;

public class ReportGenerator {
    public void printDeptStudents(Department dept){
        System.out.println("Student of ("+dept.getDeptname()+") : ");
        for(Student s: dept.getStudents()){
            System.out.println(s.getId() + " - "+ s.getName() + " - GPA:"+ s.getGpa());
        }
        System.out.println("total students"+ dept.getStudentCount());

    }

    public void printHighGpaStudents(Department dept,double minGpa){
        System.out.println(" high GPA students in ("+dept.getDeptname()+") : ");
        Student[] students=dept.getStudents();

        for(int i=0; i<dept.getStudentCount();i++){
            Student s=students[i];
            if(s.getGpa()>= minGpa){
                System.out.println(s.getName() + " - GPA: "+s.getGpa());
            }
        }
    }

    public void printDeptCount(Department dept){
System.out.println("Department: "+ dept.getDeptname());
System.out.println("Number of students: "+dept.getStudentCount());    }
}
