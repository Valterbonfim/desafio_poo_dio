import java.time.LocalDate;

import dio_dominio.Curso;
import dio_dominio.Mentoria;

public class Main {

    public static void main(String[] args) {

            Curso curso1 = new Curso();
            curso1.setTitulo("Curso Java");
            curso1.setDescricao("Indrotução ao Curso Java");
            curso1.setCargaHoraria(8);

            Curso curso2 = new Curso();
            curso2.setTitulo("Curso Java");
            curso2.setDescricao("Indrotução ao Curso Javascript");
            curso2.setCargaHoraria(5);

            Mentoria mentoria = new Mentoria();
            mentoria.setTitulo("Mentoria de Java");
            mentoria.setDescricao("Descrição Mentoria Java");
            mentoria.setData(LocalDate.now());

       
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }   
    
}