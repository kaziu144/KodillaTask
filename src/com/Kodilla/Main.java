package com.Kodilla;

public class Main {

    public static void main(String[] args) {
	MobilePhone Alcatel = new MobilePhone("200 gram",300);
        System.out.println(Alcatel.showPrice());
        System.out.println(Alcatel.priceMinusTenProcent());
        System.out.println(Alcatel.pricePlusDefaultValue(50));
    }
}
class MobilePhone{
    String weight;
    int price;
    public MobilePhone(String weight, int price){
        this.weight=weight;
        this.price=price;

    }
    public void displayValues(){
        System.out.println(this.weight+ " "+ this.price);
    }
    public  String getParameters(){
        return this.weight+" "+this.price;
    }
    public String showPrice(){
        return "Cena telefonu to "+this.price;
    }
    public String priceMinusTenProcent(){
        double result =this.price-(10.0/100*this.price);
        return "Cena po obniżce 10% : "+result;
    }
    public String pricePlusDefaultValue(int value){
        double result = this.price+value;
        return "Cena po zwiekszeniu :"+result;
    }

}
