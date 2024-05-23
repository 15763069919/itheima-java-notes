package practise.API.UUID;

import java.util.UUID;

public class demo1 {
    public static void main(String[] args) {
        System.out.println(UUID.randomUUID());//009cd173-aca6-4505-a20a-956f9b324f09
        System.out.println(UUID.randomUUID().toString().replace("-", ""));//5959939426094135860d409a1c61a0ff
    }
}
