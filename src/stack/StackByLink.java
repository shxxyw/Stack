package stack;


public class StackByLink {
public Node front;//堆栈底端的指针
public Node rear;//堆栈顶端的指针

//判断是否为空方法isEmpty（）  front==null
public boolean isEmpty() {
	return front==null;
}
//打印堆栈内容 output_of_stack
public void output_of_stack() {
	Node current = front;
	if(!isEmpty())
	System.out.println("数据弹出后的堆栈内容：");
	while(current != null) {
		System.out.print("["+current.data+"]");
		current=current.next;
	}
	System.out.println();
}

//插入 数据到顶端数据
public void insert(int data) {
	Node newNode = new Node(data);
	if(isEmpty()) {
		front=newNode;
		rear=newNode;
	}else {
		rear.next=newNode;
		rear=newNode;
	}
}

//在顶端删除数据
public void pop() {
	Node current;
	if(isEmpty()) {
		System.out.println("堆栈为空，无法删除");
		return;//中断程序
	}
	current=front;
	if(current==rear) {//只有一个数据的情况
		rear=front=null;
		System.out.println("此时堆栈为空状态");
	}else {
		while(current.next!=rear) {
			current=current.next;
		}
		current.next=rear.next;//注意此时要将该节点指向最后节点
		rear=current;
	}
}

}
