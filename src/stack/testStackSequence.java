package stack;

public class testStackSequence {
	public static void main(String[] args) {
//	��ջ˳������
		int [] original = {1,2,3,4,5,6};
		int [] order= {3,2,5,6,4,1};
		StackByArray stack =new StackByArray(order.length);
		for(int i=order.length-1;i>=0;i--)
	    stack.push(order[i]);
	
	if (stack.isStackOutSqueen(original,stack))
		System.out.println("��ջ˳����ȷ");
	else
		System.out.println("��ջ˳�����");
	}
}
