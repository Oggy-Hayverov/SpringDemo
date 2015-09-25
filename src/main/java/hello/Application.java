package hello;
import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication //adds annotations: @EnableAutoConfiguration,@EnableWebMvc for a Web app
//adds component DispatchServlet @ComponentScan scans for other components, configs services etc
//in the specified package in this case hello package, allowing to find HelloContoller
public class Application {

	public static void main (String [] args)
	{
//SpringApplication.run() launches the app	
		//run() returns ApplicationContext and it retrieves all beans user defined or auto added
ApplicationContext ctx=SpringApplication.run(Application.class,  args);
		System.out.println("Let's inspect the beans provided by Spring Boot");
		
		String [] beanNames=ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		
		for (String beanName :beanNames)
		{
			System.out.println(beanName);
		}
	}
}
