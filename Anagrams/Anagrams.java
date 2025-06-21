import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String word1;
        String word2;
        char c;

        System.out.println("Masukkan kalimat atau kata: ");
        word1 = reader.nextLine();
        System.out.println("Masukkan kalimat atau kata lain: ");
        word2 = reader.nextLine();
        boolean anagram = true;
        
        for (int i = 0; i < word1.length(); i++) {
            c = word1.charAt(i);
            if (word2.indexOf(c) == -1) {
                anagram = false;
                break;
            }
        }
        if(anagram)
        System.out.println("Ini kalimat atau kata anagram.");
        else
        System.out.println("Ini kalimat atau kata yang bukan Anagram");
        reader.close();
    }
}
