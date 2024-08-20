package com.example.patterns;

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

		// Prompt the user for input
		System.out.print("Enter your Pattern: ");
		String patternName = scanner.nextLine();

		// let say in our company helping hand, we want to help those beggar first, who was helped very little in past
		// so to know who was helped very little, we need to sort our beggars with respected to helping count
		// so, for sorting we need sorting algorithm, and out of many sorting algorithm which one to choose
		if(Objects.equals(patternName, "strategy"))
		{
			SortIt bubbleSort = new BubbleSort();
			SortIt mergeSort = new MergeSort();

			Context context = new Context(bubbleSort);
			context.execute();

			context.setContext(mergeSort);
			context.execute();
		}

		scanner.close();
	}

}
