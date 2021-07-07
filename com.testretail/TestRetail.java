package com.testretail;

public class TestRetail {
    public static void main(String[] args) {
        Double reward = calculateRewards(new Double(120));
        System.out.println("Total reward "+reward.intValue()+" points");
    }

    private static Double calculateRewards(Double amount){

        Integer difference50 = 0;
        Integer difference100 = 0;

        if(amount>50){
            difference50 = amount.intValue() - 50;
        }

        if(amount>100){
            difference100 = amount.intValue() - 100;
        }

        Double reward50 = new Double(0);
        Double reward100 = new Double(0);

        reward50 = difference50.doubleValue()*1;
        reward100 = difference100.doubleValue()*2;

        Double totalReward = reward50+reward100;

        return totalReward;
    }
}