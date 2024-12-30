package ClassNotes;

public class BesantTambaram extends BesantBaseBranch {

	String BranchName = "Tambaram"; // global
	static String Course4=".Net";
	String Course5="SQL";

	/*String Course1 ="Python";
	String Course2 ="Java";
	String Course3= "c#";*/

	public void GetCourseExist(String EnquiredCourse)
	{
		if(GetCourse(EnquiredCourse)) 
		{
			System.out.println("The Course is avaialble");

		}
		else
		{
			if(EnquiredCourse.equalsIgnoreCase(Course4)||EnquiredCourse.equalsIgnoreCase(Course5)) {
				System.out.println("This course is avaialbe in Tamabarm");

			}
			else
			{
				System.out.println("This is not avaialble in Tamabaram Branch");
			}
		}
	}


	public void BaseBranchName()
	{
		//int a=10; //local variable

		System.out.println(BaseBranchName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BesantTambaram B = new BesantTambaram();
		B.GetCourseExist("c#");
	}

}
