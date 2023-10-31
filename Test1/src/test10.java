import java.util.Scanner;

public class test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("학생의 수를 입력하시오.>>");
		Scanner s= new Scanner(System.in);
		int in = s.nextInt();

		String names[] = new String[in];
		int kor[] = new int[in];
		int eng[] = new int[in];
		int mat[] = new int[in];
		int sum= 0;
		int avg=0;
		
		for(int i=0; i<in; i++) {
			System.out.println(in+"명 중 " + (i+1) + "번쨰 학생의 이름 국어 영어 수학 점수를 입력하시오.");
			names[i] = s.next();
			kor[i] = s.nextInt();
			eng[i] = s.nextInt();
			mat[i] = s.nextInt();
		}
		
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
	

			
	


