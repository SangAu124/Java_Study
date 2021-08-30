package Java_Study;

public class polymorphism {
}
class Parent{ ... }
class Child extends Parent { ... }
// ...
Parent pa = new Parent();
Child ch = new Child();
Parent pc = new Child();
Child cp = new Parent();
