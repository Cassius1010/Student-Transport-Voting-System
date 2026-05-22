package manyopa;

public class Vote {

    private String studentId;
    private String transportChoice;
    private String timeSlot;

    public Vote(String studentId, String transportChoice, String timeSlot) {
        this.studentId = studentId;
        this.transportChoice = transportChoice;
        this.timeSlot = timeSlot;
    }

    
    public String getStudentId() {
        return studentId;
    }

    public String getTransportChoice() {
        return transportChoice;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void displayVote() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Transport: " + transportChoice);
        System.out.println("Time Slot: " + timeSlot);
        System.out.println("-------------------------");
    }
}
