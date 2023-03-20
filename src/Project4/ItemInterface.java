package Project4;

public interface ItemInterface {
    /**
     *  the users could use the SetItem() to set the basic Information
     @param name A string that is the name of the object
     @param shopid A string that is the shopid of the object
     @param price A string that is the price of the object
     */
    public void SetItem(String name,int shopid,float price);

    /**
     * the users could use the SetStorage() to Set the storage of the item
     * @param numbers A int that is the total number of the item
     */
    public void SetStorage(int numbers);

    /**
     * DetailsOnItem is initialized by the factory and users can not change the value
     * @param category A string that shows the category of the item
     * @param description A string that shows the description of the item
     * @param factoryid A int that shows the factory id of the item
     */
    public void DetailsOnItem(String category,String description,int factoryid);

    /**
     *
     * @param a is the Item that the users want to Show
     */
    public void ShowItem(Item a);
}
//end ItemInterface