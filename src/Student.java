public class Student {
    int id;
    String name;
    Student(int id,String name){
        this.id=id;
        this.name=name;
    }
    void printDetails(){
        System.out.printf("%d %s", id, name);
    }
}
