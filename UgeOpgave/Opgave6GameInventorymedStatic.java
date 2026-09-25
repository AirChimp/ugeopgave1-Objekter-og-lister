import java.util.ArrayList;

public class Opgave6GameInventorymedStatic {
    /*
    // Item.java
    public static class Item {
        private String name;
        private int value;
        private String type;
        private static int totalItemsCreated = 0;
        private static int totalValue = 0;  // For ekstra udfordring

        public Item(String name, int value, String type) {
            this.name = name;
            this.value = value;
            this.type = type;
            totalItemsCreated = totalItemsCreated + 1;
            totalValue = totalValue + value;  // For ekstra udfordring
        }

        public String getName() {
            return name;
        }

        public int getValue() {
            return value;
        }

        public String getType() {
            return type;
        }

        public static int getTotalItemsCreated() {
            return totalItemsCreated;
        }

        public static double getAverageItemValue() {
            if (totalItemsCreated == 0) {
                return 0;
            }
            return (double)totalValue / totalItemsCreated;
        }

        public String toString() {
            return name + " (" + type + ") - " + value + " gold";
        }
    }

    // Inventory.java
    public static class Inventory {
        private String playerName;
        private ArrayList<Item> items;
        private int maxCapacity;

        public Inventory(String playerName, int maxCapacity) {
            this.playerName = playerName;
            this.maxCapacity = maxCapacity;
            this.items = new ArrayList<>();
        }

        public void addItem(Item item) {
            if (items.size() < maxCapacity) {
                items.add(item);
                System.out.println(playerName + " picked up: " + item.getName());
            } else {
                System.out.println("Inventory fuld! Kan ikke tilføje " + item.getName());
            }
        }

        public int getTotalValue() {
            int total = 0;
            for (Item item : items) {
                total = total + item.getValue();
            }
            return total;
        }

        public ArrayList<Item> findItemsByType(String type) {
            ArrayList<Item> found = new ArrayList<>();
            for (Item item : items) {
                if (item.getType().equalsIgnoreCase(type)) {
                    found.add(item);
                }
            }
            return found;
        }

        public void printInventory() {
            System.out.println("\n=== " + playerName + "'s Inventory ===");
            System.out.println("Capacity: " + items.size() + "/" + maxCapacity);
            for (Item item : items) {
                System.out.println("- " + item);
            }
            System.out.println("Total value: " + getTotalValue() + " gold");
        }
    }

    // Main.java
    public static class Main {
        public static void main(String[] args) {
            // Opret to spillere med inventories
            Inventory player1 = new Inventory("Hero", 10);
            Inventory player2 = new Inventory("Warrior", 8);

            // Tilføj items til spiller 1
            player1.addItem(new Item("Iron Sword", 150, "weapon"));
            player1.addItem(new Item("Health Potion", 50, "potion"));
            player1.addItem(new Item("Wooden Shield", 100, "armor"));
            player1.addItem(new Item("Mana Potion", 75, "potion"));

            // Tilføj items til spiller 2
            player2.addItem(new Item("Steel Axe", 200, "weapon"));
            player2.addItem(new Item("Leather Armor", 180, "armor"));
            player2.addItem(new Item("Health Potion", 50, "potion"));

            // Print inventories
            player1.printInventory();
            player2.printInventory();

            // Print total items created (STATIC metode)
            System.out.println("\n=== Game Statistics ===");
            System.out.println("Total items created: " + Item.getTotalItemsCreated());
            System.out.println("Average item value: " + Item.getAverageItemValue() + " gold");

            // Find items by type
            System.out.println("\n=== Hero's Potions ===");
            ArrayList<Item> potions = player1.findItemsByType("potion");
            for (Item potion : potions) {
                System.out.println("- " + potion);
            }
        }
    }
    // Output: Hero picked up: Iron Sword
    //Hero picked up: Health Potion
    //Hero picked up: Wooden Shield
    //Hero picked up: Mana Potion
    //Warrior picked up: Steel Axe
    //Warrior picked up: Leather Armor
    //Warrior picked up: Health Potion
    //
    //=== Hero's Inventory ===
    //Capacity: 4/10
    //- Iron Sword (weapon) - 150 gold
    //- Health Potion (potion) - 50 gold
    //- Wooden Shield (armor) - 100 gold
    //- Mana Potion (potion) - 75 gold
    //Total value: 375 gold
    //
    //=== Warrior's Inventory ===
    //Capacity: 3/8
    //- Steel Axe (weapon) - 200 gold
    //- Leather Armor (armor) - 180 gold
    //- Health Potion (potion) - 50 gold
    //Total value: 430 gold
    //
    //=== Game Statistics ===
    //Total items created: 7
    //Average item value: 115.0 gold
    //
    //=== Hero's Potions ===
    //- Health Potion (potion) - 50 gold
    //- Mana Potion (potion) - 75 gold
     */
}
