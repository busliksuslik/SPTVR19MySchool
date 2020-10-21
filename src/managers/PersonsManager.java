/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entity.Person;
import java.util.List;
import java.util.Scanner;
import tools.savers.SaveToFile;

/**
 *
 * @author user
 */
public class PersonsManager {
    private Scanner scan = new Scanner(System.in);
    public Person createPerson(String role) {
        System.out.printf("Name: ");
        String name = scan.nextLine();
        System.out.printf("Second Name: ");
        String secName = scan.nextLine();
        System.out.printf("Phone ");
        String phone = scan.nextLine();
        return new Person(name, secName, phone, role);
    }

    public void addPersonToList(Person person, List<Person> list) {
        list.add(person);
        SaveToFile saver = new SaveToFile();
        saver.saveToFile(list, "persons");
    }

    public void printList(List<Person> listP, String role) {
        System.out.printf("---------%sList-------------%n",role);
        for (int i = 0; i < listP.size(); i++) {
            if(role.equals(listP.get(i).getRole())){
                System.out.printf("%d. %s %s%n", i+1, listP.get(i).getName(), listP.get(i).getSecName());
            }
            
        }
        
    }
    public Person getTeacher(List<Person> persons){
        System.out.printf("---------TeachersList-------------%n");
        for (int i = 0; i < persons.size(); i++) {
            if("teacher".equals(persons.get(i).getRole())){
                System.out.printf("%d. %s %s%n", i+1, persons.get(i).getName(), persons.get(i).getSecName());
            }
            
        }
        System.out.printf("Incert id");
        int choise = scan.nextInt();
        return persons.get(choise - 1);
    }
    public Person getStudent(List<Person> persons){
        System.out.printf("---------StudentsList-------------%n");
        for (int i = 0; i < persons.size(); i++) {
            if("student".equals(persons.get(i).getRole())){
                System.out.printf("%d. %s %s%n", i+1, persons.get(i).getName(), persons.get(i).getSecName());
            }
            
        }
        System.out.printf("Incert id");
        int choise = scan.nextInt();
        return persons.get(choise - 1);
    }
    
    
}
