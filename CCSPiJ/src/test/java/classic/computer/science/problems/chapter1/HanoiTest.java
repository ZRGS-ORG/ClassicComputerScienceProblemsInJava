package classic.computer.science.problems.chapter1;

import org.junit.BeforeClass;
import org.junit.Test;

import org.assertj.core.api.Assertions;

import java.util.Stack;

/**
 * @author glick
 */
public class HanoiTest {

    static Stack<Integer> stack = new Stack<>();

    @BeforeClass
    public static void setUp() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
    }

    @Test
    public void testHanoi() {
        Hanoi hanoi = new Hanoi(3);

        printCurrentDisksForTheTowers(hanoi, "hanoi towerA before execution ", "hanoi towerB before execution ", "hanoi towerC before execution ");

        Integer[] integerArray = new Integer[] {};

        Integer[] arrayFromStack = HanoiTest.stack.toArray(integerArray);

        Assertions.assertThat(hanoi.towerA).containsExactly(arrayFromStack);
//        Assertions.assertThat(hanoi.towerA).isEqualTo(HanoiTest.stack);

        hanoi.solve();

        System.out.println("");
        printCurrentDisksForTheTowers(hanoi, "hanoi towerA after execution ", "hanoi towerB after execution ", "hanoi towerC after execution ");

        Assertions.assertThat(hanoi.towerC).containsExactly(arrayFromStack);
    }

    private void printCurrentDisksForTheTowers(Hanoi hanoi, String s, String s2, String s3) {
        System.out.println(s + hanoi.towerA);
        System.out.println(s2 + hanoi.towerB);
        System.out.println(s3 + hanoi.towerC);
    }

    @Test
    public void exerciseHanoiMain() {
        Hanoi.main(new String[] {});
    }
}
