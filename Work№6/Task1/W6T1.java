// Work №6 - Task №1

// Разработать программу, имитирующую поведение коллекции HashSet. 
// В программе содать метод add добавляющий элемент, 
// метод toString возвращающий строку с элементами множества 
// * и метод позволяющий читать элементы по индексу.
// * Реализовать все методы из семинара.
// Формат данных Integer.

// ------------
//  Вариант №1 - Основное задание
// ------------ 

import java.util.HashMap;

public class W6T1
{
    private static HashMap <Integer, Object> Imed = new HashMap<>();
    private static final Object FIN  = new Object();
    public static void main(String[] args) throws Exception
    {
        add(113);
        add(222);
        add(537);
        add(944);
        add(550);

        System.out.println(getString());

        System.out.println(gettkey(0));
        System.out.println(gettkey(4));
    }

    private static int gettkey(int num)
    {
        return (Integer)Imed.keySet().toArray()[num];
    }

    private static String getString()
    {
        return Imed.keySet().toString();
    }

    public static void add(Integer numbers)
    {
        Imed.put(numbers, FIN);
    }
}
