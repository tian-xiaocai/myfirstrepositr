package demoprovider.demoprovider.dao;

import com.alibaba.dubbo.config.annotation.Service;

@Service
public class service implements hello {
    @Override
    public String sayHello(String name) {
        return name+"rpc !";
    }
}
