package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author evan.m.kim
 */
@Controller
@RequestMapping({"", "/"})
public class MainController {
    @GetMapping("")
    public String index() {
        return "index";
    }
}
