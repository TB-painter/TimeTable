package com.practics;

import java.util.*;

public class Utils {

    public <String> void  addElementTo (String s[], Collection<String> collection) {
        for (int i = 0; i < 10000; i++) {
            collection.add(s[i]);
        }
    }

    public <String> void addElementToMap (String s[], Map<Integer, String> map) {
        for (int i = 0; i < 10000; i++) {
            map.put(i, s[i]);
        }
    }

    public String getElementFromList(int index, List<String> list) {
        return list.get(index);
    }

    public String getElementFromMap(int index, Map<Integer, String> map) {
        return map.get(index);
    }

    public String getElementFromSet (int index, Set<String> set) {
        Object[] s = set.toArray();
        return  s[index].toString();
    }
    public <String> void removeElementFromList (Collection<String> collection) {
        collection.removeAll(collection);
    }

    public <String> void removeElementFromMap (Map<Integer, String> map) {
        for (int i = 0; i < 10000; i++) map.remove(i);
    }
}
