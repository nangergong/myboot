package com.myboot;

/**
 * Created by nanger on 27/04/17.
 */

@RestController
@EnableAutoConfiguration
public class HelloWord {

    @RequestMapping("/hello")
    public String hello() {
        return "Spring boot!";
    }

    //带参数
    @RequestMapping("/word/{name}")
    public String word(@PathVariable String name) {
        return "word--spring boot:" + name;
    }
}