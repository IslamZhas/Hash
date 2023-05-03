public class Main {
    public static void main(String[] args) {
        MyHashTable<MyTestingClass, Student> table = new MyHashTable<>();
        for(int i = 0; i < 10000;i++){

        }
    }
    class Student{
        String name;
        public Student(String name){
            this.name = name;
        }
    }
}
