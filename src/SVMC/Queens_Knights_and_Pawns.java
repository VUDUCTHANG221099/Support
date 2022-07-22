package SVMC;
import java.util.*;
import java.io.*;
public class Queens_Knights_and_Pawns {
	final static int Q         = 0;
	final static int K         = 1;
	final static int P         = 2;
	final static int Safe      = 3;
	final static int Unsafe    = 4;
	static int Board[][]=new int[1000][1000];//Lưu bàn cờ
	static int ROW,COL;	//Số hàng,cột
	// Đường đi con mã
	static int K_row[]= {-1,-2, 1, 2,-2,-1, 2, 1};
	static int K_col[]= {2, 1, 2, 1,-1,-2,-1,-2};
	
	// Đường đi con hậu
	static int Q_row[] = { 0, 0, 1, 1, 1,-1,-1,-1};
	static int Q_col[] = { 1,-1,-1, 0, 1,-1, 0, 1};
	static int Sum=0;
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		InputStream myFife=new FileInputStream("data/input.txt");
		
		Scanner sc=new Scanner(myFife);
		int TestCase;
		TestCase=0;
		while (true) {
			ROW=sc.nextInt();
			COL=sc.nextInt();
			if(ROW==0 && COL==0) {
				break;
			}
			TestCase++;
			Sum=ROW*COL;
			ROW--;
			COL--;
			// Ban đầu gán các ô là ô an toàn
			for (int r = 0; r <=ROW; r++) {
				for (int c = 0; c <=COL; c++) {
					Board[r][c]=Safe;
				}	
			}
			int r, c;
			int row[][]=new int [2][100],
				col[][]=new int [2][100];// Lưu thông tin con hậu, con mã
			int num[]=new int [3];		// Số lượng con hậu, con mã, con tốt
			//Tiếp tục nhập đầu vào
			for (int i = 0; i <3; i++) {
				num[i]=sc.nextInt();
				for(int j = 0; j < num[i]; j++)
				{
					r=sc.nextInt();
					c=sc.nextInt();
					Board[r-1][c-1] = i;
					if(i != 2)
					{
						row[i][j] = r - 1;
						col[i][j] = c - 1;
					}
				}
			}
			// Tính tổng các ô rảnh mà chưa có con nào đang đứng
			Sum -= num[Q] + num[K] + num[P];
			// Duyệt các con mã
			for (int i = 0; i < num[K]; i++) {
				Sum -= checkK(row[K][i],col[K][i]);
			}
			// Duyệt các con hậu
			for (int i = 0; i < num[Q]; i++) {
				for (int j = 0; j < 8; j++) {					
					checkQ(row[Q][i], col[Q][i], j);
				}
			}
			System.out.println("Board "+TestCase+" has "+Sum+" safe squares.");
		}
	}
	/*
	* Tính số ô con mã có thể ăn
	* @PARAM: row, hàng của con mã đang xét
	* @PARAM: col, cột của con mã đang xét
	* RETURN: số vị trí con mã có thể ăn
	*/
	static int checkK(int row,int col) {
		int count=0;
		//Kiểm tra 8 hướng đi của con mã
		for (int i = 0; i <8; i++) {
			int r=row+K_row[i];
			int c=col+K_col[i];
			if(r<=ROW && r>=0 && c<=COL && c>=0) {
				// Nếu ô nào đang ở vị trí an toàn
				// thì tức là con mã có thể ăn
				// cho ô đó thành Unsafe để tránh lặp và tăng biến đếm
				if(Board[r][c]==Safe) {
					Board[r][c] = Unsafe;
					count++;
				}
			}
		}
		return count;
	}
	/*
	* Duyệt mỗi con hậu tại vị trí row, col theo từng hướng
	* Sử dụng đệ quy
	*/
	static void checkQ(int row,int col,int direct) {
		int r=row+Q_row[direct];
		int c=col+Q_col[direct];
		if(r<=ROW && r>=0 && c<=COL && c>=0) {
			// Ô nào đang an toàn thì sẽ bị ăn
			// Cho thành Unsafe
			if(Board[r][c]==Safe) {
				Board[r][c]=Unsafe;
				Sum--;
				checkQ(r, c, direct);
			}else if(Board[r][c]==Unsafe) {
				// Trường hợp này là đã tính trước đó.
				checkQ(r, c, direct);
			}
		}
	}
	

}
