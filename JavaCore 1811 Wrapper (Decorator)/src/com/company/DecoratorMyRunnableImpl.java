package com.company;

public class DecoratorMyRunnableImpl implements Runnable {
   private Runnable component;

    public DecoratorMyRunnableImpl(Runnable component) {
        this.component = component;
    }

    @Override
    public void run() {
        System.out.println("DecoratorMyRunnableImpl body");
        component.run();
;    }
}