public class DoWhile {
    public static void main(String[] args) {

        //遍历100以内的偶数，并计算所有偶数的和及偶数的个数
        int num = 1;
        int sum = 0;//记录总和
        int count = 0;//记录个数
        do {
            if (num % 2 == 0){
                System.out.println(num);
                sum += num;
                count++;
            }

            num++;

        }while (num <= 100);

        System.out.println("总和为：" + sum);
        System.out.println("个数为：" + count);

        //*************************
        int number1 = 15;
        while (number1 > 10){
            System.out.println("hello:while");
            number1--;
        }
        int number2 = 15;
        do {
            System.out.println("hello:while");
            number2--;
        }while (number2 > 10);

    }
}