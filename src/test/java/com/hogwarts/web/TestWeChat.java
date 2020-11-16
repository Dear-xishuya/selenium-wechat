package com.hogwarts.web;

import com.hogwarts.web.annotation.CsvToMember;
import com.hogwarts.web.model.Member;
import com.hogwarts.web.page.LoginPage;
import com.hogwarts.web.resolver.ChromeParameterResolver;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author fyh
 * @date 2020/11/12
 * @desc 测试企业微信
 */
@ExtendWith(ChromeParameterResolver.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestWeChat extends BaseTest {

	private static WebDriver driver;

	@BeforeAll
	public static void initDriver(){
		driver = getDriver();
	}

	/**
	 * 创建用户
	 * @param member	用户对象
	 */
	@Order(1)
	@ParameterizedTest
	@CsvFileSource(files = "data/testdata/wechat.csv", numLinesToSkip = 1)
	public void testAddMember(@CsvToMember Member member){
		try {
			// 添加用户
			LoginPage loginPage = new LoginPage(driver);
			loginPage.login().contact().addMember(member);
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 创建部门并搜索
	 * @param departName	部门名称
	 */
	@Order(2)
	@ParameterizedTest
	@ValueSource(strings = "定向4期")
	public void testAddDepartAndSearch(String departName){
		try {
			LoginPage loginPage = new LoginPage(driver);
			String departInfo = loginPage.login().contact().addDepart(departName).searchInfo(departName).getDepartInfo();
			assertTrue(departInfo.contains(departName));
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Order(3)
	@ParameterizedTest
	@ValueSource(strings = "定向4期2")
	public void testUpdateDepartName(String newDepartName){
		try {
			LoginPage loginPage = new LoginPage(driver);
			String departInfo = loginPage.login().contact().updateDepartInfo(newDepartName).searchInfo(newDepartName).getDepartInfo();
			assertTrue(departInfo.contains(newDepartName));
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Order(4)
	@Test
	public void testDeleteDepartInfo(){
		try {
			LoginPage loginPage = new LoginPage(driver);
			loginPage.login().contact().deletePartInfo();
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
}
