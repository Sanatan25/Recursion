import java.util.*;
public class PrintNumberNto1 {
	
	public static void print(int n) {
		
		if(n == 1) {
			System.out.println(n);
			return;
		}
		System.out.println(n+" ");
		print(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		print(n);

	}

}
