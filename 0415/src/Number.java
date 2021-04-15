import java.util.Scanner;
public class Number {

	public static void main(String[] args) {

	System.out.print("10개의 랜덤 숫자 중 하나를 맞춰보세요(1~50까지):");
	Scanner scan = new Scanner(System.in);
	int number=scan.nextInt();
	int []a=new int[10];
	int diff=0;
	
	for(int i=0; i<10; i++) {
		a[i]=(int)(Math.random()*50+1);
		System.out.print(a[i]+" ");
	}
	System.out.println();
	
	for(int b=0; b<10; b++) {
		if(a[b] == number) {
		System.out.println("당첨! 일치하는 숫자가 있습니다");
		diff = 1;
	}
	}
	if(diff==0) System.out.println("꽝! 다음기회에~");
}
}