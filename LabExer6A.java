package magdaraog_yel;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LabExer6A {
public static void main(String[] args){
   String fn="C:\\Users\\user\\Documents\\NetBeansProjects\\MAGDARAOG_YEL\\src\\magdaraog_yel\\word.txt";
    ArrayList wordsList = new ArrayList<>(); 
    String randomWord; String wordRevealed = "";
    String letter;
    int count = 0;
    boolean wordGuessed = false;
    Scanner sc = new Scanner(System.in);
   
    try{ 
         BufferedReader br = new BufferedReader(new FileReader(fn)); 
        String line = br.readLine();
        while(line != null){ wordsList.add(line); line = br.readLine(); }
        br.close();
        }catch(IOException e){
        e.printStackTrace();
        }
   
    Random rand = new Random();
    randomWord = (String) wordsList.get(rand.nextInt(wordsList.size()));
  
    for(int i = 0; i < randomWord.length(); i++){ 
        wordRevealed += "?";
    }

    System.out.println("\nWelcome to the guessing game!"); 
    System.out.println("The word has " + randomWord.length() + " letters."); 
    System.out.println("Guess a letter: " + wordRevealed);
   
    while(!wordGuessed){ 
        letter = sc.nextLine().toUpperCase(); 
        if(randomWord.contains(letter)){ 
            for(int i = 0; i < randomWord.length(); i++){
                if(randomWord.charAt(i) == letter.charAt(0))

    {
    wordRevealed = wordRevealed.substring(0, i) + letter + wordRevealed.substring(i + 1); count++;
    }
    }
    System.out.println("Correct! You have guessed " + count + " letter(s)."); 
    System.out.println("Guess a letter: " + wordRevealed);
    }
    else{ System.out.println("Wrong! Guess again.");
    System.out.println("Guess a letter: " + wordRevealed); }
    if(!wordRevealed.contains("?"))
    {
    wordGuessed = true; System.out.println("\nCongratulation! You have guessed the word: " + randomWord);
    }
    }
}
}
    
    

