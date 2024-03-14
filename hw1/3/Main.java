import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String topic="";       //宣告題目
        Scanner scanner = new Scanner(System.in);    //宣告scanner
        topic = scanner.next(); //輸入題目
        String input_now="";   //宣告自己的輸入
        while (scanner.hasNext() && (input_now = scanner.next()) != null) {  //當輸入不等於null
            int A=0;
            int B=0;
            int []arr=new int[10]; //宣告陣列
            for(int i=0;i<4;++i){ //迴圈
                if(topic.charAt(i)==input_now.charAt(i)){
                    A++; //如果題目的數字等於自己的輸入的數字，A++
                }
                else arr[topic.charAt(i)-'0']++; //將題目的數字轉成int ASCII
            }
            for(int i=0;i<4;++i){
                if(topic.charAt(i) != input_now.charAt(i) && topic.contains(input_now.charAt(i)+"")){ //如果題目包含自己的輸入的數字且位置不同
                    if(arr[input_now.charAt(i)-'0']>0){ //如果陣列的數字大於0
                        B++; //B++
                        arr[input_now.charAt(i)-'0']--; //將陣列的數字減一
                    }
                }
            }
            System.out.println(A+"A "+B+"B"); //輸出A和B
        }
    }
}