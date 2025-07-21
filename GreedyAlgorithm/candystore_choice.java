package GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class candystore_choice {
    public List<Integer> candyStore(List<Integer> candies, int K) {
        List <Integer> res = new ArrayList<>();
        Integer arr[] = new Integer[candies.size()];
        arr= candies.toArray(arr);
        Arrays.sort(arr);
        int min =0;
        int buy=0;
        int free = arr.length-1;
        while(buy<=free){ // Min Cost
            min = min+arr[buy];
            buy++;
            free=free-K;
        }
        res.add(min);
        int max=0;
        buy= arr.length-1;
        free=0;
        while(buy>=free){
            max=max+arr[buy];
            buy--;
            free=free+K;
        }
        res.add(max);
        return res;
    }


    }


