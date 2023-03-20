package Project4;

import org.jetbrains.annotations.NotNull;

public class Item implements ItemInterface{
        private String name;
        private String category;
        private String description;
        private int shopid;
        private int factoryid;
        private float price;
        private int numbers;

        public void SetItem(String name,int shopid,float price){
            this.name=name;//this.name is the name of the object
            this.shopid=shopid;//this.shopid is the shopid of the object
            this.price=price;//this.price is the price of the object
        }
        public void SetStorage(int numbers){

            this.numbers=numbers;//this.numbers is the numbers of the object
        }
        public void DetailsOnItem(String category,String description,int factoryid){
            this.category=category; //this.category is the category of the object
            this.description=description;//this.description is the description of the object
            this.factoryid=factoryid;//this.factoryid is the factoryid of the object
        }
        public void ShowItem(Item a){
            System.out.println("Name:"+a.name+"\n");
            System.out.println("Category:"+a.category+"\n");
            System.out.println("Description:"+a.description+"\n");
            System.out.println("Shopid:"+a.shopid+"\n");
            System.out.println("factoryid:"+a.factoryid+"\n");
            System.out.println("price:"+a.price+"$\n");
            System.out.println("Still have:"+a.numbers+" pieces");

        }
    }

