package chapter1;

import org.junit.Test;

import org.assertj.core.api.Assertions;

/**
 * @author glick
 */
public class Fib2Test {

    @Test
    public void testFib2() {

        Fib2 fib2 = new Fib2();

        System.out.println(fib2.fib2(5));
        System.out.println(fib2.fib2(10));

        Assertions.assertThat(fib2.fib2(5)).isEqualTo(5);
        Assertions.assertThat(fib2.fib2(10)).isEqualTo(55);
    }

    @Test
    public void exerciseFib2Main() {
        Fib2.main(new String[]{});
    }
}
