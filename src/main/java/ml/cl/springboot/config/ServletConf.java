package ml.cl.springboot.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;


@Configuration
public class ServletConf {
    /**
     *修改字符集编码
     * 需要修改核心配置文件 application.properties 内 spring.http.encoding.enabled=false
     */
//    @Bean
//    public FilterRegistrationBean filterRegistrationBean (){
//        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
//
//        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
//        characterEncodingFilter.setForceEncoding(true);
//        characterEncodingFilter.setEncoding("UTF-8");
//        filterRegistrationBean.setFilter(characterEncodingFilter);
//        filterRegistrationBean.addUrlPatterns("/*");
//        return filterRegistrationBean;
//    }
}
