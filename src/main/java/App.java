import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");

        // Bean equals bean2 ?
        String result1 = (bean1 == bean2) ? "Переменные (bean1 & bean2) ссылаются на один и тот же объект!" :
                                            "Переменные (bean1 & bean2) ссылаются на разные объекты!";

        // Create cat bean
        Cat cat1 = (Cat) applicationContext.getBean("cat");
        Cat cat2 = (Cat) applicationContext.getBean("cat");
        String result2 = (cat1 == cat2) ? "Переменные (cat1 & cat2) ссылаются на один и тот же объект!" :
                                          "Переменные (cat1 & cat2) ссылаются на разные объекты!";

        System.out.println(result1);
        System.out.println(result2);

    }
}