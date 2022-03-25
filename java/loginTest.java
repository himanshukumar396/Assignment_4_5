import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class loginTest {
    @Test
    public  void browser_launch() throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\himanshukumar7\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        //read_user(driver);
        File file = new File("C:\\Users\\himanshukumar7\\Documents\\userData.xls");
        FileInputStream inputStream = new FileInputStream(file);
        HSSFWorkbook wb=new HSSFWorkbook(inputStream);
        HSSFSheet sheet=wb.getSheet("userData");
        HSSFRow row1=sheet.getRow(1);
        HSSFCell cell1=row1.getCell(0);
        HSSFCell cell2=row1.getCell(1);
        HSSFCell cell3=row1.getCell(2);
        HSSFCell cell4=row1.getCell(3);
        HSSFCell cell5=row1.getCell(4);
        String username1=cell1.getStringCellValue();
        String password1=cell2.getStringCellValue();
        String firstname=cell3.getStringCellValue();
        String lastname=cell4.getStringCellValue();
        String zipcode= String.valueOf(cell5.getNumericCellValue());
        WebElement username = driver.findElement(By.xpath("//*[@id='user-name']"));
        username.click();
        username.sendKeys(username1);
        WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
        password.click();
        password.sendKeys(password1);
        WebElement loginButton = driver.findElement(By.xpath("//*[@id='login-button']"));
        loginButton.click();

        //Select sort button high to low and add highest product in cart
        WebElement sort = driver.findElement(By.xpath("//*[@id='header_container']//span/select"));
        sort.click();
        Thread.sleep(3000);
        WebElement HighToLow = driver.findElement(By.xpath("//*[@id='header_container']//select/option[4]"));
        HighToLow.click();
        Thread.sleep(3000);
        WebElement HighestPricedProduct = driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-fleece-jacket']"));
        HighestPricedProduct.click();
        Thread.sleep(3000);


        //remove product from cart
        WebElement cart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        cart.click();
        Thread.sleep(3000);
        WebElement removeProduct = driver.findElement(By.xpath("//*[@id='remove-sauce-labs-fleece-jacket']"));
        removeProduct.click();
        Thread.sleep(3000);
        WebElement continueShopping = driver.findElement(By.id("continue-shopping"));
        continueShopping.click();
        Thread.sleep(3000);


        //Again sort high to low and add the product again
        WebElement sort2 = driver.findElement(By.xpath("//*[@id='header_container']//span/select"));
        sort2.click();
        Thread.sleep(3000);
        WebElement HighToLow1 = driver.findElement(By.xpath("//*[@id='header_container']//select/option[4]"));
        HighToLow1.click();
        Thread.sleep(3000);
        WebElement HighestPricedProduct1 = driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-fleece-jacket']"));
        HighestPricedProduct1.click();
        Thread.sleep(3000);

        //Sort the page to low to high and add lowest product to cart and checkout
        WebElement sort1 = driver.findElement(By.xpath("//*[@id='header_container']//span/select"));
        sort1.click();
        Thread.sleep(3000);
        WebElement LowToHigh = driver.findElement(By.xpath("//*[@id='header_container']//select/option[3]"));
        LowToHigh.click();
        Thread.sleep(3000);
        WebElement LowestPricedProduct = driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-onesie']"));
        LowestPricedProduct.click();
        Thread.sleep(3000);
        WebElement cart3 = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        cart3.click();
        Thread.sleep(3000);
        WebElement checkout = driver.findElement(By.id("checkout"));
        checkout.click();
        Thread.sleep(3000);

        //Add firstname, lastname and zipcode from excel
        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.click();
        firstName.sendKeys(firstname);
        Thread.sleep(3000);
        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.click();
        lastName.sendKeys(lastname);
        Thread.sleep(3000);
        WebElement zipCode = driver.findElement(By.id("postal-code"));
        zipCode.click();
        zipCode.sendKeys(zipcode);
        Thread.sleep(3000);
        WebElement continueButton = driver.findElement(By.xpath("//input[@class='submit-button btn btn_primary cart_button btn_action']"));
        continueButton.click();
        Thread.sleep(3000);

        //click on continue button
        WebElement finish = driver.findElement(By.xpath("//button[@class='btn btn_action btn_medium cart_button']"));
        finish.click();
        Thread.sleep(3000);

        //Order Placed page
        WebElement SuccessMessage = driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2"));
        System.out.println(SuccessMessage);
    }
    //@Test
    //public  void read_user(WebDriver driver) throws IOException {
        /*File file = new File("C:\\Users\\himanshukumar7\\Documents\\userData.xls");
        FileInputStream inputStream = new FileInputStream(file);
        HSSFWorkbook wb=new HSSFWorkbook(inputStream);
        HSSFSheet sheet=wb.getSheet("userData");
        HSSFRow row1=sheet.getRow(1);
        HSSFCell cell1=row1.getCell(0);
        HSSFCell cell2=row1.getCell(1);
        String username1=cell1.getStringCellValue();
        String password1=cell2.getStringCellValue();
        WebElement username = driver.findElement(By.xpath("//*[@id='user-name']"));
        username.click();
        username.sendKeys(username1);
        WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
        password.click();
        password.sendKeys(password1);
        WebElement loginButton = driver.findElement(By.xpath("//*[@id='login-button']"));
        loginButton.click();
    }*/

    /*public static void main(String[] args) throws IOException {
        //browser_launch();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\himanshukumar7\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        read_user(driver);
        products p = new products();
        p.product_sort(driver); */





}


