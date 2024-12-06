import java.util.List;

public class Basket {
    private final List<Item> itemsList;
    private double _amount;

    public Basket(List<Item> item)
    {
        this.itemsList=item;
        sumItems();
    }
    public double getAmount() {

        return _amount;
    }
    private void sumItems()
    {
        for(Item item : itemsList)
        {
            _amount+=item.getTotalPrice();
        }
    }
    public boolean has(String name)
    {
        for(Item item:itemsList)
        {
            if(item.getName().contains(name))
            {
                return true;
            }
        }
        return false;
    }


    public int qtyOfItems()
    {
        int cnt=0;
        for(var item:itemsList)
        {
            cnt++;
        }
        return  cnt;
    }

    public double substract(double amount) {
        _amount-=amount;
        return  _amount;
    }
}
