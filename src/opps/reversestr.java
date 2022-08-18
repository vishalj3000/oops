package opps;

public class reversestr {
	
	
	
	
	void rev()
	{
		String str = "welcome to java";
		String[] words = str.split(" ");
		
		String reverse="";
		
		for(String v:words)
		{
			String revword="";
			
			for(int i=v.length()-1;i>=0;i--);
			{
				revword=revword+v.charAt(i);
			}
			
			reverse=reverse+revword+" ";
			
		}
		
		System.out.println(reverse);
		

		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reversestr obj = new reversestr();
				obj.rev();
		

	}

}
