package greetings;

import java.util.*;

public class OutputFormat {
	public static void main(String[] args) {
        Scanner take_input = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0; i < 3; i++) {
            String str = take_input.nextLine();
            String[] value = str.split(" ");
            String name = value[0];
            String inte = value[1];
            name = String.format("%-15s", name);
            if (inte.length() < 2) {
                inte = String.format("00"+inte);
            } else if (inte.length() < 3) {
                inte = String.format("0"+inte);
            }
            System.out.println(name + inte);
        }
        System.out.println("================================");
        take_input.close();    
    }
}
