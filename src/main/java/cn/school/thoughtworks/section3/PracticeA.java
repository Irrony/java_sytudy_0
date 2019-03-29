package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        List<String> collectionB = object.get("value");
        for (Map.Entry<String, Integer> it : collectionA.entrySet()) {
            String key = it.getKey();
            Integer value = it.getValue();
            for(int j=0;j<collectionB.size();j++){
                if (key.equals(collectionB.get(j))){
                    collectionA.put(collectionB.get(j),value-1);
                }
            }
        }
        return collectionA;
    }
}
