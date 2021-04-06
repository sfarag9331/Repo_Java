package HW11;

public class PracticePrinterMethods {
    public static void main(String[] args) {
        Printer p1 = new Printer();
        p1.printerSummary();
        p1.print (1);
        p1.printerSummary();
        p1.print(3 , true);
        p1.printerSummary();
        p1.print(4, true);
        p1.printerSummary();
        p1.print(5);
        p1.print(10);
        p1.printerSummary();

        Printer.addPaper(-21);
        Printer.addToner(24);
        Printer.addPaper(1);
        Printer.addToner(1);
        p1.printerSummary();
    }


}
