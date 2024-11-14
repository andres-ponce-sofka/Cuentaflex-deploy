package co.com.sofka.cuentaflex.infrastructure.entrypoints.rest.endpoints.customer.getallaccounts;

import co.com.sofka.cuentaflex.domain.usecases.customer.getallaccounts.GetAllCustomerAccountsRequest;
import co.com.sofka.cuentaflex.domain.usecases.customer.getallaccounts.GetAllCustomerAccountsResponse;
import co.com.sofka.shared.infrastructure.entrypoints.din.DinHeader;
import co.com.sofka.shared.infrastructure.entrypoints.din.DinRequest;
import co.com.sofka.shared.infrastructure.entrypoints.din.DinResponse;

import java.util.List;

public final class GetAllCustomerAccountsMapper {
    public static GetAllCustomerAccountsRequest fromDinToUseCaseRequest(DinRequest<GetAllCustomerAccountsRequestDto> request) {
        return new GetAllCustomerAccountsRequest(
                request.getDinBody().getCustomerId(),
                request.getDinHeader().getInitializationVector(),
                request.getDinHeader().getSymmetricKey()
        );
    }

    public static DinResponse<List<GetAllCustomerAccountsResponseDto>> fromUseCaseToDinResponse(
            DinHeader dinHeader,
            List<GetAllCustomerAccountsResponse> response
    ) {
        return new DinResponse<>(
                dinHeader,
                response
                        .stream()
                        .map(
                                x -> {
                                    return new GetAllCustomerAccountsResponseDto(
                                            x.getAccountId(),
                                            x.getEncryptedNumber(),
                                            x.getAmount()
                                    );
                                }
                        )
                        .toList()
        );
    }
}
