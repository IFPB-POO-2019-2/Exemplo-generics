package com.ifpb.biblioteca.visao;

import com.ifpb.biblioteca.modelo.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {

        CadastroGenerico<Livro> livros = new CadastroGenerico<>();

    }

    public static <T> void imprimir(T[] array) {
        for (T e : array) {
            System.out.println(e);
        }
    }

}
