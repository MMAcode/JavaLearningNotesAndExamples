package fromOtherProject.random;

import java.util.HashMap;

public class Database {

    public HashMap<String, Product> db = new HashMap<>();
    //public HashMap<String, ArrayList<String>> dbMerchant = new HashMap<>();

    public int size(){
        return db.size();
    }
    public void add(Product product){
        db.put(product.name, product);
        //dbMerchant.st
    }

    public Product getProductByName(String name){return db.get(name);}

    public boolean contains(Product p){return db.containsValue(p);}
    public boolean contains(String prName){return db.containsKey(prName);}

    public void remove(String p){db.remove(p);}

    public Database getProductsBySeller(String merchant){
        //HashMap<String, Product> sellersDb = new HashMap<>();
        Database sellersDb = new Database();
        db.forEach((key,value)->{
            if(value.merchant.equals(merchant))
                sellersDb.add(value);
        });
        return sellersDb;
    }

    public void show() {
        System.out.println(this.getClass().getSimpleName());
        db.forEach((key,value)-> System.out.println(value));
        System.out.println();
    }

    public Database getProductsByPrice(int min, int max){
        Database priceDb = new Database();
        db.forEach((key,product)->{
            if(product.price>= min && product.price<=max)
                priceDb.add(product);
        });
        return priceDb;
    }
}
