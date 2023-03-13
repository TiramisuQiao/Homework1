package Project4;
    public class Item {
        private String name;
        private String category;
        private String description;
        private int shopid;
        private int factoryid;
        private float price;
        private int numbers;

        public void SetItem(String name,int shopid,float price){
            this.name=name;
            this.shopid=shopid;
            this.price=price;
        }
        public void SetStorage(int numbers){
            this.numbers=numbers;
        }
        public void DetailsOnItem(String category,String description,int factoryid){
            this.category=category;
            this.description=description;
            this.factoryid=factoryid;
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

