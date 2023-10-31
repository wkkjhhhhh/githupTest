import java.util.Scanner;

public class test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);

		
		String names[] = {"홍길동","김길동","이길동"};
		int kor[] = {80,78,60};
		int eng[] = {90,80,70};
		int mat[] = {98,90,80};
		int sum= 0;
		int avg=0;
		
		System.out.print("이름 국어 영어 수학 총점 평균"+'\n');
		System.out.println("-----------------------");
			
		for(int i=0; i<names.length; i++) {
			for(int j=0; j<names.length; j++)
			sum = kor[i]+eng[i]+mat[i];
			avg=sum/names.length;
			System.out.printf(names[i] + " " + kor[i] +" " + eng[i] + 
					" " + mat[i] + "  " +sum + " " + "%.2f",(double)avg);
			System.out.print('\n');
			
		}	
		System.out.println("-----------------------");
		int totalK=0;
		int totalE=0;
		int totalM=0;
		int avg2=0;
		int ta=0;
	
		for(int k=0; k<names.length; k++){
			totalK+=kor[k];
			totalE+=eng[k];
			totalM+=mat[k];
			ta= totalK+totalE+totalM;
			avg2=ta / (names.length * 3);
		}
			System.out.printf("총합 " + totalK+ " "+ totalE+ " "+ totalM + " "+ta+ " "+ "%.2f",(double)avg2);
			System.out.print('\n');
			
	}
	
	
	}
	

			
	


