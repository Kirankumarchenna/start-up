package org.practice.designPatterns.structural;

/*
    It acts like a translator between two incompatible interfaces
    In software, the Adapter lets classes with different interfaces work together without changing their existing code.
 */

class LegacyPrinter {
    public void printMessage(String message){
        System.out.println("Legacy printer: "+message);
    }
}

class PrinterAdapter{

    private final LegacyPrinter legacyPrinter;

    public PrinterAdapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }

    public void send(String message){
        legacyPrinter.printMessage(message);
    }
}

class Main {
    public static void main(String[] args) {
        PrinterAdapter printerAdapter = new PrinterAdapter(new LegacyPrinter());
        printerAdapter.send("Hello Adapter");
    }
}