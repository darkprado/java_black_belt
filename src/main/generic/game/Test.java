package main.generic.game;

/**
 * @author s.melekhin
 * @since 03 дек. 2021 г.
 */
public class Test {

    public static void main(String[] args) {

        Schoolchild schoolchild1 = new Schoolchild("Ivan", 13);
        Schoolchild schoolchild2 = new Schoolchild("Mariya", 15);

        Student student1 = new Student("Oleg", 22);
        Student student2 = new Student("Elena", 21);

        Employer employer1 = new Employer("Dmitriy", 45);
        Employer employer2 = new Employer("Ekaterina", 33);

        Team<Schoolchild> schoolTeam = new Team<>("School Dragon");
        schoolTeam.addNewParticipant(schoolchild1);
        schoolTeam.addNewParticipant(schoolchild2);

        Team<Student> studentTeam = new Team<>("Student Dragon");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Employer> employerTeam = new Team<>("Employer Dragon");
        employerTeam.addNewParticipant(employer1);
        employerTeam.addNewParticipant(employer2);

        Team<Schoolchild> schoolTeam2 = new Team<>("School Dragon 2");
        schoolTeam2.addNewParticipant(schoolchild1);
        schoolTeam2.addNewParticipant(schoolchild2);

        schoolTeam.playWith(schoolTeam2);

    }

}
