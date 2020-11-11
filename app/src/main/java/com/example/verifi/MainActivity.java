package com.example.verifi;


import android.os.Bundle;
import android.app.Activity;
import android.widget.Toast;
import org.web3j.crypto.Credentials;
import com.eample.verifi.Smart_contract_sol_Authentic;
//import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;

import java.math.BigInteger;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String block_address = "0x8514eb450312b402d59a4ae975db972368d781db";
        String url = "https://rinkeby.infura.io/v3/2b9986ae6d9c4702b46eedf234438f9b";
        Web3j web3j = Web3j.build(new HttpService(url));
        BigInteger GAS_LIMIT = BigInteger.valueOf(6721975L);
        BigInteger GAS_PRICE = BigInteger.valueOf(20000000000L);
        Credentials credentials = Credentials.create("45d0231a1aee355d148f0445bb5eff0607fdae0690f95d760186a78fb5a9097c");
        Smart_contract_sol_Authentic authenticate = Smart_contract_sol_Authentic.load(block_address, web3j, credentials, GAS_LIMIT, GAS_PRICE);
        String owner = authenticate.ask_owner_name());
        Toast.makeText(this, owner, Toast.LENGTH_SHORT).show();
    }
}
