package practise.genericity.泛型的继承性和通配符.practice;

import java.util.ArrayList;

public class Practice1 {
    public static void main(String[] args) {
            ArrayList<Persian> list1 = new ArrayList<>();
            ArrayList<DragonLi> list2 = new ArrayList<>();
            ArrayList<Husky> list3 = new ArrayList<>();
            ArrayList<Teddy> list4 = new ArrayList<>();
            ArrayList<Student> list5 = new ArrayList<>();



            keepPet1(list1);
            keepPet1(list2);
            keepPet1(list3);
            keepPet1(list4);
//            keepPet1(list5);    //err


//            keepPet2(list1);  //err
//            keepPet2(list2);  //err
            keepPet2(list3);
            keepPet2(list4);
//            keepPet2(list5);    //err


            keepPet3(list1);
            keepPet3(list2);
//            keepPet3(list3);  //err
//            keepPet3(list4);  //err
//            keepPet3(list5);    //err

    }
    public static void keepPet1(ArrayList<? extends Animal> list){
    }

    public static void keepPet2(ArrayList<? extends Dog> list){
    }

    public static void keepPet3(ArrayList<? extends Cat> list){
    }

}
