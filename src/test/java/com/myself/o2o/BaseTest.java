package com.myself.o2o;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
* @Description:    用来配置spring和junit整合,junit启动时加载springIOC容器
* @Author:         liningbo
* @CreateDate:     2018/8/30 14:46
* @UpdateUser:     liningbo
* @UpdateDate:     2018/8/30 14:46
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件的位置
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class BaseTest {

}
