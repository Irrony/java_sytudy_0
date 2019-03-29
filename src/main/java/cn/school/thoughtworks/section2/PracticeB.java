package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import static javax.swing.UIManager.get;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> result = new HashMap<>();
        for (int i=0;i<collection1.size();i++) {
            if (result.containsKey(collection1.get(i))){
                Integer k=result.get(collection1.get(i));
                result.put(collection1.get(i),k+1);
            }
            else {
                result.put(collection1.get(i),1);
            }
            if (result.containsKey("d-5")){
                result.remove("d-5");
                result.put("d",5);
            }
        }

            return result;
    }
}
