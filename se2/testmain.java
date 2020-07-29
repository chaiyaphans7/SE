package Version3;

import java.util.ArrayList;
public class testmain {
    public static void main(String[] args) {
        ArrayList<Room> rooms = new ArrayList<Room>();
        for (int i = 0; i < 10; i++) {
            rooms.add(new Room(String.valueOf(100+i)));     
        }

        for (int i = 0; i < 9; i++) {
            rooms.get(i).addCom(30);
        }
        rooms.get(9).addCom(43);
        for (Room room : rooms) {
            room.printList();
        }
    }
}
