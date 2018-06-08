package stack;
/**
 * �ݹ�ԭ����hanoi��
 * @author shxxy
 *
 *Ŀ�ģ�����hanoi���������ͬ�������������ƶ�����
 */
import java.io.*;
public class CH04_04_Hanoi {
	public static void main(String[] args) throws IOException{
	int j;
	String str;
	BufferedReader keyin=new BufferedReader(new
			InputStreamReader(System.in));
	System.out.println("����������������");
	str=keyin.readLine();
	j=Integer.parseInt(str);
	hanoi(j,1,2,3);//���ﾲ̬�������Ǿ�̬hanoi����������HanoiҪΪ��̬
		}
	
	/*
	 * hanoi��˼�룬��Ϊ���������һ�����Ӻͺ��������ӵģ�����n���Ŀ��Կ���ʱn-1��
	 * ���Ӽ��Ϻ͵�n�����ӵĲ���
	 * 
	 */
	public  static void hanoi(int n,int p1,int p2,int p3) {
		if(n==1) {
			System.out.println("��Բ��1��"+p1+"�ƶ���"+p3);//move��1��p1��p3��  ��һ���� ��p1�ƶ���p3
		}else {
			hanoi(n-1,p1,p3,p2);//��n-1���ļ�������p3 ��ʹ��p1�ƶ���p2
			System.out.println("��Բ��"+n+"��"+p1+"�ƶ���"+p3);//move��n��p1��p3��  ��n���� ��p1�ƶ���p3
			hanoi(n-1,p2,p1,p3);//��n-1���ļ�������p1 ��ʹ��p2�ƶ���p3
		}
	}
}
