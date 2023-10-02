import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        do{
        System.out.println("Введите первое число: ");
        int a = scan.nextInt();
        System.out.println("Введите второе число: ");
        int b = scan.nextInt();
        System.out.println("Выберите вид операции: \n 1. Сложение \n 2. Вычитание \n 3. Умножение \n 4. Деление");
        char choise = scan.next().charAt(0);
        switch (choise) {
            case '1':
                System.out.println("Сумма двух чисел: " + (a+b));
                break;
            case '2':
                System.out.println("Разница двух чисел: " + (a-b));
                break;
            case '3':
                System.out.println("Умножение двух чисел: " + (a*b));
                break;
            case '4':
                if(b == 0){
                    System.out.println("Делить на ноль нельзя!");
                }
                else{
                    System.out.println("Деление двух чисел: " + (a/b));
                }
                break;
            default:
                System.out.println("Вы ввели некорректное число");
                break;
        }
            System.out.println("Хотите продолжить? y or n");
            char c = scan.next().charAt(0);
            if (c == ('n'))
                System.exit(0);
        }while(true);
    }
}
