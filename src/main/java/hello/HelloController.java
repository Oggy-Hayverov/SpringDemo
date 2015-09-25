package hello;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
 //the following class is flagged as restcontroller meaning it is ready
//for use by spring MVC to handle web requests
@RestController
public class HelloController {
//request mapping maps / to the index() method.
//When invoked from a browser or using curl on the command line, the method returns pure text. 
	//That’s because @RestController combines @Controller and @ResponseBody, 
	//two annotations that results in web requests returning data rather than a view.
	@RequestMapping ("/")
public String index() 
{
return "Greetings from SPRING Boot";	
}
}
