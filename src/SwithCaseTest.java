public class SwithCaseTest {
    public static void main (String[] args){

        int number = 1;
        switch (number){

            case 0 :
                System.out.println("zero");
                break;
            case 1 :
                System.out.println("one");
            case 2 :
                System.out.println("two");
            case 3 :
                System.out.println("three");
            default:
                System.out.println("other");

            //******************************

            String season = "summer";
            switch (season) {
                case "spring" :
                    System.out.println("春暖花开");
                case "summmer" :
                    System.out.println("夏日炎炎");
                    break;
                case "autumn" :
                    System.out.println("秋高气爽");
                    break;
                case "winter" :
                    System.out.println("冬雪皑皑");
                    break;
                default :
                    System.out.println("季节输入有误");
                    break;

                //*************************


            }
        }
    }
}
