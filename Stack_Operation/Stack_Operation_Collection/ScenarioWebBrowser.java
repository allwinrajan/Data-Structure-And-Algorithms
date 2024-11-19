package Stack_Operation_Collection;

import java.util.Stack;

public class ScenarioWebBrowser {

	Stack<String> backwardStack;
	Stack<String> forwardStack;
	public String currentpage;

	public ScenarioWebBrowser() {
		backwardStack = new Stack<String>();
		forwardStack = new Stack<String>();
		currentpage = "HomePage";
	}

	public void addPage(String page) {
		backwardStack.push(currentpage);
		currentpage = page;
		forwardStack.clear();
	}

	public String getCurrentPage() {
		return "The Current Page is: " + currentpage;
	}

	public void previousPage() {
		if (!backwardStack.isEmpty()) {
			forwardStack.push(currentpage);
			currentpage = backwardStack.pop();
		} else {
			System.out.println("Page Already in HomePage");
		}
	}

	public void nextPage() {
		if (!forwardStack.isEmpty()) {
			backwardStack.push(currentpage);
			currentpage = forwardStack.pop();
		} else {
			System.out.println("You reached last page");
		}
	}

	public void deleteHistory() {
		backwardStack = null;
		forwardStack = null;
		System.out.println("Histroy is deleted");
	}
}
