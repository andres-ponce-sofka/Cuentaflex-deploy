package co.com.sofka.cuentaflex.domain.usecases.customer.getallaccounts;

public final class GetAllCustomerAccountsRequest {
    private final String customerId;
    private final String initializationVector;
    private final String secretKey;

    public GetAllCustomerAccountsRequest(String customerId, String initializationVector, String secretKey) {
        this.customerId = customerId;
        this.initializationVector = initializationVector;
        this.secretKey = secretKey;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getInitializationVector() {
        return initializationVector;
    }

    public String getSecretKey() {
        return secretKey;
    }
}
