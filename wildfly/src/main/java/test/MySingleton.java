package test;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import java.io.File;
import java.io.IOException;

/**
 * Created by bischofa on 10/05/16.
 */
@Singleton
@Startup
public class MySingleton {
    @PostConstruct
    public void init()  {
        File file = new File(System.getProperty("jboss.home.dir") + "/../../../../postalcodes/test.dat");
        System.out.println(file.exists());
        try (MyMap myMap = new MyMap(file)) {
            System.out.println(myMap.get(1));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
