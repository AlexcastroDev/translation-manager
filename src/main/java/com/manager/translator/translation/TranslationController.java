package com.manager.translator.translation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
public class TranslationController {

    @GetMapping(value = "/translations")
    public ArrayList<Translation> getTranslation() {
        return new ArrayList<Translation>();
    }
}