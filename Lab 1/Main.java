//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student obj1 = new Student();
        Teacher obj2 = new Teacher();
        obj1.name = "Pranto";
        obj1.id="241-15-977";
        obj1.cgpa=3.50f;
        obj2.name = "Nasima Islam Bithi";
        obj2.department="Computer Science";
        obj2.id="1234567890";
        obj1.doStudy();
        obj1.display1();
        obj2.teaching();
        obj2.display2();

    }

}