package jack;
import java.util.Scanner;
import java.util.Arrays;
public class Aaa {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);		
//		StringBuffer
		
//	StringBuffer s1=new StringBuffer("hii");
//	System.out.println(s1);
//	s1.append("hello");
//	s1.insert(5, "world");
//	s1.delete(5, 12);
//	s1.reverse();
//	System.out.println(s1);
    
//    length
    String s1="cbit";
    String s2="charan kumar reddy";
    System.out.println(s1.length());
    
//	replace	
    String s3="cbit";
    String s4="charan kumar reddy";
    System.out.println(s3.replace("c","bac"));

    
//    index of
    String s5="cbit";
    String s6="charan kumar reddy";
    System.out.println(s6.indexOf("u"));
    
//    toLowerCase
    String s7="CBIT STUDENT";
    String s8="charan kumar reddy";
    System.out.println(s7.toLowerCase());
    
//    toUpperCase
    String s9="cbit";
    String s10="charan kumar reddy";
    System.out.println(s2.toUpperCase());
    
//    substring
    String s11="cbit";
    String s12="charan kumar reddy";
    System.out.println(s12.substring(3,7));
    
//    tostring
    String s13="CBIT";
    String s14="charan kumar reddy";
    System.out.println(s14.toString());
    
//    charAt
    String s15="cbit";
    String s16="charan kumar reddy";
    System.out.println(s16.charAt(10));
    
//    ***arrays using tostring***
    
    String arr[]=new String[2];
    arr[0]="charan";
    arr[1]="jon";
    System.out.println(Arrays.toString(arr));
    
//    toCharArray
    char [] ch=arr[0].toCharArray();
    for(int i=0;i<ch.length;i++)
    {
    	System.out.println(ch[i]);
    }
    StringBuilder s20=new StringBuilder("hii");
	System.out.println(s20);
	s20.append("hello");
	s20.insert(5, "world");
	s20.delete(5, 12);
	s20.reverse();
	System.out.println(s20);
    
    
    
	}
	

}
