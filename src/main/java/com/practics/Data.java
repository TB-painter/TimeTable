package com.practics;

public class Data {
    public String temp[] = new String[10000];

    public String[] generateObjects() {
        for (int i = 0; i < 10000; i++) {
            temp[i] = "aaaa" + i+1 + "bbb";
        }
        return temp;
    }

    public void printTable (int arr[]) {
        System.out.println("----------------------------------------------------");
        System.out.println("                 add       getElement      remove   ");
        System.out.println("----------------------------------------------------");
        System.out.println("ArrayList         "+arr[0]+"         "+arr[1]+"          "+arr[2]);
        System.out.println("----------------------------------------------------");
        System.out.println("LinkedList        "+arr[3]+"         "+arr[4]+"          "+arr[5]);
        System.out.println("----------------------------------------------------");
        System.out.println("HashSet         "+arr[6]+"         "+arr[7]+"          "+arr[8]);
        System.out.println("----------------------------------------------------");
        System.out.println("TreeSet         "+arr[9]+"         "+arr[10]+"          "+arr[11]);
        System.out.println("----------------------------------------------------");
        System.out.println("HashMap         "+arr[12]+"         "+arr[13]+"          "+arr[14]);
        System.out.println("----------------------------------------------------");
        System.out.println("TreeMap         "+arr[15]+"         "+arr[16]+"          "+arr[17]);
        System.out.println("----------------------------------------------------");
    }

}
