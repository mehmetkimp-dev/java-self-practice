package metodlar2.Employee;

public class Employee {

    public String firstname;
    public String lastname;
    public String SSN;
public int age;
public boolean isMarried;
public double salary;
public char securityLevel;



public void workInOffice(){
    System.out.println("Employee is working in the office.");
}



    public void meetWithClient(){
    System.out.println("Employee is meeting with the client");
}
    public void printEmployeeInfo(){
        System.out.println(toString());
}

    @Override
    public String toString() {
        return "Employee{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", SSN='" + SSN + '\'' +
                ", age=" + age +
                ", isMarried=" + isMarried +
                ", salary=" + salary +
                ", securityLevel=" + securityLevel +
                '}';
    }





}
