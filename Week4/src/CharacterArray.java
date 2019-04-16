import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class CharacterArray {

	public static void main(String[] args) throws Exception {
		
		File file = new File("C:\\characters.txt");
		Scanner input = new Scanner(file);
		
		//read the file and store it as a string.
		String textString = input.nextLine();
		
		//convert the string to 1d char array
		char[] text2char = textString.toCharArray();
		
		//print out the array just so we know we grabbed from the file.
		for (char eachCharacter: text2char)
			System.out.print(eachCharacter);
		System.out.println("\n");
		
		
		//create the 2d array and loop through each char from text2char to store as 6x7 array.
		char[][] characters = new char[6][7];
		int index = 0;	//keep track of current index of text2char array
		
		for (int row=0; row < 6; row++) {
			for (int col=0; col < 7; col++) {
				characters[row][col] = text2char[index];
				System.out.print(characters[row][col]);
				index += 1;
			}
			System.out.println();
		}
		
		System.out.println();
		
		//print out the array row + column to get the Output string
		for (int row=0; row < 5; row++) {
			for (int col=0; col < 6; col++) {
				System.out.print
				(characters[col][row]);
			}
		}
		
	}

}
