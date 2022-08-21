import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JS");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
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

        Dev devLeo = new Dev();
        devLeo.setNome("Leonardo");
        devLeo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + devLeo.getConteudosInscritos());
        devLeo.progredir();
        System.out.println("Conteúdos Concluídos: " + devLeo.getConteudoConcluidos());
        System.out.println("Conteúdos Inscritos: " + devLeo.getConteudosInscritos());
        System.out.println("XP: " + devLeo.calcularXp());

        System.out.println("------");

        Dev devDuda = new Dev();
        devDuda.setNome("Eduarda");
        devDuda.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + devDuda.getConteudosInscritos());
        devDuda.progredir();
        devDuda.progredir();
        devDuda.progredir();
        System.out.println("Conteúdos Concluídos: " + devDuda.getConteudoConcluidos());
        System.out.println("Conteúdos Inscritos: " + devDuda.getConteudosInscritos());
        System.out.println("XP: " + devDuda.calcularXp());

    }
}
