/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Locale; //импортирование из пакета java.util классов
import java.util.Scanner; 

/**
 *
 * @author estel
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.format("The value of e is %-10.4f%n", Math.E);
        System.out.printf("The value of pi is %10.5f%n", Math.PI);
        System.out.printf(Locale.ENGLISH, "Using locale: %d%n", 123456789); //locale не работает как надо
        final double PI = (double) 22/7;//объясление какого-то числа константой
        System.out.printf(String.join("%n",/* добавление %n позволяет каждую 
                следующую строку писать с новой строки*/
                "Using argument index:",
                "First number: %2$-5d",
                "Second number: %1$5d",
                "PI: %3$.20f%n"), 123, 456, PI);
        
        //int celsium = 10;
       System.out.print("Введите температуру по цельсию: ");
       Scanner temp_celsium = new Scanner(System.in); //ввод инфы в консоль, объявление сканера
       float celsium = temp_celsium.nextFloat(); //считываетывает введенное в консоль число, дробь писать с запятой
       //nextInt() отвечает за то, чтобы считать введенное целое число с консоли
       //nextLine() для текста
       System.out.println ("Вы ввели температуру по Цельсию " + celsium);
       float farhengheit = (celsium*9/5)+32; //формула вычисления из цельсия в фаренгейт
       System.out.println ("Температура по Фаренгейту " + farhengheit);
       
       
       /*System.out.print("Введите трехзначное число: ");
       Scanner scan_number = new Scanner(System.in); //ввод инфы в консоль, объявление сканера
       int number = scan_number.nextInt();
       System.out.println("Ваше число: " + number);
       
       /*String str = "123";
       String[] arrOfStr = str.split("");
       for (String a : arrOfStr)
            System.out.println(a);*/
    }
    
}
