package factorymethodlab;

public class StudentFactory {

    public Student getStudent(String studentType, String studentName, String id, double balance) {
        if (studentType.equals("IT")) {
            return new ITStudent(studentName, id, balance);
        } else if (studentType.equals("Engineer")) {
            return new EngineerStudent(studentName, id, balance);
        } else if (studentType.equals("Medicine")) {
            return new MedicineStudent(studentName, id, balance);
        } else {
            return null;
        }
    }
}
