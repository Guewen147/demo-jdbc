package fr.diginamic.xml;

import java.util.Iterator;

import org.apache.commons.configuration2.XMLConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;


public class TestConfigurationXML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configurations configs = new Configurations();
		try {
			XMLConfiguration config = configs.xml("fichier.xml");
			String testLangue1 =config.getString("langue1");
			System.out.println(testLangue1);
			
			config.getKeys();
			Iterator<String> it1=config.getKeys();
			while(it1.hasNext()) {
				String key=it1.next();
				String val=config.getString(key);
				System.out.println(key+" "+val);
			}
		} catch (ConfigurationException e) {
			e.printStackTrace();
		}
	}

}
