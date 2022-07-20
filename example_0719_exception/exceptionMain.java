package example_0719_exception;

import example_0630.exam02_abstract_method.Animal;
import example_0630.exam02_abstract_method.Cat;
import example_0630.exam02_abstract_method.Dog;

import static example_0719_exception.excep.multi_catch.CatchByExceptionKindExample.catchexam1;
import static example_0719_exception.excep.multi_catch.Catch_ByException.catchexam2;


public class exceptionMain {
    public static void main(String[] args) {
//        catchexam1();
//        catchexam2();
//        ArrayIndexOutOfBoundsException();
//        NullPointerException();
//        NumberFormatException();

        Dog dog = new Dog();
        changeDog(dog);

        Cat cat = new Cat();
        changeDog(cat);



    }

    public static void NullPointerException() {
        String data = null;
        System.out.println(data.toString());
    }

    public static void ArrayIndexOutOfBoundsException() {
        System.out.println("________________________________");
        String[] arg = {"0¹øÂ°"};
        String data1 = arg[0];
        String data2 = arg[1];

        System.out.println("arg[0] : "+data1);
        System.out.println("arg[1] : "+data2);
        System.out.println("________________________________");
    }

    public static void NumberFormatException() {
        String data1 = "100";
        String data2 = "a100";
        int value1 = Integer.parseInt(data1);
        int value2 = Integer.parseInt(data2);
    }

    public static void changeDog(Animal animal) {
        //if(animal instance of Dog) {
          Dog dog = (Dog) animal;
        // }
    }
}
