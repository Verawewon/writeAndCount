

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String text;
        Writer writer= new Writer();
        Count count= new Count();

        do{
            System.out.println("write something(end with typing 'stop'): ");
            text=writer.createText();
            count.countCharacters(text);
            count.countNewLines();

            count.printCountedChar();
            count.printCountedLines();
            writer.stop();

        }while(!writer.stop());

        System.out.println("program stop.");
        writer.printAllText();
    }
}