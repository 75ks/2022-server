package com.c4c._2022server.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MessageConfig implements WebMvcConfigurer {
    /**
     * プロパティファイルの設定をする
     * @return messageSource
     */
    private MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        // クラスパスにプロパティファイルを設定
        messageSource.setBasename("classpath:/messages");
        // UTF-8をデフォルトのエンコーディングコードとして設定
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }

    /**
     * バリデーションメッセージの設定をmessageSourceメソッドの内容で上書きする
     * @return localValidatorFactoryBean
     */
    @Bean
    public LocalValidatorFactoryBean validator() {
        LocalValidatorFactoryBean localValidatorFactoryBean = new LocalValidatorFactoryBean();
        localValidatorFactoryBean.setValidationMessageSource(messageSource());
        return localValidatorFactoryBean;
    }

    @Override
    public Validator getValidator() {
        return validator();
    }
}
