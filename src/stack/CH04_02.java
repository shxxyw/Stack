package stack;
import java.io.*;
public class CH04_02 {
	public static void main(String[] args) throws IOException{
		BufferedReader buf;
		buf=new BufferedReader(new InputStreamReader(System.in));
		StackByLink stack_by_linkedList =new StackByLink();
		int choice=0;
		while (true) {
			System.out.println("(0)结束     （1）在堆栈中加入数据     （2）弹出后的"
					+ "堆栈数据：");
			choice=Integer.parseInt(buf.readLine());
			if(choice==2) {
				stack_by_linkedList.pop();
				
				stack_by_linkedList.output_of_stack();
			}else if(choice==1) {
				System.out.println("请输入要添加的内容：");
				int data = Integer.parseInt(buf.readLine());
				stack_by_linkedList.insert(data);
				stack_by_linkedList.output_of_stack();
			}else if (choice==0) {
				break;
			}else {
				System.out.println("输入错误，请按照指定输入");
			}

		}
	}
}
