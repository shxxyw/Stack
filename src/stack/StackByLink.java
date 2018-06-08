package stack;


public class StackByLink {
public Node front;//��ջ�׶˵�ָ��
public Node rear;//��ջ���˵�ָ��

//�ж��Ƿ�Ϊ�շ���isEmpty����  front==null
public boolean isEmpty() {
	return front==null;
}
//��ӡ��ջ���� output_of_stack
public void output_of_stack() {
	Node current = front;
	if(!isEmpty())
	System.out.println("���ݵ�����Ķ�ջ���ݣ�");
	while(current != null) {
		System.out.print("["+current.data+"]");
		current=current.next;
	}
	System.out.println();
}

//���� ���ݵ���������
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

//�ڶ���ɾ������
public void pop() {
	Node current;
	if(isEmpty()) {
		System.out.println("��ջΪ�գ��޷�ɾ��");
		return;//�жϳ���
	}
	current=front;
	if(current==rear) {//ֻ��һ�����ݵ����
		rear=front=null;
		System.out.println("��ʱ��ջΪ��״̬");
	}else {
		while(current.next!=rear) {
			current=current.next;
		}
		current.next=rear.next;//ע���ʱҪ���ýڵ�ָ�����ڵ�
		rear=current;
	}
}

}
