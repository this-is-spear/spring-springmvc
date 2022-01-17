package hello.springmvc;


import hello.springmvc.aop.TimeTraceAop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Imaspear on 2021-10-25
 * Blog : https://imspear.tistory.com/
 * Github : https://github.com/Imaspear
 */

@Configuration
public class SpringConfig {

    @Bean
    public TimeTraceAop timeTraceAop(){
        return new TimeTraceAop();
    }
}
