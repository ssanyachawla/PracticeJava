package CodePractice;

public class Vowel_Or_Consonant{
    static void vowelOrConsonant(char y){
        if (y == 'a'|| y=='e' || y=='i' || y=='o' || y=='u'){
            System.out.println(y+ " is a vowel");
        }
        else{
            System.out.println(y+" is a consonant");
        }
    }

    public static void main(String[] args) {
        vowelOrConsonant('b');
        vowelOrConsonant('u');
    }
}
