public class Store {

    private int cashRegisters;  // кол-во касс
    private Product[] products;  // массив
    private int sellers;         // кол-во продавцов

    public Store() {
        this.cashRegisters = 0;
        this.products = new Product[0];
        this.sellers = 0;
    }

    public Store(int cashRegisters, Product[] products, int sellers) {
        this.cashRegisters = cashRegisters;
        this.products = products;
        this.sellers = sellers;
    }

     //подсчет эффективности кассы
    public double calculateCashRegisterEfficiency() {
        if (cashRegisters == 0) return 0;
        return (double) sellers / cashRegisters;
    }

    // подсчет ср. весапродукта
    public double calculateAverageProductWeight() {
        if (products.length == 0) return 0;
        double totalWeight = 0;
        for (Product product : products) {
            totalWeight += product.getWeight();
        }
        return totalWeight / products.length;
    }

    // подсчет общ. эфф-ти
    public double calculateStoreEfficiency() {
        double cashEfficiency = calculateCashRegisterEfficiency();
        double averageWeight = calculateAverageProductWeight();
        return averageWeight * cashEfficiency; //соотношение
    }

    public String toString() {
        return "Store: " + cashRegisters + " cash registers, " + sellers + " sellers.";
    }

    // класс товар
    public class Product {
        private double weight;  // вес
        private double price;   // цена
        public Product() {
            this.weight = 0;
            this.price = 0;
        }
        public Product(double weight, double price) {
            this.weight = weight;
            this.price = price;
        }

        // мутаторы
        public void setWeight(double weight) {
            this.weight = weight;
        }
        public double getWeight() {
            return weight;
        }
        public void setPrice(double price) {
            this.price = price;
        }
        public double getPrice() {
            return price;
        }
    }
}
