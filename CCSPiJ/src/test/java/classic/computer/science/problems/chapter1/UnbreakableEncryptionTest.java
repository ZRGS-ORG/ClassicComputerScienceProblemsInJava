package classic.computer.science.problems.chapter1;

import org.junit.Ignore;
import org.junit.Test;

import org.assertj.core.api.Assertions;

/**
 * @author glick
 */
public class UnbreakableEncryptionTest {

    private static final String ONE_TIME_PAD = "One Time Pad!";

    @Test
    @Ignore
    public void testEncrypt() {
        throw new UnsupportedOperationException();
    }

    @Test
    @Ignore
    public void testDecrypt() {
        throw new UnsupportedOperationException();
    }

    @Test
    public void endToEndTest() {
        UnbreakableEncryption unbreakable = new UnbreakableEncryption();
        KeyPair kp = unbreakable.encrypt(ONE_TIME_PAD);
        String result = unbreakable.decrypt(kp);
        System.out.println(result);
        Assertions.assertThat(result).isEqualTo(ONE_TIME_PAD);
    }
}
