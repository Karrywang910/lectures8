/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lectures8;

 class Student {
    int id;
    String name;
Student(int i, String n){
    id =i;
    name=n;
}
void display(){System.out.println(id+""+name);}
    public static void main(String[] args) {
        Student s1 = new Student(111,"karan");
        Student s2 = new Student(222, "aryan");
        s1.display();
        s2.display();
    }
}


    
    

