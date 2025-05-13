package com.sangita.designpatterns;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * SingletonDemo.getInstance().load(); SingletonDemo.getInstance().load();
		 */
		
		/* FactoryDemo.getNotification("Email").notifyUser(); */
		
		/*
		 * BurgerBuilderDemo burger = new
		 * BurgerBuilderDemo.Builder("Whole Wheat Bun").addCheese().addLettuce().build()
		 * ; System.out.println(burger);
		 */
		
		/*
		 * DocumentPrototypeDemo d1 = new DocumentPrototypeDemo("Letter");
		 * System.out.println(d1.content); DocumentPrototypeDemo d2 = d1.clone();
		 * System.out.println(d2.content);
		 */
		
		/*
		 * MediaPlayerAdapterDemo player = new MediaPlayerAdapterDemo();
		 * player.play("mp3", "Byebye");
		 */
		
		/*
		 * Coffee basicCoffee = new BasicCoffee(); // Add milk decorator Coffee
		 * milkCoffee = new MilkDecoratorDemo(basicCoffee);
		 * 
		 * System.out.println("Order: " + milkCoffee.getDescription());
		 * System.out.println("Total: $" + milkCoffee.cost());
		 */
		
		
		/*
		 * CommandProxyDemo test = new CommandProxyDemo(true); test.execute();
		 */
		
		/*
		 * WeatherStationObserverDemo demo = new WeatherStationObserverDemo(); Display
		 * d1 = new Display(); Display d2 = new Display(); demo.addObserver(d1);
		 * demo.addObserver(d2); demo.setTemperature(89.7f);
		 */
		
		/*
		 * PaymentStrategy ccp = new CreditCardPayment(); PaymentStrategyDemo p = new
		 * PaymentStrategyDemo(ccp); p.makePayment(100);
		 */
		
	}

}
