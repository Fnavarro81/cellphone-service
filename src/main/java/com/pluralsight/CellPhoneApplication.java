package com.pluralsight;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone cellPhone1 = new CellPhone();
        cellPhone1.setSerialNumber(1000);
        cellPhone1.setModel("Samsung Galaxy S23+");
        cellPhone1.setCarrier("Tmobile");
        cellPhone1.setPhoneNUmber("708-663-9685");
        cellPhone1.setOwner("Fabian");

        System.out.println(cellPhone1.getModel());
        System.out.println(cellPhone1.getCarrier());
    }
}
