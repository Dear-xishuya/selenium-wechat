package com.hogwarts.web.resolver;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;

/**
 * @author fyh
 * @date 2020/11/12
 * @desc
 */
public class ChromeParameterResolver extends BaseParameterResolver {

	@Override
	public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
		return "chrome";
	}
}
