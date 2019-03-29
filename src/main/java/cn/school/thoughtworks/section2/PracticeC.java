package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String,Integer> result = new HashMap<>();
        for (int i=0;i<collection1.size();i++){
            if (result.containsKey(collection1.get(i))){
                Integer k=result.get(collection1.get(i));
                result.put(collection1.get(i),k+1);
            }
            else {
                result.put(collection1.get(i),1);
            }
            if (result.containsKey("h[3]")){
                Integer g1=result.get(collection1.get(i-1));
                result.remove("h[3]");
                result.put("h",g1+3);
            }
            if (result.containsKey("t-2")){
                Integer g2 = result.get((collection1.get(i-1)));
                result.remove("t-2");
                result.put("t",g2+2);
            }
            if (result.containsKey("t[10]")){
                Integer g3 = result.get((collection1.get(i-1)));
                result.remove("t[10]");
                result.put("t",g3+10);
            }
            if (result.containsKey("c:8")){
                Integer g4 = result.get((collection1.get(i-1)));
                result.remove("c:8");
                result.put("c",8);
            }
            if (result.containsKey("d-5")){
                Integer g5 = result.get((collection1.get(i)));
                result.remove("d-5");
                result.put("d",5);
            }
        }
        return result;
    }
}
