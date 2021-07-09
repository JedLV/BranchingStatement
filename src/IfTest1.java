import java.util.Scanner;
public class IfTest1 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入阿衰的期末成绩：（0-100）");
        int score = scan.nextInt();

        if (score == 100){
            System.out.println("奖励一台BMW,亲生的，一看就随我！");
        }else if (score >= 80 && score <= 90){
            System.out.println("奖励一台iphone xs max，宝贝儿，你真棒！");
        }else if (score >= 60 && score <= 80) {
            System.out.println("奖励一个 IPad，挺好，再接再厉！");
        } else{
            System.out.println("考这么差还想要奖励？食屎啦你！");

        }
    }
}
