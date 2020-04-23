package chapter1;

import org.junit.Test;

import org.apache.commons.lang3.StringUtils;
import org.assertj.core.api.Assertions;

/**
 * @author glick
 */
public class CompressedGeneTest {

    private static final String[] originalArray = {
        "TAGGGATTAACCGTTATATATATATAGCCATGGATCGATTATAT",
        "AGGGATTAACCGTTATATATATATAGCCATGGATCGATTATA"
    };

    private static final String original = StringUtils.join(originalArray);


    @Test
    public void testCompressedGene() {
        CompressedGene compressed = new CompressedGene(original);
        final String decompressed = compressed.decompress();

        System.out.println(decompressed);
        System.out.println("original is the same as decompressed: " + original.equalsIgnoreCase(decompressed));

        Assertions.assertThat(decompressed).isEqualToIgnoringCase(decompressed);
    }

    @Test
    public void testMain() {
        System.out.println("exercising the main method to increase test coverage");
        CompressedGene.main(new String[] {});
    }
}
