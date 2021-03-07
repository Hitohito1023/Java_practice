import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exercise {
	public static void main( String[] args ) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] param = input.split(" ");
        int num1 = Integer.parseInt(param[0]);
        int num2 = Integer.parseInt(param[2]);
        
        if(param[1].equals("+")) {
        	System.out.println(num1 + num2);
        } else if(param[1].equals("-")) {
        	System.out.println(num1 - num2);
        } else if(param[1].equals("*")) {
        	System.out.println(num1 * num2);
        } else if(param[1].equals("/")) {
        	System.out.println(num1 / num2 + " ... " + num1 % num2);
        }
        
        
    }
}
