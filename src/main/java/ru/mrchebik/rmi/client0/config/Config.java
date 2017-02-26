package ru.mrchebik.rmi.client0.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;
import ru.mrchebik.rmi.client0.service.ExampleService;

/**
 * Created by mrchebik on 26.02.17.
 */
@Configuration
@ComponentScan("ru.mrchebik.rmi.client0")
public class Config {
    @Bean
    public RmiServiceExporter rmiServiceExporter(ExampleService service) {
        RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
        rmiServiceExporter.setService(service);
        rmiServiceExporter.setServiceName("ExampleService");
        rmiServiceExporter.setServiceInterface(ExampleService.class);
        rmiServiceExporter.setRegistryHost("rmi.example.ru");
        rmiServiceExporter.setRegistryPort(2048);

        return rmiServiceExporter;
    }
}
