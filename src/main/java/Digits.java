import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{  
	    String sNum = Integer.toString(num);
	    for(int i = 0; i < sNum.length(); i++) {
		digitList.add(Integer.parseInt(sNum.substring(i, i+1)));
	    }
	}

	public boolean isStrictlyIncreasing()
	{ 
		for(int i = 0; i < digitList.size()-1; i++) {
			if(digitList.get(i) <= digitList.get(i+1)) {
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
