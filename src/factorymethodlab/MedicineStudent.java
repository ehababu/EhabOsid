package factorymethodlab;

import java.util.HashMap;
import java.util.Map;

public class MedicineStudent extends Student {

    final int pricePerHoure = 100;

    public MedicineStudent(String name, String id, double balance) {

        this.map = new HashMap<>();
        this.name = name;
        this.id = id;
        this.balance = balance;

    }

    double a = 0;
    double b = 0;

    @Override
    public void enrollCourse(course c, double grade) {
        map.put(c, grade);
        this.numOfHours += c.numOfHours;
        this.balance -= pricePerHoure * c.numOfHours;
        double x = c.numOfHours * grade;
        a += x;
        double y = c.numOfHours * 100;
        b += y;
        this.gpa = ((a / b) * 100);
    }

    @Override
    public void printInfo() {
        System.out.println("The Name : " + name + "\nThe Id : " + id + "\nThe Balance : " + balance
                + "\nThe Number Of Houres : " + numOfHours + "\nThe GPA : " + gpa + "\nCourses : ");
        for (Map.Entry<course, Double> courseMap : map.entrySet()) {
            courseMap.getKey().printCourse();
        }
    }
}
