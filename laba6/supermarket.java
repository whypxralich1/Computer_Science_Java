class Supermarket extends Store {

    private double area;               // площадь
    private String[] productCategories; // массив категорий товаров

    public Supermarket() {
        super();
        this.area = 0;
        this.productCategories = new String[0];
    }

    public Supermarket(int cashRegisters, Product[] products, int sellers, double area, String[] productCategories) {
        super(cashRegisters, products, sellers);
        this.area = area;
        this.productCategories = productCategories;
    }

    // подсчет эфф-ти супемакета
    public double calculateSupermarketEfficiency() {
        double cashEfficiency = calculateCashRegisterEfficiency();
        double categoryCount = productCategories.length == 0 ? 1 : productCategories.length;
        return (area / categoryCount) * cashEfficiency;
    }
}