/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: HelloWorldController
 * Author:   淡无心
 * Date:     2019/4/25 10:12
 * Description: 控制器
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.explme.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 〈一句话功能简述〉<br> 
 * 〈控制器〉
 *
 * @author 淡无心
 * @create 2019/4/25
 * @since 1.0.0
 */
@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping("/say")
    public  String say(Model model){
        model.addAttribute("name","张三");
        model.addAttribute("url","http://www.cnblogs.com/wormday/p/8435617.html"); // 指定Model的值
        return "say";
    }

}