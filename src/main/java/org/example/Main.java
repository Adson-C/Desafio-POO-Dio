package org.example;

import org.example.dominio.Curso;
import org.example.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Criar cusrsos
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso de Java");
        curso1.setCargaHoraria(8);
        // curso2 python
        Curso curso2 = new Curso();
        curso2.setTitulo("Python");
        curso2.setDescricao("Curso de Python");
        curso2.setCargaHoraria(5);

        //  Criar Mentoria
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição Mentoria de Java");
        mentoria1.setData(LocalDate.now());


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);

    }
}