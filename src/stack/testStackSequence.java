package stack;

public class testStackSequence {
	public static void main(String[] args) {
//	出栈顺序排列
		int [] original = {1,2,3,4,5,6};
		int [] order= {3,2,5,6,4,1};
		StackByArray stack =new StackByArray(order.length);
		for(int i=order.length-1;i>=0;i--)
	    stack.push(order[i]);
	
	if (stack.isStackOutSqueen(original,stack))
		System.out.println("出栈顺序正确");
	else
		System.out.println("出栈顺序错误");
	}
}
