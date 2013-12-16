package chap1.q1;

import java.util.List;

public class UniqueString<T> {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniqueString<List> test1 = new UniqueString<List>();
		String s1 = "!@#$%^&*()_+?><:";
		System.out.print(test1.IsUnique(s1));
	}
	
	public boolean IsUnique(String s1)
	{
		boolean[] check = new boolean[256];
		//init check to false
		for(boolean b:check)
			b = false;
		
			for(char c:s1.toCharArray())
			{
				if(check[c]==false)
					check[c] = true;
				else
					return false;
			}
			
			
		return true;
	}

}
