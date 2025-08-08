package org.example.StructuralDP.Adapter.Main;

public class PhonePe {
    public static void main(String[] args) {
        BankAPI yba = new ICICIBankAdapter();
        yba.sendMoney("Pratik","Pankaj",40000);
    }
}
