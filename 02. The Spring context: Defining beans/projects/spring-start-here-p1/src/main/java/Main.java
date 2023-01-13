import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import test.Parrot;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var context  = new AnnotationConfigApplicationContext(ProjectConfig.class);
        /*
        Parrot p = context.getBean(Parrot.class);
        System.out.println(p);

        System.out.println(p.getName());

         */

        /*
        test.Parrot p = context.getBean("parrot1", test.Parrot.class);
        System.out.println(p.getName());


        String s = context.getBean(String.class);
        System.out.println(s);


        Integer n = context.getBean(Integer.class);
        System.out.println(n);


        test.Parrot p2 = context.getBean("parrot2", test.Parrot.class);
        System.out.println("test.Parrot 2: " + p2.getName());

         */




        Parrot x = new Parrot();
        x.setName("Kiki");

        Supplier<Parrot> parrotSupplier = () -> x;
        context.registerBean("kiki", Parrot.class, parrotSupplier);

        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());
    }
}
