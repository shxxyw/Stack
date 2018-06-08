package stack;

import java.io.*;

public class CH04_01 {
	public static void main(String[] args) throws  IOException {
	BufferedReader buf;
	int value;
	StackByArray stack =new StackByArray(10);
	buf=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("请依次输入10个数据");
	for (int i=0;i<10;i++) {
		value=Integer.parseInt(buf.readLine());
		stack.push(value);
	}
	System.out.println("=======================");
	while (!stack.empty())//将堆栈数据从顶端弹出
		System.out.println("堆栈弹出的数据为:"+stack.pop());
   }
}
