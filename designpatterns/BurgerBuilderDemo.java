package com.sangita.designpatterns;

public class BurgerBuilderDemo {

	    // Required
	    private final String bun;

	    // Optional
	    private final boolean cheese;
	    private final boolean lettuce;
	    private final boolean tomato;

	    private BurgerBuilderDemo(Builder builder) {
	        this.bun = builder.bun;
	        this.cheese = builder.cheese;
	        this.lettuce = builder.lettuce;
	        this.tomato = builder.tomato;
	    }

	    @Override
	    public String toString() {
	        return "Burger with " + bun +
	                (cheese ? ", cheese" : "") +
	                (lettuce ? ", lettuce" : "") +
	                (tomato ? ", tomato" : "");
	    }

	    static class Builder {
	        private final String bun;  // Required
	        private boolean cheese;
	        private boolean lettuce;
	        private boolean tomato;

	        public Builder(String bun) {
	            this.bun = bun;
	        }

	        public Builder addCheese() {
	            this.cheese = true;
	            return this;
	        }

	        public Builder addLettuce() {
	            this.lettuce = true;
	            return this;
	        }

	        public Builder addTomato() {
	            this.tomato = true;
	            return this;
	        }

	        public BurgerBuilderDemo build() {
	            return new BurgerBuilderDemo(this);
	        }
	    }
	}

