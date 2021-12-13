package com.abhishek;
//https://leetcode.com/problems/count-good-nodes-in-binary-tree/
public class GoodNodes {
    public static <T> T demo(Class<T> class1, int i){
        if (i%2==0){
            return (T)"True";
        }
        else{
            return (T) new Integer(3);
        }
    }
    public static void main(String[] args) {
        System.out.println(demo(Integer.class,3));
        System.out.println(demo(String.class,4));
    }
}
