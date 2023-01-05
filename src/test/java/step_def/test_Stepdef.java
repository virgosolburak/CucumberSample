package step_def;

import io.cucumber.java.en.Given;

public class test_Stepdef {

    @Given("User opens click something")
    public void user_opens_click_something() throws InterruptedException {
     Thread.sleep(5000);
    }

}
