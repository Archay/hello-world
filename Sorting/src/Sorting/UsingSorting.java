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
        List<Integer> a = new ArrayList<>();
        int smallest = 999999;
        int index = 0;
        while (x.size() > 1) {
            for (int i = 0; i < x.size(); i++) {
                if (x.get(i) < smallest) {
                    smallest = x.get(i);
                    index = i;
                }
            }
            smallest = 999999;
            a.add(x.get(index));
            x.remove(index);
        }
        a.add(x.get(0));
        return a;
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        int max = (int) (Math.random()*30+1);
        for (int i = max ; i >= a.size(); i--) {
            a.add((int) (Math.random() * 20));
        }
        System.out.println(a);
        System.out.println(bsort(a));
        System.out.println(ssort(a));
    }
}
