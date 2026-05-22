package manyopa;

public class student {
	
	
	private String studentId;
	private String password;

	public student(String studentId, String password) {
        this.studentId = studentId;
        this.password = password;
    }
	
	public String getStudentId() {
        return studentId;
    }
	
	
 public String getPassword() {
	 return password;
 }
 
 public void setStudentId(String studentId) {
     this.studentId = studentId;
 }
  
 public void setPassword(String password) {
	 this.password=password;
 }
 
 public boolean login(String enteredId, String enteredPassword) {
	    return this.studentId.equals(enteredId) && this.password.equals(enteredPassword);
	}
 
 
}
