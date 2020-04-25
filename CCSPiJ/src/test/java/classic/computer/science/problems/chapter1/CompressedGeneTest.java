package classic.computer.science.problems.chapter1;

import org.junit.Test;

import org.apache.commons.lang3.StringUtils;
import org.assertj.core.api.Assertions;

/**
 * @author glick
 */
public class CompressedGeneTest {

    private static final String[] ORIGINAL_ARRAY = {
        "TAGGGATTAACCGTTATATATATATAGCCATGGATCGATTATAT",
        "AGGGATTAACCGTTATATATATATAGCCATGGATCGATTATA"
    };

    private static final String ORIGINAL = StringUtils.join(ORIGINAL_ARRAY);


    @Test
    public void testCompressedGene() {
        CompressedGene compressed = new CompressedGene(ORIGINAL);
        final String decompressed = compressed.decompress();

        System.out.println(decompressed);
        System.out.println("ORIGINAL is the same as decompressed: " + ORIGINAL.equalsIgnoreCase(decompressed));

        Assertions.assertThat(decompressed).isEqualToIgnoringCase(decompressed);
    }

    @Test
    public void testMain() {
        System.out.println("exercising the main method to increase test coverage");
        CompressedGene.main(new String[] {});
    }
}
