package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> treeSet=new TreeSet<>();
        Iterator<Integer> iterator=sourceList.iterator();
        while (iterator.hasNext()){
            int element=iterator.next();
            treeSet.add((int)Math.pow(element,2));
        }
        Set<Integer> set=new LinkedHashSet<>(treeSet.subSet(lowerBound,upperBound+1));
        return set;
    }
}
