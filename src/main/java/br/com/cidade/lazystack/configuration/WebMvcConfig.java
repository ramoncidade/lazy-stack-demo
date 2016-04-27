package br.com.cidade.lazystack.configuration;

import java.nio.charset.Charset;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
/**
 * Configuração para o mvc
 * MVC configuration class
 * @author ramoncidade
 *
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {
	
	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		converters.add(new MappingJackson2HttpMessageConverter());
		converters.add(new StringHttpMessageConverter(Charset.defaultCharset()));
		super.configureMessageConverters(converters);
	}
}
