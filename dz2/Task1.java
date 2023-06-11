/*
 * Задание 1. Реализуйте метод, который запрашивает у пользователя ввод 
 * дробного числа (типа float), и возвращает введенное значение. Ввод 
 * текста вместо числа не должно приводить к падению приложения, вместо 
 * этого, необходимо повторно запросить у пользователя ввод данных.
 */
// этож надо было запутаться в трёх соснах и плутать два часа... 

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        while (true){
            String str = input.next();
            Float num = 0F;
            try {
                num = Float.parseFloat(str);
                System.out.printf("\nВы ввели - %f\n", num);    
                break;
            }
            catch (NumberFormatException e) {
                System.out.println("Необходимо ввести число! Проверьте разделитель разрядов!");
                System.out.println("Попробуйте ещё раз: ");
            }
        }
        input.close();            
    }
}