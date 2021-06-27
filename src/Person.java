public class Person  {
   private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }
    public void printName(String name){
        System.out.println("Name is: "+name);
    }
}
