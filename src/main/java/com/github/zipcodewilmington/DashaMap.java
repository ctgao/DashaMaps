package com.github.zipcodewilmington;


import com.github.zipcodewilmington.mylinkedlist.MyLinkedList;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public abstract class DashaMap implements HashMapX{
    //private vars
    protected MyLinkedList[] dash;
    protected String alphabet = "abcdefghijklmnopqrstuvwxyz";

    //constructor
    public DashaMap(){
        dash = new MyLinkedList[26];
        for(int i = 0; i < dash.length; i++){
            dash[i] = new MyLinkedList("" + alphabet.charAt(i));
        }
    }

    // inherited functions from the interface
    public boolean isEmpty(){
        for(MyLinkedList mll : dash){
            if(!mll.isEmpty()){
                return false;
            }
        }
        return true;
    }

    public long size(){
        long totalSize = 0;
        for(MyLinkedList mll : dash){
            totalSize += mll.size();
        }
        return totalSize;
    }

    /**
     * returns the size of the "bucket" corresponding to the key
     * @param key letter corresponding to bucket ("a", "b", "c", etc.)
     * @return size of bucket
     */
    @Override
    public int bucketSize(String key) {
        return dash[getBucketIndex(key)].size();
    }

    protected int getBucketIndex(String key) {
        return alphabet.indexOf(key);
    }
}
