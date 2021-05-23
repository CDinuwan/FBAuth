package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FBHome {
    private WebDriver driver;
    public String title=driver.getTitle();

    public FBHome(WebDriver driver) {
        this.driver = driver;
    }
    public void title(){
        System.out.println(title);
    }
}
