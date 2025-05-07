package com.sangita.oops;

abstract class Greeting {
    abstract void sayHello();
}

public class AbstractAnonymous {

	    public static void main(String[] args) {
	        
	        Greeting greeting = new Greeting() {
	            @Override
	            void sayHello() {
	                System.out.println("Hello from the anonymous class!");
	            }
	        };
	        greeting.sayHello();
	    }
}

