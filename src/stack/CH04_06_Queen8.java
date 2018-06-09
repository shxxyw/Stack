package stack;
/*
 * Ŀ�ģ����Իʺ�����з�������ٷ������÷����жϣ����ؼ��ֽ�
 */

import java.io.*;

public class CH04_06_Queen8 {
static int TRUE=1,FALSE=0,Eight=8;
static int[] queen = new int [Eight];//�˸��ʺ��е�λ��
static int number=0;//���㹲�м���������
//���캯��
public CH04_06_Queen8() {
	number=0;
}
//��Enter ������
public static void PressEnter() {
	char tchar;
	System.out.print("\n\n");
	System.out.println("...����Enter����...");
	try {
		tchar=(char)System.in.read();
	}catch(IOException e) {}
}

//�����ʺ��ŵ�λ��
public static void decide_position(int value) {
	int i =0;
	while (i<Eight) {
		//�Ƿ��ܵ������ж�
		if(attack(i,value)!=1) {
			queen[value]=i;
			if(value==7)
				print_table();
			else decide_position(value+1);
		}
		i++;
	}
}

/*
 * 	�������·����λ�ã�row��col���Ƿ�ᱻ�������ܵ���������1������Ϊ0��
 * �ж�˼�룺1.���������к���ǰ�ʺ���������ȣ�row==queen[i] ������
 * 2.�ж����Խ��ߺ͸��Խ������Ƿ�ᱻ��ǰ�ʺ󹥻� �Խ��߹���i��j=const  ���Խ��� i+j=const
 * i-queen[i]==col-row; i+queen[i]==col+row;
 * i-col=queen[i]-row; i-col=-queen[i]+row;
 * �ʿɼ�Ϊ����ֵ |i-col|==|queen[i]-row|
 */
	public static int attack(int row,int col) {
		int i=0,atk=FALSE;
		int offset_row=0,offset_col=0;
		
		while(atk!=1 && i<col) {
			offset_col = Math.abs(i-col);
			offset_row = Math.abs(queen[i]-row);
			//�ж��к������Խ����Ƿ��ͻ
			if((queen[i]==row)||(offset_col==offset_row))
				atk=TRUE;
			i++;
		}
		return atk;
	}
	
//	������
	public static void print_table() {
		int x=0,y=0;
		number+=1;
		System.out.println();
		System.out.print("�˻ʺ������ĵ�"+ number+"���\n\t");
		for(x=0;x<Eight;x++) {
			for(y=0;y<Eight;y++)
				if(x==queen[y])
					System.out.print("<*>");
				else 
					System.out.print("<->");
			System.out.print("\n\t");
		}
		PressEnter();
	}
	public static void main(String[] args) {
		CH04_06_Queen8.decide_position(0);
	}
}
