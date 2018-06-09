package stack;
/*
 * 目的：测试皇后的排列方案，穷举法；利用方法判断，返回几种解
 */

import java.io.*;

public class CH04_06_Queen8 {
static int TRUE=1,FALSE=0,Eight=8;
static int[] queen = new int [Eight];//八个皇后列的位置
static int number=0;//计算共有几组解的总数
//构造函数
public CH04_06_Queen8() {
	number=0;
}
//按Enter 键函数
public static void PressEnter() {
	char tchar;
	System.out.print("\n\n");
	System.out.println("...按下Enter继续...");
	try {
		tchar=(char)System.in.read();
	}catch(IOException e) {}
}

//决定皇后存放的位置
public static void decide_position(int value) {
	int i =0;
	while (i<Eight) {
		//是否受到攻击判断
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
 * 	测试在新放入的位置（row，col）是否会被攻击，受到攻击返回1，否则为0；
 * 判断思想：1.利用输入行和以前皇后所在行相比，row==queen[i] 被攻击
 * 2.判断主对角线和副对角线上是否会被以前皇后攻击 对角线规律i—j=const  副对角线 i+j=const
 * i-queen[i]==col-row; i+queen[i]==col+row;
 * i-col=queen[i]-row; i-col=-queen[i]+row;
 * 故可简化为绝对值 |i-col|==|queen[i]-row|
 */
	public static int attack(int row,int col) {
		int i=0,atk=FALSE;
		int offset_row=0,offset_col=0;
		
		while(atk!=1 && i<col) {
			offset_col = Math.abs(i-col);
			offset_row = Math.abs(queen[i]-row);
			//判断行和主副对角线是否冲突
			if((queen[i]==row)||(offset_col==offset_row))
				atk=TRUE;
			i++;
		}
		return atk;
	}
	
//	输出结果
	public static void print_table() {
		int x=0,y=0;
		number+=1;
		System.out.println();
		System.out.print("八皇后的问题的第"+ number+"组解\n\t");
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
