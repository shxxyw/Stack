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
	
//�ж��Ƿ�Ϊ��ջ��ȷ˳��
	public boolean isStackOutSqueen(int[] num,StackByArray stackOrder) {
		StackByArray tempStack = 
				new StackByArray(stackOrder.stack.length);
		
		//����˳��ģ��һ���ջ
		for(int i=0;i<num.length;i++) {
			tempStack.push(num[i]);
			while(!tempStack.empty()&&tempStack.stack[tempStack.top]
					==stackOrder.stack[top]) {
				tempStack.pop();
				stackOrder.pop();
			}
		}		
		return tempStack.empty();
	}
}
