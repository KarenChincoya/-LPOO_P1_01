class Billing{//photo book stores
  public Double computeBill(Double price){
    return price*1.08;
  }
  public Double computeBill(Double price, Double quantityOrdered){
    return (price*quantityOrdered)*1.08;
  }
  public Double computeBill(Double price, Double quantityOrdered, Double couponValue){
    return ((price*quantityOrdered)-couponValue)*1.08;
  }
}
