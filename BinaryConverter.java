import java.util.Scanner;

public class BinaryConverter {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello");
		int x = scan.nextInt();
		while(x != -1) {
			System.out.println(binToDec(x));
			x = scan.nextInt();
		}
	}
	
	public static int binToDec(int binary) {
		int dec = 0;
		int[] bin = toArray(binary);
		for(int i = 1; i <= bin.length; i++) {
			dec += bin[bin.length - i] * Math.pow(2, i - 1);
		}
		return dec;
	}
	
	public static int[] toArray(int num) {
		int x = num, y = 0; 
		while(x > 0) {
			y++;
			x /= 10;
		}
		int[] arr = new int[y];
		for(int i = 0; i < y; i++) 
			arr[i] = (int) ((num/(Math.pow(10, (y - i - 1)))) % 10);
		return arr;
	}
	
}
