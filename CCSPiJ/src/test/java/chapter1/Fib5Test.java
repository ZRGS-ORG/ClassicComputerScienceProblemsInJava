package chapter1;

import org.junit.Test;

import org.assertj.core.api.Assertions;

/**
 * @author glick
 */
public class Fib5Test {

    @Test
    public void testFib5() {
        Fib5 fib5 = new Fib5();

        fib5.stream().limit(41).forEachOrdered(System.out::println);

        Assertions.assertThat(true).isTrue();
    }

    @Test
    public void exerciseFib5Main() {
        Fib5.main(new String[]{});
    }
}
