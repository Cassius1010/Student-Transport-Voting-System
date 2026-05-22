package manyopa;
import java.util.ArrayList;

public class StudentSystem {

    private ArrayList<student> students = new ArrayList<>();

    //  REGISTER
    public boolean register(String studentId, String password) {

        // check if student already exists
        for (student s : students) {
            if (s.getStudentId().equals(studentId)) {
                System.out.println("Student already registered!");
                return false;
            }
        }

        students.add(new student(studentId, password));
        System.out.println("Registration successful!");
        return true;
    }

    //  LOGIN
    public student login(String studentId, String password) {

        for (student s : students) {
            if (s.getStudentId().equals(studentId) &&
                s.getPassword().equals(password)) {

                System.out.println("Login successful!");
                return s;
            }
        }

        System.out.println("Invalid credentials!");
        return null;
    }
}