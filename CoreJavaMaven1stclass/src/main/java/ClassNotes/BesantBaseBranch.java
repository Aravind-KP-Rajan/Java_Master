package ClassNotes;

public class BesantBaseBranch {

	String BaseBranchName = "Bangalore";
	String Course1 ="Python";
	String Course2 ="Java";
	String Course3= "c#";

	public boolean GetCourse(String ActualCourse)
	{
		if(ActualCourse.equalsIgnoreCase(Course1)||ActualCourse.equalsIgnoreCase(Course2)||ActualCourse.equalsIgnoreCase(Course3))
		{
			return true;
		}
		else
		{
			return false;
			//System.out.println("The course is not available now");
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BesantBaseBranch B = new BesantBaseBranch();
		B.GetCourse("C#");
	}

}

