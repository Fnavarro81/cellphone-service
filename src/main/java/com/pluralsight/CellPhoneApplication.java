package com.pluralsight;

public class CellPhoneApplication {
    public static void display(CellPhone phone){
        System.out.println("Model: " + phone.getModel());
        System.out.println("Phone Number: " + phone.getPhoneNUmber());
        System.out.println("Owner: " + phone.getOwner());

    }
    public static void main(String[] args) {
        CellPhone cellPhone1 = new CellPhone();
        cellPhone1.setSerialNumber(1000);
        cellPhone1.setModel("Samsung Galaxy S23+");
        cellPhone1.setCarrier("Tmobile");
        cellPhone1.setPhoneNUmber("708-663-9685");
        cellPhone1.setOwner("Fabian");

        CellPhone cellPhone2 = new CellPhone();
        cellPhone2.setSerialNumber(999);
        cellPhone2.setModel("IPhone S23");
        cellPhone2.setCarrier("Boost Mobile");
        cellPhone2.setPhoneNUmber("312-555-5555");
        cellPhone2.setOwner("Raul");

        display(cellPhone1);
        display(cellPhone2);

        cellPhone1.dial(cellPhone2.getPhoneNUmber());
        cellPhone2.dial(cellPhone1.getPhoneNUmber());
    }
}
