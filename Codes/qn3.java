import java.util.*;
public class qn3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.print("Enter your number :");
		Scanner in = new Scanner(System.in);
		num=in.nextInt();
		
		for(int i=1 ; i<=num;i++) {
			for(int j=1 ; j<=num;j++) {
				if(i==1 || i==num) {
					System.out.print(j);
				}
				else {
					if(i==num-j+1) {
						System.out.print(j);
					}
					else {
						System.out.print(" ");
					}
				}
			}
            System.out.println("");
		}
	}

}

