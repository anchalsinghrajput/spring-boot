package infosys_traning.dependency_injection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Customer c =  (Customer) context.getBean("cust"); 
        System.out.println("id : " +c.getId());
        System.out.println("name : " +c.getName());
        System.out.println("email : " +c.getEmail());
    }
}