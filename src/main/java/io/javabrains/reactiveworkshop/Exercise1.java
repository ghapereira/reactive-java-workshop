package io.javabrains.reactiveworkshop;

public class Exercise1 {

    public static void main(String[] args) {
        // Use StreamSources.intNumbersStream() and StreamSources.userStream()

        // Print all numbers in the intNumbersStream stream
        StreamSources.intNumbersStream().forEach(i -> System.out.println(i));

        // Print numbers from intNumbersStream that are less than 5
        StreamSources.intNumbersStream()
                .filter(i -> i < 5)
                .forEach(i -> System.out.println(i));

        // Print the second and third numbers in intNumbersStream that's greater than 5
        StreamSources.intNumbersStream()
                .filter(i -> i > 5)
                .skip(1)
                .limit(2)
                .forEach(i -> System.out.println(i));

        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1

        Integer value = StreamSources.intNumbersStream()
                .filter(i -> i > 5)
                .findFirst()
                .orElse(-1);

        System.out.println(value);

        // Print first names of all users in userStream
        StreamSources.userStream()
                .map(user -> user.getFirstName())
                .forEach(name -> System.out.println(name));

        // Print first names in userStream for users that have IDs from number stream
        StreamSources.userStream()
                .forEach(user -> {
                    boolean userFound = StreamSources.intNumbersStream().anyMatch(i -> i == user.getId());
                    if (userFound) {
                        System.out.println(user.getFirstName());
                    }
                });
    }

}
