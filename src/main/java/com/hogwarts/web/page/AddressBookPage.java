package com.hogwarts.web.page;

import com.hogwarts.web.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author fyh
 * @date 2020/11/12
 * @desc 通讯录管理页面
 */
public class AddressBookPage extends BasePage {

	@FindBy(linkText = "selenium实战")
	private WebElement childDept;

	@FindBy(linkText = "添加成员")
	private WebElement addMemberButton;


	public AddressBookPage(WebDriver driver) {
		super(driver);
	}

	/**
	 * 切换到selenium实战的子部门下
	 */
	public void clickDept(){
		click(childDept);
	}

	/**
	 * 点击添加成员按钮
	 */
	public void clickAddMemberButton(){
		click(addMemberButton);
	}
}
