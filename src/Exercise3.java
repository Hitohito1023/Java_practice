import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exercise3 {
	public static void main( String[] args ) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] param = input.split(" ");
        int sum = 0;
        for(int i = 0;i<param.length;i++) {
        	int num = Integer.parseInt(param[i]);
        	sum = sum + num;
        	i++;
        	
        }
        System.out.println(sum);
	}
}