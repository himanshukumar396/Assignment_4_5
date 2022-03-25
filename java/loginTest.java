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

        WebElement sort = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select"));
        sort.click();

        WebElement high_to_low = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[4]"));
        high_to_low.click();

        WebElement cart = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]"));
        cart.click();

        Thread.sleep(5000);

        WebElement remove_product = driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-fleece-jacket\"]"));
        remove_product.click();

        Thread.sleep(5000);

        WebElement add_cart = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]"));
        add_cart.click();

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


