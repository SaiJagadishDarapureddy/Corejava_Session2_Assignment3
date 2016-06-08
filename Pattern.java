
public class Pattern {

	public static void main(String[] args) {
		int row, column;
		
        for (row = 1; row <= 5; row++) {	// rows iteration
            
            for (column = 1; column <= row; column++) {		//columns iteration
                System.out.print(column + " ");
            }
            System.out.println("");
        }
        	
        for (row = 0; row < 4; row++) { // rows iteration
            
            for (column = 1; column <= 4- row; column++) { 		//columns iteration
                System.out.print(column + " ");
            }
            System.out.println("");
        }
	}
}
