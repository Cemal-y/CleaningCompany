import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.*;

public class HouseApp {
    public static void main(String[] args) {
//        CleaningTool broom = new Broom();
//        CleaningServiceImpl jill = new CleaningServiceImpl();
//        jill.setCleaningTool(broom);
//        jill.clean();

        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

//   //     CleaningService jill = ctx.getBean("jill", CleaningService.class);
//
//        CleaningService bob = ctx.getBean("bob", CleaningService.class);
//
//        CleaningService jane = ctx.getBean("jane", CleaningService.class);
//
//
//     //   jill.clean();
//        bob.clean();
//        jane.clean();

//        CleaningService scott = ctx.getBean("scott", CleaningService.class);
//        scott.clean();
//        scott.clean();
//        scott.clean();

        DomesticService dsc = ctx.getBean("domesticService",DomesticService.class);
        dsc.runHousehold();

    }
}
