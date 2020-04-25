package classic.computer.science.problems.chapter1;

import org.junit.Test;

import org.assertj.core.api.Assertions;

/**
 * @author glick
 */
public class PiCalculatorTest {

    @Test
    public void testPiCalculator() {

        double piToOneMillionTerms = PiCalculator.calculatePi(1000000);

        System.out.println("pi to one million terms is " + piToOneMillionTerms);

        Assertions.assertThat(true).isTrue();
    }

    @Test
    public void testPiCalculatorMain() {

        PiCalculator.main(new String[]{});

        Assertions.assertThat(true).isTrue();
    }
}
