package Project4;

public class Init {
    public static void main(String[] args){
        Item ItemA=new Item();
       ItemA.SetItem("Cake",77776666,18.88f);
       ItemA.DetailsOnItem("Food","Delicious",99887766);
       ItemA.SetStorage(100);
       ItemA.ShowItem(ItemA);
    }
}
