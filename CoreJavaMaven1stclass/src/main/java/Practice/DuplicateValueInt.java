package Practice;

import java.util.ArrayList;
import java.util.List;

public class DuplicateValueInt 
{
	public static void main(String[] args) {
		 //TODO Auto-generated method stub
		int[] arr = {1,2,3,4,1,2,5};
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<arr.length-1;i++) 
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]==arr[j]) 
				{
					if(list.contains(arr[i])) 
					{
						i++;
						continue;
					}
					else 
					{
						list.add(arr[i]);
					}
				}
			}
		}
		System.out.println(list);
	}
}


