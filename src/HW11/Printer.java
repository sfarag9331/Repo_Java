package HW11;

public class Printer {

    static int tonerLevel = 100;
    static int paperInTray = 100;
    boolean isDoubleSided = true;
    int paperAmount;
    int tonerAmount;


    /**
     * Create a Printer
     * <p>
     * maxToner level = 100
     * maxPaper in tray = 100
     * with 1 page printing, 1 toner is being used
     * <p>
     * print a files which is having 5 pages, print single sided
     * paperInTray = 95
     * toner = 95
     * <p>
     * print a files which is having 5 pages; print double sided
     * paper-1     pg1,2
     * paper-2     pg3,4
     * paper-3     pg5
     * paper used = 3
     * toner used = 5
     * <p>
     * paperInTray = 92
     * toner = 90
     * <p>
     * <p>
     * 1. Create method 'print' which can be used to print single-sided or double-sided
     * // If paper or toner is not enough to print, we display error msg saying, Not enough paper or toner
     * 2. Create method 'addPaper' to add papers in the tray
     * 3. Create method 'addToner' to add toner
     * 4. Create method 'printerSummary'
     * Toner level: YY
     * Paper in tray: XX
     */

    public void print(int pages) {
        int maxToner = 100;
        int maxPaper = 100;
        if (pages <= 0) {
            System.out.println("Invalid number pages");
        } else if (pages >= 1 && paperInTray <= maxPaper && paperInTray >= pages && tonerLevel <= maxPaper && tonerLevel >= pages) {
            paperInTray = paperInTray - pages;
            tonerLevel = tonerLevel - pages;
            System.out.println("Toner level: " + paperInTray + "\nPaper in tray: " + paperInTray);
        } else if (pages >= 1 && paperInTray > maxPaper || paperInTray < pages || tonerLevel > maxPaper || tonerLevel < pages) {
            System.out.println("Not enough paper or toner");

        }
    }

    public void print(int pages, boolean isDoubleSided) {
        int maxToner = 100;
        int maxPaper = 100;
        if (pages >= 1 && paperInTray <= maxPaper && paperInTray >= pages && tonerLevel <= maxPaper && tonerLevel >= pages) {
            paperInTray = paperInTray - pages / 2;
            tonerLevel = tonerLevel - pages;
            System.out.println("Toner level: " + paperInTray + "\nPaper in tray: " + paperInTray);
        } else if (pages >= 1 && paperInTray > maxPaper || paperInTray < pages || tonerLevel > maxPaper || tonerLevel < pages) {
            System.out.println("Not enough paper or toner");

        }
    }

    public static int addPaper(int paperAmount) {
        if (paperAmount > 0) {
            paperInTray = paperInTray + paperAmount;
            if (paperInTray > 100){
                paperInTray = paperInTray - paperAmount;
                System.out.println("Invalid paper amount added");
            } else if (paperInTray <= 100){
                paperInTray = paperInTray + paperAmount;
            }
        } else {
            System.out.println("Invalid paper amount added");
        } return paperInTray;
    }

    public static int addToner(int tonerAmount) {
        if (tonerAmount > 0) {
            tonerLevel = tonerLevel + tonerAmount;
            if (tonerLevel > 100){
                tonerLevel = tonerLevel - tonerAmount;
                System.out.println("Invalid toner amount added");
            } else if (tonerLevel <= 100){
                tonerLevel = tonerLevel + tonerAmount;
            }
        } else {
            System.out.println("Invalid toner amount added");
        } return tonerLevel;
    }


    public void printerSummary (){
        System.out.println("Toner level: " + paperInTray + "\nPaper in tray: " + paperInTray);

    }

}
