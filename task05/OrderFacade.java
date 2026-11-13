package task05;

public class OrderFacade {
    private InventoryService inventory;
    private PaymentProcessor payment;
    private ShippingService shipping;

    public OrderFacade(InventoryService inventory, PaymentProcessor payment, ShippingService shipping) {
        this.inventory = inventory;
        this.payment = payment;
        this.shipping = shipping;
    }

    public void placeOrder(String itemId, double amount, String address) {
        System.out.println("--- Placing New Order ---");
        inventory.reserveStock(itemId);
        payment.chargeCustomer(amount);
        shipping.generateShippingLabel(address);
        System.out.println("Order completed successfully!");
    }
}