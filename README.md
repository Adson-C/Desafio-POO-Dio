# Desafio POO DIO - Bootcamp Banco PAN # Java Spring Boot

## Bootcamp Java: Gerenciador de Conteúdos e Desempenho de Desenvolvedores

Este projeto é um sistema de gerenciamento para um bootcamp, que organiza conteúdos e acompanha o progresso de desenvolvedores inscritos. Ele foi desenvolvido em Java, utilizando conceitos de POO (Programação Orientada a Objetos) como herança, polimorfismo e encapsulamento.

## Funcionalidades Principais

### 1. **Bootcamp**
- **Atributos**:
    - Nome e descrição.
    - Data de início (atual) e data de fim (45 dias após o início).
    - Conjunto de conteúdos oferecidos.
    - Conjunto de desenvolvedores inscritos.
- **Métodos**:
    - Gerenciar conteúdos do bootcamp.
    - Controlar inscrições de desenvolvedores.

### 2. **Conteúdo**
- **Classe abstrata** que define o padrão para os tipos de conteúdos oferecidos no bootcamp.
- **Atributos**: Título e descrição.
- **Método abstrato**:
    - `calcularXp()`: Retorna a quantidade de experiência (XP) obtida ao concluir o conteúdo.

### 3. **Curso**
- Especialização da classe `Conteudo`.
- **Atributos**: Carga horária.
- **Método sobrescrito**:
    - `calcularXp()`: Calcula a experiência com base na carga horária e no XP padrão.

### 4. **Dev** (Desenvolvedor)
- **Atributos**:
    - Nome do desenvolvedor.
    - Conjuntos de conteúdos inscritos e concluídos.
- **Métodos**:
    - `inscreverBootcamp(Bootcamp bootcamp)`: Inscreve o desenvolvedor em um bootcamp.
    - `progredir()`: Marca o próximo conteúdo como concluído.
    - `calcularTotalXp()`: Retorna o XP total acumulado com base nos conteúdos concluídos.

## Estrutura do Projeto

- **Pacote**: `org.example.dominio`
- **Classes**:
    - `Bootcamp`: Gerencia os conteúdos e desenvolvedores inscritos.
    - `Conteudo`: Classe base abstrata para definir conteúdos.
    - `Curso`: Representa conteúdos do tipo curso.
    - `Dev`: Gerencia os desenvolvedores e seu progresso.

## Exemplo de Uso

```java
Bootcamp bootcamp = new Bootcamp();
bootcamp.setNome("Java Bootcamp");
bootcamp.setDescricao("Aprenda Java do básico ao avançado.");

Curso curso1 = new Curso();
curso1.setTitulo("Introdução ao Java");
curso1.setDescricao("Curso introdutório de Java.");
curso1.setCargaHoraria(10);

bootcamp.getConteudos().add(curso1);

Dev dev = new Dev();
dev.setNome("Maria");
dev.inscreverBootcamp(bootcamp);
dev.progredir();

System.out.println("XP total: " + dev.calcularTotalXp());
```

## Tecnologias Utilizadas

- Linguagem: **Java**
- Paradigma: Programação Orientada a Objetos (POO)

## Como Executar
1. Clone este repositório.
2. Importe o projeto em sua IDE favorita (IntelliJ, Eclipse, etc.).
3. Compile e execute os arquivos de exemplo para validar as funcionalidades.

## Contribuições
Sinta-se à vontade para contribuir com melhorias, novos tipos de conteúdos ou funcionalidades adicionais!

---
**Autor**: [Adson Sa]


