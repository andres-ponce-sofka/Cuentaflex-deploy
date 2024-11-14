package co.com.sofka.cuentaflex.infrastructure.entrypoints.rest.endpoints.customer.getallaccounts;

public final class GetAllCustomerAccountsRequestDto {
    private String customerId;

    public GetAllCustomerAccountsRequestDto() {
    }

    public GetAllCustomerAccountsRequestDto(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}
