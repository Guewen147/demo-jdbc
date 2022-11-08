package fr.diginamic.props;

import java.util.Enumeration;
import java.util.ResourceBundle;


public class TestConfigurationProps {
	
	public static void main(String[] args) {
		
		ResourceBundle config = ResourceBundle.getBundle("data");
		String valeur1=config.getString("valeur1");
		System.out.println(valeur1);
		
		config.getKeys();
		Enumeration<String> enum1=config.getKeys();
		while (enum1.hasMoreElements()) {
			String key= enum1.nextElement();
			String val=config.getString(key);
			System.out.println(key+" "+val);
			
		}
		
	}

}


