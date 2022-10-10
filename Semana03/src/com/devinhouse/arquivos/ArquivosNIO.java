package com.devinhouse.arquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ArquivosNIO {

    public static void main(String[] args) throws IOException {

        // referencia dos arquivos
        Path path1 = Paths.get("arquivos1.txt");
        Path path2 = Paths.get("arquivos2.txt");
//        Paths.get("diretorio");
//        Path diretorioEarquivo = dir.resolve(path);

        // cria se nao existir
        if (Files.notExists(path1)) {
            Files.createFile(path1);
        }
        if (Files.notExists(path2)) {
            Files.createFile(path2);
        }

        // gravar dados nos arquivos
        List<String> nomesStarWars = List.of("Luke Skywalker", "Obi-Wan Kenobi", "Han Solo", "Darth Vader");
        for(String nome: nomesStarWars) {
            nome = nome + "\n";  // quebra de linha
            Files.writeString(path1, nome, StandardOpenOption.APPEND);
//            Files.write(path1, nome.getBytes(), StandardOpenOption.APPEND);
        }
        List<String> nomesStarTrek = List.of("James Kirk", "Spock", "Uhura", "Leonard McCoy", "Montgomery Scott");
        for(String nome: nomesStarTrek) {
            nome = nome + "\n";  // quebra de linha
            Files.writeString(path2, nome, StandardOpenOption.APPEND);
            // Files.write(path, nome.getBytes(), StandardOpenOption.APPEND);
        }

        // lendo arquivos

        List<String> nomesLidosSW = Files.readAllLines(path1);
        List<String> nomesLidosST = Files.readAllLines(path2);

        System.out.println(nomesLidosSW);
        System.out.println(nomesLidosST);

    }

}
