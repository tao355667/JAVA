package experiment;
public class StringTest {
	public static void main(String [] args)
	{
		String s="ABCDEFGHIJKLMN";
	    System.out.println(s);
		System.out.println("The string contains"+s.length());
		System.out.println("The character at index 4 is:"+s.charAt(4));
		System.out.println("The index of character N is:"+s.indexOf('N'));
		String alphabet="ABCDEFGHIJKLMN";
		System.out.println(alphabet);
		System.out.println("The substring from index 4 to index 8 is"+alphabet.substring(4,8));
		System.out.println("The substring from index 0 to index 8 is"+alphabet.substring(0,8));
		System.out.println("The substring from index 8 to end is"+alphabet.substring(8));
		String sbis="StringBufferInputStream";
		System.out.println(sbis);
		String sbislc=sbis.toLowerCase();
		System.out.println(sbislc);
		String sbisup=sbis.toUpperCase();
		System.out.println(sbisup);
		String first="James";
		String last="Gosling";
		System.out.println(first+last);
		System.out.println(first+","+last);
		String str="This is the Mississippi River";
		System.out.println(str);
		int i=str.indexOf('s');
		System.out.println("The first index of 's' is "+i);
		int j=str.indexOf('s',i+1);
		System.out.println("The next index of 's' is "+j);
		int k=str.indexOf('s',j+1);
		System.out.println("The next index of 's' is "+k);	
		k=str.lastIndexOf('s');
		System.out.println("The last index of 's' is "+k);
		System.out.println(str.substring(k));
		String inventor="charles Babbage";
		System.out.println(inventor);
		System.out.println(inventor.replace('B','C'));
		System.out.println(inventor);
		int n=44;
		System.out.println("n= "+n);
		String strn=String.valueOf(n);
		System.out.println("strn= "+strn);	
		String today="May 18,2009";
		String todaysDayString=today.substring(4,6);
		int todaysDayInt=Integer.parseInt(todaysDayString);
		int nextWeeksDayInt=todaysDayInt+7;
		String nextWeek=today.substring(0,4)+nextWeeksDayInt+today.substring(6);
		System.out.println("Today's date is"+today);
		System.out.println("Today's date is"+todaysDayInt);
		System.out.println("next week's date is"+nextWeeksDayInt);
		System.out.println("next week's date is"+nextWeek);
	}

}
