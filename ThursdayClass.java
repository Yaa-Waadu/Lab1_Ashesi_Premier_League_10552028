import java.util.Scanner;
public class ThursdayClass {
    public static void main(String[] args){
        //Count the number of vowels in a given string.
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a word");
        String wordd =input.nextLine();
        char[] word=wordd.toLowerCase().toCharArray();
        char[] vowel= {'a','o','u','i','e'};
        for(char character:word){
            System.out.println(character);
            for(char vow:vowel){
                if(vow==character){
                    // System.out.println("The words are: "+ character);
                }
            }
        }
    }
}
