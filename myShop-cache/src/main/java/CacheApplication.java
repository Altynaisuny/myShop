import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName CacheApplication
 * @Description: TODO
 * @Author messi
 * @Date 2020/4/26
 * @Version V1.0
 **/
@SpringBootApplication
@Configuration
public class CacheApplication {
    public static void main(String[] args) {
        SpringApplication.run(CacheApplication.class, args);
    }
}

