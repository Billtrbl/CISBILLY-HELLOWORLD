package CISAssignmentsWeek3;

public class NestedLoops
{
	public static void main(String[] args) {
		
		int i = 1;
		
		while (1 <= 10) {
			
			System.out.println("Outer loop iteration " + i);
			
			for (int j = 1; j <= 2; ++j) {
				System.out.println("i = " + i + "; j = " + j);
			}
			
			++i;
		}
	}
}
