package Stack_Operation_Collection;

public class MainClass {

	public static void main(String[] args) {

		ScenarioWebBrowser web = new ScenarioWebBrowser();

		System.out.println(web.getCurrentPage());

		web.addPage("Amazon Management Console Signin Page");
		web.addPage("Amazon management console");
		web.addPage("Ec2 Management Console");
		web.addPage("Launch Instance");
		web.addPage("Ec2 Instance Connect");
		
		web.previousPage();
		web.previousPage();
		web.previousPage();
		
		web.nextPage();
		web.nextPage();
		web.nextPage();
//		web.nextPage();
		
		web.deleteHistory();
		
		System.out.println(web.getCurrentPage());

	}
}
