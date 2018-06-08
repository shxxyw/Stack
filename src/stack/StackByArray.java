package stack;

public class StackByArray {//以数组模拟堆栈说明
	private int[] stack ;//在类中声明数组
	private int top;//指向栈顶端的索引
//	stack类构造函数
	public StackByArray(int stack_size) {
		stack=new int[stack_size];//建立数组
		top=-1;//表示空栈的状态
	}
	
//	类方法push  存放栈顶数据，并更新栈顶内容
	public boolean push (int data) {
		if(top>=stack.length) {
			System.out.println("堆栈已满，无法加入");
			return false;
		}else {
			stack[++top]=data;
			return true;
		}
	}
//	类方法出栈pop  从堆栈中取出数据元素
	public int pop () {
		if(empty())//判断是否为空栈
			return -1;//-1表示空栈
		else return stack[top--];
	}
//	类方法 empty 判断是否为空
	public boolean empty() {
		if(top==-1) return true;
		else return false;
	}

}
