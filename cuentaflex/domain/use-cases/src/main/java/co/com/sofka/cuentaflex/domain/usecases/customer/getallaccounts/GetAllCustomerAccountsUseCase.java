package co.com.sofka.cuentaflex.domain.usecases.customer.getallaccounts;

import co.com.sofka.core.cryptography.aes.AESCipher;
import co.com.sofka.cuentaflex.domain.drivenports.repositories.AccountRepository;
import co.com.sofka.shared.domain.usecases.UseCase;

import java.util.List;

public final class GetAllCustomerAccountsUseCase implements UseCase<GetAllCustomerAccountsRequest, List<GetAllCustomerAccountsResponse>> {
    private final AccountRepository accountRepository;

    public GetAllCustomerAccountsUseCase(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public List<GetAllCustomerAccountsResponse> execute(GetAllCustomerAccountsRequest request) {
        return this.accountRepository
                .getByCustomerId(request.getCustomerId())
                .stream()
                .map(x -> {
                    return new GetAllCustomerAccountsResponse(
                            x.getId(),
                            AESCipher.encryptToBase64(String.valueOf(x.getNumber()), request.getSecretKey(), request.getInitializationVector()),
                            x.getAmount()
                    );
                })
                .toList();
    }
}
