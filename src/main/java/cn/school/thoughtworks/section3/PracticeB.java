package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        List<String> collectionB = object.get("value");
        for (Map.Entry<String, Integer> it : collectionA.entrySet()) {
            String key = it.getKey();
            Integer value = it.getValue();
            for(int j=0;j<collectionB.size();j++){
                if (key.equals(collectionB.get(j))){
                    int value_1 = value / 3;
                    collectionA.put(collectionB.get(j),value-value_1);
                }
            }
        }
        return collectionA;
    }
}
