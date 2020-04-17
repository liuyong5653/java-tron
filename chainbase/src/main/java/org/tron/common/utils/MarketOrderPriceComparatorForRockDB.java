package org.tron.common.utils;

import org.rocksdb.ComparatorOptions;
import org.rocksdb.DirectSlice;
import org.rocksdb.util.DirectBytewiseComparator;

public class MarketOrderPriceComparatorForRockDB extends DirectBytewiseComparator {

  public MarketOrderPriceComparatorForRockDB(final ComparatorOptions copt) {
    super(copt);
  }

  @Override
  public String name() {
    return "MarketOrderPriceComparator";
  }

  //todo: implement later
  @Override
  public int compare(final DirectSlice a, final DirectSlice b) {
    return a.data().compareTo(b.data());
  }


}
