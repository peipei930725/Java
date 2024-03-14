import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    //宣告scanner
        String topic="";       //宣告
        while((topic = scanner.next())!=null){
            int i;
            for(i=0;i<topic.length()-1;++i){
                switch (topic.charAt(i)) {
                    case 'R':
                        if(topic.charAt(i+1)=='R'||(topic.charAt(i+1)!='G'&&topic.charAt(i+1)!='B')){
                            System.out.println("INVALID");
                            i=topic.length()-1;
                        }
                        break;
                    case 'G':
                        if(topic.charAt(i+1)=='G'||(topic.charAt(i+1)!='B'&&topic.charAt(i+1)!='R')) {
                            System.out.println("INVALID");
                            i=topic.length()-1;
                        }
                        break;
                    case 'B':
                        if(topic.charAt(i+1)=='B'||(topic.charAt(i+1)!='G'&&topic.charAt(i+1)!='R')) {
                            System.out.println("INVALID");
                            i=topic.length()-1;
                        }
                        break;
                    default:
                        System.out.println("INVALID");
                        i=topic.length()-1;
                        break;
                }
            }
            if(i==4) {
                System.out.println("VALID:"+topic);
            }
        }
    }
}