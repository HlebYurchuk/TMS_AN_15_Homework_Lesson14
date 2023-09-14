package com.teachmeskills.homework14.part3;

public class Consumer implements Runnable{
    private ServiceStation serviceStation;

    public Consumer(ServiceStation serviceStation){
        this.serviceStation=serviceStation;
    }

    @Override
    public void run() {
        for (int i=1; i<IMaximumCapacity.maxCapacity; i++){
            serviceStation.put();
        }
    }
}
