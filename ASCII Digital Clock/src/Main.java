import java.io.IOException;
import java.time.LocalTime;

public class Main {
	
	private static boolean canStart = true;
	//the three possible outputs: nothing , vertical line or horizontal line
	static String space = " ";
	static String vLine = "|";
	static String hLine = "_";
	//The four digits of actual time
	static String digitOne;
	static String digitTwo;
	static String digitThree;
	static String digitFour;
	//The counter for the drawTime method. Helps to keep track of the line we are in at the moment
	static int line = 0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//A temporary variable, when this the "previous time" ( minutes )  and the new time are not the same, the screen updates
		int tmptime = LocalTime.now().getMinute();
		
		while(true) {
			//Actually gets the 4 digit strings
			if(LocalTime.now().getHour() < 10) {
				digitOne = "0";
				digitTwo = String.valueOf(LocalTime.now().getHour());
				
			} else {
				digitOne = String.valueOf(LocalTime.now().getHour()).substring(0,1);
				digitTwo = String.valueOf(LocalTime.now().getHour()).substring(1);
			}
			
			if(LocalTime.now().getMinute() < 10) {
				digitThree = "0";
				digitFour = String.valueOf(LocalTime.now().getMinute());
				
			} else {
				digitThree = String.valueOf(LocalTime.now().getMinute()).substring(0,1);
				digitFour = String.valueOf(LocalTime.now().getMinute()).substring(1);
			}
		//Some random useless comment
		//System.out.println(digitOne + digitTwo + " : " + digitThree + digitFour);
		
		if(canStart) {
			drawTime(digitOne);
			canStart = false;
		}
	  /*String line1 = " _   _     _   _ ";
		String line2 = "|_| |_| . |_| |_|";
		String line3 = "|_| |_| . |_| |_|";
		
		
		String fl1 = "_";
		String fl2 = "_";
		String fl3 = "_";
		String fl4 = " ";
		
		
		String tmpH = "_";
		String tmpV = "|";
		System.out.printf(" %s   %s     %s   %s \n", fl1 , fl2 , fl3 , fl4);
		
		System.out.println("%s%s%s %s%s%s . %s%s%s %s%s%s\n" );*/
		
		//drawTime(digitOne);
			//Updates the screen when the time changes
			if(tmptime != LocalTime.now().getMinute()) {
				cls(31);
				line = 0;
				tmptime = LocalTime.now().getMinute();
				drawTime(digitOne);
			}
				
				
				
			
			
			
		}
		
		
		//System.out.println(LocalTime.now().getHour());
	}
	//Clears the screen var: The height of the console
	public static void cls(int height){
		
		for(int i = 0 ; i < height + 1 ; i++) {
			System.out.println();
		}
		
	}
	
	//Work gets done here, draws the 3 separate lines in which every line has 4 "columns" for each number.
	public static void drawTime(String digit) {
		
		
		//init variables
		String fl = space;
		String sl1= space;
		String sl2= space;
		String sl3= space;
		String tl1= space;
		String tl2= space;
		String tl3= space;
		
		
		//Draws the first line. 
		if(line == 0) {
			
			//This statement sets the variables a horizontal line or a space if needed.
			if(digit.equals("0") || digit.equals("2") || digit.equals("3") || digit.equals("5") || digit.equals("6") || digit.equals("7") ||digit.equals("8") || digit.equals("9") ) {
				fl = hLine;
				
			} else fl = " ";
			
			
			System.out.printf(" %s ", fl);
			
			if(digit == digitOne) {
				
				drawTime(digitTwo);
			}
			if(digit == digitTwo) {
				
				System.out.print("   ");
				drawTime(digitThree);
			}
			if(digit == digitThree) {
				
				drawTime(digitFour);
			}
			System.out.println();
			line++;
			digit = digitOne;
		}
		//Draws the second line
		if(line == 1) {
			
			if(digit.equals("0") || digit.equals("4") || digit.equals("5") || digit.equals("6") || digit.equals("8") || digit.equals("9")) {
				sl1 = vLine;
				
			} else sl1 = " ";
			
			if(digit.equals("2") || digit.equals("3") || digit.equals("4") || digit.equals("5") || digit.equals("6") || digit.equals("8") ||digit.equals("9")) {
				sl2 = hLine;
				
			} else sl2 = " ";
			
			if(digit.equals("0") || digit.equals("1") || digit.equals("2") || digit.equals("3") || digit.equals("4") || digit.equals("7") || digit.equals("8") || digit.equals("9") ) {
				sl3 = vLine;
				
			} else sl3 = " ";
			
			System.out.printf("%s%s%s", sl1,sl2,sl3);
			
			if(digit == digitOne) {
				
				drawTime(digitTwo);
			}
			if(digit == digitTwo) {
				
				System.out.print(" , ");
				drawTime(digitThree);
			}
			if(digit == digitThree) {
				
				drawTime(digitFour);
			}
			
			System.out.println();
			line++;
			digit = digitOne;
		}
		
		if(line == 2) {
			
			if(digit.equals("0") || digit.equals("2") || digit.equals("6") || digit.equals("8")) {
				tl1 = vLine;
				
			} else tl1 = " ";
			
			if(digit.equals("0") || digit.equals("2") || digit.equals("3") || digit.equals("5") || digit.equals("6") ||digit.equals("8") || digit.equals("9") ) {
				tl2 = hLine;
				
			} else tl2 = " ";
			
			if(digit.equals("0") || digit.equals("1") || digit.equals("3") || digit.equals("4") || digit.equals("5") || digit.equals("6") || digit.equals("7") || digit.equals("8") || digit.equals("9") ) {
				tl3 = vLine;
				
			} else tl3 = " ";
			
			System.out.printf("%s%s%s", tl1,tl2,tl3);
			
			if(digit == digitOne) {
				
				drawTime(digitTwo);
			}
			if(digit == digitTwo) {
				
				System.out.print(" , ");
				drawTime(digitThree);
			}
			if(digit == digitThree) {
				
				drawTime(digitFour);
			}
			
			System.out.println();
			
			
		}
			
			
			
		
	}
	
	

}
