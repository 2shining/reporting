package step;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","json:src/test/resources/json/sample.json"},
        features = {"src/test/java/step/us2"},
        glue = {"step.us2"}
)
public class appTest {

}