/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lectures8;

public class lectures81 {
        public static class  Student {
            int id;
            String name;
            public Student(int id , String name){
                this.id=id;
                this.name=name;}
            void displayInformation(){
                System.out.println("id:"+id+",name:"+ name);
            }
            public static void main(String[] args) {
                Student student1 = new Student(1, "NAM");
                Student student2 = new Student(2, "Lan");
                student1.displayInformation();
                student2.displayInformation();
            }
            }
        
    
}
