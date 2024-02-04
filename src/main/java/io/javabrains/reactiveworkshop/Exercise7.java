package io.javabrains.reactiveworkshop;

import java.io.IOException;

public class Exercise7 {


    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono() and ReactiveSources.userMono()

        // Print all values from intNumbersFlux that's greater than 5
//        ReactiveSources.intNumbersFlux()
//                .filter(i -> i > 5)
//                .log()
//                .subscribe((Integer i) -> System.out.println(i));

        // Print each value multiplied by 10 from intNumbersFlux that's greater than 5
//        ReactiveSources.intNumbersFlux()
//                .filter((Integer i) -> i > 5)
//                .map((Integer i) -> i * 10)
//                .subscribe(System.out::println);

        // Print 10 multiplied by each value from intNumbersFlux for the first 3 numbers emitted that's greater than 5
//        ReactiveSources.intNumbersFlux()
//                .filter((Integer i) -> i > 5)
//                .take(3)
//                .map((Integer i) -> i * 10)
//                .subscribe(System.out::println);

        // Print each value from intNumbersFlux that's greater than 20. Print -1 if no elements are found
//        ReactiveSources.intNumbersFlux()
//                .filter((Integer i) -> i > 20)
//                .defaultIfEmpty(-1)
//                .subscribe(System.out::println);

        // Switch ints from intNumbersFlux to the right user from userFlux
//        ReactiveSources.intNumbersFlux()
//                .flatMap((Integer id) -> ReactiveSources
//                        .userFlux()
//                        .filter((User user) -> user.getId() == id))
//                .subscribe((User user) -> System.out.println(user.getFirstName()));

        // Print only distinct numbers from intNumbersFluxWithRepeat
//        ReactiveSources.intNumbersFluxWithRepeat()
//                .distinct()
//                .subscribe(System.out::println);

        // Print from intNumbersFluxWithRepeat excluding immediately repeating numbers
        ReactiveSources.intNumbersFluxWithRepeat()
                .distinctUntilChanged()
                .log()
                .subscribe();

        System.out.println("Press a key to end");
        System.in.read();
    }

}
