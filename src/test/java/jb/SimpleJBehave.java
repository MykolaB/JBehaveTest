package jb;

/**
 * Created by NBiletskiy on 10/8/2015.
 */
import java.util.Arrays;
import java.util.List;

import de.codecentric.jbehave.junit.monitoring.JUnitReportingRunner;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.junit.runner.RunWith;

@RunWith(JUnitReportingRunner.class)
public class SimpleJBehave extends JUnitStories {

    private Configuration configuration;

    public SimpleJBehave() {
        super();
        configuration = new Configuration() {
        };
    }

    @Override
    public Configuration configuration() {
        return configuration;
    }

    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(), new ExampleSteps());
    }

    @Override
    protected List<String> storyPaths() {
        return Arrays.asList("Math.story");
    }
}
