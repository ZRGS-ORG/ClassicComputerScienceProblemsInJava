package classic.computer.science.problems.chapter1;

import org.junit.Test;

import org.assertj.core.api.Assertions;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author glick
 */
public class KeyPairTest {

    @Test
    public void testKeyPair() {

        final byte[] firstBytes = new byte[20];
        final byte[] secondBytes = new byte[20];
        ThreadLocalRandom.current().nextBytes(firstBytes);
        ThreadLocalRandom.current().nextBytes(secondBytes);

        KeyPair keyPair = new KeyPair(firstBytes, secondBytes);

        Assertions.assertThat(keyPair.key1).isEqualTo(firstBytes);
        Assertions.assertThat(keyPair.key2).isEqualTo(secondBytes);
    }
}
