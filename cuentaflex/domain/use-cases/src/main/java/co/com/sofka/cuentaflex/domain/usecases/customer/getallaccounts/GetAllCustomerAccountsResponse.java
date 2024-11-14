package co.com.sofka.cuentaflex.domain.usecases.customer.getallaccounts;

import java.math.BigDecimal;

public final class GetAllCustomerAccountsResponse {
    private final String accountId;
    private final String encryptedNumber;
    private final BigDecimal amount;

    public GetAllCustomerAccountsResponse(String accountId, String encryptedNumber, BigDecimal amount) {
        this.accountId = accountId;
        this.encryptedNumber = encryptedNumber;
        this.amount = amount;
    }

    public String getAccountId() {
        return accountId;
    }

    public String getEncryptedNumber() {
        return encryptedNumber;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
