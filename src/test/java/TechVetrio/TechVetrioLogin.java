package TechVetrio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class TechVetrioLogin {
	public static WebDriver driver;
	

	/*
	 * @Given("Login to TechVetrio Admin Page with correct username and password")
	 * public void
	 * login_to_tech_vetrio_admin_page_with_correct_username_and_password() {
	 */
		/*
		 * // Write code here that turns the phrase above into concrete actions
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Program Files\\Chrome Driver\\Chromedriver.exe"); WebDriver driver = new
		 * ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("https://rahul-pujari.herokuapp.com/admin");
		 * driver.findElement(By.xpath("//input[@id='admin_user_email']")).sendKeys(
		 * "admin@example.com");
		 * driver.findElement(By.xpath("//input[@id='admin_user_password']")).sendKeys(
		 * "password"); driver.findElement(By.xpath("//input[@type='submit']")).click();
		 * driver.findElement(By.xpath("//a[@href='/admin/products']")).click();
		 * driver.findElement(By.xpath("//a[text()='Create one']")).click();
		 * driver.findElement(By.id("product_title")).sendKeys("Rahul Pujari Demo Title"
		 * ); driver.findElement(By.id("product_sku")).sendKeys("Rahul");
		 * driver.findElement(By.id("product_description")).
		 * sendKeys("Rahul Pujari Demo Description");
		 * //driver.findElement(By.xpath("//a[text()='Cancel']")).click();
		 * driver.findElement(By.name("commit")).click();
		 * 
		 * 
		 * }
		 */

	/*@Given("create new product with Tittle, Sku,Description")
	public void create_new_product_with_tittle_sku_description() {
		// Write code here that turns the phrase above into concrete actions
		//driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS );
		driver.findElement(By.xpath("//a[@href='/admin/products']")).click();
		driver.findElement(By.xpath("//a[text()='Create one']")).click();
		driver.findElement(By.id("product_title")).sendKeys("new creat");
		driver.findElement(By.id("product_sku")).sendKeys("12345");
		driver.findElement(By.id("product_description")).sendKeys("one,two,three");
		driver.findElement(By.xpath("//a[text()='Cancel']")).click();
	*/

		
	//}

	/*
	 * @Given("Login to TechVetrio Admin Page") public void
	 * login_to_tech_vetrio_admin_page() { // Write code here that turns the phrase
	 * above into concrete actions System.setProperty("webdriver.chrome.driver",
	 * "C:\\Program Files\\Chrome Driver//Chromedriver.exe"); WebDriver driver = new
	 * ChromeDriver(); driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
	 * driver.get("https://rahul-pujari.herokuapp.com/admin");
	 * 
	 * throw new io.cucumber.java.PendingException(); }
	 * 
	 * 
	 * @Given("I enter the url http:\\rahul-pujari.herokuapp.com/admin") public void
	 * i_enter_the_url_http_rahul_pujari_herokuapp_com_admin() { // Write code here
	 * that turns the phrase above into concrete actions
	 * 
	 * throw new io.cucumber.java.PendingException(); }
	 * 
	 * @Then("I click on the signin page") public void i_click_on_the_signin_page()
	 * { // Write code here that turns the phrase above into concrete actions throw
	 * new io.cucumber.java.PendingException(); }
	 * 
	 * @Then("I enter page") public void i_enter_page() { // Write code here that
	 * turns the phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 * 
	 * @Then("^I enter correct ([a-zA-Z]{1,})$") public void
	 * i_enter_correct_username_and_password(String username,String password) { //
	 * Write code here that turns the phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 * 
	 * @Then("I click on the SignIn button") public void
	 * i_click_on_the_sign_in_button() { // Write code here that turns the phrase
	 * above into concrete actions throw new io.cucumber.java.PendingException(); }
	 */

	/*
	 * @Given("Login to TechVetrio Admin Page") public void i_open_chrome_browser()
	 * { // Write code here that turns the phrase above into concrete actions
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Program Files\\Chrome Driver//Chromedriver.exe"); WebDriver driver = new
	 * ChromeDriver(); driver.manage().window().maximize();
	 * driver.get("https://rahul-pujari.herokuapp.com/admin");
	 * driver.findElement(By.xpath("//input[@id='admin_user_email']")).sendKeys(
	 * "admin@example.com");
	 * driver.findElement(By.xpath("//input[@id='admin_user_password']")).sendKeys(
	 * "password"); driver.findElement(By.xpath("//input[@type='submit']")).click();
	 * // driver.close(); throw new io.cucumber.java.PendingException();
	 * driver.findElement(By.xpath("//a[@href='/admin/products']")).click();
	 * driver.findElement(By.xpath("//a[text()='Create one']")).click();
	 * driver.findElement(By.id("product_title")).sendKeys("new creat");
	 * driver.findElement(By.id("product_sku")).sendKeys("12345");
	 * driver.findElement(By.id("product_description")).sendKeys("one,two,three");
	 * driver.findElement(By.xpath("//a[text()='Cancel']")).click(); }
	 */
@Given("Login to TechVetrio  Page")
public void login_to_tech_vetrio_page() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chrome Driver\\Chromedriver.exe");
	WebDriver driver = (WebDriver) new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rahul-pujari.herokuapp.com/admin");
	Thread.sleep(500);
   // throw new io.cucumber.java.PendingException();
}

@When("enter correct username")
public void enter_correct_username() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(500);
	driver.findElement(By.xpath("//input[@id='admin_user_email']")).sendKeys("admin@example.com");
   // throw new io.cucumber.java.PendingException();
}

@When("enter correct password")
public void enter_correct_password() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//input[@id='admin_user_password']")).sendKeys("password");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
   // throw new io.cucumber.java.PendingException();
}

@Given("Create new product with Tittle, Sku,Description")
public void create_new_product_with_tittle_sku_description() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(500);
	driver.findElement(By.xpath("//a[@href='/admin/products']")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath("//a[text()='Create one']")).click();
	
   // throw new io.cucumber.java.PendingException();
}

@When("enter Tittle")
public void enter_tittle() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("product_title")).sendKeys("Rahul Pujari Demo Title");
   // throw new io.cucumber.java.PendingException();
}

@When("enter sku")
public void enter_sku() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("product_sku")).sendKeys("Rahul");
  //  throw new io.cucumber.java.PendingException();
}

@When("enter Description")
public void enter_description() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("product_description")).sendKeys("Rahul Pujari Demo Description");
	driver.findElement(By.xpath("//a[text()='Cancel']")).click();
  //  throw new io.cucumber.java.PendingException();
}

@Given("Listing the created product")
public void listing_the_created_product() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("Updated the created product")
public void updated_the_created_product() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("Delete the created product")
public void delete_the_created_product() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
}
