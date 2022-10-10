package tech.devinhouse.excecoes;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TesteExcecoes {

    public static void main(String[] args) throws IOException {
        System.out.println("começou metodo main");
//        testarUnchecked();
//        testarChecked();

        try {
            testeMinhaExcecao();
            System.out.println("Passei sem dar excecao");
        } catch (GarfieldException e) {
            System.out.println( e.getMessage() );
            e.printStackTrace();
        } finally {
            System.out.println("vai ser executado de qualquer jeito");
        }

        System.out.println("Fim do pograma");
    }

    // RuntTimeException
    private static void testarUnchecked() {
        try {
            String nada = null;
            nada.toUpperCase();  // NullPointerException
        } catch (RuntimeException e) {
            System.out.println("Deu null pointer exception");
        }

//        int a = 7, b = 0;
//        int c = a / b;  // ArithmeticException
    }

    // Exception
    private static void testarChecked() {
        Path path = Paths.get("arquivotestes.txt");
        try {
            Files.createFile(path);  // pode lançar IOException
            throw new FileNotFoundException();
        } catch (FileNotFoundException | FileAlreadyExistsException e) {
            // faz alguma coisa aqui
            System.out.println("arquivo nao existe!!!");
        } catch (IOException e) {
            System.out.println("Deu IOException");
            e.getMessage();
//            e.printStackTrace();
        }
    }

    public static void testeMinhaExcecao() throws GarfieldException {
        System.out.println("dentro do metodo minha excecao");
        throw new GarfieldException(); // codigo que lancaria esta excecao
    }

}
