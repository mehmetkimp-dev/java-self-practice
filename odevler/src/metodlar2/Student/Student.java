package metodlar2.Student;

public class Student {
    public String name;
    public String surname;
    public int age;
    public double gpa;
    public boolean isGraduated;
    char gradeLevel;


    public void study(){
        System.out.println("Student is Studying");
    }
    public void attendClass(){
        System.out.println("Studend is attending the class");
    }
    public void printStudentInfo(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                ", isGraduated=" + isGraduated +
                ", gradeLevel=" + gradeLevel +
                '}';
    }
}
