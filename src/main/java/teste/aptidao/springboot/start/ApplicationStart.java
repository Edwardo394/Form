package teste.aptidao.springboot.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages = "teste.aptidao.springboot") //vai passar por tudo que há em packages e encontrar os componentes do spring caracteriados como controller
public class ApplicationStart {
    public static void main(String[] args) {
       SpringApplication.run(ApplicationStart.class, args); //essa linha identifica que e uma aplicacao que roda springboot
    }
}
