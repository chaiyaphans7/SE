package Version3;

import java.util.ArrayList;

public class Technician {


    String name;
    ArrayList<Com> FixList = new ArrayList<Com>();


    public Technician(String name) {
        this.name=name;
    }
    public void addFix(Com com) {
        this.FixList.add(com);
    }
    public ArrayList<Com> get_FixList() {
        return this.FixList;
    }
    public void Fix_() {

    }
}
