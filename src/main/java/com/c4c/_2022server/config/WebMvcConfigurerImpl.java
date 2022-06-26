package com.c4c._2022server.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CommonsRequestLoggingFilter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfigurerImpl implements WebMvcConfigurer {
    @Autowired
    HandlerInterceptorImpl handlerInterceptorImpl;

    /**
     * リクエストログの設定
     * @return filter
     */
    @Bean
    public CommonsRequestLoggingFilter requestLoggingFilter() {
      CommonsRequestLoggingFilter filter = new CommonsRequestLoggingFilter();
      // IPアドレス、HTTPメソッドを設定
      filter.setIncludeClientInfo(true);
      // クエリパラメーターを設定
      filter.setIncludeQueryString(true);
      // リクエストヘッダーを設定
      filter.setIncludeHeaders(true);
      // リクエストボディを設定
      filter.setIncludePayload(true);
      // リクエストボディの表示サイズを設定
      filter.setMaxPayloadLength(1024);
      return filter;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // AuthorizationController以外で共通処理を実行する
        registry.addInterceptor(handlerInterceptorImpl)
                .excludePathPatterns("/authorization/**")
                .excludePathPatterns("/selectOption/**");
    }
}
