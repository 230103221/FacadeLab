package task05;

public class Main {
    public static void main(String[] args) {
        InventoryService inventory = new InventoryService();
        PaymentProcessor payment = new PaymentProcessor();
        ShippingService shipping = new ShippingService();

        OrderFacade orderFacade = new OrderFacade(inventory, payment, shipping);

        orderFacade.placeOrder("LAPTOP-99", 1200.50, "Almaty, Abay Ave 10");
        System.out.println();

        orderFacade.placeOrder("MOUSE-04", 35.00, "Astana, Kabanbay Batyr 25");
    }
}