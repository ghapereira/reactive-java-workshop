package io.javabrains.reactiveworkshop;

import java.io.IOException;

public class SideClass {
    public void sideMethod() throws IOException {
        ReactiveSources.intNumbersFlux()
                .subscribe(i -> System.out.println(i));

        ReactiveSources.userFlux()
                .subscribe(u -> System.out.println(u));

        System.out.println("Exiting method. Will the observers keep running if the program still exists?");
    }
}
