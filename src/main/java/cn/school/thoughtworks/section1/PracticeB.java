package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        List<String> result=new ArrayList<>();
        List<String> collection_2 = collection2.get(0);
        for (int i=0;i<collection1.size();i++){
            for (int j=0;j<collection_2.size();j++) {
                if (collection1.get(i).equals(collection_2.get(j))){
                    result.add(collection1.get(i));
                }
            }
        }
        return result;
    }
}
