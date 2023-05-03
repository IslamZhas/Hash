public class MyTestingClass {
    String name;
    int barcode;
    public MyTestingClass(String name, int barcode){
        this.name = name;
        this.barcode = barcode;
    }
    public int hashCode(){
        int hash = 17;
        hash = 31 * hash + name.hashCode();
        hash = 31* hash + barcode;
        return hash;
    }
}
