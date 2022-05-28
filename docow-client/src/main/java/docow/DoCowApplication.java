package docow;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

import java.io.IOException;

@SpringBootApplication
@ServletComponentScan
@EnableAsync
public class DoCowApplication {

    public static void main(String[] args) throws IOException {

        new SpringApplicationBuilder(DoCowApplication.class)
                .logStartupInfo(false)
                .bannerMode(Banner.Mode.OFF)
                .run(args);
//        try {
//            SpringApplication.run(DoCowApplication.class, args);
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }

    }

}
