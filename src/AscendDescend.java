import java.util.*;


public class AscendDescend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ss[] = {"Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra", "Herman"};
		Arrays.sort(ss);
		System.out.println("Ascend:");
		for (int count = 0; count < ss.length; count++) {
			System.out.println (ss[count]);
		}
		System.out.println("\nDescend:");
		for (int count2 = ss.length; count2 > 0; count2--) {
			System.out.println(ss[count2-1]);
		}
	}
}