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
public class ContactPage extends BasePage {

	@FindBy(linkText = "selenium实战")
	private WebElement childDept;

	@FindBy(linkText = "添加成员")
	private WebElement addMemberButton;

	public ContactPage(WebDriver driver) {
		super(driver);
	}


	/**
	 * 切换子部门并进入用户添加页面
	 * @return	MemberPage
	 */
	public MemberPage toMemberPage(){
		click(childDept);
		click(addMemberButton);

		return new MemberPage(this.getDriver());
	}
}
