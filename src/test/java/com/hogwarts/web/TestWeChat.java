package com.hogwarts.web;

import com.hogwarts.web.annotation.CsvToMember;
import com.hogwarts.web.model.Member;
import com.hogwarts.web.page.LoginPage;
import com.hogwarts.web.resolver.ChromeParameterResolver;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

/**
 * @author fyh
 * @date 2020/11/12
 * @desc 测试企业微信
 */
@ExtendWith(ChromeParameterResolver.class)
public class TestWeChat extends BaseTest {

	@ParameterizedTest
	@CsvFileSource(files = "data/testdata/wechat.csv", numLinesToSkip = 1)
	public void testAddMember(@CsvToMember Member member){
		WebDriver driver = getDriver();
		try {
			// 添加用户
			LoginPage loginPage = new LoginPage(driver);
			loginPage.login().contact().toMemberPage().addMember(member);
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}

}
