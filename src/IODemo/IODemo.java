package IODemo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 编写一个Java程序将当100,101,102,103,104,105个数以数组的形式写入到Dest.txt文件中，
 * 并以相反的顺序读出显示在屏幕上。
 * @author Administrator
 *
 */
public class IODemo {
	public static void main(String[] args) throws IOException {
		int[] arr = {100,101,102,103,104,105};
		//用于输出数据和类型。
		//OutputStreamWriter osw = new OutputStreamWriter(new 
				//FileOutputStream("test.txt"), "utf-8");
		DataOutputStream out = new  DataOutputStream (new  
				FileOutputStream("test.txt"));
		for(int i = 0 ; i < arr.length ; i++ ){
			//System.out.println(arr[i]);
			out.write(arr[i]);
		}
		DataInputStream dis = new DataInputStream(new
				FileInputStream("test.txt"));
		int read ;
		while((read = dis.read()) != -1){
			System.out.println(read);
		}
	}
}
