import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    //宣告scanner
        int max = java.lang.Integer.MIN_VALUE;    //宣告變數為最小
        int input_now;   //宣告變數
        while ((input_now = scanner.nextInt()) > 0) {  //當輸入大於0
            if (input_now > max) { //如果輸入大於max
                max = input_now; //如果輸入大於max，則max等於輸入
            }
        }
        System.out.println("MAX:" + max); //輸出MAX:和max
    }
} 
