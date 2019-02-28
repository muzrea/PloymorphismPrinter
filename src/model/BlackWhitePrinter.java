package model;
import model.Printer;

public class BlackWhitePrinter extends Printer{
    @Override
    public void print(){
        System.out.println("print black and white paper.");
    }
}

class Test{
    public static void main(String[] args){
        BlackWhitePrinter blackWhitePrinter = new BlackWhitePrinter();
        blackWhitePrinter.print();
    }
}