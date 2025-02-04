package TestCase;
import org.testng.annotations.Test;

import pageobjects.AdminDashboardPage;
import pageobjects.AdminLogin;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.MentorDashboardPage;
import pageobjects.MentorList;
import pageobjects.ReferanceMaterials;

public class HomePageTest extends TestBase{
	HomePage HP;
	LoginPage log;
	MentorDashboardPage md;
	ReferanceMaterials rm;
	AdminLogin ad;
	AdminDashboardPage abp;
	MentorList men;
	@Test
	public void config() throws InterruptedException {
		
		HP=new HomePage(driver);
		
		log=new LoginPage(driver);
		md = new MentorDashboardPage(driver);
		rm=new ReferanceMaterials(driver);
		ad=new AdminLogin(driver);
		abp= new AdminDashboardPage(driver);
		men= new  MentorList(driver);
		HP.verifyelement();
		
		
	   // hom.click();
	   // hom.name(prop.getProperty("uname"));
	   // hom.batch();
	  //  hom.email(prop.getProperty("emil"));
	  //  hom.sublink(prop.getProperty("link"));
	   // hom.submit();
		//mentor login
		
        log.setLog();
	    log.setUsername(prop.getProperty("username"));
	    log.setPasswrd(prop.getProperty("password"));
	    log.login();
	    //mentordashboard
	    md.showProject();
	    md.view();
	    rm.viewRef();
	    rm.addRef();
	    rm.delRef();
	    rm.logout();
	    ad.signin();
	    //adminlogin
	    ad.email(prop.getProperty("mail"));
	    ad.passwd(prop.getProperty("pass"));
	    ad.login();
	    //admin dashboard
	    abp.mentors();
	    abp.projects();
	    abp.editproject(prop.getProperty("tedit"));
	    abp.saveproject();
	   /* abp.mentorform();
	    abp.name(prop.getProperty("nme"));
	    abp.mail(prop.getProperty("mal"));
	    abp.phone(prop.getProperty("phn"));
	    abp.paswd(prop.getProperty("psw"));
	    abp.topic(prop.getProperty("pr"));
	    abp.submit();*/
	    //men.mentor();
		/*men.update();
		men.name(prop.getProperty("nname"));
		men.sub();
		men.delet();*/
		men.home();
		men.logout();

	    
	    }
}
