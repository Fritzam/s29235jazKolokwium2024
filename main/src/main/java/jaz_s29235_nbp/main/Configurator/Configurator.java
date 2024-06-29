package jaz_s29235_nbp.main.Configurator;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Configurator {

    @Bean
    RestTemplate restTemplate() {return new RestTemplate();}
}
