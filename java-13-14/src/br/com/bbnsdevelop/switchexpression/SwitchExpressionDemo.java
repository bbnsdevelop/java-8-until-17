package br.com.bbnsdevelop.switchexpression;

public class SwitchExpressionDemo {
	
	public static void main(String[] args) {
		
		int key = 1;
		
		
		String result = switch (key) {
		case 1: {			
			yield "Choice 1";
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + key);
		};
				
		System.out.println(result);
		
		
		
	}

}
