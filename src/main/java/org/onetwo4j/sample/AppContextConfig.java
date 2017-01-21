package org.onetwo4j.sample;

import org.onetwo.boot.module.security.config.EnableCommonSecurity;
import org.onetwo.common.db.BaseEntityManager;
import org.onetwo4j.sample.utils.DefaultWebSecurityConfigurerAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCommonSecurity
public class AppContextConfig {
	@Autowired
	private BaseEntityManager baseEntityManager;
	
	public AppContextConfig(){
	}

	@Bean
	public DefaultWebSecurityConfigurerAdapter simpleWebSecurityConfigurerAdapter(){
		return new DefaultWebSecurityConfigurerAdapter();
	}
	
}
