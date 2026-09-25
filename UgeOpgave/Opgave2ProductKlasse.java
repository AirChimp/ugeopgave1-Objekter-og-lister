public class Opgave2ProductKlasse {
    /*
    public static class Product {
        String name;
        double price;
        String[] tags;

        public Product(String name, double price, String[] tags) {
            this.name = name;
            this.price = price;
            this.tags = tags;
        }

        public void printInfo() {
            System.out.println(name + " - " + price + " kr");
            System.out.print("  Tags: ");
            for (int i = 0; i < tags.length; i++) {
                System.out.print(tags[i]);
                if (i < tags.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }

        public boolean hasTag(String tag) {
            for (String t : tags) {
                if (t.equals(tag)) {
                    return true;
                }
            }
            return false;
        }
    }

    // Main.java
    public static class Main {

        public static Product findMostExpensive(Product[] products) {
            Product mostExpensive = products[0];
            for (Product p : products) {
                if (p.price > mostExpensive.price) {
                    mostExpensive = p;
                }
            }
            return mostExpensive;
        }

        public static void findProductsInPriceRange(Product[] products, double min, double max) {
            System.out.println("Produkter mellem " + min + " og " + max + " kr:");
            for (Product p : products) {
                if (p.price >= min && p.price <= max) {
                    p.printInfo();
                }
            }
        }

        static void main(String[] args) {
            Product p1 = new Product("Laptop", 5999, new String[]{"electronics", "new"});
            Product p2 = new Product("Mouse", 199, new String[]{"electronics", "sale"});
            Product p3 = new Product("Keyboard", 499, new String[]{"electronics", "sale"});
            Product p4 = new Product("Monitor", 2499, new String[]{"electronics"});

            Product[] products = {p1, p2, p3, p4};

            System.out.println("Produkter på tilbud:");
            for (Product p : products) {
                if (p.hasTag("sale")) {
                    p.printInfo();
                }
            }

            System.out.println("\nDyreste produkt:");
            Product expensive = findMostExpensive(products);
            expensive.printInfo();
        }
    }
    // Output:
    // Produkter på tilbud:
    // Mouse - 199.0 kr
    // Tags: Electronics, sale
    // Keyboard - 499.0 kr
    // Tags: Electronics, sale
    // Dyreste produkt:
    //Laptop - 5999.0 kr
    //  Tags: electronics, new
     */
}
