package hw3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Создать список типа ArrayList<String>.
// Поместить в него как строки, так и целые числа. Пройти по списку, найти и удалить целые числа.
public class Task3 {
    public static void main(String[] args) {
        ex03();
    }

        private static void ex03 () {

            List<String> arrayList = new ArrayList<>();
            arrayList.add("3");
            arrayList.add("3");
            arrayList.add("А");
            arrayList.add("1");
            arrayList.add("в");
            arrayList.add("о");
            arrayList.add("к");
            arrayList.add("5");
            arrayList.add("а");
            arrayList.add("д");
            arrayList.add("8");
            arrayList.add("о");

            System.out.println(arrayList);

            }
        }

