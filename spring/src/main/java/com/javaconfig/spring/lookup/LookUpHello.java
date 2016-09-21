package com.javaconfig.spring.lookup;


/**
 * PACKAGE_NAME:com.javaconfig.spring.lookup.LookUpHello DESCRIPTION: User: liuhp date:
 * 16-7-14上午9:48
 */
public class LookUpHello implements HelloApi {

    private Printer printer;

    @Override
    public void sayHello() {
        printer.print("setter");
        printer.print();
       /* Printer singletonPrinter = createSingletonPrinter();
        System.out.println("singletonPrinter" + singletonPrinter);
        singletonPrinter.print("singleton");

        Printer prototypePrinter = createPrototypePrinter();
        System.out.println("prototypePrinter" + prototypePrinter);
        prototypePrinter.print("prototype");*/
    }

    public Printer createSingletonPrinter() {
        System.out.println("createSingletonPrinter...");
        return new Printer();
    }

    public Printer createPrototypePrinter() {
        System.out.println("createPrototypePrinter...");
        return new Printer();
    }

    public Printer getPrinter() {
        return printer;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }
}
