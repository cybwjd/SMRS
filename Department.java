package srms;
public class Department {

    private String deptname;
    private Student[] students;
    private int studentCount;

    //department constructor
    public Department(String deptname,int maxStudents){
        this.deptname=deptname;
        //max student for the dept
        this.students=new Student[maxStudents];
        this.studentCount=0;
    }

    public void setDeptname(String deptname){ this.deptname=deptname;}
    public void setStudentCount(int studentCount){this.studentCount=studentCount;}

    public String getDeptname(){return deptname;}
    public int getStudentCount(){return studentCount;}
    public Student[] getStudents(){return students;}
    //to add a student to a certain dept
    public boolean addStudent(Student student){
        //if studentCount is less than students array maxstudent 
        //then add student
        if(studentCount< students.length){
            students[studentCount]=student;
            studentCount++;
            return true;
        }
        else{
            System.out.println("Department is full");
            return false;
        }
    }

 
    //to remove a student from a dept
    public boolean removeStudent(String id){
        //we will check each index to search fro the meant student
        for (int i = 0; i < studentCount; i++) {
            //if u find the id 
            if(students[i].getId().equals(id)){
            //replace it with the last index
            students[i]=students[studentCount-1];
            //set it to null which means it got deleted
            students[studentCount-1]=null;
            studentCount--;
            return true; 
        }}
        return false;
    }



    public void printStudents(){
        System.out.println("Students in "+ getDeptname()+ " : " );
        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i].getName());
        }
     }


}
