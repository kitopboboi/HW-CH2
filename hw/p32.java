package hw;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class p32 {

	public static void main(String[] args) throws IOException
	{
		System.out.println("請問要在第幾次處理結束迴圈?(1~10)"); 
		BufferedReader br = new
			BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		for (int i = 1;i <= 10;i++) {
			System.out.print("第" + i + "次的處理");
			if(i == res)
				break;
		}
		
	}

}
