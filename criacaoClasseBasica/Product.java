public class Product {

    public String name;
    public double price;
    public int quantity;

    public double TotalValueInStock(){
        double totalValue = price * quantity;
        return totalValue;
    }

    public void AddProducts(int quantity){
        this.quantity += quantity;
    }

    public void RemoveProducts(int quantity){
        this.quantity -= quantity;
    }

}
