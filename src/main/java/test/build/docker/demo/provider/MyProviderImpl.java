package test.build.docker.demo.provider;

import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author XiongXin
 * @date 2022/7/18
 * @menu
 */
@DubboService
public class MyProviderImpl implements MyProvider {

    @Override
    public String testProvider(){
        return "test";
    }

}
