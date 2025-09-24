
public class Exp6_2 {

	public static void main(String[] args) {

		int n = 13;
		int step = 0;

		while (n != 1) {
			step++;
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n = 3 * n + 1;
			}
		}
	
		 System.out.println("1 になるまでに" + step +"回の操作をしました"); 
	
	}

}
