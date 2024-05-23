package classPractise.demo2;

public class demo2 {

        public static void main(String args[]) {
            Fish redFish = new Fish();
            System.out.println(redFish.weight); 		//¡¾´úÂë1¡¿
            Lake lake = new Lake();
            lake.setFish(redFish);
            lake.foodFish(120);
            System.out.println(redFish.weight); 		//¡¾´úÂë2¡¿
            System.out.println(lake.fish.weight); 	//¡¾´úÂë3¡¿
        }

}
class Fish {
    int weight = 1;
}
class Lake {
    Fish fish;
    void setFish(Fish s){
        fish = s;
    }
    void foodFish(int m) {
        fish.weight=fish.weight+m;
    }
}