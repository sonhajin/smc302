import java.util.Scanner;
public class ArrayExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int count = 0;
		
		for(int i = 0;i<arr.length;i++) {
			count = i+1;
			System.out.println(count + "�� �Է� :");
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		int max_count = 0;
		
		for(int j=0;j<arr.length;j++) {
			if(arr[j] > max) {
				max = arr[j];
				max_count = j+1;
			}
		}
		System.out.println("���� ū ���� " + max_count + "��° ������" + max);
	}
}
