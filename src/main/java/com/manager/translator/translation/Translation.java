package com.manager.translator.translation;

import lombok.*;

@Getter
@Setter
@Data
@NoArgsConstructor @AllArgsConstructor
public class Translation {
    private String i18n_key;
    private String translation;
    private String namespace;
    private String language;
}
