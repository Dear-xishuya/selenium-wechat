package com.hogwarts.web.resolver;

import com.hogwarts.web.model.Browser;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;

/**
 * @author fyh
 * @date 2020/11/12
 * @desc Firefox浏览器
 */
public class FirefoxParameterResolver extends BaseBrowserParameterResolver {

	@Override
	public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
		return new Browser("firefox");
	}
}
