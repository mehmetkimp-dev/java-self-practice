package metodlar2.Employee;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1=new Employee();
        employee1.firstname="Mehmet";
        employee1.lastname="Kimp";
        employee1.SSN="taf";
        employee1.age=36;
        employee1.isMarried=true;
        employee1.salary=1800;
        employee1.securityLevel='9';

employee1.workInOffice();
employee1.meetWithClient();
employee1.printEmployeeInfo();



    }




}
