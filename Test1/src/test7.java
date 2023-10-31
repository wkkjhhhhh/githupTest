
public class test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Array[] = {4,1,3,5,2};
	      int r = 5;
	      
	      for (int i=0;i<Array.length;i++){
	         for (int j=0;j<Array.length;j++) {
	            if(Array[j]>=r)
	               System.out.print("* ");
	            else
	               System.out.print("  ");
	         }
	         System.out.print("\n");
	         r = r - 1;
	      }
	      for (int y=0;y<Array.length;y++) {
	         System.out.print(Array[y]+" ");
	      }

		}
	}

