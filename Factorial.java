import java.util.*;
public class Factorial {
	public static int fact(int n) {
		if(n == 0) {
			return 1;
		}else {
			return n*fact(n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n ");
		int n = sc.nextInt();
		System.out.println(fact(n));

	}

}
