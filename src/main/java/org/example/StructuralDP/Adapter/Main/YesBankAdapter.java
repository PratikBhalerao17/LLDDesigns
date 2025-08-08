package org.example.StructuralDP.Adapter.Main;

import org.example.StructuralDP.Adapter.ThirdPartyServiceProvider.YesBank;

public class YesBankAdapter implements BankAPI{
    YesBank yesBank =  new YesBank();
    @Override
    public void sendMoney(String from, String to, int amount) {
        yesBank.transferMoney(amount,from,to);
    }
}
