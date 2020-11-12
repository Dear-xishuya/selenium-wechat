package com.hogwarts.web;

import com.hogwarts.web.annotation.CsvToMember;
import com.hogwarts.web.model.Member;
import com.hogwarts.web.page.AddMemberPage;
import com.hogwarts.web.page.AddressBookPage;
import com.hogwarts.web.page.HomePage;
import com.hogwarts.web.page.LoginPage;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

/**
 * @author fyh
 * @date 2020/11/12
 * @desc 测试企业微信
 */
public class TestWeChat extends BaseTest {

	private WebDriver driver;

	@ParameterizedTest
	@CsvFileSource(files = "data/testdata/wechat.csv", numLinesToSkip = 1)
	public void testAddMember(@CsvToMember Member member){
		driver = getDriver();
		try {
			// 登录
			LoginPage loginPage = new LoginPage(driver);
			loginPage.login();

			// 点击通讯录按钮，今日通讯录管理页面
			HomePage homePage = new HomePage(driver);
			homePage.clickButton();

			// 进行selenium测试的子部门
			AddressBookPage addressBookPage = new AddressBookPage(driver);
			addressBookPage.clickDept();
			addressBookPage.clickAddMemberButton();

			// 添加成员
			AddMemberPage addMemberPage = new AddMemberPage(driver);
			addMemberPage.addMember(member);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
