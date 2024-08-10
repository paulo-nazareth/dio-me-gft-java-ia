package me.dio.web.financeira;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Transacao {

    private char tipo;
    private double valor;
    
}
