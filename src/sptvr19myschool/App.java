/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19myschool;

import tools.savers.SaveToFile;
import entity.Person;
import entity.Subject;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import managers.PersonsManager;
import managers.SubjectsManager;

/**
 *
 * @author user
 */
class App {
    private Scanner scan = new Scanner(System.in);
    
    private List<Person> listPersons = new ArrayList<>();
    
    private PersonsManager personManager = new PersonsManager();
    
    private SubjectsManager subjectManager = new SubjectsManager();
    
    private List<Subject> listSubjects = new ArrayList<>();

    public App() {
        SaveToFile saveToFile = new SaveToFile();
        listPersons = saveToFile.loadFromFile("persons");
    }
    
    void run() {
        
        boolean repeat = true;
        do{
            System.out.printf("Go fuck yourself%n0 - exit%n1 - addst%n2 - listst%n3 - addte%n4 - listte%n5 - addsub%n6 - listsub%n7 - addjo%n8 - listjo%n9 - chjo%nINPUT: ");
            String input = scan.nextLine();
            switch(input){
                case "0":{
                    System.exit(0);
                    break;
                }
                case "1":{
                    personManager.addPersonToList(personManager.createPerson("student"), listPersons);
                    SaveToFile saveToFile = new SaveToFile();
                    saveToFile.saveToFile(listPersons, "persons");
                    break;
                }
                case "2":{
                    personManager.printList(listPersons, "student");
                    scan.nextLine();
                    break;
                }
                case "3":{
                    personManager.addPersonToList(personManager.createPerson("teacher"), listPersons);
                    SaveToFile saveToFile = new SaveToFile();
                    saveToFile.saveToFile(listPersons, "persons");
                    break;
                }
                case "4":{
                    personManager.printList(listPersons, "teacher");
                    scan.nextLine();
                    break;
                }
                case "5":{
                    subjectManager.addSubjectToList(subjectManager.createSubject(listPersons), listSubjects);
                    SaveToFile saveToFile = new SaveToFile();
                    saveToFile.saveToFile(listPersons, "persons");
                    break;
                }
                case "6":{
                    subjectManager.printList(listSubjects);
                    break;
                }
                case "7":{
                    
                    break;
                }
                case "8":{
                    
                    break;
                }
                case "9":{
                    
                    break;
                }
            }
        }while(repeat);
        
    }
    
}
