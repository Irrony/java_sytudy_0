package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        Map<String,Integer> collectionB = new HashMap<>();
        List<String> collection2 = object.get("value");

        for (int i=0;i<collectionA.size();i++){
            //String temp = collectionA .get(i);
            if(collectionB.containsKey(collectionA .get(i))){
                collectionB.put(collectionA .get(i), collectionB.get(collectionA .get(i))+1);
                }
                else {
                collectionB.put(collectionA .get(i), 1);
            }
        }
        for (Map.Entry<String,Integer> it : collectionB.entrySet()){
            String key = it.getKey();
            Integer value = it.getValue();
            for (int j=0;j<collection2.size();j++){
                if (key.equals(collection2.get(j))){
                    int value_1 = value / 3;
                    collectionB.put(collection2.get(j),value-value_1);
                }
            }
        }
        return collectionB;
    }
}
