## 企业微信实战selenium

搭建了一个简易的框架，后期会继续维护

page  存放页面对象的
model 存放实体类的
config 存放读取配置文件的信息
core  存放框架的核心类
aggregate 自定义的聚合类

### 编写步骤

- 定义的页面类必须要基础BasePage类,因为查找元素是基于PageFactory的@FindBy来写的，示例如下：
```java
public class HomePage extends BasePage {

	@FindBy(css = "[node-type='addmember']")
	private WebElement addMemberButton;

	public HomePage(WebDriver driver) {
		super(driver);
	}
}
```

- 编写的测试类需要基础BaseTest,BaseTest中存在driver的初始化方法,默认使用的是chrome浏览器，也可以选择使用firefox浏览器，需要自己传参

- 参数的传递是通过@CsvFileSource来传递，通过自定义聚合类来实现的，csv文件放在data/testdata/目录下
### 注意
- 不管使用chrome还是firefox浏览器，需要提前在电脑上设置环境变量