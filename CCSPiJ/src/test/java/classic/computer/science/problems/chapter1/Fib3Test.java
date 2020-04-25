package classic.computer.science.problems.chapter1;

import org.junit.Test;

import org.assertj.core.api.Assertions;

/**
 * @author glick
 */
public class Fib3Test {
    @Test
    public void testFib3() {

        Fib3 fib3 = new Fib3();

        System.out.println(fib3.fib3(5));
        System.out.println(fib3.fib3(40));

        Assertions.assertThat(fib3.fib3(5)).isEqualTo(5);
        Assertions.assertThat(fib3.fib3(40)).isEqualTo(102334155);
    }

    @Test
    public void exerciseFib3Main() {
        Fib3.main(new String[]{});
    }
}
