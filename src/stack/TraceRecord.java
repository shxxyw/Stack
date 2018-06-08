package stack;

class Node_maze{
	int x;
	int y;
	Node_maze next;
	public Node_maze (int x,int y) {
		this.x=x;
		this.y=y;
		this.next=null;
	}
}
public class TraceRecord {
public Node_maze first;
public Node_maze last;

public boolean isEmpty() {
	return first==null;
}

public void insert(int x,int y) {
	Node_maze newNode=new Node_maze(x,y);
	if(isEmpty()) {
		first=last=newNode;
	}else {
		last.next=newNode;
		last=newNode;
	}
}

public void pop() {
	Node_maze current ;
	if(isEmpty()) {
		System.out.println("[队列为空]");
		return;//记得打断函数
	}
	current=first;
	if(first==last) {
		first=last=null;
		System.out.println("[此时堆栈为空状态]");
	}else {
	  while(current.next!=last) {
		  current=current.next;
	  }
	  current.next=last.next;
	  last=current;
	  }
    }

}
