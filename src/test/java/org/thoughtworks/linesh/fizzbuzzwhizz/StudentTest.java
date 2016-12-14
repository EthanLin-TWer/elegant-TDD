package org.thoughtworks.linesh.fizzbuzzwhizz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import support.Tasking;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {

    private Student student;

    @BeforeEach
    void setUp() {
        student = new Student();
    }

    @Tasking(estimated = "2mins")
    class should_say_fizz_when_number_can_be_devided_by_the_first_special_number {

        @Test
        void should_say_fizz_when_number_is_3() {
            String said = student.say(3, 3);

            assertEquals("Fizz", said);
        }

        @Test
        void should_say_fizz_when_number_is_6() {
            String said = student.say(6, 3);

            assertEquals("Fizz", said);
        }

        @Test
        void should_say_fizz_when_number_is_99() {
            String said = student.say(99, 3);

            assertEquals("Fizz", said);
        }
    }

    @Tasking(estimated = "2mins")
    class should_say_buzz_when_number_can_be_devided_by_the_second_special_number {
        @Test
        void should_say_buzz_when_number_is_5() {
            String said = student.say(5, 5);

            assertEquals("Buzz", said);
        }
    }

    @Tasking(estimated = "2mins")
    class should_say_whizz_when_number_can_be_devided_by_the_third_special_number {

    }

    @Tasking(estimated = "2mins")
    class should_say_fizzbuzz_when_number_can_be_devided_by_the_first_and_second_special_number {

    }

    @Tasking(estimated = "2mins")
    class should_say_buzz_whizz_when_number_can_be_devided_by_the_second_and_third_special_number {

    }

    @Tasking(estimated = "2mins")
    class should_say_fizzwhizz_when_number_can_be_devided_by_the_first_and_third_special_number {

    }

    @Tasking(estimated = "2mins")
    class should_say_fizzbuzzwhizz_when_number_can_be_devided_by_the_all_three_special_number {

    }

    @Tasking(estimated = "30mins")
    class should_say_fizz_when_number_contains_the_first_special_number {

    }

    @Tasking(estimated = "2mins")
    class should_say_number_itself_when_none_of_the_rules_above_applies {

    }
}