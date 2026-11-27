import java.io.*;

class Box{
int height, width, breadth;

void dis(){
System.out.println( height*width*breadth);
 }
}

class Box1{

public static void main(){
double vol;
Box nb=new Box();
Box nb1=new Box();
Box nb2=new Box();

nb.height=23;
nb.width=29;
nb.breadth=32;

nb2.height=3;
nb2.width=233;
nb2.breadth=872;

nb1.height=2;
nb1.width=9;
nb1.breadth=32;

nb.dis();
nb1.dis();
nb2.dis();
}
}

