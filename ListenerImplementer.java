package listeners;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.google.common.io.Files;

public class ListenerImplementer implements WebDriverEventListener {

	public void afterChangeValueOf(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Inside afterChangeValueOf");
	//	element.sendKeys("ketan");
		System.out.println(element.getAttribute("value"));
		System.out.println(driver.getCurrentUrl());
	
		
	}
	
	
	public void afterClickOn(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Inside afterClickOn");
		
	}

	
	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Inside afterFindBy");
		
	}

	
	public void afterNavigateBack(WebDriver driver) {
		System.out.println(driver.getCurrentUrl());
		// TODO Auto-generated method stub
		
	}

	
	public void afterNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Inside afterNavigateForward");
		
	}

	public void afterNavigateTo(String url, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Inside afterNavigateTo - " + url);
	}

	public void afterScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Inside afterScript");
	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver) {
		element.clear();
		System.out.println("Inside beforeChangeValueOf");
	}

	public void beforeClickOn(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Inside beforeClickOn");
		
	}

	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Inside beforeFindBy");
	}

	public void beforeNavigateBack(WebDriver driver) {
		System.out.println(driver.getCurrentUrl());
		// TODO Auto-generated method stub
		
	}

	public void beforeNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Inside beforeNavigateForward");
	}

	public void beforeNavigateTo(String url, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Inside beforeNavigateTo - " + url);
	}

	public void beforeScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Inside beforeScript");
	}

	public void onException(Throwable exception, WebDriver driver) {
 	    try {
	    	if (driver.getClass().getName().equals("org.openqa.selenium.remote.RemoteWebDriver")) {
	    		driver = new Augmenter().augment(driver);
		    } 
		    File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);//BASE64,BYTE
		    //String filePath = "C:\temp" + DateTime ;
		    Files.copy(scrFile, new File("target/screenshots/error.png"));
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }
	}


	public void beforeAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}


	public void afterAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}


	public void afterAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}


	public void beforeAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}


	public void beforeNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}


	public void afterNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}


	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		
	}


	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		
	}


	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}


	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}


	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		// TODO Auto-generated method stub
		
	}


	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		// TODO Auto-generated method stub
		
	}


	public void beforeGetText(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}


	public void afterGetText(WebElement element, WebDriver driver, String text) {
		// TODO Auto-generated method stub
		
	}

	
}
