package hr.fer.oop.LabTask;

import java.util.*;

class LabTask {
    static Scanner scanner = new Scanner(System.in);
    static TreeSet<Zapis> list = new TreeSet<>();
    static String scan;
    static String[] split;
    static Zapis temp;

    //read from stdin until "quit" is entered
    //for each line, create a Zapis object and add it to the list without duplicates
    //sort the list alphabetically by ime
    //return the list
    public static Set<Zapis> readData() {
        while (true) {
            scan = scanner.next();
            if (scan.length() < 2) break;
            if (scan.equals("quit")) break;
            split = scan.split("#");
            temp = new Zapis(split[0], Integer.parseInt(split[1]));
            for (Zapis a : list) {
                if (a.compareTo(temp) == 0) {
                    list.remove(a);
                    break;
                }
            }
            list.add(temp);
        }
        return list;
    }

}
