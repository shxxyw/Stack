package stack;
import java.io.*;
public class CH04_05_maze {
//	�������궨�弰�Թ�
public static int ExitX=8;
public static int ExitY=10;
public static int [][] maze= {
		{1,1,1,1,1,1,1,1,1,1,1,1},
		{1,0,0,0,1,1,1,1,1,1,1,1},
		{1,1,1,0,1,1,0,0,0,0,1,1},
		{1,1,1,0,1,1,0,1,1,0,1,1},
		{1,1,1,0,0,0,0,1,1,0,1,1},
		{1,1,1,0,1,1,0,1,1,0,1,1},
		{1,1,1,0,1,1,0,1,1,0,1,1},
		{1,1,1,1,1,1,0,1,1,0,1,1},
		{1,1,0,0,0,0,0,0,1,0,0,1},
		{1,1,1,1,1,1,1,1,1,1,1,1}  } ;

public static void main(String[] args) {
	int i,j,x,y;
	TraceRecord path = new TraceRecord();
	x=1;
	y=1;
	path.insert(x, y);
	System.out.println("�Թ���·����0�Ĳ��֣�");
	for(i=0;i<10;i++) {
		for(j=0;j<12;j++) 
			System.out.print(maze[i][j]);
			System.out.println();
		
	}
	
	while(true) {
		maze[x][y]=2;
		if(x==ExitX&&y==ExitY) {
			System.out.println("Сmouse�������");
			System.out.println("Ӧ�ߵ�·����2�Ĳ��֣�3Ϊʧ��·��");
			for(i=0;i<10;i++) {
				for(j=0;j<12;j++) 
					System.out.print(maze[i][j]);
					System.out.println();
			}
			break;
		}else if(maze[x-1][y]==0) {//����Ѱ��
			x-=1;
			path.insert(x, y);
		}else if(maze[x+1][y]==0) {//����Ѱ��
			x+=1;
			path.insert(x, y);
		}else if(maze[x][y-1]==0) {//����Ѱ��
			y-=1;
			path.insert(x, y);
		}else if(maze[x][y+1]==0) {//����Ѱ��
			y+=1;
			path.insert(x, y);
		}else if(x==1&&y==1) {
			System.out.println("û�г�·");
			break;
		}else {
			maze[x][y]=3;
			path.pop();
			x=path.last.x;
			y=path.last.y;
			
		}
	}
}
}
