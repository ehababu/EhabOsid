package factorymethodlab;

public class Main {

    public static void main(String[] args) {

        course c = new course();
        c.name = "Java Programming";
        c.id = "CSIC1403";
        c.numOfHours = 3;
        course c2 = new course();
        c2.name = "Java2 Programming";
        c2.id = "CSIC3103";
        c2.numOfHours = 3;
        course c3 = new course();
        c3.name = "Java3 Programming";
        c3.id = "CSIC1203";
        c3.numOfHours=2;
        course c4 = new course();
        c4.name = "CalculasA";
        c4.id = "Math3302";
        c4.numOfHours = 3;
        course c5 = new course();
        c5.name = "Anatomy";
        c5.id = "Qura3203";
        c5.numOfHours = 1;

        StudentFactory factory = new StudentFactory();

        Student ItSt = factory.getStudent("IT", "Khaled", "120161002", 500.9);
        Student MedSt = factory.getStudent("Medicine", "Ahmed", "120207852", 400.50);

        ItSt.enrollCourse(c, 90.8);
        ItSt.enrollCourse(c2, 99.6);
        ItSt.enrollCourse(c4, 78.2);
        ItSt.enrollCourse(c3, 50.7);

        MedSt.enrollCourse(c, 88.4);
        MedSt.enrollCourse(c5, 66.4);
        MedSt.enrollCourse(c4, 98.4);

        ItSt.printInfo();
        System.out.println("--------------------------------");
        MedSt.printInfo();

    }

}
