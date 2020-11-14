package com.hogwarts.web.page;

import com.hogwarts.web.core.BasePage;
import com.hogwarts.web.model.Member;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.crypto.Cipher;
import java.util.List;

/**
 * @author fyh
 * @date 2020/11/12
 * @desc 添加成员页面
 */
public class AddMemberPage extends BasePage {

	/**
	 * 姓名
	 */
	@FindBy(id = "username")
	private WebElement userName;

	/**
	 * 别名
	 */
	@FindBy(id = "memberAdd_english_name")
	public WebElement englishName;

	/**
	 * 账号
	 */
	@FindBy(id = "memberAdd_acctid")
	public WebElement acctId;

	/**
	 * 性别
	 */
	@FindBy(name = "gender")
	public List<WebElement> genders;

	/**
	 * 手机号
	 */
	@FindBy(id = "memberAdd_phone")
	public WebElement phone;

	/**
	 * 座机号
	 */
	@FindBy(id = "memberAdd_telephone")
	public WebElement telephone;

	/**
	 * 邮箱
	 */
	@FindBy(id = "memberAdd_mail")
	public WebElement mail;

	/**
	 * 地址
	 */
	@FindBy(id = "memberEdit_address")
	public WebElement address;

	/**
	 * 职务
	 */
	@FindBy(id = "memberAdd_title")
	public WebElement title;

	/**
	 * 身份
	 */
	@FindBy(name = "identity_stat")
	public List<WebElement> identityStats;

	/**
	 * 职务
	 */
	@FindBy(name = "extern_position_set")
	public List<WebElement> externPositionSets;

	/**
	 * 是否需要发送邮件或短信  默认发送
	 */
	@FindBy(name = "sendInvite")
	public WebElement sendInvite;

	@FindBy(linkText = "保存")
	public WebElement saveBtn;

	public AddMemberPage(WebDriver driver) {
		super(driver);
	}

	/**
	 * 添加成员
	 * @param member 成员类
	 */
	public void addMember(Member member){
		// 输入信息
		inputText(userName, member.getUserName());
		inputText(englishName, member.getEnglishName());
		inputText(acctId, member.getAcctId());
		inputText(phone, member.getPhone());
		inputText(telephone, member.getTelephone());
		inputText(mail, member.getMail());
		inputText(address, member.getAddress());
		inputText(title, member.getTitle());

		// 点击保存按钮
		click(saveBtn, true);
	}
}
