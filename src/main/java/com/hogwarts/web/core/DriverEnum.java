package com.hogwarts.web.core;

/**
 * @author fyh
 * @date 2020/11/12
 * @desc
 */
public enum DriverEnum {

	/**
	 * chrome浏览器
	 */
	CHROME("chrome", "chromedriver-86.0.4240.22.exe"),
	/**
	 * firefox浏览器
	 */
	FIREFOX("firefox", "geckodriver-0.28.exe"),

	/**
	 * EDGE浏览器
	 */
	EDGE("edge", "msedgedriver-88.0.696.0.exe"),

	/**
	 * 默认使用chrome浏览器
	 */
	DEFAULT("chrome", "chromedriver-86.0.4240.22.exe");

	private String browserName;

	private String driverVersion;

	public String getBrowserName() {
		return browserName;
	}

	public String getDriverVersion() {
		return driverVersion;
	}

	DriverEnum(String browserName, String driverVersion) {
		this.browserName = browserName;
		this.driverVersion = driverVersion;
	}

	public static DriverEnum getEnum(String browser){
		for (DriverEnum driverEnum : DriverEnum.values()) {
			if (driverEnum.getBrowserName().equalsIgnoreCase(browser)) {
				return driverEnum;
			}
		}

		return DEFAULT;
	}
}
