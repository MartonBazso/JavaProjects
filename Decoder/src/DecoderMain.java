import java.util.Scanner;

public class DecoderMain {

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Would you like to translate from letters to numbers ( l ), or numbers to letters (n)");
		
		
		char[] decide = in.nextLine().toCharArray();
		if(decide[0] == 'l') {
			wordToNumber();
		} else if(decide[0] == 'n') {
			numberToWord();
		} else {System.out.println("Try again faggot!");}
		
	}
	
	
	
	private static void numberToWord() {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to the number to text converter :) ");
		String firstline = in.nextLine();
		
		
		char[] array = firstline.toCharArray();
		int size = (array.length-1)/2;
		char[] first = new char[1000];
		char[] second = new char[1000];
		int i = 0; 
		int j = 0;
		
		 
		while(array[i] != ':') {
			
			
			
			//System.out.print( array[i]);
			first[i] = array[i];
			i += 1;
			
		}
		
		
		for(int x = i + 1 ; x < array.length ; x++ ) {
			
			//System.out.print(array[x]);
			second[j] = array[x];
			j += 1 ;
		}
		
		//számok 49-57
		System.out.println();
		int firstplace = 50;
		int secondplace = 49;
		char character = 97;
		
		for( int place = 0 ; place < size ; place++) {
			
				if(first[place] == '1' && second[place] == '2') {System.out.print(' ');}
			
				if(first[place] == '2') {
					
					switch( second [place]) {
					
					case '1': System.out.print('a'); break;
					
					case '2' : System.out.print('b'); break;
					
					case '3' : System.out.print('c'); break;
					
					}
					
				}
					
					
					
					if(first[place] == '3') {
						
						switch( second [place]) {
						
						case '1': System.out.print('d'); break;
						
						case '2' : System.out.print('e'); break;
						
						case '3' : System.out.print('f'); break;
						
						}
						
					}
						
						
						if(first[place] == '4') {
							
							switch( second [place]) {
							
							case '1': System.out.print('g'); break;
							
							case '2' : System.out.print('h'); break;
							
							case '3' : System.out.print('i'); break;
							
							}
							
						}	
							
							
							if(first[place] == '5') {
								
								switch( second [place]) {
								
								case '1': System.out.print('j'); break;
								
								case '2' : System.out.print('k'); break;
								
								case '3' : System.out.print('l'); break;
								
								}
								
							}	
								
								
								if(first[place] == '6') {
									
									switch( second [place]) {
									
									case '1': System.out.print('m'); break;
									
									case '2' : System.out.print('n'); break;
									
									case '3' : System.out.print('o'); break;
									
									}
									
								}	
									
									if(first[place] == '7') {
										
										switch( second [place]) {
										
										case '1': System.out.print('p'); break;
										
										case '2' : System.out.print('q'); break;
										
										case '3' : System.out.print('r'); break;
										
										case '4' : System.out.print('s'); break;
										
										}
										
									}	
										
										
										if(first[place] == '8') {
											
											switch( second [place]) {
											
											case '1': System.out.print('t'); break;
											
											case '2' : System.out.print('u'); break;
											
											case '3' : System.out.print('v'); break;
											
											}
										}
										
										
											
											if(first[place] == '9') {
												
												switch( second [place]) {
												
												case '1': System.out.print('w'); break;
												
												case '2' : System.out.print('x'); break;
												
												case '3' : System.out.print('y'); break;
												
												case '4' : System.out.print('z'); break;
												}
											}
				}
					
				
										
		
	}
	
	
	
	

	
	
	private static void wordToNumber() {
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to the text to number converter :) ");
		
		String basetext = in.nextLine();
		String text = basetext.toLowerCase();
		int[] code = new int[text.length()];
		int[] press = new int[text.length()];
		
		
		System.out.println(text);
		for(int x = 0; x < text.length() ; x++) {
			
			char a = text.charAt(x);
			
			code[x] = returnNum(a);
			press[x] = returnPress(a);
			
		}
		
		
		
		for(int y = 0; y < code.length ; y++ ) {
			System.out.print(code[y]);
		}
		System.out.print(":");
		for(int y = 0; y < press.length ; y++ ) {
			System.out.print(press[y]);
		}
		
		System.out.println();
		
	}
	
	
	
	private static int returnNum(char a) {
		
		int number = 1;
		
		if(a == 32) {return 1; }
		//97-122 small abc
		for(int x = 97; x < 123 ; x+=3 )
		{	
			
			number += 1;
			if( x < 115) {
				
				
			if(a == x || a == x+1 || a == x+2 ) 
			{
				
				return number;
				
			} else 
					{
						if( a == 115) {
							
							
							return 7;
							
						}
						
						if( a == 116 || a == 117 || a == 118) {
							
							
							return 8;
							
						}
						
						if( a == 119 || a == 120 || a == 121 || a == 122) {
							
							
							return 9;
							
						}
			
			
					}
			}
		}
		
		
		return number;
	}
	
	
	
	
	private static int returnPress(char a) 
	{
		if(a == 32) {return 2; }
		
		if( a == 'a' || a == 'd' || a == 'g' || a == 'j' || a == 'm' || a == 'p' || a == 't' || a == 'w') {
			
			return 1;
			
		}
		
		
		if( a == 'b' || a == 'e' || a == 'h' || a == 'k' || a == 'n' || a == 'q' || a == 'u' || a == 'x') {
			
			return 2;
			
		}
		
		if( a == 'c' || a == 'f' || a == 'i' || a == 'l' || a == 'o' || a == 'r' || a == 'v' || a == 'y') {
			
			return 3;
			
		}
		
		
		if( a == 's' || a == 'z') {
			return 4;
		}
		
		
		return 0;
		
	}
	
}
