import java.util.*;
public class Main{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("tony");
        System.out.println(sb);

        // Char at index 1
        System.out.println(sb.charAt(1));

        // set char at 0
        sb.setCharAt(0,'p');
        System.out.println(sb);

        //insert
        sb.insert(2,'n');
        System.out.println(sb);

        //delete
        sb.delete(2,4);
        System.out.println(sb);

        //append
        sb.append("s");
        System.out.println(sb);


    }
}