package test.spring.boot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ympark on 2016-04-08.
 */
@Controller
public class TestController {

    @RequestMapping("/helloworld")
    public @ResponseBody
    String helloWorldP() {
        return "Hello World!";
    }


    @RequestMapping("/")
    public @ResponseBody
    String helloWorld() {
        return "hello";
    }
}
