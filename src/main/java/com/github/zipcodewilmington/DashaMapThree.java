package com.github.zipcodewilmington;

import com.github.zipcodewilmington.mylinkedlist.MyNode;

public class DashaMapThree extends DashaMap{
    public DashaMapThree(){
        super();
    }

    private String hashFunctionThree(String input) {
        if (input.length() > 1) {
            int bucketZero = getBucketIndex("" + input.charAt(0));
            int bucketOne = getBucketIndex("" + input.charAt(1));
            return "" + alphabet.charAt((bucketZero + bucketOne) % alphabet.length());
        }
        return null;
    }

    @Override
    public void set(String key, Integer value) {
        String keyHash = hashFunctionThree(key);
        int keyHashIndex = getBucketIndex(keyHash);
        dash[keyHashIndex].add(key, value);
    }

    @Override
    public Integer delete(String key) {
        String keyHash = hashFunctionThree(key);
        int keyHashIndex = getBucketIndex(keyHash);
        return dash[keyHashIndex].remove(key);
    }

    @Override
    public Integer get(String key) {
        String keyHash = hashFunctionThree(key);
        int keyHashIndex = getBucketIndex(keyHash);
        MyNode result = dash[keyHashIndex].get(key);
        return result.getData().getValue();
    }
}
