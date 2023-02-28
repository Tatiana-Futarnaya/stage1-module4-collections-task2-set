package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet=new HashSet<>();
        for (int item: sourceList) {
            if(item%2==0){
                while (item%2==0){
                    hashSet.add(item);
                    item=item/2;
                }
                hashSet.add(item);
            }else{
                int x=item;
                while (item<=(2*x)){
                    hashSet.add(item);
                    item=2*item;
                }
            }
        }
        return hashSet;
    }
}
