package org.thoughtworks.linesh.fizzbuzzwhizz;

public class Student {
    private final GameRuleConfig config;
    // TODO: [Linesh][12/3/16] firstSpecial should not be here

    public Student(GameRuleConfig config) {
        this.config = config;
    }

    public String say(int number, int firstSpecial) {
        // TODO: [Linesh][12/3/16] Refactor
        return firstSpecial == 3 ? "Fizz" : "Buzz";
    }
}
