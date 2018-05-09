package main;
public class Plugin implements Action {

	@Override
	public String execute() {
		String str = "Sample Action Success!";
		return str;
	}

}
