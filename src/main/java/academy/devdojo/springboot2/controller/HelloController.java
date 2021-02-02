package academy.devdojo.springboot2.controller;

import academy.devdojo.springboot2.util.Components;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("test")
@Log4j2
@AllArgsConstructor
public class HelloController {
    
    @GetMapping(path = "doleo")
    public String exibe(){
        Components components = new Components();
        return components.exibe();
    }

}
