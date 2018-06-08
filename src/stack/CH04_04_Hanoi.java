package stack;
/**
 * 递归原理建立hanoi塔
 * @author shxxy
 *
 *目的：利用hanoi函数求出不同盘子数的盘子移动过程
 */
import java.io.*;
public class CH04_04_Hanoi {
	public static void main(String[] args) throws IOException{
	int j;
	String str;
	BufferedReader keyin=new BufferedReader(new
			InputStreamReader(System.in));
	System.out.println("请输入盘子数量：");
	str=keyin.readLine();
	j=Integer.parseInt(str);
	hanoi(j,1,2,3);//这里静态参量到非静态hanoi不允许，所以Hanoi要为静态
		}
	
	/*
	 * hanoi塔思想，分为两种情况：一个盘子和和两个盘子的，后面n个的可以看作时n-1个
	 * 盘子集合和第n个盘子的操作
	 * 
	 */
	public  static void hanoi(int n,int p1,int p2,int p3) {
		if(n==1) {
			System.out.println("将圆盘1从"+p1+"移动到"+p3);//move（1，p1，p3）  第一个盘 从p1移动到p3
		}else {
			hanoi(n-1,p1,p3,p2);//将n-1个的集合利用p3 ，使从p1移动到p2
			System.out.println("将圆盘"+n+"从"+p1+"移动到"+p3);//move（n，p1，p3）  第n个盘 从p1移动到p3
			hanoi(n-1,p2,p1,p3);//将n-1个的集合利用p1 ，使从p2移动到p3
		}
	}
}
