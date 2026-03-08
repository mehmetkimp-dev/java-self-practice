package metodlar2.Student;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1=new Student();

        student1.name="yo";
        student1.surname="cumburlak";
        student1.age=21;
        student1.gpa=18.9;
        student1.isGraduated=false;
        student1.gradeLevel='C';

        student1.study();
        student1.attendClass();
        student1.printStudentInfo();




    }
}
