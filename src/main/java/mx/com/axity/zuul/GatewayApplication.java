package mx.com.axity.zuul;

import mx.com.axity.zuul.filters.SimpleFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
public class GatewayApplication {

    public static void main(String[] args) {
        //SpringApplication.run(GatewayApplication.class, args);

        ApplicationContext applicationContext = SpringApplication.run(GatewayApplication.class);

    }

    @Bean
    public SimpleFilter simpleFilter() {
        return new SimpleFilter();
    }
}
