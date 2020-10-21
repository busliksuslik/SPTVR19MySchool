/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entity.Person;
import entity.Subject;
import java.util.List;
import java.util.Scanner;
import tools.savers.SaveToFile;

/**
 *
 * @author user
 */
public class SubjectsManager {
    private Scanner scan = new Scanner(System.in);
    private PersonsManager personsManager = new PersonsManager();
    public Subject createSubject(List<Person> persons) {
        System.out.printf("Name: ");
        String name = scan.nextLine();
        System.out.printf("Duration: ");
        int duration = scan.nextInt();
        System.out.printf("Teacher: ");
        Person person = personsManager.getTeacher(persons);
        return new Subject(name, duration, person);
    }

    public void addSubjectToList(Subject subject, List<Subject> list) {
        list.add(subject);
        SaveToFile saver = new SaveToFile();
        saver.saveToFile(list, "subjects");
    }

    public void printList(List<Subject> listS) {
        System.out.println("---------SubjectsList-------------");
        for (int i = 0; i < listS.size(); i++) {
            System.out.printf("%d. %s %d %s %s%n", i+1, listS.get(i).getName(), listS.get(i).getDuration(),listS.get(i).getPerson().getName(),listS.get(i).getPerson().getSecName());
            
        }
        scan.nextLine();
    }
}
