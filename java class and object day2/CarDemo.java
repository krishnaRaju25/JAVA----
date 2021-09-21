class CarDemo {
    public static void main(String[] args) {
        Tyre t1=new Tyre("MRF",19);
        Tyre t2=new Tyre("Apollo",18);

        Entertainment e1=new Entertainment("bolt",4,true,12);
        Entertainment e2=new Entertainment("skullcandy",6,true,8);

        Car c1=new Car("nexon","petrol",1200, 111.11f,5);
        Car c2=new Car("rollsroycee","petrol",2000,350.20f,5);
       c1.setTyre(t1);
       c2.setTyre(t2);
       c1.setEntertainment(e1);
       c2.setEntertainment(e2);
         c1.displayFeature();
        System.out.println("CAR 2");
        c2.setName("honda city");
        c2.displayFeature();

    }
}
