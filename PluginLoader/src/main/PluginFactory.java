package main;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class PluginFactory {
	static Action getPlugin(String pluginPath) throws MalformedURLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		File jarFile = new File(pluginPath);
		
		ClassLoader loader = URLClassLoader.newInstance(new URL[] {jarFile.toURI().toURL()});
		Action a = (Action)loader.loadClass("main.Plugin").newInstance();
		return a;
	}
}
