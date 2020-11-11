package com.eample.verifi;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.0.1.
 */
public class Smart_contract_sol_Authentic extends Contract {
    private static final String BINARY = "6060604052341561000f57600080fd5b60008054600160a060020a033316600160a060020a03199091161790556108098061003b6000396000f300606060405263ffffffff7c010000000000000000000000000000000000000000000000000000000060003504166336f46748811461005257806367a6377a1461011a578063747542821461030957600080fd5b341561005d57600080fd5b6100a360046024813581810190830135806020601f8201819004810201604051908101604052818152929190602084018383808284375094965061034595505050505050565b60405160208082528190810183818151815260200191508051906020019080838360005b838110156100df5780820151838201526020016100c7565b50505050905090810190601f16801561010c5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b341561012557600080fd5b6102f760046024813581810190830135806020601f8201819004810201604051908101604052818152929190602084018383808284378201915050505050509190803590602001908201803590602001908080601f01602080910402602001604051908101604052818152929190602084018383808284378201915050505050509190803590602001908201803590602001908080601f01602080910402602001604051908101604052818152929190602084018383808284378201915050505050509190803590602001908201803590602001908080601f01602080910402602001604051908101604052818152929190602084018383808284378201915050505050509190803590602001908201803590602001908080601f01602080910402602001604051908101604052818152929190602084018383808284378201915050505050509190803590602001908201803590602001908080601f01602080910402602001604051908101604052818152929190602084018383808284378201915050505050509190803590602001908201803590602001908080601f01602080910402602001604051908101604052818152929190602084018383808284375094965061045595505050505050565b60405190815260200160405180910390f35b341561031457600080fd5b61031c61069f565b60405173ffffffffffffffffffffffffffffffffffffffff909116815260200160405180910390f35b61034d6106bb565b6001826040518082805190602001908083835b6020831061037f5780518252601f199092019160209182019101610360565b6001836020036101000a03801982511681845116808217855250505050505090500191505090815260200160405180910390206004018054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156104495780601f1061041e57610100808354040283529160200191610449565b820191906000526020600020905b81548152906001019060200180831161042c57829003601f168201915b50505050509050919050565b6000805481903373ffffffffffffffffffffffffffffffffffffffff90811691161461048057600080fd5b808980516104929291602001906106cd565b50600181018880516104a89291602001906106cd565b50600281018780516104be9291602001906106cd565b50600381018680516104d49291602001906106cd565b50600481018580516104ea9291602001906106cd565b50600581018480516105009291602001906106cd565b50600681018380516105169291602001906106cd565b508060018a6040518082805190602001908083835b6020831061054a5780518252601f19909201916020918201910161052b565b6001836020036101000a03801982511681845116808217855250505050505090500191505090815260200160405190819003902081546105a090829084906002600019610100600184161502019091160461074b565b50600182018160010190805460018160011615610100020316600290046105c892919061074b565b50600282810180546105ed92848101929160001961010060018316150201160461074b565b506003820181600301908054600181600116156101000203166002900461061592919061074b565b506004820181600401908054600181600116156101000203166002900461063d92919061074b565b506005820181600501908054600181600116156101000203166002900461066592919061074b565b506006820181600601908054600181600116156101000203166002900461068d92919061074b565b5060019b9a5050505050505050505050565b60005473ffffffffffffffffffffffffffffffffffffffff1681565b60206040519081016040526000815290565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f1061070e57805160ff191683800117855561073b565b8280016001018555821561073b579182015b8281111561073b578251825591602001919060010190610720565b506107479291506107c0565b5090565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f10610784578054855561073b565b8280016001018555821561073b57600052602060002091601f016020900482015b8281111561073b5782548255916001019190600101906107a5565b6107da91905b8082111561074757600081556001016107c6565b905600a165627a7a7230582079b5a0a48100c3701ec11850f6dc29dfe2984ef48acfb406e228b719c2b8c7e10029";

    public static final String FUNC_ASK_OWNER_NAME = "ask_owner_name";

    public static final String FUNC_ADDPRODUCT = "addProduct";

    public static final String FUNC_MANUFACTURER = "manufacturer";

    @Deprecated
    protected Smart_contract_sol_Authentic(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Smart_contract_sol_Authentic(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Smart_contract_sol_Authentic(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Smart_contract_sol_Authentic(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<TransactionReceipt> ask_owner_name(String _id) {
        final Function function = new Function(
                FUNC_ASK_OWNER_NAME, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_id)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> addProduct(String _id, String p_name, String model_, String brand_, String owner_, String owner_loc, String m_name) {
        final Function function = new Function(
                FUNC_ADDPRODUCT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_id), 
                new org.web3j.abi.datatypes.Utf8String(p_name), 
                new org.web3j.abi.datatypes.Utf8String(model_), 
                new org.web3j.abi.datatypes.Utf8String(brand_), 
                new org.web3j.abi.datatypes.Utf8String(owner_), 
                new org.web3j.abi.datatypes.Utf8String(owner_loc), 
                new org.web3j.abi.datatypes.Utf8String(m_name)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> manufacturer() {
        final Function function = new Function(FUNC_MANUFACTURER, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    @Deprecated
    public static Smart_contract_sol_Authentic load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Smart_contract_sol_Authentic(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Smart_contract_sol_Authentic load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Smart_contract_sol_Authentic(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Smart_contract_sol_Authentic load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Smart_contract_sol_Authentic(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Smart_contract_sol_Authentic load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Smart_contract_sol_Authentic(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<Smart_contract_sol_Authentic> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Smart_contract_sol_Authentic.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    public static RemoteCall<Smart_contract_sol_Authentic> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Smart_contract_sol_Authentic.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Smart_contract_sol_Authentic> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Smart_contract_sol_Authentic.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Smart_contract_sol_Authentic> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Smart_contract_sol_Authentic.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }
}
