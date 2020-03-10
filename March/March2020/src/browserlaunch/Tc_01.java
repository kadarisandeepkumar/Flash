package browserlaunch;

public class Tc_01 extends BaseTest {

	public static void main(String[] args) throws Exception {
		inhit();
		browserlaunch("chromebrowser");
		launchurl("amazonurl");
		driver.manage().window().maximize();
		
		/*
		 * String title = driver.getTitle(); System.out.println(title); String url =
		 * driver.getCurrentUrl(); System.out.println(url);
		 * driver.manage().deleteAllCookies(); driver.navigate().back();
		 * Thread.sleep(30000); driver.navigate().forward(); Thread.sleep(3000);
		 * driver.navigate().refresh(); Thread.sleep(3000);
		 */
		//driver.findElement(By.linkText("KNOW MORE")).click();
		//driver.close();
		//driver.quit();
	}

}
