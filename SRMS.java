package srms;

public class SRMS {
    public static void main(String[] args) {
        // إنشاء قسم IT
        Department IT = new Department("IT", 100);

        // إنشاء طالب وتمرير القسم له
        Student s1 = new Student("1001", "Wajd", 4.2, IT);

        // عرض بيانات الطالب
        System.out.println("Before update:");
        s1.display();

        // تحديث المعدل
        s1.setGpa(4.5);

        // إنشاء قسم جديد
        Department Cyber = new Department("Cybersecurity", 50);
        s1.setDepartment(Cyber); // تحديث القسم

        System.out.println("\nAfter update:");
        s1.display();

        // إضافة الطالب للقسم الجديد
        Cyber.addStudent(s1);

        // عرض كل الطلاب في القسم الجديد
        Cyber.printStudents();
    }
}





//
//package srms;
//
//// Example usage
//class SRMS {
//    public static void main(String[] args) {
//        Department IT = new Department ("IT",100);
//        Student s1 = new Student("1001", "Wajd", 4.2, IT);
//        s1.display();
//
//        // Update DATA
//        s1.setGpa(4.5);
//        s1.setDepartment();
//
//        System.out.println("\nAfter update:");
//        s1.display();
//    }
//}
