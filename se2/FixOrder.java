package Version3;



public class FixOrder {

    public int comID;
    public String text = "";
    public String nameEng = "";


    public FixOrder(int comID,String text){
        this.comID = comID;
        this.text = text;
    }


    public void set_nameEng(String nameEng){
        this.nameEng = nameEng;
    }

}
