package Lesson5;


public class Employee {
    int emplId;
    String emplSurname;
    int emplAge;
    int emplSalary;
    String emplDepartment;

    Employee(int id, String surname, int age, int salary, String department) {
        emplId = id;
        emplSurname = surname;
        emplAge = age;
        emplSalary = salary;
        emplDepartment = department;
    }

    int doubleSalary() {
        int x2 = emplSalary * 2;
        emplSalary = x2;
        return emplSalary;
    }


}

class EmployeeTest {

    static Employee e1 = new Employee(1, "Ivanov", 23, 200, "Police");
    static Employee e2 = new Employee(2, "Petrov", 25, 450, "Hospital");

    public static void main(String[] args) {

        System.out.println(e1.emplSurname + " has new salary: " + e1.doubleSalary());
        System.out.println(e2.emplSurname + " has new salary: " + e2.doubleSalary());
    }


}
