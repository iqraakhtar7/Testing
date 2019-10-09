/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciseviterbi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Iqra Akhtar
 */
public class ExerciseViterbi {

       
	public static void main(String[] args) throws Exception {

             System.setProperty("webdriver.chrome.driver","C:\\Users\\Iqra Akhtar\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
                WebDriver driver=new ChromeDriver();
                driver.get("http://emojiquiz.win/formpage.html");
                
             driver.manage().window().maximize();
              driver.findElement(By.id("name")).sendKeys("iqra akhtar");
  driver.findElement(By.id("email")).sendKeys("iqra.akhtar789@yahoo.com");
    driver.findElement(By.id("message")).sendKeys("heelo dear");
//                driver.findElement(By.id("login-signin")).click();
//                
     driver.findElement(By.xpath("//*[@id=\"reused_form\"]/div[4]/button")).click();
//            //*[@id="app"]/div[1]/div/div[1]/nav/div/div[1]/a
//            driver.findElement(By.id("message-to-field")).sendKeys("anumhussain19@gmail.com");
//              driver.findElement(By.id("rte")).sendKeys("hello friend");
            
	}
}