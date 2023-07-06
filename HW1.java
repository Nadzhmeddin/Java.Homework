package Homework1;
import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        // sumNums();
        // primeNums();
        Calculator();
    }
    
    static void sumNums(){
    // 1.1 Вычислить n-ое треугольное число (сумма чисел от 1 до n).
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int num = sc.nextInt();
        int res = 0;
        if(num > 0 ){
            for (int i = 0; i <= num; i++) {
            res += i;
            }System.out.println("Сумма равна " +res);
        }else System.out.println(-1);
        
        sc.close();
        }
    
    static void primeNums(){
        //Вывести все простые числа от 1 до 1000.
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число от 1 до 1000: ");
        int num = sc.nextInt();

        if (num > 2 && num % 2 !=0){
            for (int i = 3; i < num;i++) {
                if(num % i == 0) System.out.printf("Число %d не является простым", num);
                else System.out.printf("Число %d является простым ", num);
            }
        } else if (num == 2) System.out.printf("Число %d является простым", num);
        else System.out.printf("Число %d не является простым", num);
        sc.close();
    } 


    static void Calculator(){


        Scanner sc = new Scanner(System.in);
        System.out.print("Введите номер операции:\n 1- Cложение;\n 2- Вычитание;\n 3- Умножение;\n 4- Деление;\n 5- Решил в уме\n");
        float operation = sc.nextFloat();
        System.out.print("Введите первое число: ");
        float num1 = sc.nextFloat();
        System.out.print("Введите второе число: ");
        float num2 = sc.nextFloat();
        float res = 0;

        if(operation == 1){
            res = num1 + num2;
            System.out.printf("Результат сложения равен: %.2f", res);
        } else if (operation == 2){
            res = num1 - num2;
            System.out.printf("Результат вычитания равен: %.2f", res);
        } else if(operation == 3){
            res = num1*num2;
            System.out.printf("Результат умножения равен: %.2f", res);
        } else if(operation == 4 ){
            res = num1 / num2;
            System.out.printf("Результат деления равен: %.2f", res);
        }else if(operation == 5){
            System.out.println("Молодец! Обошелся без меня!");
        }else{
            System.out.println(-1);
        }
        
        sc.close();
    }
}
    