import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloworldBean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld helloworldBean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(helloworldBean1 == helloworldBean2);

        Cat catBean1 = (Cat) applicationContext.getBean("cat");
        Cat catBean2 = (Cat) applicationContext.getBean("cat");
        System.out.println(catBean1 == catBean2);
    }
}