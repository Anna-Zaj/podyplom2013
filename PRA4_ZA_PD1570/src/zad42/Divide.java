package zad42;

import java.math.BigDecimal;

public class Divide extends Operator {
	  public BigDecimal compute(BigDecimal l1, BigDecimal l2)   {
		  BigDecimal wyn=l1;
		  wyn=wyn.divide(l2);
	
	    return wyn;
	  }}
