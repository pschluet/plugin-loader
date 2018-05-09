package main;

import java.net.MalformedURLException;

public class Main {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, MalformedURLException {
		String result = "";
		Action a = PluginFactory.getPlugin("plugins/Plugin.jar");
		result = a.execute();
		System.out.println(result);
	}

}
