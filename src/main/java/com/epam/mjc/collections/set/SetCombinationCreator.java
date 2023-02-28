package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> set=new HashSet<>();

        if(thirdSet.isEmpty()){
            for (String value: secondSet) {
                if(firstSet.contains(value) ){
                    set.add(value);
                }
            }
        }else{
            for (String item: thirdSet) {
                if( !firstSet.contains(item) && !secondSet.contains(item)){
                    set.add(item);
                }else{
                    for (String value: secondSet) {
                        if(thirdSet.isEmpty() || (firstSet.contains(value) && !thirdSet.contains(value) )){
                            set.add(value);
                        }
                    }
                }
            }
        }

        return set;
    }
}
