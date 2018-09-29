import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String asd = "hellod hogy vagy indítsd el a facebookot";
		
		
		String[] commands = toWordArray(asd);
		
		for(int i = 0; i < commands.length ; i++) {
			
			process(commands[i]);
			
		}
		
	}
	
	
	private static String[] toWordArray(String commands){
        String[] words = new String[commands.length()];
        String newcommand = commands;
        int j = 0;
        
        for(int i = 0; i < newcommand.length() ; i++) {
        	
        	if(newcommand.charAt(i) == ' ') {
        
        		words[j] = newcommand.substring(0, i);
        		
        		newcommand = newcommand.substring(i+1);
        		i = 0;
        		j++;
        		
        	}
        	
        }
        
        words[j] = newcommand;
		return words;
        
	}
	
	
	
	private static void process(String command) {
		//System.out.println(command);
		if(command != null) {
			
			if(command.contains("hello")) {
				
				System.out.println("Üdv Uram!");
				
			}
			
			
			
			if(command.contains("facebook")) {
				
				System.out.println("Facebook is starting......");
				
			}
		
		
		
		}
		
		
	}

}
