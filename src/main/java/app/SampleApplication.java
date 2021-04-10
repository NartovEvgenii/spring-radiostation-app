package app;

import app.config.ApplicationConfig;
import app.repository.OrderRepository;
import app.service.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
        basePackageClasses = {OrderRepository.class,
                ApplicationConfig.class,
                OrderService.class})
public class SampleApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SampleApplication.class);
    }

}
