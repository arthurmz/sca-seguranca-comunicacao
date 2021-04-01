package com.sca.seguranca_comunicacao.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

@Controller
@RequestMapping("/")
@ApiIgnore
public class RootRedirectController {
    @GetMapping
    public String swaggerUi() {
        return "redirect:/swagger-ui.html";
    }
}