package zad42;

import java.math.BigDecimal;

public class Multiply extends Operator {
	public BigDecimal compute(BigDecimal l1, BigDecimal l2)   {
		  BigDecimal wyn=l1;
		  wyn=wyn.multiply(l2);
	
	    return wyn;
	  }
	}