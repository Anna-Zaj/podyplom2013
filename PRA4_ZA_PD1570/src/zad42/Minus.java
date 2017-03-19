package zad42;

import java.math.BigDecimal;

public class Minus extends Operator {
	public BigDecimal compute(BigDecimal l1, BigDecimal l2)   {
		  BigDecimal wyn=l1;
		  wyn=wyn.subtract(l2);
		  
	    return wyn;
	  }
	}
