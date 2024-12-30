package Practice;

public class DupVal {

	
	public void value() {
		int[] val = {1,2,1,2,3,4,3,5}; 
		for(int i=0;i<val.length;i++) 
		{
			for (int j = i+1;j<val.length;j++) 
			{
				if(val[i] == val[j]) 
				{
					System.out.println(val[i]);
				}	
			}
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DupVal obj = new DupVal();
		obj.value();
	}

}
