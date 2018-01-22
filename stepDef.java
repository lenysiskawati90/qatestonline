package cucumberTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.GojekPage;

public class StepDefs {
    
    @Given("^I open website gojek$")
    public void I_Open_Website_Gojek() throw Throwable {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("http://www.gojek.com");
    }
    
    @And("^I click layanan button$")
    public void I_Click_Layanan_Button() throw Throwable {
        driver.findElement(By.className("buttonLayanan")).click();
    }
    
    @When("^I click images (.*)$")
    public void I_Click_Images_Product_Option(String productOption) () throw Throwable {
        WebElement temp = driver.findElement(By.xpath("//img[@src='web/L001/images/GORIDE.jpg']"));
        WebElement temp = driver.findElement(By.xpath("//img[@src='web/L002/images/GOCAR.jpg']"));
    }
    
    @Then("^I should see kenapa (.*)'$")
    public void I_Should_See_Kenapa(List<String> productOption) () throw Throwable {
        WebElement temp = driver.findElement(By.xpath("//img[@src='web/L001/images/GORIDE.jpg']"));
        WebElement temp = driver.findElement(By.xpath("//img[@src='web/L002/images/GOCAR.jpg']"));
    }
}
