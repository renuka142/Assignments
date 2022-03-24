package Assignment;

public class DayScholarInhr extends StudentInhr{
	protected String address;

	public void displayStudentDetails(int sId,String sName, String address) {
		System.out.println("student id :"+sId+" student name"+sName+ " Address:" + address);
	}
	
}
