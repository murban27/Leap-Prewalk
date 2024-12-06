import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DiscountApplierTest {

    private DiscountApplier dsc;
        @Before
        public void setUp()
        {
            dsc=new DiscountApplier();
        }
        @Test
        public void discountForMacAndIphoneTogether()
        {
//            List<Item> items=new ArrayList<>();
//            items.add(new Item("IPHONE",2,1000));
//            items.add(new Item("MACBOOK",1,1000));
            Basket basket=new BasketBuilder()
                    .w("IPHONE",1000)
                    .w("MACBOOK",2000).build();
            double expected=(1000+2000)*0.85;
            dsc.apply(basket);
            Assert.assertEquals(expected,basket.getAmount(),0.0001);


        }

}
