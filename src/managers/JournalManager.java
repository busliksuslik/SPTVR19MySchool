/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entity.Journal;
import entity.Person;
import entity.Subject;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;
import tools.savers.SaveToFile;

/**
 *
 * @author user
 */
public class JournalManager {
    private Scanner scan = new Scanner(System.in);
    private PersonsManager personManager = new PersonsManager();
    private SubjectsManager subjectManager = new SubjectsManager();
    public Journal createJournal(List<Person> persons, List<Subject> subjects) {
        System.out.printf("Select student: ");
        Person student = personManager.getStudent(persons);
        System.out.printf("Select subject: ");
        Subject subject = subjectManager.getSubject(subjects);
        System.out.printf("Mark: ");
        int mark = scan.nextInt();
        GregorianCalendar calendar = new GregorianCalendar();
        Date date = calendar.getTime();
        return new Journal(student,subject, mark, date);
    }

    public void addJournalToList(Journal journal, List<Journal> list) {
        list.add(journal);
        SaveToFile saver = new SaveToFile();
        saver.saveToFile(list, "journals");
    }

    public void printList(List<Journal> listJ) {
        System.out.printf("---------JournalList-------------%n");
        for (int i = 0; i < listJ.size(); i++) {
            System.out.printf("%d. %s %s %s%n", i+1, listJ.get(i).getStudent().getName(),listJ.get(i).getStudent().getSecName(), listJ.get(i).getSublect(), listJ.get(i).getMark());
            
        }
        
    }
}
