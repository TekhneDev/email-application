package model; //Na aula o package é emailapp

public class App { // Na aula Class é EmailApp

    public static void main(String[] args) throws Exception {
        Email em1 = new Email("Carla", "Braga");
        System.out.println(em1.showInfo());

    }
}
