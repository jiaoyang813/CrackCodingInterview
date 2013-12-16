package chap1.q3;

public class permutation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result;
		permutation test = new permutation();
		String s1 = "Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75";
		String s2 = "Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75Four people were killed on Interstate 75";
		
		result = test.IsPermuation(s1, s2);
		System.out.print(result);
	}
	
	public boolean IsPermuation(String s1, String s2)
	{
		if(s1.length() != s2.length())
			return false;
		int[] counter1 = new int[256];
		int[] counter2 = new int[256];
		
		for(int i = 0 ; i < s1.length(); i++)
		{
			counter1[s1.charAt(i)]++;
			counter2[s2.charAt(i)]++;
		}
		
		for(int i = 0 ; i < counter1.length; i++)
		{
			if(counter1[i] != counter2[i])
				return false;
		}
		return true;
	}

}
