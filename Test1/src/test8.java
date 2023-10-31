
public class test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArrary[] = {4,1,2,3,5};
		int rows=5;
		
		for(int i=0; i<intArrary.length; i++) {
			for(int j=0; j<intArrary.length; j++) {
				if(intArrary[j] >= rows)
					System.out.print("*");
					else {
						System.out.print(" ");
					}
				}
				System.out.print('\n');
				rows--;
					}
		for(int k=0; k<intArrary.length; k++) {
			System.out.print(intArrary[k]+"");
		}
	}

}
