package org.tao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.metrics.buffering.BufferingApplicationStartup;

/**
 * 启动程序
 *
 * @author tao
 */

@SpringBootApplication
public class TaoApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(TaoApplication.class);
        application.setApplicationStartup(new BufferingApplicationStartup(2048));
        application.run(args);
        System.out.println("(♥◠‿◠)ﾉﾞ  Tao启动成功   ლ(´ڡ`ლ)ﾞ");
    }

}
