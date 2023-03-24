package br.alura.renan.apidoc.controller;


import br.alura.renan.apidoc.docs.DataDocRegistry;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctors")
public class DocController {
    @PostMapping
    public void register(@RequestBody DataDocRegistry json) {
        System.out.println(json);
    }
}
