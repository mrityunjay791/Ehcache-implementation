package com.example.conf;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching
@ComponentScan("com.example.*")
public class EhCacheConfiguartion {
	

	@Bean
	public KeyGenerator multiplyKeyGenerator() {
		return (Object target, Method method, Object... params) -> method.getName() + "_" + Arrays.toString(params);
	}
	


    
}