package org.onetwo4j.sample;

import org.onetwo.boot.core.EnableJFishBootExtension;
import org.onetwo.boot.core.EnableJFishBootExtension.AppcationType;
import org.onetwo.dbm.spring.EnableDbm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
//@DbmPackages({"org.onetwo4j.sample.model", "org.onetwo4j.sample.dao"})
@EnableDbm
@EnableJFishBootExtension(appcationType=AppcationType.WEB_UI)
public class WebApplicationStarter {
	
	@RequestMapping("/")
	public String home() {
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(WebApplicationStarter.class, args);
    }
}
