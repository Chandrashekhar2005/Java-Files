import java.io.*;

class Box{
int height, width, breadth;
}


class Box2{

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

vol=nb.height*nb.width*nb.breadth;
System.out.println(vol);
vol=nb1.height*nb1.width*nb1.breadth;
System.out.println(vol);
vol=nb2.height*nb2.width*nb2.breadth;
System.out.println(vol);

}
}


