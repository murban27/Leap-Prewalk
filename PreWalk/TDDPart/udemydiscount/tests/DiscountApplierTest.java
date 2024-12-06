import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DiscountApplierTest {

        @Test
        public void discountForMacAndIphoneTogether()
        {
            DiscountApplier dsc=new DiscountApplier();
            List<Item> items=new ArrayList<>();
            items.add(new Item("IPHONE",2,1000));
            items.add(new Item("MACBOOK",1,1000));

            Basket basket=new Basket(items);
            DiscountApplier applier=new DiscountApplier();
             applier.apply(basket);
             double expected=3000*0.85;
            Assert.assertEquals(expected,basket.getAmount(),0.0001);

        }

}
