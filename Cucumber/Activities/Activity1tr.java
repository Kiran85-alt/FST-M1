package testRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/java/features",
            glue = {"stepDefinations"}
          //  tags = "@activity1"
    )

    public class Activity1tr {
        //empty
    }
