import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Реализовать консольное приложение, которое:

Принимает от пользователя строку вида text~num

Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.

Если введено print~num, выводит строку из позиции num в связном списке.

Если введено exit, завершаем программу
 */
public class task {

    public static void main(String[] args) {
        ArrayList <String> list1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true){
            String s = sc.nextLine();
            String[] split = s.split("~");
            int i = 0;
            try {
                i = Integer.parseInt(split[1]);
            } catch (NumberFormatException e) {
            }
            if (split[0].equals("print") == true){
                if (list1.size() == 0) {
                    System.out.println("Список элементов пуст, невозможно вывести в консоль элемент с позицией "+ i);
                }
                if (list1.get(i) == null | list1.size() < i){
                    System.out.println("Элемента с позицией "+ i +" нет в списке.");
                }
                else {
                System.out.println(list1.get(i));
                }
            }
            if (split[0].equals("print") == false) {
                while (list1.size() <= i){
                    list1.add(null);
                }
                list1.add(i,split[0]);
                list1.remove(i+1);
                System.out.println(list1);
            }
            if (s == "exit") {
                break;
            }
        }
    }
}