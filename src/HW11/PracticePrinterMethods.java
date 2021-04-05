package HW11;

public class PracticePrinterMethods {
    public static void main() {
        Printer p1 = new Printer();
        p1.printerSummary();
        p1.print (10);
        p1.printerSummary();
        p1.print(10 , true);
        p1.printerSummary();
        p1.print(9, true);
        p1.printerSummary();
        p1.print(90);
        p1.print(10);
        p1.printerSummary();

        Printer.addPaper(150);
        Printer.addPaper(5);
        Printer.addToner(-1);
        Printer.addToner(5);
    }


}
