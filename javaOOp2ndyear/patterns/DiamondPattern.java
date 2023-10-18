package patterns;
import java.util.Scanner;
public class DiamondPattern {
	public static void main(String[]args) {
		int across, down;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter across: ");
		across = sc.nextInt();
		System.out.println("Enter down: ");
		down = sc.nextInt();
		for(int i =0; i<down;i++) {
			for(int k = 0; k<=across; k++) {
				if((k>=(across/2)+1-i) && (k<=(across/2)+1+i))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		for(int i =0; i <down; i++) {
			for(int j= 0; j <=across; j++) {
				if((j>=1+i) && (j<=(across/2)*2-i))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
