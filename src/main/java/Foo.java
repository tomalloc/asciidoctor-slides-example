public class Foo {
  private String name;
  private int age;

  private Foo(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Foo create(String name, int age){
    return new Foo(name,age);
  }
}
