import java.util.Arrays;

public class Main {
	
	
	
	public static void main(String[] args) {
		
		String number = "10012";
		System.out.println(number);
		char[] digits = number.toCharArray();
		String[] texts = new String[digits.length];
		
		for(int i = digits.length - 1 ; i >= 0 ; i--) {
			
			
					if(i == (digits.length - 1)) {
						
						switch(digits[i]) {
						
							default: texts[i] = "wrong";
							break;
							
							case 48: texts[i] = " ";
							break;
							
							case 49: texts[i] = " one ";
							break;
							
							case 50: texts[i] = " two ";
							break;
							
							case 51: texts[i] = " three ";
							break;
							
							case 52: texts[i] = " four ";
							break;
							
							case 53: texts[i] = " five ";
							break;
							
							case 54: texts[i] = " six ";
							break;
							
							case 55: texts[i] = " seven ";
							break;
							
							case 56: texts[i] = " eight ";
							break;
							
							case 57: texts[i] = " nine ";
							break;
						}
					}
					
					
					if(i == (digits.length - 2) || i == (digits.length - 5)) {
						
							
							switch(digits[i]) {
							
								default: texts[i] = "wrong";
								break;
								
								case 48: texts[i] = " ";
								break;
								
								case 49: if(i == (digits.length - 2)) {
									texts[i + 1] = " ";
									switch(digits[i+1]) {
								
										default: texts[i] = "wrong";
										break;
										
										case 48: texts[i] = " ";
										break;
										
										case 49: texts[i] = " eleven ";
										break;
										
										case 50: texts[i] = " twelve ";
										break;
										
										case 51: texts[i] = " thirteen ";
										break;
										
										case 52: texts[i] = " fourteen ";
										break;
										
										case 53: texts[i] = " fifteen ";
										break;
										
										case 54: texts[i] = " sixteen ";
										break;
										
										case 55: texts[i] = " seventeen ";
										break;
										
										case 56: texts[i] = " eightteen ";
										break;
										
										case 57: texts[i] = " nineteen ";
										break;
										
										}
									}else {
										texts[i] = "ten";
									}
								break;
								
								
								
								
								case 50: texts[i] = " twenty ";
								break;
								
								case 51: texts[i] = " thirty ";
								break;
								
								case 52: texts[i] = " fourty ";
								break;
								
								case 53: texts[i] = " fifty ";
								break;
								
								case 54: texts[i] = " sixty ";
								break;
								
								case 55: texts[i] = " seventy ";
								break;
								
								case 56: texts[i] = " eighty ";
								break;
								
								case 57: texts[i] = " ninety ";
								break;
							}
						
						}
					
					
					if(i == (digits.length - 3) || i == (digits.length - 6)) {
						
						switch(digits[i]) {
						
						default: texts[i] = "wrong";
						break;
						
						case 48: texts[i] = " ";
						break;
						
						case 49: texts[i] = " one "+ "hundred and ";
						break;
						
						case 50: texts[i] = " two "+ "hundred and ";
						break;
						
						case 51: texts[i] = " three "+ "hundred and ";
						break;
						
						case 52: texts[i] = " four "+ "hundred and ";
						break;
						
						case 53: texts[i] = " five "+ "hundred and ";
						break;
						
						case 54: texts[i] = " six "+ "hundred and ";
						break;
						
						case 55: texts[i] = " seven "+ "hundred and ";
						break;
						
						case 56: texts[i] = " eight "+ "hundred and ";
						break;
						
						case 57: texts[i] = " nine "+ "hundred and ";
						break;
					}
						
						
					}
						
						
						if(i == (digits.length - 4)) {
							
							switch(digits[i]) {
							
							default: texts[i] = "wrong";
							break;
							
							case 48: texts[i] = " ";
							break;
							
							case 49: texts[i] = " one "+ "thousand ";
							break;
							
							case 50: texts[i] = " two "+ "thousand ";
							break;
							
							case 51: texts[i] = " three "+ "thousand ";
							break;
							
							case 52: texts[i] = " four "+ "thousand ";
							break;
							
							case 53: texts[i] = " five "+ "thousand ";
							break;
							
							case 54: texts[i] = " six "+ "thousand ";
							break;
							
							case 55: texts[i] = " seven "+ "thousand ";
							break;
							
							case 56: texts[i] = " eight "+ "thousand ";
							break;
							
							case 57: texts[i] = " nine "+ "thousand ";
							break;
						}
						
						
						
					}
						
						
					
			}
		
		System.out.println(Arrays.toString(texts));
		
		
	}

}
