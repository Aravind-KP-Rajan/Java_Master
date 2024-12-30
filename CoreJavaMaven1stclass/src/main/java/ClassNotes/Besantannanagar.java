package ClassNotes;

public class Besantannanagar extends BesantBaseBranch{

	String BesantBranchName ="Annanagar";

	String Course6= "Testing";
	String Course7= "FE";

	public void GetCourseExist(String EnquiredCourse)
	{
		if(GetCourse(EnquiredCourse))
		{
			System.out.println("The Course is avaialble");

		}
		else
		{
			if(EnquiredCourse.equalsIgnoreCase(Course6)||EnquiredCourse.equalsIgnoreCase(Course7)) {
				System.out.println("This course is avaialbe in Annanagar");

			}
			else
			{
				System.out.println("This is not avaialble in Annanagar Branch");
			}
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Besantannanagar B = new Besantannanagar();
		B.GetCourseExist("c#");
	}

}
