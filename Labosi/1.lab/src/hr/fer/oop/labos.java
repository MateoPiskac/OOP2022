package hr.fer.oop;

public class labos {
    public static void main(String[] args) {






    }

    static String withoutVowels(String input){
        String s1 = "";
            s1=input.replaceAll("[aeiouAEIOU]", "");
            return s1;
        }


    }
    static boolean isPalindrome(int number){

    String s1 = Integer.toString(number);
    for(int i = 0;i<s1.length();i++){
        if(s1.charAt(i)!=s1.charAt(s1.length()-i))
            return false;

    }
    return true;
}
