package org.example.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    // Atributos
    // nome, conteudoEscrito, conteudoConcluido
    private String nome;
    private Set<Conteudo> conteudoEscrito = new LinkedHashSet<>();
    private Set<Conteudo> conteudoConcluido = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudoEscrito.addAll(bootcamp.getConteudos());
        bootcamp.getDevsIncritos().add(this);
    }
    public void progredir() {
        Optional<Conteudo> conteudo = conteudoEscrito.stream().findFirst();
        if (conteudo.isPresent()) {
            conteudoConcluido.add(conteudo.get());
            conteudoEscrito.remove(conteudo.get());
        } else {
            System.out.println("O Dev " + nome + " Não está matriculado em nenhum conteúdo!");
        }
    }
    public double calcularTotalXp() {
        return this.conteudoConcluido.stream().mapToDouble(Conteudo::calcularXp).sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoEscrito() {
        return conteudoEscrito;
    }

    public void setConteudoEscrito(Set<Conteudo> conteudoEscrito) {
        this.conteudoEscrito = conteudoEscrito;
    }

    public Set<Conteudo> getConteudoConcluido() {
        return conteudoConcluido;
    }

    public void setConteudoConcluido(Set<Conteudo> conteudoConcluido) {
        this.conteudoConcluido = conteudoConcluido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudoEscrito, dev.conteudoEscrito) && Objects.equals(conteudoConcluido, dev.conteudoConcluido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudoEscrito, conteudoConcluido);
    }
}
