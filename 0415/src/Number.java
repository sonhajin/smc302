import java.util.Scanner;
public class Number {

	public static void main(String[] args) {

	System.out.print("10���� ���� ���� �� �ϳ��� ���纸����(1~50����):");
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
		System.out.println("��÷! ��ġ�ϴ� ���ڰ� �ֽ��ϴ�");
		diff = 1;
	}
	}
	if(diff==0) System.out.println("��! ������ȸ��~");
}
}