package dubbo.service.impl;

import dubbo.service.HelloService;
import org.apache.dubbo.config.annotation.DubboService;


// 指定注册中心id，dubbo 2.0版本是@Service，3.0改为了@DubboService，这个注解用于对外发布服务的
// 为了开启数据库的事务控制，这里改为使用cglib动态代理的方式，而这种方式会继承我们的实现类，所以我们要指定发布的是interfaceClass = HelloService.class
// todo:后续测试：有帖子说springboot2 默认开启的就是cglib的代理方式
@DubboService(registry ="zk-registry",interfaceClass = HelloService.class)
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "hello:"+name ;
    }
}
