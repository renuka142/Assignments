package Assignment;

public class StudentMain {
	public static void main(String[] args) {
		Student student = new Student();
		student.setStudentId(Integer.parseInt(args[0]));
		student.setStudentName(args[1]);
		student.setResedentialStatus(args[2]);
		student.setFeesPerMonth(Integer.parseInt(args[3]));
		System.out.println(student.getStudentName()+" "+student.getStudentId());
	}
}
