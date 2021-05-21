import java.util.Scanner;

public class TestExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("500 이하의 자연수를 입력하세요.");
		
		int sum = 0;
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++){
			if(i%3==0 && i%2!=0){
				System.out.println(i);
				sum += i;
			}
		}
		System.out.println("1~20까지"+num+"의 배수이면서 홀수인 수의 합은"+sum+"입니다.");
	}
}