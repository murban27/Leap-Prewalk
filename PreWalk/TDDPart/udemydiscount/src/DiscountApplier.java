public class DiscountApplier {
    public void apply(Basket basket)
    {
        boolean ok=discountPerProduct(basket);
        if(!ok) discountPerAmount(basket);
    }
    private boolean discountPerProduct(Basket basket) {
        if(basket.has("MACBOOK")&&basket.has("IPHONE"))
        {
            basket.substract(basket.getAmount()*0.15);
            return true;
        }
        if(basket.has("NOTEBOOK")&&basket.has("Windows PHONE"))
        {
            basket.substract(basket.getAmount()*0.12);
            return true;
        }
        if(basket.has("XBOX"))
        {
            basket.substract(basket.getAmount()*0.7);
            return true;
        }
        return false;
    }
    private void discountPerAmount(Basket basket) {
        if(basket.getAmount()<=1000 && basket.qtyOfItems()<=2){
            basket.substract(basket.getAmount()*0.2);
        }
        else if(basket.getAmount()<=3000 && basket.qtyOfItems()<5 && basket.qtyOfItems()>2){
            basket.substract(basket.getAmount()*0.05);
        }
        else if(basket.getAmount()<=3000 && basket.qtyOfItems()>=5) {
            basket.substract(basket.getAmount()*0.06);
        }
    }


}
