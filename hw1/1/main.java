import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//宣告scanner
        int input_1,input_2;    //宣告變數
        input_1=scanner.nextInt();        //讀取輸入
        input_2=scanner.nextInt();        //讀取輸入
        while (scanner.hasNext()) {       //當輸入還有下一個時   
            int input_now;        //宣告變數
            input_now=scanner.nextInt();    //讀取輸入        
            if(input_now==input_1+input_2){ //如果輸入等於input_1+input_2
                System.out.println("RIGHT!"); //輸出RIGHT
                break; //跳出迴圈
            }
            System.out.println("WRONG!"); //輸出WRONG
        }
    }
}