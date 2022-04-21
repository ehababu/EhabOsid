package factorymethodlab;

import java.text.Normalizer;
import java.util.HashMap;

public abstract class Student {

    String name;
    String id;
    int numOfHours;
    double balance;
    double gpa;

    HashMap<course, Double> map;

    
    public abstract void enrollCourse(course c , double grade);
    public abstract void printInfo();

}
