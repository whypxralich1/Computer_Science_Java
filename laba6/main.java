public class Main {
    public static void main(String[] args) {
        Store.Product product1 = new Store().Milk(1.5, 79.0);
        Store.Product product2 = new Store().Bread(0.9, 59.0);
        Store.Product product3 = new Store().Butter(0.5, 159.0);
        Store.Product product4 = new Store().Apples(1.0, 149.0);
        Store.Product product5 = new Store().Porridge(0.1, 69.0); 
        Store.Product product6 = new Store().Chicken(1.0, 179.0);

        Store.Product[] products = {product1, product2, product3, product4, product5, product6};

        Store store = new Store(6, products, 5);
        System.out.println(store);
        System.out.println("Store Efficiency: " + store.calculateStoreEfficiency());

        String[] categories = {"Fruits", "Vegetables", "Dairy", "Drinks"};
        Supermarket supermarket = new Supermarket(7, products, 10, 300.0, categories);
        System.out.println(supermarket);
        System.out.println("Supermarket Efficiency: " + supermarket.calculateSupermarketEfficiency());
    }
}