package stack;
import java.io.*;
public class CH04_02 {
	public static void main(String[] args) throws IOException{
		BufferedReader buf;
		buf=new BufferedReader(new InputStreamReader(System.in));
		StackByLink stack_by_linkedList =new StackByLink();
		int choice=0;
		while (true) {
			System.out.println("(0)����     ��1���ڶ�ջ�м�������     ��2���������"
					+ "��ջ���ݣ�");
			choice=Integer.parseInt(buf.readLine());
			if(choice==2) {
				stack_by_linkedList.pop();
				
				stack_by_linkedList.output_of_stack();
			}else if(choice==1) {
				System.out.println("������Ҫ��ӵ����ݣ�");
				int data = Integer.parseInt(buf.readLine());
				stack_by_linkedList.insert(data);
				stack_by_linkedList.output_of_stack();
			}else if (choice==0) {
				break;
			}else {
				System.out.println("��������밴��ָ������");
			}

		}
	}
}
