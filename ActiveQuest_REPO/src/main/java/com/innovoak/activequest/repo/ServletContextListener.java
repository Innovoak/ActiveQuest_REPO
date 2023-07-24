package com.innovoak.activequest.repo;

import java.io.IOException;

import javax.servlet.annotation.WebListener;

import com.innovoak.util.webhelpers.data.Configuration;
import com.innovoak.util.webhelpers.data.ConfigurationLoader;
import com.innovoak.util.webhelpers.server.DatabaseContextListener;

@WebListener
public class ServletContextListener extends DatabaseContextListener {
	@Override
	public Configuration getConfiguration() {
		try {
			return ConfigurationLoader.loadFromProperties(this.getClass().getResource("/datasource.properties"));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}
