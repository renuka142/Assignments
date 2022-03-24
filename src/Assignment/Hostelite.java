package Assignment;

public class Hostelite extends StudentInhr{
	protected String hostelName;
	protected int hostelNumber;
	
	/*
	 * public String toString() { return "Hostelite [hostelName=" + hostelName +
	 * ", hostelNumber=" + hostelNumber + ", sId=" + sId + ", sName=" + sName +
	 * ", sType=" + sType + ", fees=" + fees; }
	 */
	
	public void displayStudentDetails(int sId,String sName, String hostelName) {
		System.out.println("student id :"+sId+" student name"+sName+ " Hostel name:" + hostelName);
	}

	
	
	
}
