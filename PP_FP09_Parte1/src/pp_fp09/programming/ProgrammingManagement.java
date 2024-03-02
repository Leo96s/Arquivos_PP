/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp09.programming;

/**
 *
 * @author Leonardo
 */
public class ProgrammingManagement{
    
    private Person[] person;
    private int count = 0;
    
    public ProgrammingManagement(){
        this.person = new Person[5];
    }
    
    public void addPerson(Person _person){
        if(this.count == this.person.length){
            this.person = this.extendsPerson();
        }
        this.person[this.count++] = _person;
    }
    
    private Person[] extendsPerson(){
        int newlength = this.person.length * 2;
        Person[] newperson = new Person[newlength];
        
        for(int i = 0; i < this.person.length; i++){
            newperson[i] = this.person[i];
        }
        return newperson;
    }
    
    public void removePerson(Person _person) {
    int indexToRemove = -1;

        for (int i = 0; i < this.count; i++) {
            if (this.person[i].equals(_person)) {
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove != -1) {
            for (int i = indexToRemove; i < this.count - 1; i++) {
            this.person[i] = this.person[i+1];
            }
            this.count--;
            this.person[this.count] = null;
        }
    }
    
    public String listGestorProj(){
        String str = "";
        
        for(Person _person : this.person){
            if(_person instanceof ProjectManager){
                    ProjectManager manager = (ProjectManager)_person;
                    str+= "\n-----------------------------\n";
                    str += manager.toString();
                    str+= "\n-----------------------------\n";
            }
            
        }
        return str;
    }
    
    @Override
    public String toString(){
        
        String str = "";
        
        for(Person _person : this.person){
            if(_person != null){
                
                if(_person instanceof Administrative){
                    Administrative admin = (Administrative)_person;
                    str+="--------------------------------\n";
                    str += admin.toString();
                    str+="--------------------------------\n";
                    
                }else if(_person instanceof JavaProgrammer){
                    JavaProgrammer programmer = (JavaProgrammer)_person;
                    str+="--------------------------------\n";
                    str += programmer.toString();
                    str+="--------------------------------\n";
                    
                }else if(_person instanceof ProjectManager){
                    ProjectManager manager = (ProjectManager)_person;
                    str+="--------------------------------\n";
                    str += manager.toString();
                    str+="\n--------------------------------\n";
                    
                }
            }else{
                    System.out.println("Impossible to read.");
            }
        }
        return str;
    }
    
}
