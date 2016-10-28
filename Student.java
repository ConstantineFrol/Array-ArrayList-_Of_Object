/**
 * 
 */
package Week2_Q3;

/**
 * @author 		Konstantin Frolov
 * Student ID 	R00144177
 * Email		konstantin.frolov@mycit.ie
 * GitHub		https://github.com/ConstantineFrol/repositories
 */
public class Student {

	//-------------------//
	//    Attributes     //
	//-------------------//
	
	/**
	 * Declaring attributes
	 */
	private int studentExaminationMark;
	private String studentFirstName;
	private String studentLastName;
	private String studentExamResult;

	//-------------------//
	//    Constructor    //
	//-------------------//
	
	/**
	 * @param initialization instance variables using a constructor 
	 */
	public Student()
	{
		setStudentFirstName("");
		setStudentLastName("");
		setStudentExaminationMark(0);
	}
	
	
	//-------------------//
	// Setters & Getters //
	//-------------------//


	/**
	 * @return the studentExamResult
	 */
	public String getStudentExamResult() {
		return this.studentExamResult;
	}

	/**
	 * @param studentExamResult the studentExamResult to set
	 */
	public void setStudentExamResult(String studentExamResult) {
		this.studentExamResult = studentExamResult;
	}

	/**
	 * @return the studentFirstName
	 */
	public String getStudentFirstName() {
		return this.studentFirstName;
	}

	/**
	 * @param studentFirstName the studentFirstName to set
	 */
	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	/**
	 * @return the studentLastName
	 */
	public String getStudentLastName() {
		return this.studentLastName;
	}

	/**
	 * @param studentLastName the studentLastName to set
	 */
	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	/**
	 * @return the studentExaminationMark
	 */
	public int getStudentExaminationMark() {
		return this.studentExaminationMark;
	}

	/**
	 * @param studentExaminationMark the studentExaminationMark to set
	 */
	public void setStudentExaminationMark(int studentExaminationMark) {
		this.studentExaminationMark = studentExaminationMark;
	}

	/**
	 * @return the examResult
	 */
	public String getExamResult() {
		return this.studentExamResult;
	}

	/**
	 * @param examResult the examResult to set
	 */
	public void setExamResult(String examResult) {
		this.studentExamResult = examResult;
	}

	//-------------------//
	//      Methods      //	
	//-------------------//
	
	/**
	 * Calling method toString()
	 */
	public void print()
	{
		System.out.println(toString());
	}

	/**
	 * Display all states of the Object called Student and their parameters
	 */
	public String toString() {
//		Display version.1
		
//		return "\nStudent\nstudentFirstName=" + this.studentFirstName + "\nstudentLastName=" + this.studentLastName
//				+ "\nstudentExaminationMark=" + this.studentExaminationMark + "\nexamResult=" + this.studentExamResult;
		
//		Display version.2
		return "\n\t" + this.studentFirstName + " " + this.studentLastName + " received a " + this.studentExamResult + " for his/her mark of " + this.studentExaminationMark;
	}
	
}
