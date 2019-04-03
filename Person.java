public class Person {
  String name;
  private float weight;
  void Person(String name) {
    this.name=name;
  }
  float getWeight(){
    return weight;
  }
  void setWeight(float weight){
    this.weight=weight;
  }
  public void printWeight() {
    System.out.println(name + " " + weight + "Kg");
  }
  public static void main(String[] args) {
    Person p=new Person();
    p.Person("Kim");
    p.setWeight(60);
    p.printWeight();
  }
}
