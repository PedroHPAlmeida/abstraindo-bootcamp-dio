import dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Bootcamp da plataforma DIO");
        bootcamp.getConteudos().add(new Curso("Introdução ao Java", "Conceitos básicos de Java", 2));
        bootcamp.getConteudos().add(new Curso("Java Intermediário", "Conceitos intermediários de Java", 4));
        bootcamp.getConteudos().add(new Mentoria("Com se tornar um programador", "Dicas de carreira", LocalDate.now()));

        Dev dev1 = new Dev();
        dev1.setNome("Pedro");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos incritos de " + dev1.getNome() + ": " + dev1.getConteudosIncritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteúdos incritos de " + dev1.getNome() + ": " + dev1.getConteudosIncritos());
        System.out.println("Conteúdos concluídos de " + dev1.getNome() + ": " + dev1.getConteudosConcluidos());
        System.out.println("XP = " + dev1.calcularXp());

        Dev dev2 = new Dev();
        dev2.setNome("João");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos incritos de " + dev2.getNome() + ": " + dev2.getConteudosIncritos());
        dev2.progredir();
        System.out.println("Conteúdos incritos de " + dev2.getNome() + ": " + dev2.getConteudosIncritos());
        System.out.println("Conteúdos concluídos de " + dev2.getNome() + ": " + dev2.getConteudosConcluidos());
        System.out.println("XP = " + dev2.calcularXp());
    }
}
