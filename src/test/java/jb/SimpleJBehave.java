package jb; /**
 * Created by NBiletskiy on 10/8/2015.
 */
import java.util.Arrays;
import java.util.List;

import org.jbehave.core.embedder.Embedder;

public class SimpleJBehave {

    private static Embedder embedder = new Embedder();
    private static List<String> storyPaths = Arrays
            .asList("Math.story");

    public static void main(String[] args) {
        embedder.candidateSteps().add(new ExampleSteps());
        embedder.runStoriesAsPaths(storyPaths);
    }
}
