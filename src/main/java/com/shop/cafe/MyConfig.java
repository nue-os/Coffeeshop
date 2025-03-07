package com.shop.cafe;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyConfig implements WebMvcConfigurer {
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		WebMvcConfigurer.super.addCorsMappings(registry);
		registry.addMapping("/**") // 모든 URL 매핑
		.allowedOrigins("http://127.0.0.1:5500/") // 허용할 URL
		.allowedMethods("*") // 허용할 HTTP 요청 방식
		.allowedHeaders("*") // 허용할 헤더
		.allowCredentials(true); // 쿠키, 세션 허용
	}
}
