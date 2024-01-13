package experiment;
public class FindMinimalK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int sum=1;
			 int k=1;
			 while(sum<=2000){
 			 k++;
 			 sum=sum+k;
			}
	    System.out.println("the minimal k="+k);

	}

}
