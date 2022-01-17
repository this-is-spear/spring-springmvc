package hello.springmvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by Imaspear on 2022-01-17
 * Blog : https://imspear.tistory.com/
 * Github : https://github.com/Imaspear
 */

@Component
public class LogTest {

    private final Logger log = LoggerFactory.getLogger(getClass());

    public LogTest() {
        logTrace();
        logDebug();
        logInfo();
        logWarn();
        logErr();
    }

    public void logInfo() {
        int a = 5;
        int b = 10;
        System.out.println(a+b);
        log.info("{}", a+b);
        log.info("info 로그가 출력이 됩니다.");
    }

    public void logDebug() {
        log.debug("debug 로그가 출력이 됩니다.");
    }

    public void logTrace() {
        log.trace("trace 로그가 출력이 됩니다.");
    }

    public void logWarn() {
        log.warn("warn 로그가 출력이 됩니다.");
    }

    public void logErr() {
        log.error("error 로그가 출력이 됩니다.");
    }
}
