package pl.project.config;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class Application extends SpringBootServletInitializer {

    public static void main(final String[] args) {
        new SpringApplicationBuilder(Application.class).run(args);
    }

}