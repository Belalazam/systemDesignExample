package com.example.patterns;

import com.example.patterns.service.Singleton.Logger;
import com.example.patterns.service.factory.DonationTypeFactory;
import com.example.patterns.service.factory.Messenger;
import com.example.patterns.service.observer.FemaleObserver;
import com.example.patterns.service.observer.HelperStation;
import com.example.patterns.service.observer.MaleObserver;
import com.example.patterns.service.strategy.BubbleSort;
import com.example.patterns.service.strategy.Context;
import com.example.patterns.service.strategy.MergeSort;
import com.example.patterns.service.strategy.SortIt;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Objects;
import java.util.Scanner;

@SpringBootApplication
public class PatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatternsApplication.class, args);
		// Create a Scanner object
		Scanner scanner = new Scanner(System.in);

		while(true) {
			// Prompt the user for input
			System.out.print("Enter your Pattern: ");
			String patternName = scanner.nextLine();

			// let say in our company helping hand, we want to help those beggar first, who was helped very little in past
			// so to know who was helped very little, we need to sort our beggars with respected to helping count
			// so, for sorting we need sorting algorithm, and out of many sorting algorithm which one to choose
			if (Objects.equals(patternName, "strategy")) {

				// behavioral
				// choosing an algorithm out of family of algorithm during runtime is called strategy pattern

				SortIt bubbleSort = new BubbleSort();
				SortIt mergeSort = new MergeSort();

				Context context = new Context(bubbleSort);
				context.execute();

				context.setContext(mergeSort);
				context.execute();
			}

			// Now we want to motivate our users ,we want to tell them there help is changing the world
			// every time 1000 more beggar is helped, we want to update our users
			// but there is one catch, some of the users are female and some are male
			// And we want to send "Hello sir/mam , thanks for your support, your support is changing the world"
			// we don't want to user sir/mam together, we want to use it gender-specific
			// also we know gender are increasing day by day, so to avoid if else. sarcastic
			else if (Objects.equals(patternName, "observer")) {

				// behavioral
				// when there are many observer, who are subscribed to an object and all want to get notified when
				// object (the "subject" or "observable")  is changed , such type of pattern are called observer pattern

				HelperStation helperStation = new HelperStation();
				MaleObserver maleObserver = new MaleObserver(helperStation);
				FemaleObserver femaleObserver = new FemaleObserver(helperStation);

				helperStation.setTotalHelped("1023");
				helperStation.setTotalHelped("2033");
				helperStation.setTotalHelped("3033");
			}




			// Many users , donate different amount to help the people who are in need,
			// but some give less amount , some give average amount , and some pay very high amount
			// for each donation we want to show some gratitude to our customers.
			// so for that we decided to send them message, in context of there donation
			else if(Objects.equals(patternName, "factory"))
			{
				// creational
				// The Factory Pattern is about creating the wright object at runtime based on a given input or condition

				// In abstract factory pattern, In the Abstract Factory Pattern, you indeed work with abstract classes
				// or interfaces for both the factory and the products. The concrete implementations of the factories
				// create concrete products. The pattern abstracts away the concrete classes by using abstract classes
				// or interfaces, allowing the client code to interact with the products and
				// factories through these abstractions.

				DonationTypeFactory donationTypeFactory = new DonationTypeFactory();

				Messenger messenger = donationTypeFactory.createMessenger(40L);
				messenger.sendMessage();

				messenger = donationTypeFactory.createMessenger(2200L);
				messenger.sendMessage();

				messenger = donationTypeFactory.createMessenger(50000L);
				messenger.sendMessage();
			}

			// we want to implement one logic, and across the project same logic will be used
			// or we want to maintain some data across the project, so that we can fetch that data any where in the project
			else if(Objects.equals(patternName, "singleton"))
			{
				// Creational
				// when we maintain only one instance of class
				Logger logger1 = Logger.getLoggerInstance();
				Logger logger2 = Logger.getLoggerInstance();

				logger1.log("hello 1");
				logger2.log("hello 2");

				System.out.println(logger1 == logger2);
			}
			else {
				System.out.println("oops wrong input");
			}
		}
	}

}
