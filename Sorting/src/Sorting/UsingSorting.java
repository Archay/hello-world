/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

import java.util.List;
import java.util.ArrayList;
import java.lang.Object;

public class UsingSorting {

    public static List<Integer> bsort(List<Integer> x) {
        int temp = 0;
        List<Integer> a = new ArrayList<Integer>();
        x.add(null);
        int swaps = 0;
        while (x.size() > 2) {
            a.add(x.get(x.size() - 1));
            x.remove(x.size() - 1);
            int i = 1;
            while (i < x.size()) {
                if (x.get(i - 1) > x.get(i)) {
                    temp = x.get(i - 1);
                    x.set(i - 1, x.get(i));
                    x.set(i, temp);
                    swaps++;
                }
                i++;
            }
        }
        for (int i = a.size() - 1; i > 0; i--) {
            x.add(a.get(i));
        }
        return x;
    }

    public static List<Integer> ssort(List<Integer> x) {
        int start = 0;
        int smallest = x.get(0);
        int index = 0;
        int temp;
        while (start != x.size()) {
            for (int i = start; i < x.size(); i++) {
                System.out.println("Comparing " + smallest + " with " + x.get(i));
                if (smallest > x.get(i)) {
                    System.out.println("changing smallest from " + smallest + " to " + x.get(i));
                    index = i;
                    smallest = x.get(i);
                }
                System.out.println(i);
            }
            System.out.println("Swapping " + x.get(start) + " for " + x.get(index));
            temp = x.get(start);
            x.set(start, x.get(index));
            x.set(index, temp);
            System.out.println(x);
            smallest = 999999999;
            start++;
        }
        return x;
    }
    
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        int max = (int) (Math.random()*30+1);
        for (int i = max ; i >= a.size(); i--) {
            a.add((int) (Math.random() * 20));
        }
        System.out.println(a);
        System.out.println(ssort(a));
    }
}
