import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JavaScript");
        curso2.setDescricao("descrição curso Javascript");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao ("descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCarol = new Dev();
        devCarol.setNome("Carol");
        devCarol.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Carol:" + devCarol.getConteudosInscritos());
        devCarol.progredir();
        devCarol.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Carol:" + devCarol.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Carol:" + devCarol.getConteudosConcluidos());
        System.out.println("XP:" + devCarol.calcularTotalXp());

        System.out.println("-------");

        Dev devJeferson = new Dev();
        devJeferson.setNome("Jeferson");
        devJeferson.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Jeferson:" + devJeferson.getConteudosInscritos());
        devJeferson.progredir();
        devJeferson.progredir();
        devJeferson.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Jeferson:" + devJeferson.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Jeferson:" + devJeferson.getConteudosConcluidos());
        System.out.println("XP:" + devJeferson.calcularTotalXp());

    }
}
