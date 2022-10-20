package dubbo.controller;

import dubbo.service.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController// 这是把返回的字符串等直接响应给前端，不会跳转html
@RequestMapping("/demo")
public class HellloController {
    @DubboReference(registry ="zk-registry")// 从指定的注册中心引用提供者发布的服务
    HelloService helloService;

    @RequestMapping("/hello")
    public String hello(  String name){// 这里省略了@RequestParam
        // 调用HelloService中的sayHello方法
        String result =helloService.sayHello(name);
        return result;

    }
}
