package br.com.bbnsdevelop;

public class CharReversal {
	
	public static void main(String[] args) {
		String s = "Java is awesome!!";
		
		String[] temp = s.split(" ");
		int i = 0;
		String result = "";
		while(i < temp.length) {
			result+= new StringBuffer(temp[i]).reverse().toString();
			if(i != temp.length) {
				result += " ";
			}
			i++;
		}
		
		System.out.println(result);
	}

}
