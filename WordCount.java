import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text :");

        String input = scanner.nextLine(); // This reads the input from the user
        String[] words = input.split("\\s+"); // This splits the string into words based on whitespace

        // The "words" count is the length of the array
        int wordCount = words.length;

        System.out.println("The number of words in the string: " + wordCount);

        scanner.close(); // This is where you close the scanner
    }
}

// In this program, I used the Scanner class to read the input from the user. 
// I then split the input string into words based on whitespace and count the number of words in the string. 
// Finally, we Sysout the word count to the console.