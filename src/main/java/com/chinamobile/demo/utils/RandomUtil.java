package com.chinamobile.demo.utils;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomUtil {

    public static Set<Integer> generateRandomNums(int max,int sum){
        Set<Integer> randomNumSet = new HashSet<>();
        Random random = new Random();

        int cnt = 0;
        while(cnt < sum){
            int num = random.nextInt(max + 1);
            if(!randomNumSet.contains(num)){
                randomNumSet.add(num);
                cnt++;
            }
        }

        return randomNumSet;
    }

}
