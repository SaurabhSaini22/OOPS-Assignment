class Base1 {
    public Base1() {
        System.out.print("Base ");
    }

    public Base1(String s) {
        System.out.print("Base: " + s);
    }
}
 class Derived1 extends Base1 {
    public Derived1(String s) {
        super(); // Stmt-1
        //super(s); // Stmt-2
        System.out.print("Derived ");
    }
}

class Test1 {
    public static void main(String[] args) {
        Base1 base = new Derived1("Hello ");
    }
}

/* Out will be Correct on these three condition
b) Removing Stmt-1 will make the program compilable and it will print the following: Base: Hello Derived.
c) Removing Stmt-2 will make the program compilable and it will print the following: Base Derived.
d) Removing both Stmt-1 and Stmt-2 will make the program compilable and it will print the following: Base Derived.
 */
