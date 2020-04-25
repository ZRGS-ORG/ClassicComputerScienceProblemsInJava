package classic.computer.science.problems.chapter3;

import org.junit.Test;

import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author glick
 */
public class WordSearchConstraintTest {

    @Test
    public void testWordSearchConstraint() {
        WordGrid grid = new WordGrid(9, 9);
        List<String> words = List.of("MATTHEW", "JOE", "MARY", "SARAH", "SALLY");
        // generate domains for all words
        Map<String, List<List<WordGrid.GridLocation>>> domains = new HashMap<>();
        for (String word : words) {
            domains.put(word, grid.generateDomain(word));
        }
        CSP<String, List<WordGrid.GridLocation>> csp = new CSP<>(words, domains);
        csp.addConstraint(new WordSearchConstraint(words));
        Map<String, List<WordGrid.GridLocation>> solution = csp.backtrackingSearch();
        if (solution == null) {
            System.out.println("No solution found!");
        } else {
            SecureRandom random = new SecureRandom();
            for (Map.Entry<String, List<WordGrid.GridLocation>> item : solution.entrySet()) {
                String word = item.getKey();
                List<WordGrid.GridLocation> locations = item.getValue();
                // random reverse half the time
                if (random.nextBoolean()) {
                    Collections.reverse(locations);
                }
                grid.mark(word, locations);
            }
            System.out.println(grid);
        }
    }
 }
