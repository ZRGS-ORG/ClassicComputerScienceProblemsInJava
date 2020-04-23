package chapter1;

import org.junit.Test;

import org.assertj.core.api.Assertions;

/**
 * @author glick
 */
public class Fib4Test {

    @Test
    public void testFib4() {

        Fib4 fib4 = new Fib4();

        System.out.println(fib4.fib4(5));
        System.out.println(fib4.fib4(40));

        Assertions.assertThat(fib4.fib4(5)).isEqualTo(5);
        Assertions.assertThat(fib4.fib4(40)).isEqualTo(102334155);
    }

    @Test
    public void exerciseFib4Main() {
        Fib4.main(new String[]{});
    }
}
