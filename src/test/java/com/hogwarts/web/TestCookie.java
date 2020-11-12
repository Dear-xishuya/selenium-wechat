package com.hogwarts.web;

import com.hogwarts.web.page.LoginPage;
import com.hogwarts.web.resolver.ChromeParameterResolver;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.io.IOException;

/**
 * @author fyh
 * @date 2020/11/12
 * @desc
 */
@ExtendWith(ChromeParameterResolver.class)
public class TestCookie extends BaseTest {


	@Test
	public void testGenerateCookie(){
		LoginPage loginPage = new LoginPage(getDriver());
		try {
			loginPage.generateLoginCookie();
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}

	}
}
