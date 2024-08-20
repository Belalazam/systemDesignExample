package com.example.patterns;

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
				HelperStation helperStation = new HelperStation();
				MaleObserver maleObserver = new MaleObserver(helperStation);
				FemaleObserver femaleObserver = new FemaleObserver(helperStation);

				helperStation.setTotalHelped("1023");
				helperStation.setTotalHelped("2033");
				helperStation.setTotalHelped("3033");
			} else {
				System.out.println("oops wrong input");
			}
		}
	}

}
