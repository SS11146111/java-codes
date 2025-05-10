package com.sangita.java8;

import java.util.Optional;

class Address {
    private String city;

    public Address(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }
}

class User {
    private Optional<Address> address;

    public User(Optional<Address> address) {
        this.address = address;
    }

    public Optional<Address> getAddress() {
        return address;
    }
}

public class OptionalDemo4 {
	
	public void call()
	{
		//Address address = new Address("Mumbai");
		Address address = new Address(null);
        User user = new User(Optional.of(address));

        // Chaining to get the city safely
        String city = Optional.of(user)
                .flatMap(User::getAddress)       // returns Optional<Address>
                .map(Address::getCity)           // returns Optional<String>
                .orElse("City Not Found");

        System.out.println(city);
	}

}
