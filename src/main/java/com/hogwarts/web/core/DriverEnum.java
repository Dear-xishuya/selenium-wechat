package com.hogwarts.web.core;

/**
 * @author fyh
 * @date 2020/11/12
 * @desc
 */
public enum DriverEnum {

	CHROME("chrome"),
	FIREFOX("firefox"),
	DEFAULT("chrome");

	private String name;

	public String getName() {
		return name;
	}

	DriverEnum(String name) {
		this.name = name;
	}

	public static DriverEnum getEnum(String browser){
		for (DriverEnum driverEnum : DriverEnum.values()) {
			if (driverEnum.getName().equalsIgnoreCase(browser)) {
				return driverEnum;
			}
		}

		return DEFAULT;
	}
}
