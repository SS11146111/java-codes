package com.sangita.designpatterns;

public class SingletonDemo {

	 private static SingletonDemo instance;

	    private SingletonDemo() { }

	    public static SingletonDemo getInstance() {
	        if (instance == null) {
	            synchronized (SingletonDemo.class) {
	                if (instance == null) {
	                    instance = new SingletonDemo();
	                }
	            }
	        }
	        return instance;
	    }

	    public void load() {
	        System.out.println("SingletonDemo loaded "+instance.hashCode());
	    }
}
