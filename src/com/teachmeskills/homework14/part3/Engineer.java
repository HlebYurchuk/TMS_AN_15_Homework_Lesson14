package com.teachmeskills.homework14.part3;

public class Engineer implements Runnable{

    private ServiceStation serviceStation;

    public Engineer(ServiceStation serviceStation){
        this.serviceStation=serviceStation;
    }

    @Override
    public void run() {
        for (int i=1; i < IMaximumCapacity.maxCapacity; i++){
            serviceStation.get();
        }
    }
}
