package task.com;

public class ReverseString {

	public static void main(String[] args) {

		String word="Hello World";
		 String rev=" ";
		 char[] ch=word.toCharArray();
		 
		 for(int i=word.length()-1;i>=0;i--)
		 {
			 rev=rev+ch[i];
		 }
		 System.out.println(rev);
		   
		
		
		

	}

}
