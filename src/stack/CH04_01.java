package stack;

import java.io.*;

public class CH04_01 {
	public static void main(String[] args) throws  IOException {
	BufferedReader buf;
	int value;
	StackByArray stack =new StackByArray(10);
	buf=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("����������10������");
	for (int i=0;i<10;i++) {
		value=Integer.parseInt(buf.readLine());
		stack.push(value);
	}
	System.out.println("=======================");
	while (!stack.empty())//����ջ���ݴӶ��˵���
		System.out.println("��ջ����������Ϊ:"+stack.pop());
   }
}
