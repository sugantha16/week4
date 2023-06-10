package week4.day1;

public class MissingNumbers {

	public static void main(String[] args) {
	    int n;

	    int[] numbers = new int[] {1,2,3,4,6,7};

	    n = 7;

	    int expected_sum = n * ((n + 1) / 2);
	    int sum = 0;

	    for (int i: numbers) {
	      sum += i;
	    }

	    int m = expected_sum - sum;
	    System.out.print("Missing Number is : " + m);
	}
}
	


