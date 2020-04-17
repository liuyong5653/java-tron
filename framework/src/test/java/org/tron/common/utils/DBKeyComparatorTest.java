package org.tron.common.utils;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.tron.core.capsule.utils.MarketUtils;


@Slf4j
public class DBKeyComparatorTest {


  @Test
  public void dbComparing() {
    MarketOrderPriceComparatorForLevelDB comparator = new MarketOrderPriceComparatorForLevelDB();

    byte[] pairPriceKey1 = MarketUtils.createPairPriceKey(
        ByteArray.fromString("100"),
        ByteArray.fromString("200"),
        1000L,
        2000L
    );
    byte[] pairPriceKey2 = MarketUtils.createPairPriceKey(
        ByteArray.fromString("100"),
        ByteArray.fromString("200"),
        1000L,
        2001L
    );
    System.out.println(comparator.compare(pairPriceKey1, pairPriceKey2));
    System.exit(0);
  }
}
