package browserlaunch;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	public static WebDriver driver;
	public static FileInputStream fis;
	public static String ProjectPath=System.getProperty("user.dir");
	public static Properties p;
	public static Properties mainprop;
	public static Properties subprop;
	public static void inhit() throws Exception {
	fis=new FileInputStream(ProjectPath+"//data.properties//");
	p=new Properties();
	p.load(fis);
	fis=new FileInputStream(ProjectPath+"//environment.properties");
	mainprop=new Properties();
	mainprop.load(fis);
	String e=mainprop.getProperty("env");
	System.out.println(e);
	fis=new FileInputStream(ProjectPath+"//"+e+".properties");
	subprop=new Properties();
	subprop.load(fis);
	String val=subprop.getProperty("amazonurl");
	System.out.println(val);
	
	}
	public static void browserlaunch(String browser) {
		if(p.getProperty(browser).equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",ProjectPath +"//drivers//chromedriver.exe");
		driver=new ChromeDriver();}
		else if(p.getProperty(browser).equals("firefox")){
			System.setProperty("webdriver.gecko.driver", ProjectPath+"//drivers//geckodriver.exe");
			driver=new FirefoxDriver();
	}}
	public static void launchurl(String url) {
		//driver.get(subprop.getProperty(url));
		driver.navigate().to(subprop.getProperty(url));
	}
}