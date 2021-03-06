package ru.mrchebik.client1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;
import ru.mrchebik.client1.service.ExampleService;

/**
 * Created by mrchebik on 26.02.17.
 */
@Configuration
@ComponentScan(basePackages = {"ru.mrchebik.client1"})
public class Config {
    @Bean
    public HttpInvokerProxyFactoryBean exampleService() {
        HttpInvokerProxyFactoryBean proxyFactoryBean = new HttpInvokerProxyFactoryBean();
        proxyFactoryBean.setServiceUrl("http://localhost:8080/example.service");
        proxyFactoryBean.setServiceInterface(ExampleService.class);

        return proxyFactoryBean;
    }
}
