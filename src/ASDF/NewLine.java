package ASDF;

/**
 * Created by Siret on 21.10.2016.
 */
public class NewLine{
    public static void newLine(){
        System.out.println();
 }
 public static void threeLine(){
     newLine();
     newLine();
     newLine();
 }
 public static void main(String[] args){
     System.out.println("First line.");
     threeLine();
     System.out.println("Second line.");
 }
}
