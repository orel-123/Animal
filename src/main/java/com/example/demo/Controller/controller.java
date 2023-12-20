package com.example.demo.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class controller {

    @GetMapping("/get") public String url() {
        return "Helow Orel";
       }

    @RequestMapping(method = RequestMethod.GET, value = "/geturl")
    public String getAffiliateProgramPolicies(@PathVariable String url){
      return url;
    }

}
