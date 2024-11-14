package co.com.sofka.cuentaflex.infrastructure.entrypoints.rest.constants;

public final class CustomerEndpointsConstants {
    public static final String CUSTOMER_BASE_URL = "/customers";

    public static final String CREATE_CUSTOMER_ACCOUNT_ENDPOINT = CUSTOMER_BASE_URL + "/accounts";
    public static final String GET_ALL_CUSTOMER_ACCOUNTS = CUSTOMER_BASE_URL + "/accounts/get-all";
    public static final String GET_CUSTOMER_ACCOUNT = CUSTOMER_BASE_URL + "/accounts/by-id";
}
