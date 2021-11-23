import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.testng.Assert;

public class Greeting {

  String res;

  @When("^Pass name to function$")
  public void passName() {
     res = example.Greeting.greeting("Steve");
  }

  @Then("^Response should be hello world Steve$")
  public void checkMessage() {
     Assert.assertEquals(res, "Hello World, Steve");
  }
}
