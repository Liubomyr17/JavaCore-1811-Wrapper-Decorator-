package com.company;

/*
1811 Wrapper (Decorator)
Understand what the program does.
Similar to the DecoratorRunnableImpl class, create the DecoratorMyRunnableImpl class.

Requirements:
1. Create a class DecoratorMyRunnableImpl, similar to DecoratorRunnableImpl.
2. After starting, each class should output to the console "'Class name' body".
3. The RunnableImpl and DecoratorRunnableImpl classes cannot be changed.
4. The main method cannot be changed.

 */

import com.sun.deploy.net.DownloadException;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;




public class Solution {
    public static void main(String[] args) {
        new Thread(new DecoratorRunnableImpl(new DecoratorMyRunnableImpl(new RunnableImpl()))).start();
    }

    public static class RunnableImpl implements Runnable {
        @Override
        public void run() {
            System.out.println("RunnableImpl body");
        }
    }

    public static class DecoratorRunnableImpl implements Runnable {
        private Runnable component;

        public DecoratorRunnableImpl(Runnable component) {
            this.component = component;
        }

        @Override
        public void run() {
            System.out.print("DecoratorRunnableImpl body ");
            component.run();
        }
    }

}

