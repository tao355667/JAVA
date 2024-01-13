package experiment;
public class my_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myTable[] = {23, 45, 65, 34, 21, 67, 78};
			int sum=0,max=0; 
			for (int i=0; i<myTable.length; i++) {
				sum+=myTable[i];
				if(myTable[i]>max)
					max=myTable[i];
				
			}
			int ave=sum/myTable.length;
			System.out.println("ave = " + ave + ", max= " + max);
	}

}
