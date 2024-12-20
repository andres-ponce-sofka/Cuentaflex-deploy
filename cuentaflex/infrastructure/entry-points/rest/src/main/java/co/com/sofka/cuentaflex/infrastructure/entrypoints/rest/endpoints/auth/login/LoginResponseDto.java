package co.com.sofka.cuentaflex.infrastructure.entrypoints.rest.endpoints.auth.login;

public final class LoginResponseDto {
    private String customerId;
    private String token;

    public LoginResponseDto() {
    }

    public LoginResponseDto(String customerId, String token) {
        this.customerId = customerId;
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}
