package lab11.model.logic;

public class Store {
    private Product[] products = new Product[0];
    private String title;

    public Store(String title) {
        this.title = title;
    }

    public void addProducts(Product[] products) {
        if (products != null) {
            Product[] newProducts = new Product[this.products.length + products.length];

            System.arraycopy(this.products, 0, newProducts, 0, this.products.length);
            System.arraycopy(products, 0, newProducts, this.products.length, products.length);

            this.products = newProducts;
        }
    }

    public Product[] getProducts() {
        return this.products;
    }

    public String getStoreInfo() {
        StringBuilder result = new StringBuilder();

        result.append("Store ").append(this.title).append(" products:\n");
        for (Product p: this.products) {
            result.append("  ").append(p.toString()).append("\n");
        }

        return result.toString();
    }
}
