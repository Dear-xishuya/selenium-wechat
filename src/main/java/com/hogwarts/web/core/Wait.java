package com.hogwarts.web.core;

import com.hogwarts.web.config.ConfigPropInfo;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.plugin.javascript.JSClassLoader;

import java.util.function.Function;

/**
 * @author fyh
 * @date 2020/11/11
 * @desc
 */
public class Wait {

	private WebDriver driver;

	private WebDriverWait webDriverWait;

	public Wait(WebDriver driver) {
		this.driver = driver;
		this.webDriverWait = new WebDriverWait(this.driver, ConfigPropInfo.DRIVER_EXPLICIT_WAIT);
	}

	/**
	 * 获取js执行器
	 * @return	js执行器
	 */
	public JavascriptExecutor getJsExecutor() {
		return (JavascriptExecutor) driver;
	}

	/**
	 * 等待页面加载完成
	 */
	public void waitForPageLoad() {
		this.webDriverWait.until(isPageLoaded());
	}

	public Function<WebDriver, Boolean> isPageLoaded(){
		return webDriver -> Boolean.valueOf(getJsExecutor().executeScript("return document.readyState=='complete'").toString());
	}

	/**
	 * 等待元素可见
	 * @param element	元素
	 */
	public void waitElement(WebElement element){
		this.webDriverWait.until(ExpectedConditions.visibilityOf(element));
	}
}
