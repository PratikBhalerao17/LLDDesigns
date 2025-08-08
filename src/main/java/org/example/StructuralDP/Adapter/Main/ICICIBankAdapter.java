package org.example.StructuralDP.Adapter.Main;

import org.example.StructuralDP.Adapter.ThirdPartyServiceProvider.ICICIBank;

public class ICICIBankAdapter implements BankAPI{
    ICICIBank iciciBank = new ICICIBank();
    @Override
    public void sendMoney(String from, String to, int amount) {
        iciciBank.PayMoney(from, to, amount);
    }
}
