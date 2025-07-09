package steps;

import io.cucumber.java.en.*;
import io.restassured.response.Response;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.*;

public class InsuranceSteps {
    WebDriver driver;
    Response response;

    @Given("user is on login page")
    public void user_is_on_login_page() {
        driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/insurance/v1/index.php");
    }

    @When("user enters valid credentials and logs in")
    public void user_enters_valid_credentials_and_logs_in() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("tester", "123456");
    }

    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {
        String expectedUrl = "https://demo.guru99.com/insurance/v1/header.php";
        assertEquals(driver.getCurrentUrl(), expectedUrl, "User is not on dashboard.");
        driver.quit();
    }

    @When("user creates a policy")
    public void user_creates_a_policy() {
        String body = "{ \"policyType\": \"Auto\", \"coverage\": \"Full\", \"userId\": 123 }";
        response = given().header("Content-Type", "application/json")
                .body(body)
                .post("https://jsonplaceholder.typicode.com/posts");
    }

    @Then("policy is created with status code {int}")
    public void policy_is_created_with_status_code(Integer code) {
        assertEquals(response.getStatusCode(), (int) code);
    }

    @When("user updates the policy")
    public void user_updates_the_policy() {
        String updatedBody = "{ \"id\": 1, \"policyType\": \"Auto\", \"coverage\": \"Partial\", \"userId\": 123 }";
        response = given().header("Content-Type", "application/json")
                .body(updatedBody)
                .put("https://jsonplaceholder.typicode.com/posts/1");
    }

    @When("user deletes the policy")
    public void user_deletes_the_policy() {
        response = given().delete("https://jsonplaceholder.typicode.com/posts/1");
    }

    @Then("policy should return status {int}")
    public void policy_should_return_status(Integer code) {
        assertEquals(response.getStatusCode(), (int) code);
    }
}
