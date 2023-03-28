import java.time.LocalDate;

import dio_dominio.Bootcamp;
import dio_dominio.Curso;
import dio_dominio.Dev;
import dio_dominio.Mentoria;

public class Main {

    public static void main (String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao do Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java");
        curso2.setDescricao("Descricao do Curso Javascript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devValter = new Dev();
        devValter.setNome("Valter Bonfim");
        devValter.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Valter" + devValter.getConteudosInscritos());
       
        devValter.progredir();
        devValter.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Valter" + devValter.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Valter" + devValter.getConteudosConcluidos());
        System.out.println("XP:" + devValter.calcularTotalXP());

        System.out.println("---------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João Silva");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos João" + devJoao.getConteudosInscritos());
       
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos João" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos João" + devValter.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXP());

        
        


        
    }

    
}
