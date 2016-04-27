package br.com.cidade.lazystack;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.http.MediaType;

@Configuration
public class RestRepositoryConfig extends RepositoryRestConfigurerAdapter {
	@Override
	  public void configureRepositoryRestConfiguration(RepositoryRestConfiguration configuration) {
	    configuration.setBasePath("/rest");
	    configuration.setDefaultMediaType(MediaType.APPLICATION_JSON);
	    configuration.setEnableEnumTranslation(true);
	    configuration.setDefaultPageSize(100);
	    configuration.isEnableEnumTranslation();
	  }
}
