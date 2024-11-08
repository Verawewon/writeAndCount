public class Count {
    int charNumber, lines;

    public Count() {
        charNumber = 0;
        lines = 0;
    }

    public int countCharacters(String text) {
        for (int i = 0; i < text.length(); i++) {
            charNumber += 1;
        }
        return charNumber;
    }

    public int countNewLines() {
        return lines+= 1;
    }

    public void printCountedChar(){
        System.out.println("antal tecken: "+ charNumber);
    }

    public void printCountedLines(){
        System.out.println("antal rader: "+ lines);
    }

}
