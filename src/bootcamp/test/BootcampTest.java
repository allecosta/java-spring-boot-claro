package bootcamp.test;

import bootcamp.main.Bootcamp;
import bootcamp.main.Course;
import bootcamp.main.Dev;
import bootcamp.main.Mentoring;

import java.time.LocalDate;

public class BootcampTest {
    public static void main(String[] args) {
        Course course01 = new Course();
        course01.setTitle("Java Básico");
        course01.setDescription("Curso de Introdução ao Mundo Java");
        course01.setHourLoad(10);

        Course course02 = new Course();
        course02.setTitle("Kotlin For Mobile");
        course02.setDescription("Introdução ao mundo Mobile");
        course02.setHourLoad(6);

        Mentoring mentoring = new Mentoring();
        mentoring.setTitle("Mentoria Java");
        mentoring.setDescription("Reescrevendo o código fonte do mundo");
        mentoring.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Java Developer");
        bootcamp.setDescription("Bootcamp para desenvolvedores Java");
        bootcamp.getContent().add(course01);
        bootcamp.getContent().add(course02);
        bootcamp.getContent().add(mentoring);

        Dev devJM = new Dev();
        devJM.setName("Jose Maria");
        devJM.registerBootcamp(bootcamp);
        
        System.out.println(devJM.getName() + ", conteúdo inscrito: " + devJM.getContentSubscribed());

        devJM.progress();
        devJM.progress();

        System.out.println("--");
        System.out.println(devJM.getName() + ", conteúdo inscrito: " + devJM.getContentSubscribed());
        System.out.println(devJM.getName() + ", conteúdo inscrito: " + devJM.getContentFinale());
        System.out.println("XP: " + devJM.calculateTotalXP());

        System.out.println("- - - - - - - -");

        Dev devRM = new Dev();
        devRM.setName("Rosa Maria");
        devRM.registerBootcamp(bootcamp);

        System.out.println(devRM.getName() + ", conteúdo inscrito: " + devRM.getContentSubscribed());

        devRM.progress();
        devRM.progress();
        devRM.progress();

        System.out.println("--");
        //System.out.println(devRM.getName() + ", conteúdo inscrito: " + devRM.getContentSubscribed());
        System.out.println(devRM.getName() + ", conteúdo inscrito: " + devRM.getContentFinale());
        System.out.println("XP: " + devRM.calculateTotalXP());

    }
}
