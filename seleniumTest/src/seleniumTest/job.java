package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class job {

	public void login(WebDriver driver) {
		
		

		// ��ͨLogin-51job.com----------------------------------------------------------------
		driver.get("https://login.51job.com/login.php?lang=c");
		System.out.println(driver.getTitle());
//		driver.findElement(By.linkText("��ҳ")).click();
		driver.findElement(By.partialLinkText("��ҳ")).click();
		// ��������� ��С---------------------
		/*
		 * maximize() ������������ setSize() ������������
		 */
		driver.manage().window().maximize();// ������������
	//	driver.manage().window().
		// driver.manage().window().setSize(new Dimension(480, 800));�����������С
		// driver.findElement(By.linkText("��¼")).click();

		// ��������أ���ǰ��ˢ��--------------
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		// Login ���� ���ֶ�λ��ʽ------------
		// driver.findElement(By.linkText("��¼")).click();�����ı���ʽ
		// driver.findElement(By.partialLinkText("��ҳ")).click(); ģ�������ı���ʽ
		// driver.findElement(By.id("loginname")).click();id��ʽ
		// driver.findElement(By.className("ef")).click();class��ʽ
		// driver.findElement(By.name("loginname")).click();name��ʽ
		// driver.findElement(By.tagName("input")).sendKeys("13437868119");tag
		// driver.findElement(By.xpath("//*[@id=\"loginname\"]")).sendKeys("13437868119");Xpath
		// ��λ
		driver.findElement(By.cssSelector("#loginname")).sendKeys("13437868119");
		// driver.findElement(By.id("loginname")).sendKeys("13437868119");
		driver.findElement(By.id("password")).sendKeys("zxcvbnm123");
		driver.findElement(By.className("p_but")).click();
		String txtString = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[3]/ul/li[1]/a")).getText()
				.toString();
		System.out.println("-----------------" + txtString);
		if (txtString.equals("��ӭ��")) {
			System.out.println("��ӭ��½����¼�ɹ���");
		} else {
			System.out.println("�Բ��𣬵�¼ʧ��");
		}
		// ��ͨLogin

		// ��ͨLogin-51job.com----------------------------------------------------------------

		// �����ص�div ֱ����JavascriptExecutorִ�оͺ�
		/*
		 * Actions action=new Actions(driver); WebElement
		 * welcome=driver.findElement(By.xpath(
		 * "/html/body/div[1]/div[1]/div/div[3]/ul/li[1]/a"));
		 * action.moveToElement(welcome).perform();
		 */
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement changePage = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[3]/ul/li[3]/a"));
		js.executeScript("arguments[0].click();", changePage);
		String nString = driver.findElement(By.xpath("/html/body/div[2]/div[1]/a[2]")).getAttribute("class");
		if (nString.equals("on")) {
			System.out.println("�ɹ������ؽ�����������ת");
		} else {
			System.out.println("���ؽ�����תʧ��");
		}
		WebElement LoginOut = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[3]/ul/li[6]/a"));
		js.executeScript("arguments[0].click();", LoginOut);

		// �����ص�div ֱ����JavascriptExecutorִ�оͺ�

		// ����divʽ��¼
		driver.get("https://www.51job.com/");
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div[3]/span[1]")).click();
		WebElement lowdown = driver.findElement(By.xpath("//*[@id=\"login_form\"]/p[2]/span"));

		js.executeScript("arguments[0].click();", lowdown);
		// ��ʾ��壬����ʾ�Ļ��ᱨ element not interactable ���ܽ����Ĵ���
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div[3]/span[1]")).click();

		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		// ����input�����Ըı���ٽ��в���
		String inputName = "document.getElementById('loginname').setAttribute('value', 'text')";
		js.executeScript(inputName);
		// driver.findElement(By.id("loginname")).sendKeys("13437868119");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		String inputpassword = "document.getElementById('password').setAttribute('type', 'text')";
		js.executeScript(inputpassword);
		driver.findElement(By.id("password")).sendKeys("zxcvbnm123");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		// ������ѡ�����
		driver.findElement(By.id("isread")).click();
		/*
		 * String checkoutoLogin = "document.getElementById('isread').click()";
		 * js.executeScript(checkoutoLogin);
		 */
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		// button�����ӵĲ���
		driver.findElement(By.id("login_btn")).click();
		// js������ѡ��
		/*
		 * WebElement webbutton=driver.findElement(By.id("login_btn"));
		 * js.executeScript("arguments[0].click();", webbutton);
		 */

		// driver.quit();

	}
}
