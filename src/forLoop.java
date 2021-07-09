public class forLoop {
    public static void main(String[] args) {

        /*
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");

         */

        for (int i = 1; i <= 5; i++) {//1,2,3,4,5
            System.out.println("Hello World!");
        }

        //练习：
        int num = 1;
        for (System.out.print('a'); num <= 3; System.out.print('c'), num++) {
            System.out.print('b');

        }

        //例题：遍历100以内的偶数，输出所有偶数的和，输出偶数的个数
        int sum = 0;
        int count = 0;
        for (int i = 1; i<= 100; i++){

            if (i % 2 == 0){
                System.out.println(i);
                sum += i;
                count++;
            }
            //System.out.println("总和为：" + sum);
        }
        System.out.println("总和为：" + sum);
        System.out.println("个数为：" + count);
    }
}

