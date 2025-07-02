package Strings;

public class vowels_consonants {
    public static void main(String[] args) {
        String str="hello";
        System.out.println(str);
        int vowel_count=0;
        int conso_count=0;
       for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u' ){
        vowel_count++;
        }
        else{
        conso_count++;
        }
       }
       System.out.println("vowels: "+vowel_count);
       System.out.println("Consonant: "+conso_count);
    }
}
