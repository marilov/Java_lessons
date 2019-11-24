package Lesson4;

public class Student {
    int studentId;
    String name;
    String surname;
    String studyYear;
    double mathMark;
    double economyMark;
    double langMark;
    Double avgMark;
}

class StudentTest {

    public static void main(String[] args) {

        Student Student1 = new Student();
        Student1.studentId = 123;
        Student1.name = "Jane";
        Student1.surname = "Austin";
        Student1.studyYear = "2010 - 2015";
        Student1.mathMark = 10.2;
        Student1.economyMark = 10.2;
        Student1.langMark = 10.2;

        Student1.avgMark = (Student1.mathMark + Student1.economyMark + Student1.langMark) / 3;

        Student Student2 = new Student();
        Student2.studentId = 456;
        Student2.name = "Ernest";
        Student2.surname = "Hemingway";
        Student2.studyYear = "2005 - 2010";
        Student2.mathMark = 8.2;
        Student2.economyMark = 8.2;
        Student2.langMark = 8.2;
        Student2.avgMark = (Student2.mathMark + Student2.economyMark + Student2.langMark) / 3;

        Student Student3 = new Student();
        Student3.studentId = 789;
        Student3.name = "Dan";
        Student3.surname = "Brown";
        Student3.studyYear = "2000 - 2005";
        Student3.mathMark = 9.2;
        Student3.economyMark = 9.2;
        Student3.langMark = 9.2;
        Student3.avgMark = (Student3.mathMark + Student3.economyMark + Student3.langMark) / 3;

        System.out.println("Средняя арифметическая оценка " + Student1.name + " " + Student1.surname + " = " + Student1.avgMark );
        System.out.println("Средняя арифметическая оценка " + Student2.name + " " + Student2.surname + " = " + Student2.avgMark );
        System.out.println("Средняя арифметическая оценка " + Student3.name + " " + Student3.surname + " = " + Student3.avgMark );
    }
}
