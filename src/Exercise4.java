import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise4 {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
//		String  s = br.readLine();    // 1行分の文字列を入力する
//		int     n = Integer.parseInt( s ); 
		
		int x = Integer.parseInt(br.readLine());
//		int y = Integer.parseInt(br.readLine());
//		//3-8
//		if (x >= 60 && y >= 60) {
//			System.out.println("合格");
//		}else if(x + y == 130) {
//			System.out.println("合格");
//		}else if(x + y >= 100 && (x >= 90 || y >= 90)) {
//			System.out.println("合格");
//		}else {
//			System.out.println("不合格");
//		}
		//3-9
//		boolean open = true;
//		if(x == 0) {
//			open = false;
//		} else if(x == 2 && y == 0) {
//			open = false;
//		} else if(x == 3 && y == 2) {
//			open = false;
//		} else if (x == 5 && y == 0) {
//			open = false;
//		} else if (x == 6 && (y == 1 && y == 2)) {
//			open = false;
//		}
//		
//		if(open) {
//			System.out.println("営業");
//		}else {
//			System.out.println("休診");
//		}
		//3-11
//		switch(x) {
//			case 1:
//				System.out.println("");
//				break;
//			case 2:
//		}
		//3-13
		switch(x) {
			case 1:
				System.out.println("31日");
				break;
			case 2:
				System.out.println("28");
				break;
			case 3:
				System.out.println("31");
				break;
			default:
				System.out.println("入力が間違っています");
				break;
		}
		
	}

}
