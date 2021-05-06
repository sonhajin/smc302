import java.util.Scanner;

public class TriangleExam {

	public static void main(String[] args) {
		Triangle T1 = new Triangle(10.2, 17.3);
		System.out.println("Area = " + T1.Area());
		T1.Change_Trinangle(7.5, 9.2);
		System.out.println("New Area = " + T1.Area());
	}

}

class Triangle{
	double base;
	double height;
	public Triangle(double base, double height){
		this.base = base;
		this.height = height;
	}
	public void Change_Trinangle(double base, double height){
		this.base = base;
		this.height = height;
	}
	public double Area(){
		return base * height / 2;
	}
	
}