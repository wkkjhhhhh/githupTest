import java.util.Scanner;

public class j135 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[] = new int[5];
		int sum=0;
		
		Scanner s = new Scanner(System.in);
		System.out.print(intArray.length +"개의 정수를 입력하세요>> ");
		for(int i=0; i<intArray.length; i++)
			intArray[i] = s.nextInt(); //정수 저장
		
		for(int i=0; i<intArray.length; i++)
			sum += intArray[i]; // 저장된 정수 값 더하기
		
		System.out.print("평균은 " + (double)sum/intArray.length);
		s.close();
}

}
