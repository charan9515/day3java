package strings;
import java.util.Scanner;
public class Str {

	public static void main(String[] args) {
		
//		strings are two types.1.immutable 2.mutable
//		immutable cannot ne altered once created(3ways)1.string s="CBIT";2.String s=new String[CBIT];3.
//		                                               
//		mutable strings can be altered once created
		Scanner sc=new Scanner(System.in);
		
		String s1="CBIT";
		String s2="Charan kumar reddy";
		String s3=new String("Cbit");
		

		if(s1==s3)
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not equal");
		}
		
		
//equals			
		if(s1.equals(s3))
		{
			System.out.println("Equal");
			
		}
		else
		{
			System.out.println("Not equal");
	}	
		
//		equalignorecase
		if(s1.equalsIgnoreCase(s3))
		{
			System.out.println("Equal(equalignorecase)");
			
		}
		else
		{
			System.out.println("Not equal((equalignorecase)");
		}
		
	
			
//		compareTo
			
			if(s1.compareTo(s3)>0)
				{
					System.out.println("greater(compareto)");
					
				}
				else if(s1.compareTo(s3)<0)
				{
					System.out.println("lesser(compareto)");
				}
				else {
					System.out.println("both are equal");
				}
//			concetation
			
			System.out.println(s1.concat(s3));
			String s4=s1.concat(s3);
			System.out.println(s4);
	}		
}
