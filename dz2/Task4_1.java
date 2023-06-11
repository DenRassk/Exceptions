/*
 * Задание 4. Разработайте программу, которая выбросит Exception, когда пользователь вводит
 * пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */

 // не перемудрил?

import java.util.Scanner;

public class Task4_1 {
    public static void main(String[] args) throws EmptyString {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        try {
            String str = in.nextLine();
            if (str == "") throw new EmptyString("Пустую строку вводить нельзя!");
            else System.out.println("Вы ввели: " + str) ;
        }
        finally {
            in.close();
        }
    }    
}

class EmptyString extends Exception{
    public EmptyString(String message){
        super(message);
    }
}
