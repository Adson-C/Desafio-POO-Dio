package org.example;

import org.example.dominio.Bootcamp;
import org.example.dominio.Curso;
import org.example.dominio.Dev;
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

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);
        // criar Bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        // criar Devs
        Dev dev1 = new Dev();
        dev1.setNome("Adson Sr");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Adson: " + dev1.getConteudoEscrito());
        dev1.progredir();
        dev1.progredir();
        System.out.println("====================");
        System.out.println("Conteudos Inscritos Adson: " + dev1.getConteudoEscrito());
        System.out.println("Conteudos Concluidos Adson: " + dev1.getConteudoConcluido());
        System.out.println("XP Total Adson: " + dev1.calcularTotalXp());

        Dev dev2 = new Dev();
        dev2.setNome("John John");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos John John: " + dev2.getConteudoEscrito());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("====================");
        System.out.println("Conteudos Inscritos John John: " + dev2.getConteudoEscrito());
        System.out.println("Conteudos Concluidos John John: " + dev2.getConteudoConcluido());
        System.out.println("XP Total John John: " + dev2.calcularTotalXp());

    }
}