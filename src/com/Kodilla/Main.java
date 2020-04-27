package com.Kodilla;

public class Main {

    public static void main(String[] args) {
	    MobilePhone Alcatel = new MobilePhone("200 gram",300);
	    MobilePhone phone = new MobilePhone("200g" ,700);
        MobilePhone oldphone = new MobilePhone("4000g" ,250);
        MobilePhone mediumphone = new MobilePhone("600g" ,140);

        System.out.println(Alcatel.showPrice());
        System.out.println(Alcatel.priceMinusTenProcent());
        System.out.println(Alcatel.pricePlusDefaultValue(50));

        phone.checkPrice();
        oldphone.checkPrice();
        mediumphone.checkPrice();
        //metoda do liczb parzystych z 1 parametrem
        phone.numberEven(20);
        //metoda z 2 parametrami , min i max
        phone.numberEvenMinToMax(10,16);
        //metoda zwracajaca liczbe podzielna przez 3 i 5
        phone.isDevided(4,18);
        //metoda sumujaca liczby parzyste z przedzialu
        phone.getEvenSum(5,9);
        //metoda zwracająca liczby od min do max
        phone.getNumberReverse(5,-2);




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
    public void checkPrice(){
        if(this.price<200){
            System.out.println("This price is very good !");
        }else  if(this.price<300){
            System.out.println("This price is good !");
        }else  if(this.price<550){
            System.out.println("This price cloud be lower!");
        }else{
            System.out.println("This price is too expensive");
        }
    }
    public void numberEven(int max){
        for (int i = 0; i <21 ; i=i+2) {
            System.out.println(i);
        }

    }
    public void numberEvenMinToMax(int min1 , int max1){
        for (int i = min1; i <max1 ; i++) {
            if(i%2==0) {
                System.out.println(i);
            }
        }
    }
    public void isDevided(int numberMin, int numberMax){
        int counter=0;
        for (int i = numberMin; i <=numberMax ; i++) {
            if(i%3==0||i%5==0){
              counter++;
            }
        }
        System.out.println(counter);
    }
    public void getEvenSum(int minEvenNumber , int maxEvenNumber){
        int sumOfNumbersEven=0;
        for (int i = minEvenNumber; i <=maxEvenNumber ; i++) {
            if(i%2==0){
                sumOfNumbersEven+=i;
            }
        }
        System.out.println(sumOfNumbersEven);

    }
    public void getNumberReverse(int minValue , int maxValue){
        for (int i = minValue; i >=maxValue ; i--) {
            System.out.println(i);

        }
    }


}
