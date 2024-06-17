/*
 * Class: CMSC203 
 * Instructor: G. Grinberg
 * Description: A game that tests the user's ESP by asking them to guess what the computer has randomly selected from a list of 16 colors
 * Due: 10/06/2024
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment independently. I have not copied the code from a student or any source. I have not given my code to any student.
 * Print your Name here: Michael Desir
*/

import java.io.*;
import java.util.Scanner;
import java.util.Random;


public class ESPGame { // main class/function
	public static void main(String[] args) throws FileNotFoundException { // throws because system said could not find "colors.txt"

		Scanner inputFile = new Scanner(new File("colors.txt")); // for list of colors
		Scanner keyboard = new Scanner(System.in); // for keyboard input
		Random randomNumbers = new Random(); // random engine
		
		final int NUMBER_COLORS = 16;
		final int NUMBER_ROUNDS = 3;
		
		final String color1 = "black";
		final String color2 = "white";
		final String color3 = "gray";
		final String color4 = "silver";
		final String color5 = "maroon";
		final String color6 = "red";
		final String color7 = "purple";
		final String color8 = "fuchsia";
		final String color9 = "green";
		final String color10 = "lime";
		final String color11 = "olive";
		final String color12 = "yellow";
		final String color13 = "navy";
		final String color14 = "blue";
		final String color15 = "teal";
		final String color16 = "aqua";
				
		
		System.out.println("CMSC 203 Assignment 1: Test your ESP (extrasensory perception)");
		System.out.println("Here is a list of colors from the file \"colors.txt\".");
		
		while (inputFile.hasNext()) { // prints list of colors (in a pretty neat way)
			String line = inputFile.nextLine();
			System.out.println(line);

		}
		int i = 1;
			System.out.println("\nRound " + i + "\n");
			System.out.println("I am thinking of a color.\nWhich color is it from the list above?");
			System.out.print("Enter your guess: ");
			
			String guess1 = keyboard.nextLine();
			int number1 = randomNumbers.nextInt(16) + 1;
			int numCorrect1=0,numCorrect2=0,numCorrect3=0;
			int numWrong1=0,numWrong2=0,numWrong3=0;
			
			switch(number1) {
			case 1:
				System.out.println("I was thinking of the color " + color1 + ".");
				if (guess1.equalsIgnoreCase(color1)) { // means correct answer
					if (i == 1) numCorrect1++;
					else if (i == 2) numCorrect2++;
					else if (i == 3) numCorrect3++;
				}
				else {
					if (i == 1) numWrong1++;
					else if (i == 2) numWrong2++;
					else if (i == 3) numWrong3++;
				}
				break;
			case 2:
				System.out.println("I was thinking of the color " + color2 + ".");
				if (guess1.equalsIgnoreCase(color2)) { // means correct answer
					if (i == 1) numCorrect1++;
					else if (i == 2) numCorrect2++;
					else if (i == 3) numCorrect3++;
				}
				else {
					if (i == 1) numWrong1++;
					else if (i == 2) numWrong2++;
					else if (i == 3) numWrong3++;
				}
				break;
			case 3:
				System.out.println("I was thinking of the color " + color3 + ".");
				if (guess1.equalsIgnoreCase(color3)) { // means correct answer
					if (i == 1) numCorrect1++;
					else if (i == 2) numCorrect2++;
					else if (i == 3) numCorrect3++;
				}
				else {
					if (i == 1) numWrong1++;
					else if (i == 2) numWrong2++;
					else if (i == 3) numWrong3++;
				}
				break;
			case 4:
				System.out.println("I was thinking of the color " + color4 + ".");
				if (guess1.equalsIgnoreCase(color4)) { // means correct answer
					if (i == 1) numCorrect1++;
					else if (i == 2) numCorrect2++;
					else if (i == 3) numCorrect3++;
				}
				else {
					if (i == 1) numWrong1++;
					else if (i == 2) numWrong2++;
					else if (i == 3) numWrong3++;
				}
				break;
			case 5:
				System.out.println("I was thinking of the color " + color5 + ".");
				if (guess1.equalsIgnoreCase(color5)) { // means correct answer
					if (i == 1) numCorrect1++;
					else if (i == 2) numCorrect2++;
					else if (i == 3) numCorrect3++;
				}
				else {
					if (i == 1) numWrong1++;
					else if (i == 2) numWrong2++;
					else if (i == 3) numWrong3++;
				}
				break;
			case 6:
				System.out.println("I was thinking of the color " + color6 + ".");
				if (guess1.equalsIgnoreCase(color6)) { // means correct answer
					if (i == 1) numCorrect1++;
					else if (i == 2) numCorrect2++;
					else if (i == 3) numCorrect3++;
				}
				else {
					if (i == 1) numWrong1++;
					else if (i == 2) numWrong2++;
					else if (i == 3) numWrong3++;
				}
				break;
			case 7:
				System.out.println("I was thinking of the color " + color7 + ".");
				if (guess1.equalsIgnoreCase(color7)) { // means correct answer
					if (i == 1) numCorrect1++;
					else if (i == 2) numCorrect2++;
					else if (i == 3) numCorrect3++;
				}
				else {
					if (i == 1) numWrong1++;
					else if (i == 2) numWrong2++;
					else if (i == 3) numWrong3++;
				}
				break;
			case 8:
				System.out.println("I was thinking of the color " + color8 + ".");
				if (guess1.equalsIgnoreCase(color8)) { // means correct answer
					if (i == 1) numCorrect1++;
					else if (i == 2) numCorrect2++;
					else if (i == 3) numCorrect3++;
				}
				else {
					if (i == 1) numWrong1++;
					else if (i == 2) numWrong2++;
					else if (i == 3) numWrong3++;
				}
				break;
			case 9:
				System.out.println("I was thinking of the color " + color9 + ".");
				if (guess1.equalsIgnoreCase(color9)) { // means correct answer
					if (i == 1) numCorrect1++;
					else if (i == 2) numCorrect2++;
					else if (i == 3) numCorrect3++;
				}
				else {
					if (i == 1) numWrong1++;
					else if (i == 2) numWrong2++;
					else if (i == 3) numWrong3++;
				}
				break;
			case 10:
				System.out.println("I was thinking of the color " + color10 + ".");
				if (guess1.equalsIgnoreCase(color10)) { // means correct answer
					if (i == 1) numCorrect1++;
					else if (i == 2) numCorrect2++;
					else if (i == 3) numCorrect3++;
				}
				else {
					if (i == 1) numWrong1++;
					else if (i == 2) numWrong2++;
					else if (i == 3) numWrong3++;
				}
				break;
			case 11:
				System.out.println("I was thinking of the color " + color11 + ".");
				if (guess1.equalsIgnoreCase(color11)) { // means correct answer
					if (i == 1) numCorrect1++;
					else if (i == 2) numCorrect2++;
					else if (i == 3) numCorrect3++;
				}
				else {
					if (i == 1) numWrong1++;
					else if (i == 2) numWrong2++;
					else if (i == 3) numWrong3++;
				}
				break;
			case 12:
				System.out.println("I was thinking of the color " + color12 + ".");
				if (guess1.equalsIgnoreCase(color12)) { // means correct answer
					if (i == 1) numCorrect1++;
					else if (i == 2) numCorrect2++;
					else if (i == 3) numCorrect3++;
				}
				else {
					if (i == 1) numWrong1++;
					else if (i == 2) numWrong2++;
					else if (i == 3) numWrong3++;
				}
				break;
			case 13:
				System.out.println("I was thinking of the color " + color13 + ".");
				if (guess1.equalsIgnoreCase(color13)) { // means correct answer
					if (i == 1) numCorrect1++;
					else if (i == 2) numCorrect2++;
					else if (i == 3) numCorrect3++;
				}
				else {
					if (i == 1) numWrong1++;
					else if (i == 2) numWrong2++;
					else if (i == 3) numWrong3++;
				}
				break;
			case 14:
				System.out.println("I was thinking of the color " + color14 + ".");
				if (guess1.equalsIgnoreCase(color14)) { // means correct answer
					if (i == 1) numCorrect1++;
					else if (i == 2) numCorrect2++;
					else if (i == 3) numCorrect3++;
				}
				else {
					if (i == 1) numWrong1++;
					else if (i == 2) numWrong2++;
					else if (i == 3) numWrong3++;
				}
				break;
			case 15:
				System.out.println("I was thinking of the color " + color15 + ".");
				if (guess1.equalsIgnoreCase(color15)) { // means correct answer
					if (i == 1) numCorrect1++;
					else if (i == 2) numCorrect2++;
					else if (i == 3) numCorrect3++;
				}
				else {
					if (i == 1) numWrong1++;
					else if (i == 2) numWrong2++;
					else if (i == 3) numWrong3++;
				}
				break;
			case 16:
				System.out.println("I was thinking of the color " + color16 + ".");
				if (guess1.equalsIgnoreCase(color16)) { // means correct answer
					if (i == 1) numCorrect1++;
					else if (i == 2) numCorrect2++;
					else if (i == 3) numCorrect3++;
				}
				else {
					if (i == 1) numWrong1++;
					else if (i == 2) numWrong2++;
					else if (i == 3) numWrong3++;
				}
				break;
			}
			
			i = 2;
			System.out.println("\nRound " + i + "\n");
			System.out.println("I am thinking of a color.\nWhich color is it from the list above?");
			System.out.print("Enter your guess: ");
			
			String guess2 = keyboard.nextLine();
			int number2 = randomNumbers.nextInt(16) + 1;
			
			
			switch(number2) {
			case 1:
				System.out.println("I was thinking of the color " + color1 + ".");
				if (guess2.equalsIgnoreCase(color1)) { // means correct answer
					if (i == 1) numCorrect1++;
					else if (i == 2) numCorrect2++;
					else if (i == 3) numCorrect3++;
				}
				else {
					if (i == 1) numWrong1++;
					else if (i == 2) numWrong2++;
					else if (i == 3) numWrong3++;
				}
				break;
			case 2:
				System.out.println("I was thinking of the color " + color2 + ".");
				if (guess2.equalsIgnoreCase(color2)) { // means correct answer
					if (i == 1) numCorrect1++;
					else if (i == 2) numCorrect2++;
					else if (i == 3) numCorrect3++;
				}
				else {
					if (i == 1) numWrong1++;
					else if (i == 2) numWrong2++;
					else if (i == 3) numWrong3++;
				}
				break;
			case 3:
				System.out.println("I was thinking of the color " + color3 + ".");
				if (guess2.equalsIgnoreCase(color3)) { // means correct answer
					if (i == 1) numCorrect1++;
					else if (i == 2) numCorrect2++;
					else if (i == 3) numCorrect3++;
				}
				else {
					if (i == 1) numWrong1++;
					else if (i == 2) numWrong2++;
					else if (i == 3) numWrong3++;
				}
				break;
			case 4:
				System.out.println("I was thinking of the color " + color4 + ".");
				if (guess2.equalsIgnoreCase(color4)) { // means correct answer
					if (i == 1) numCorrect1++;
					else if (i == 2) numCorrect2++;
					else if (i == 3) numCorrect3++;
				}
				else {
					if (i == 1) numWrong1++;
					else if (i == 2) numWrong2++;
					else if (i == 3) numWrong3++;
				}
				break;
			case 5:
				System.out.println("I was thinking of the color " + color5 + ".");
				if (guess2.equalsIgnoreCase(color5)) { // means correct answer
					if (i == 1) numCorrect1++;
					else if (i == 2) numCorrect2++;
					else if (i == 3) numCorrect3++;
				}
				else {
					if (i == 1) numWrong1++;
					else if (i == 2) numWrong2++;
					else if (i == 3) numWrong3++;
				}
				break;
			case 6:
				System.out.println("I was thinking of the color " + color6 + ".");
				if (guess2.equalsIgnoreCase(color6)) { // means correct answer
					if (i == 1) numCorrect1++;
					else if (i == 2) numCorrect2++;
					else if (i == 3) numCorrect3++;
				}
				else {
					if (i == 1) numWrong1++;
					else if (i == 2) numWrong2++;
					else if (i == 3) numWrong3++;
				}
				break;
			case 7:
				System.out.println("I was thinking of the color " + color7 + ".");
				if (guess2.equalsIgnoreCase(color7)) { // means correct answer
					if (i == 1) numCorrect1++;
					else if (i == 2) numCorrect2++;
					else if (i == 3) numCorrect3++;
				}
				else {
					if (i == 1) numWrong1++;
					else if (i == 2) numWrong2++;
					else if (i == 3) numWrong3++;
				}
				break;
			case 8:
				System.out.println("I was thinking of the color " + color8 + ".");
				if (guess2.equalsIgnoreCase(color8)) { // means correct answer
					if (i == 1) numCorrect1++;
					else if (i == 2) numCorrect2++;
					else if (i == 3) numCorrect3++;
				}
				else {
					if (i == 1) numWrong1++;
					else if (i == 2) numWrong2++;
					else if (i == 3) numWrong3++;
				}
				break;
			case 9:
				System.out.println("I was thinking of the color " + color9 + ".");
				if (guess2.equalsIgnoreCase(color9)) { // means correct answer
					if (i == 1) numCorrect1++;
					else if (i == 2) numCorrect2++;
					else if (i == 3) numCorrect3++;
				}
				else {
					if (i == 1) numWrong1++;
					else if (i == 2) numWrong2++;
					else if (i == 3) numWrong3++;
				}
				break;
			case 10:
				System.out.println("I was thinking of the color " + color10 + ".");
				if (guess2.equalsIgnoreCase(color10)) { // means correct answer
					if (i == 1) numCorrect1++;
					else if (i == 2) numCorrect2++;
					else if (i == 3) numCorrect3++;
				}
				else {
					if (i == 1) numWrong1++;
					else if (i == 2) numWrong2++;
					else if (i == 3) numWrong3++;
				}
				break;
			case 11:
				System.out.println("I was thinking of the color " + color11 + ".");
				if (guess2.equalsIgnoreCase(color11)) { // means correct answer
					if (i == 1) numCorrect1++;
					else if (i == 2) numCorrect2++;
					else if (i == 3) numCorrect3++;
				}
				else {
					if (i == 1) numWrong1++;
					else if (i == 2) numWrong2++;
					else if (i == 3) numWrong3++;
				}
				break;
			case 12:
				System.out.println("I was thinking of the color " + color12 + ".");
				if (guess2.equalsIgnoreCase(color12)) { // means correct answer
					if (i == 1) numCorrect1++;
					else if (i == 2) numCorrect2++;
					else if (i == 3) numCorrect3++;
				}
				else {
					if (i == 1) numWrong1++;
					else if (i == 2) numWrong2++;
					else if (i == 3) numWrong3++;
				}
				break;
			case 13:
				System.out.println("I was thinking of the color " + color13 + ".");
				if (guess2.equalsIgnoreCase(color13)) { // means correct answer
					if (i == 1) numCorrect1++;
					else if (i == 2) numCorrect2++;
					else if (i == 3) numCorrect3++;
				}
				else {
					if (i == 1) numWrong1++;
					else if (i == 2) numWrong2++;
					else if (i == 3) numWrong3++;
				}
				break;
			case 14:
				System.out.println("I was thinking of the color " + color14 + ".");
				if (guess2.equalsIgnoreCase(color14)) { // means correct answer
					if (i == 1) numCorrect1++;
					else if (i == 2) numCorrect2++;
					else if (i == 3) numCorrect3++;
				}
				else {
					if (i == 1) numWrong1++;
					else if (i == 2) numWrong2++;
					else if (i == 3) numWrong3++;
				}
				break;
			case 15:
				System.out.println("I was thinking of the color " + color15 + ".");
				if (guess2.equalsIgnoreCase(color15)) { // means correct answer
					if (i == 1) numCorrect1++;
					else if (i == 2) numCorrect2++;
					else if (i == 3) numCorrect3++;
				}
				else {
					if (i == 1) numWrong1++;
					else if (i == 2) numWrong2++;
					else if (i == 3) numWrong3++;
				}
				break;
			case 16:
				System.out.println("I was thinking of the color " + color16 + ".");
				if (guess2.equalsIgnoreCase(color16)) { // means correct answer
					if (i == 1) numCorrect1++;
					else if (i == 2) numCorrect2++;
					else if (i == 3) numCorrect3++;
				}
				else {
					if (i == 1) numWrong1++;
					else if (i == 2) numWrong2++;
					else if (i == 3) numWrong3++;
				}
				break;
			}
			
			
			i = 3;
			System.out.println("\nRound " + i + "\n");
			System.out.println("I am thinking of a color.\nWhich color is it from the list above?");
			System.out.print("Enter your guess: ");
			
			String guess3 = keyboard.nextLine();
			int number3 = randomNumbers.nextInt(16) + 1;
			
			
			switch(number3) {
			case 1:
				System.out.println("I was thinking of the color " + color1 + ".");
				if (guess3.equalsIgnoreCase(color1)) { // means correct answer
					if (i == 1) numCorrect1++;
					else if (i == 2) numCorrect2++;
					else if (i == 3) numCorrect3++;
				}
				else {
					if (i == 1) numWrong1++;
					else if (i == 2) numWrong2++;
					else if (i == 3) numWrong3++;
				}
				break;
			case 2:
				System.out.println("I was thinking of the color " + color2 + ".");
				if (guess3.equalsIgnoreCase(color2)) { // means correct answer
					if (i == 1) numCorrect1++;
					else if (i == 2) numCorrect2++;
					else if (i == 3) numCorrect3++;
				}
				else {
					if (i == 1) numWrong1++;
					else if (i == 2) numWrong2++;
					else if (i == 3) numWrong3++;
				}
				break;
			case 3:
				System.out.println("I was thinking of the color " + color3 + ".");
				if (guess3.equalsIgnoreCase(color3)) { // means correct answer
					if (i == 1) numCorrect1++;
					else if (i == 2) numCorrect2++;
					else if (i == 3) numCorrect3++;
				}
				else {
					if (i == 1) numWrong1++;
					else if (i == 2) numWrong2++;
					else if (i == 3) numWrong3++;
				}
				break;
			case 4:
				System.out.println("I was thinking of the color " + color4 + ".");
				if (guess3.equalsIgnoreCase(color4)) { // means correct answer
					if (i == 1) numCorrect1++;
					else if (i == 2) numCorrect2++;
					else if (i == 3) numCorrect3++;
				}
				else {
					if (i == 1) numWrong1++;
					else if (i == 2) numWrong2++;
					else if (i == 3) numWrong3++;
				}
				break;
			case 5:
				System.out.println("I was thinking of the color " + color5 + ".");
				if (guess3.equalsIgnoreCase(color5)) { // means correct answer
					if (i == 1) numCorrect1++;
					else if (i == 2) numCorrect2++;
					else if (i == 3) numCorrect3++;
				}
				else {
					if (i == 1) numWrong1++;
					else if (i == 2) numWrong2++;
					else if (i == 3) numWrong3++;
				}
				break;
			case 6:
				System.out.println("I was thinking of the color " + color6 + ".");
				if (guess3.equalsIgnoreCase(color6)) { // means correct answer
					if (i == 1) numCorrect1++;
					else if (i == 2) numCorrect2++;
					else if (i == 3) numCorrect3++;
				}
				else {
					if (i == 1) numWrong1++;
					else if (i == 2) numWrong2++;
					else if (i == 3) numWrong3++;
				}
				break;
			case 7:
				System.out.println("I was thinking of the color " + color7 + ".");
				if (guess3.equalsIgnoreCase(color7)) { // means correct answer
					if (i == 1) numCorrect1++;
					else if (i == 2) numCorrect2++;
					else if (i == 3) numCorrect3++;
				}
				else {
					if (i == 1) numWrong1++;
					else if (i == 2) numWrong2++;
					else if (i == 3) numWrong3++;
				}
				break;
			case 8:
				System.out.println("I was thinking of the color " + color8 + ".");
				if (guess3.equalsIgnoreCase(color8)) { // means correct answer
					if (i == 1) numCorrect1++;
					else if (i == 2) numCorrect2++;
					else if (i == 3) numCorrect3++;
				}
				else {
					if (i == 1) numWrong1++;
					else if (i == 2) numWrong2++;
					else if (i == 3) numWrong3++;
				}
				break;
			case 9:
				System.out.println("I was thinking of the color " + color9 + ".");
				if (guess3.equalsIgnoreCase(color9)) { // means correct answer
					if (i == 1) numCorrect1++;
					else if (i == 2) numCorrect2++;
					else if (i == 3) numCorrect3++;
				}
				else {
					if (i == 1) numWrong1++;
					else if (i == 2) numWrong2++;
					else if (i == 3) numWrong3++;
				}
				break;
			case 10:
				System.out.println("I was thinking of the color " + color10 + ".");
				if (guess3.equalsIgnoreCase(color10)) { // means correct answer
					if (i == 1) numCorrect1++;
					else if (i == 2) numCorrect2++;
					else if (i == 3) numCorrect3++;
				}
				else {
					if (i == 1) numWrong1++;
					else if (i == 2) numWrong2++;
					else if (i == 3) numWrong3++;
				}
				break;
			case 11:
				System.out.println("I was thinking of the color " + color11 + ".");
				if (guess3.equalsIgnoreCase(color11)) { // means correct answer
					if (i == 1) numCorrect1++;
					else if (i == 2) numCorrect2++;
					else if (i == 3) numCorrect3++;
				}
				else {
					if (i == 1) numWrong1++;
					else if (i == 2) numWrong2++;
					else if (i == 3) numWrong3++;
				}
				break;
			case 12:
				System.out.println("I was thinking of the color " + color12 + ".");
				if (guess3.equalsIgnoreCase(color12)) { // means correct answer
					if (i == 1) numCorrect1++;
					else if (i == 2) numCorrect2++;
					else if (i == 3) numCorrect3++;
				}
				else {
					if (i == 1) numWrong1++;
					else if (i == 2) numWrong2++;
					else if (i == 3) numWrong3++;
				}
				break;
			case 13:
				System.out.println("I was thinking of the color " + color13 + ".");
				if (guess3.equalsIgnoreCase(color13)) { // means correct answer
					if (i == 1) numCorrect1++;
					else if (i == 2) numCorrect2++;
					else if (i == 3) numCorrect3++;
				}
				else {
					if (i == 1) numWrong1++;
					else if (i == 2) numWrong2++;
					else if (i == 3) numWrong3++;
				}
				break;
			case 14:
				System.out.println("I was thinking of the color " + color14 + ".");
				if (guess3.equalsIgnoreCase(color14)) { // means correct answer
					if (i == 1) numCorrect1++;
					else if (i == 2) numCorrect2++;
					else if (i == 3) numCorrect3++;
				}
				else {
					if (i == 1) numWrong1++;
					else if (i == 2) numWrong2++;
					else if (i == 3) numWrong3++;
				}
				break;
			case 15:
				System.out.println("I was thinking of the color " + color15 + ".");
				if (guess3.equalsIgnoreCase(color15)) { // means correct answer
					if (i == 1) numCorrect1++;
					else if (i == 2) numCorrect2++;
					else if (i == 3) numCorrect3++;
				}
				else {
					if (i == 1) numWrong1++;
					else if (i == 2) numWrong2++;
					else if (i == 3) numWrong3++;
				}
				break;
			case 16:
				System.out.println("I was thinking of the color " + color16 + ".");
				if (guess3.equalsIgnoreCase(color16)) { // means correct answer
					if (i == 1) numCorrect1++;
					else if (i == 2) numCorrect2++;
					else if (i == 3) numCorrect3++;
				}
				else {
					if (i == 1) numWrong1++;
					else if (i == 2) numWrong2++;
					else if (i == 3) numWrong3++;
				}
				break;
			}
			
		System.out.println("\nGame over!");
		int numCorrect = numCorrect1 + numCorrect2 + numCorrect3; // total of correct answers
		int numWrong = numWrong1 + numWrong2 + numWrong3; // total of wrong answers
		System.out.println("\nYou guessed " + numCorrect + " for 3 correctly.");
		
		// requests user info
		System.out.print("Enter your name here: ");
		String username = keyboard.nextLine();
		System.out.print("Describe yourself: ");
		String userDescription = keyboard.nextLine();
		System.out.print("Enter due date: ");
		String userDate = keyboard.nextLine();
		
		// prints user info
		System.out.print("User Name: " + username + "\nUser Description: " + userDescription + "\nDate: " + userDate);
		
		// closes "colors.txt"
		inputFile.close();
	}
}