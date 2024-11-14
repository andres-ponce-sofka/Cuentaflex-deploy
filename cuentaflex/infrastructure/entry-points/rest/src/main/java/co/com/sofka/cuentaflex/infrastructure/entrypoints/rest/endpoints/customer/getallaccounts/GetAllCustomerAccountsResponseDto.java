package co.com.sofka.cuentaflex.infrastructure.entrypoints.rest.endpoints.customer.getallaccounts;

import java.math.BigDecimal;

public final class GetAllCustomerAccountsResponseDto {
    private String accountId;
    private String encryptedNumber;
    private BigDecimal amount;

    public GetAllCustomerAccountsResponseDto() {
    }

    public GetAllCustomerAccountsResponseDto(String accountId, String encryptedNumber, BigDecimal amount) {
        this.accountId = accountId;
        this.encryptedNumber = encryptedNumber;
        this.amount = amount;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getEncryptedNumber() {
        return encryptedNumber;
    }

    public void setEncryptedNumber(String encryptedNumber) {
        this.encryptedNumber = encryptedNumber;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
