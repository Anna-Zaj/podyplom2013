package zad42;

import java.math.BigDecimal;

public class Plus extends Operator {
	  public BigDecimal compute(BigDecimal l1, BigDecimal val2)   {
		  BigDecimal wyn=l1;
		  
		  wyn=wyn.add(val2);
	    return wyn;
	  }
	}