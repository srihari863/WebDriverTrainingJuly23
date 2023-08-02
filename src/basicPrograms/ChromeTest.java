package basicPrograms;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {

	public static void main(String[] args) {
		//interface obref=new classname();
		WebDriver driver=new ChromeDriver(); //empty chrome browser will launch
        //maximize the window
		driver.manage().window().maximize();
		//open the application url use get("url")
		driver.get("http://facebook.com");
		//fetch the current page titile use getTitle() which returne String
		//datatype variable=objectref.nonstaticreturntypemethod();
		String pgtitle=driver.getTitle();
		System.out.println("Current page title is:"+pgtitle);
		//fetch the current page absolute url using getCurrentUrl()
		String aburl=driver.getCurrentUrl();
		System.out.println("current page absolute url is:"+aburl);
		//fetch the html source code use getPageSource()
		String src=driver.getPageSource();
		//fetch teh current page id use getWindowhandle()
		String pwid=driver.getWindowHandle();
		System.out.println("current window id:"+pwid);
		//fetch the window ids use getWindowHandles() which returns set<String>
		Set<String>handles=driver.getWindowHandles();
		System.out.println("collection values are:"+handles);
		
		driver.close();
	}

}
