package msacapstoneprojectyyw.common;


import msacapstoneprojectyyw.OrderApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { OrderApplication.class })
public class CucumberSpingConfiguration {
    
}
