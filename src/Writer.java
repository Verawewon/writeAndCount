import java.util.Scanner;

public class Writer {
    private String text, allText;

    public Writer(){
    }

    public Writer(String text){
        this.text=text;
    }

    public String createText(){
        Scanner scan =new Scanner(System.in);
        text= scan.nextLine();
        allText=allText+"\n"+text;
        return text;
    }

    public void printAllText(){
        System.out.println(allText);
    }
    public void printText(){
        System.out.println(text);
    }

    public boolean stop(){
        boolean stop= false;
        if (text.contains("stop")) stop= true;
        return stop;
    }
}
