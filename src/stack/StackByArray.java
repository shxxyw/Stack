package stack;

public class StackByArray {//������ģ���ջ˵��
	private int[] stack ;//��������������
	private int top;//ָ��ջ���˵�����
//	stack�๹�캯��
	public StackByArray(int stack_size) {
		stack=new int[stack_size];//��������
		top=-1;//��ʾ��ջ��״̬
	}
	
//	�෽��push  ���ջ�����ݣ�������ջ������
	public boolean push (int data) {
		if(top>=stack.length) {
			System.out.println("��ջ�������޷�����");
			return false;
		}else {
			stack[++top]=data;
			return true;
		}
	}
//	�෽����ջpop  �Ӷ�ջ��ȡ������Ԫ��
	public int pop () {
		if(empty())//�ж��Ƿ�Ϊ��ջ
			return -1;//-1��ʾ��ջ
		else return stack[top--];
	}
//	�෽�� empty �ж��Ƿ�Ϊ��
	public boolean empty() {
		if(top==-1) return true;
		else return false;
	}

}
