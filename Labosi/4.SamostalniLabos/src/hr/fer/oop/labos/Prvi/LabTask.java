package hr.fer.oop.labos.Prvi;

import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class LabTask {
    public static int count(Map<Integer, Integer> map, Set<Integer> set) {
        int counter=0;
        LinkedList<Integer> checkedList= new LinkedList<>();
    for(Map.Entry<Integer, Integer> entry : map.entrySet()){
        if (set.contains(entry.getValue()))
            if (!(checkedList.contains(entry.getValue()))) {
                checkedList.add(entry.getValue());
                counter++;
            }
    }
        return counter;
    }
}