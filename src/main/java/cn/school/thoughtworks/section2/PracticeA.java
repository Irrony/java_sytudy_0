package cn.school.thoughtworks.section2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        Map <String,Integer> result = new HashMap<>();
        for(int i=0;i<collection1.size();i++){
            if (result.containsKey(collection1.get(i))){
                Integer k=result.get(collection1.get(i));
                result.put(collection1.get(i),k+1);
            }
            else {
                result.put(collection1.get(i),1);
            }
        }
        return result;
    }
}
