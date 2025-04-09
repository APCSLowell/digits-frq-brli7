import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{  
	    if(num == 0) {
		digitList.add(0);
	    }
	    int n = num;
	    while(num > 0) {
		digitList.add(0, n%10);
		n = n/10; 
	    }
	}

	public boolean isStrictlyIncreasing()
	{ 
		for(int i = 0; i < digitList.size()-1; i++) {
			if(digitList.get(i) >= digitList.get(i+1)) {
				return false;
			}
		}
	return true;
	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
