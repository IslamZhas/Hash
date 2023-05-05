import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        MyHashTable<MyTestingClass, Student> table = new MyHashTable<>();
        for(int i = 0; i < 10000;i++){
            //create key barcode random six-digit number
            MyTestingClass key = new MyTestingClass("Name " ,random.nextInt(999999));
            //create value with name 10000
            Student value = new Student("Name " + i);
            table.put(key, value);
        }
        for (int i = 0; i < table.getSize(); i++){
            int count = table.getSize();
            System.out.println("Bucket " + i + "has " + count + "elements");
        }
    }
    static class Student{
        String name;
        public Student(String name){
            this.name = name;
        }
    }
}
