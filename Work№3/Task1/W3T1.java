// Work №3 - Task №1

// Пусть дан произвольный список из 100 целых чисел.

// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение

// ------------
//  Вариант №1
// ------------ 

// import java.util.ArrayList;
// import java.util.Iterator;
// import java.util.List;
// import java.util.Random;

// public class W3T1

// {
//     public static void main(String[] args) {

//         List task1 = randlist(100, 1, 100);
//         System.out.println("List random numbers: ");
//         System.out.println(task1);

//         List task2 = deletenumber(task1);
//         System.out.println("List of delete even numbers: ");
//         System.out.println(task2);

//         List task3 = minnamber(task2);
//         System.out.println("Min number the list: ");
//         System.out.println(task3);

//         List task4 = maxnamber(task2);
//         System.out.println("Max number the list: ");
//         System.out.println(task4);

//         List task5 = midllenamber(task2);
//         System.out.println("Middle number the list: ");
//         System.out.println(task5);

//     }

//     public static List<Integer> randlist(int size, int min, int max) {
//         // int rand = new Random().nextInt(1, 100 + 1);
//         List<Integer> randlist = new ArrayList<>();
//         for (int i = 0; i < size; i++) {
//             randlist.add(new Random().nextInt(min, max + 1));
//         }
//         return randlist;
//     }

//     public static List deletenumber(List task1) {
//         for (Iterator<Integer> iterator = task1.iterator(); iterator.hasNext();) {
//             Integer deleven = iterator.next();

//             if (deleven % 2 == 0) {
//                 iterator.remove();
//             }
//         }
//         return task1;
//     }

//     public static List minnamber(List task2) {
//         int min = 100;
//         List<Integer> minlist = new ArrayList<>();
//         for (Iterator<Integer> iterator = task2.iterator(); iterator.hasNext();) {
//             Integer deleven = iterator.next();

//             if (deleven < min) {
//                 min = deleven;
//             }
//         }
//         minlist.add(min);
//         return minlist;
//     }

//     public static List maxnamber(List task2) {
//         int max = 0;
//         List<Integer> maxlist = new ArrayList<>();
//         for (Iterator<Integer> iterator = task2.iterator(); iterator.hasNext();) {
//             Integer deleven = iterator.next();

//             if (deleven > max) {
//                 max = deleven;
//             }
//         }
//         maxlist.add(max);
//         return maxlist;
//     }

//     public static List midllenamber(List task2) {
//         int min = 100;
//         int max = 0;
//         int middle = 0;
//         List<Integer> midllelist = new ArrayList<>();

//         for (Iterator<Integer> iterator = task2.iterator(); iterator.hasNext();) {
//             Integer deleven = iterator.next();

//             if (deleven < min) {
//                 min = deleven;
//             }

//             if (deleven > max) {
//                 max = deleven;
//             }
//         }

//         middle = (min + max) / 2;
//         midllelist.add(middle);

//         return midllelist;
//     }
// }

// ------------
//  Вариант №2
// ------------ 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class W3T1 {
    public static void main(String[] args) {
        List<Integer> task1 = randlist(100, 1, 100);
        System.out.println("List of random numbers:");
        System.out.println(task1);

        List<Integer> task2 = deletenumber(new ArrayList<>(task1));
        System.out.println("List of delete even numbers:");
        System.out.println(task2);

        List<Integer> task3 = minnumber(new ArrayList<>(task2));
        System.out.println("Min number in the list:");
        System.out.println(task3);

        List<Integer> task4 = maxnumber(new ArrayList<>(task2));
        System.out.println("Max number in the list:");
        System.out.println(task4);

        List<Integer> task5 = middlenumber(new ArrayList<>(task2));
        System.out.println("Middle number in the list:");
        System.out.println(task5);
    }

    public static List<Integer> randlist(int size, int min, int max) {
        Random random = new Random();
        List<Integer> randlist = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            randlist.add(random.nextInt(max - min + 1) + min);
        }
        return randlist;
    }

    public static List<Integer> deletenumber(List<Integer> task1) {
        Iterator<Integer> iterator = task1.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }
        return task1;
    }

    public static List<Integer> minnumber(List<Integer> task2) {
        int min = Integer.MAX_VALUE;
        List<Integer> minlist = new ArrayList<>();
        for (Integer num : task2) {
            if (num < min) {
                min = num;
            }
        }
        minlist.add(min);
        return minlist;
    }

    public static List<Integer> maxnumber(List<Integer> task2) {
        int max = Integer.MIN_VALUE;
        List<Integer> maxlist = new ArrayList<>();
        for (Integer num : task2) {
            if (num > max) {
                max = num;
            }
        }
        maxlist.add(max);
        return maxlist;
    }

    public static List<Integer> middlenumber(List<Integer> task2) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int middle;
        List<Integer> middlelist = new ArrayList<>();
        for (Integer num : task2) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        middle = (min + max) / 2;
        middlelist.add(middle);
        return middlelist;
    }
}
