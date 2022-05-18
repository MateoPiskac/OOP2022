package drugi;

import java.util.Scanner;

public class Reader {

    public static void readData(){
        String name;
        Scanner scanner = new Scanner(System.in);
        try{
            while (scanner.hasNextLine()){
                name=scanner.next();
                System.out.println(Names.checkAndFixName(name));
            }

        }
        catch (IllegalArgumentException exception){
            System.out.println(exception.getMessage());
            throw new IllegalArgumentException();
        }
        finally {
            System.out.println("KRAJ!");
            scanner.close();
        }
    }
}
