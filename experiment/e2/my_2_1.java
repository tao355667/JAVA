package experiment;
public class my_2_1 {

	public static void main(String[] args) {
		int[] a=new int[2005];
		a[0]=1;
		a[1]=1;
		System.out.println(a[0]);
		System.out.println(a[1]);
		for(int i=2;i<2000;i++)
		{
			a[i]=a[i-1]+a[i-2];
			if(a[i]>0&&a[i]<1000)
			    System.out.println(a[i]);
			else
				break;
		}
	}
}
