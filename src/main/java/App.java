import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorldBean_1 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld helloWorldBean_2 = (HelloWorld) applicationContext.getBean("helloworld");
        Cat catBean_1 = (Cat) applicationContext.getBean("cat");
        Cat catBean_2 = (Cat) applicationContext.getBean("cat");
        System.out.println(helloWorldBean_1.equals(helloWorldBean_2));
        System.out.println(catBean_1.equals(catBean_2));
    }
}