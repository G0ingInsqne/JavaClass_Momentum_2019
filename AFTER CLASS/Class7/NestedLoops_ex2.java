
public class NestedLoops_ex2 {

	public static void main(String[] args) {
	
		// Create the shape using nested loops:
		//		*
		//		**
		//		***
		//		****
		//		*****
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
