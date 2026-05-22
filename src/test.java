class A {
A () { System . out . print ( " A " ) ; }
}
class B extends A {
void g() { System . out . print ( " B " ) ; }
}
public class test {
public static void main ( String [] args ) {
B t=new B () ;
t.g();
}
}