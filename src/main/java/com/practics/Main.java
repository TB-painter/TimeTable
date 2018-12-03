package com.practics;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        LinkedList<String> linkedList = new LinkedList<String>();
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
        TreeSet<String> treeSet = new TreeSet<String>();
        HashSet<String> hashSet = new HashSet<String>();

        Data data = new Data();
        Utils utils = new Utils();
        data.generateObjects();
        int arr[] = new int[18];
        long t1 = System.currentTimeMillis();
        utils.addElementTo(data.temp, arrayList);
        long t2 = System.currentTimeMillis();
        arr[0] = (int) (t2 - t1);

        t1 = System.currentTimeMillis();
        utils.getElementFromList(400, arrayList);
        t2 = System.currentTimeMillis();
        arr[1] = (int) (t2 - t1);

        t1 = System.currentTimeMillis();
        utils.removeElementFromList(arrayList);
        t2 = System.currentTimeMillis();
        arr[2] = (int) (t2 - t1);


        t1 = System.currentTimeMillis();
        utils.addElementTo(data.temp, linkedList);
        t2 = System.currentTimeMillis();
        arr[3] = (int) (t2 - t1);

        t1 = System.currentTimeMillis();
        utils.getElementFromList(356, linkedList);
        t2 = System.currentTimeMillis();
        arr[4] = (int) (t2 - t1);

        t1 = System.currentTimeMillis();
        utils.removeElementFromList(linkedList);
        t2 = System.currentTimeMillis();
        arr[5] = (int) (t2 - t1);


        t1 = System.currentTimeMillis();
        utils.addElementTo(data.temp, hashSet);
        t2 = System.currentTimeMillis();
        arr[6] = (int) (t2 - t1);

        t1 = System.currentTimeMillis();
        utils.getElementFromSet(356, hashSet);
        t2 = System.currentTimeMillis();
        arr[7] = (int) (t2 - t1);

        t1 = System.currentTimeMillis();
        utils.removeElementFromList(hashSet);
        t2 = System.currentTimeMillis();
        arr[8] = (int) (t2 - t1);


        t1 = System.currentTimeMillis();
        utils.addElementTo(data.temp, treeSet);
        t2 = System.currentTimeMillis();
        arr[9] = (int) (t2 - t1);

        t1 = System.currentTimeMillis();
        utils.getElementFromSet(467, treeSet);
        t2 = System.currentTimeMillis();
        arr[10] = (int) (t2 - t1);

        t1 = System.currentTimeMillis();
        utils.removeElementFromList(treeSet);
        t2 = System.currentTimeMillis();
        arr[11] = (int) (t2 - t1);


        t1 = System.currentTimeMillis();
        utils.addElementToMap(data.temp, hashMap);
        t2 = System.currentTimeMillis();
        arr[12] = (int) (t2 - t1);

        t1 = System.currentTimeMillis();
        utils.getElementFromMap(467, hashMap);
        t2 = System.currentTimeMillis();
        arr[13] = (int) (t2 - t1);

        t1 = System.currentTimeMillis();
        utils.removeElementFromMap(hashMap);
        t2 = System.currentTimeMillis();
        arr[14] = (int) (t2 - t1);


        t1 = System.currentTimeMillis();
        utils.addElementToMap(data.temp, treeMap);
        t2 = System.currentTimeMillis();
        arr[15] = (int) (t2 - t1);

        t1 = System.currentTimeMillis();
        utils.getElementFromMap(767, treeMap);
        t2 = System.currentTimeMillis();
        arr[16] = (int) (t2 - t1);

        t1 = System.currentTimeMillis();
        utils.removeElementFromMap(treeMap);
        t2 = System.currentTimeMillis();
        arr[17] = (int) (t2 - t1);

        data.printTable(arr);
    }


}
