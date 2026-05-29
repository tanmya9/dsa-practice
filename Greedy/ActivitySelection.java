//When end time already sorted
package Greedy;
import java.util.*;
public class ActivitySelection {
	public static void main(String args[])
	{
		int start[]= {1,3,0,5,8,5};
		int end[]= {2,4,6,7,9,9};// end time is sorted
		
		int maxAct=0; //to count maximum activity done
		
		ArrayList<Integer> ans=new ArrayList<>(); //to store index of array list
		
		maxAct=1;
		ans.add(0); //storing index of 1st activity
		int lastEnd=end[0];
		for(int i=1;i<end.length;i++)
		{
			if(start[i] >=lastEnd)
			{
				maxAct++;
				ans.add(i);
				lastEnd=end[i];
			}
		}
		System.out.println("Max Activities "+ maxAct);
		for(int i=0;i<ans.size();i++)
		{
			System.out.print("A"+ans.get(i)+" ");
		}
		System.out.println();
	}
}
