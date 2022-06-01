package hr.fer.oop.labos.Drugi;

class Utils {
    public static int checkPassword(String password){
        int grade;
        int numberOfDigits=0;
        int numberOfUpperCase=0;
        for(int i =0;i<password.length();i++){
            if(Character.isDigit(password.charAt(i)))
                numberOfDigits++;
            if(Character.isUpperCase(password.charAt(i)))
                numberOfUpperCase++;
        }
        grade=password.length()+numberOfDigits*3+numberOfUpperCase*2;
        if(grade<10 && password.length()<6)
            throw new IllegalArgumentException();
        else if(grade < 10)
            throw new SecurityException();
        else if(password.length()<6)
            throw new IllegalArgumentException();
        return grade;
    }
}
