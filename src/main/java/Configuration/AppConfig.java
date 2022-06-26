package Configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
@ComponentScan(basePackages = {"AuxilaryClass","Configuration","Controllers"})
@EnableWebMvc
public class AppConfig implements WebMvcConfigurer {


}
