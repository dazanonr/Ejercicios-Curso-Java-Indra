package configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import aspect.UtilsAspect;

@Configuration
@ComponentScan("function")
@EnableAspectJAutoProxy
public class AspectConfig {
		@Bean
		public UtilsAspect utilsAspect()
		{
			return new UtilsAspect();
		}
}