package Version1;

import java.util.ArrayList;

public class Room extends Com{


private String roomID;
private ArrayList<Com> coms;


public Room(String comID,String status,String sym,String roomID,ArrayList<Com> coms){
    super(comID,status,sym);
    this.roomID = roomID;
    this.coms = coms;
}
