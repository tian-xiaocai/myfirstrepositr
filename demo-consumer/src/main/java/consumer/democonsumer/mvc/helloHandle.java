package consumer.democonsumer.mvc;

import com.alibaba.dubbo.config.annotation.Reference;
import demoprovider.demoprovider.dao.hello;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloHandle {
    @Reference
    hello dao;
    @RequestMapping("/hello")
    @ResponseBody
    public String Hellomvc(){
        String sayHello = dao.sayHello("fisttime");
        return sayHello+ "              啦啦啦，成功啦！";
    }
}
