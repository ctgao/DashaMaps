package com.github.zipcodewilmington;

import com.github.zipcodewilmington.mylinkedlist.MyNode;

public class DashaMapTwo extends DashaMap{
    public DashaMapTwo(){
        super();
    }
    private String hashFunctionTwo(String input) {
        if (input.length() > 0) {
            return String.valueOf(Character.toLowerCase(input.charAt(1)));
        }
        return null;
    }

    @Override
    public void set(String key, Integer value) {
        String keyHash = hashFunctionTwo(key);
        int keyHashIndex = getBucketIndex(keyHash);
        dash[keyHashIndex].add(key, value);
    }

    @Override
    public Integer delete(String key) {
        String keyHash = hashFunctionTwo(key);
        int keyHashIndex = getBucketIndex(keyHash);
        return dash[keyHashIndex].remove(key);
    }

    @Override
    public Integer get(String key) {
        String keyHash = hashFunctionTwo(key);
        int keyHashIndex = getBucketIndex(keyHash);
        MyNode result = dash[keyHashIndex].get(key);
        return result.getData().getValue();
    }
}
