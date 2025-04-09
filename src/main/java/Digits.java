import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{  
	    digitList = new ArrayList<Integer>();
	    if(num == 0) {
		digitList.add(num);
	    }
	    int n = num;
	    while(n > 0) {
		digitList.add(0, n%10);
		n /= 10; 
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
