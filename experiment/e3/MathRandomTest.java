package experiment;
public class MathRandomTest {

	public static void main(String[] args) {
		int count=0,maxof100=Integer.MIN_VALUE,minof100=Integer.MAX_VALUE;
		int num[]=new int[100];
		int i;
		for(i=1;i<=100;i++)
		{
			num[i-1]=(int)(100*java.lang.Math.random());
			System.out.print(num[i-1]+(i%10==0?"\n":" "));
			if(num[i-1]>maxof100)
				maxof100=num[i-1];
			else if(num[i-1]<minof100)
				minof100=num[i-1];
			if(num[i-1]>50) count++;	
		}
		System.out.println("The MAX of 100 random integers is:"+maxof100);
		System.out.println("The MIN of 100 random integers is:"+minof100);
		System.out.println("The mumber of random more than 50 is:"+count);

	}

}
