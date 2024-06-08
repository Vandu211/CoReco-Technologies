package task.com;

public class Revesewords {

	public static void main(String[] args) {

		String sentence="Hello world";
		
		String[] words=sentence.split(" ");
		String result=" ";
		
		for(int i=0;i<words.length;i++)
		{
			String reverseword=reverseString(words[i]);
			
			result+=reverseword+" ";
			
			
		}
		
		System.out.println(result);
		
	}
	
	public static String reverseString(String word)
	{
		
		char[] ch=word.toCharArray();
		String rev="";
		
		for(int i=0;i<word.length();i++)
		{
			rev=ch[i]+rev;
		}
		
		
		return  rev;
				
	}

}
