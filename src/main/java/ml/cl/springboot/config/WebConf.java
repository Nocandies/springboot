package ml.cl.springboot.config;


import ml.cl.springboot.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class WebConf implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        String[] addpath = {
                "/boot/**"
        };
        String[] excludepath = {
                "/boot/findstu",
                "/boot/hello"
        };
        // 注册拦截器                                    添加拦截路径                  添加不拦截路径
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns(addpath).excludePathPatterns(excludepath);
    }
}
