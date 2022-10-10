package bibliotecas;

import org.apache.commons.lang3.StringUtils;

public class Teste {

    public static void main(String[] args) {

        String resultado = StringUtils.leftPad("tiago", 10, "0");
        System.out.println(resultado);

    }

}
