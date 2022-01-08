package br.com.bbnsdevelop.switchexpression;

public class SwitchLambdaDemo {

	public static void main(String[] args) {
		
		Integer key = 2;
		
		
		String result = switch (key) {
		case 1 -> "Choice number 1";
		
		case 2 -> {
			yield "Choice number 2";
		}

		default -> throw new IllegalArgumentException("Unexpected value: " + key);
		};

		System.out.println(result);
	}

}
