// Work №4 - Task №1

// Организовать ввод и хранение данных пользователей. ФИО возраст и пол
// вывод в формате Фамилия И.О. возраст пол
// добавить возможность выхода или вывода списка отсортированного по возрасту!)
// *реализовать сортировку по возрасту с использованием индексов
// *реализовать сортировку по возрасту и полу с использованием индексов

// ------------
//  Вариант №1 - Основное задание
// ------------ 

// 1. Организовать ввод и хранение данных пользователей. ФИО возраст и пол

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

public class W4T1 {
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("People count: ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Name, surname, muddle name: ");
            System.out.println();
            String fio = scanner.nextLine();
            System.out.print("Enter you age and gender: ");
            System.out.println();
            String age = scanner.nextLine();
            people.add(fio + " " + age);
        }
        // System.out.println(people);
        scanner.close();

        // 2. вывод в формате Фамилия И.О. возраст пол
        for (int i = 0; i < people.size(); i++) {
            String[] array = people.get(i).split(" ");
            System.out.println(array[0] + " " + array[1].toUpperCase().charAt(0) + "."
                    + array[2].toUpperCase().charAt(0) + ". " + array[3]);
            // System.out.println(array[0] + " " + array[1].toUpperCase().charAt(0) + "." +
            // array[2].toUpperCase().charAt(0) + ". " + people.get(i + 1) + " " +
            // people.get(i + 2));
        }

        // 3. добавить возможность выхода или вывода списка отсортированного по
        // возрасту!)

        people.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o1.split(" ")[3]) - Integer.parseInt(o2.split(" ")[3]);
            }
        });
        for (int i = 0; i < people.size(); i++) {
            String[] array = people.get(i).split(" ");
            System.out.println(array[0] + " " + array[1].toUpperCase().charAt(0) + "."
                    + array[2].toUpperCase().charAt(0) + ". " + array[3]);
        }
    }

    // 4. *реализовать сортировку по возрасту с использованием индексов

    // 5. *реализовать сортировку по возрасту и полу с использованием индексов
}

// ------------
// Вариант №2 - с тремя аргументами
// ------------

// 1. Организовать ввод и хранение данных пользователей. ФИО возраст и пол

// import java.util.Scanner;
// import java.util.ArrayList;
// import java.util.Comparator;

// public class W4T1
// {
// public static void main(String[] args)
// {
// ArrayList<String> people = new ArrayList<>();

// Scanner scanner = new Scanner(System.in);
// for (int i = 0; i < 3; i++)
// {
// System.out.print("Enter Name, surname, muddle name: ");
// System.out.println();
// String fio = scanner.nextLine();
// System.out.print("Enter you age: ");
// System.out.println();
// String age = scanner.nextLine();
// System.out.print("Enter you gender: ");
// System.out.println();
// String gender = scanner.nextLine();
// people.add(fio);
// people.add(age);
// people.add(gender);

// }
// // System.out.println(people);
// scanner.close();

// // 2. вывод в формате Фамилия И.О. возраст пол
// for (int i = 0; i < people.size(); i+=3)
// {
// String temp = people.get(i) + " " + people.get(i + 1) + " " + people.get(i +
// 2);
// String[] array = temp.split(" ");
// // System.out.println(array[0] + " " + array[1].toUpperCase().charAt(0) + "."
// // + array[2].toUpperCase().charAt(0) + ". " + array[3] + " " + array[4]);
// System.out.println(array[0] + " " + array[1].toUpperCase().charAt(0) + "." +
// array[2].toUpperCase().charAt(0) + ". " + people.get(i + 1) + " " +
// people.get(i + 2));
// }

// // 3. добавить возможность выхода или вывода списка отсортированного по
// возрасту!)

// people.sort(new Comparator<String>()
// {
// @Override
// public int compare(String o1, String o2)
// {
// return Integer.parseInt(o1.split(" ")[3]) - Integer.parseInt(o2.split("
// ")[3]);
// }
// });
// for (int i = 0; i < people.size(); i+=3)
// {
// String temp = people.get(i) + " " + people.get(i + 1) + " " + people.get(i +
// 2);
// String[] array = temp.split(" ");
// System.out.println(array[0] + " " + array[1].toUpperCase().charAt(0) + "."
// + array[2].toUpperCase().charAt(0) + ". " + array[3] + " " + array[4] );
// }
// }

// // 4. *реализовать сортировку по возрасту с использованием индексов

// // 5. *реализовать сортировку по возрасту и полу с использованием индексов
// }