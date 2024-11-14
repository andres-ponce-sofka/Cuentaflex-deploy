package co.com.sofka.cuentaflex.infrastructure.entrypoints.rest.endpoints.customer.getallaccounts;

import co.com.sofka.cuentaflex.domain.usecases.customer.getallaccounts.GetAllCustomerAccountsRequest;
import co.com.sofka.cuentaflex.domain.usecases.customer.getallaccounts.GetAllCustomerAccountsResponse;
import co.com.sofka.cuentaflex.domain.usecases.customer.getallaccounts.GetAllCustomerAccountsUseCase;
import co.com.sofka.cuentaflex.infrastructure.entrypoints.rest.constants.CustomerEndpointsConstants;
import co.com.sofka.shared.infrastructure.entrypoints.din.DinRequest;
import co.com.sofka.shared.infrastructure.entrypoints.din.DinResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(CustomerEndpointsConstants.GET_ALL_CUSTOMER_ACCOUNTS)
@Tag(name = "Customer Account")
public final class GetAllCustomerAccountsEndpoint {
    private final GetAllCustomerAccountsUseCase getAllCustomerAccountsUseCase;

    public GetAllCustomerAccountsEndpoint(GetAllCustomerAccountsUseCase getAllCustomerAccountsUseCase) {
        this.getAllCustomerAccountsUseCase = getAllCustomerAccountsUseCase;
    }

    @PostMapping
    public ResponseEntity<DinResponse<List<GetAllCustomerAccountsResponseDto>>> getAllCustomerAccounts(
            @RequestBody DinRequest<GetAllCustomerAccountsRequestDto> request
    ) {
        GetAllCustomerAccountsRequest useCaseRequest = GetAllCustomerAccountsMapper.fromDinToUseCaseRequest(request);

        List<GetAllCustomerAccountsResponse> useCaseResponse = this.getAllCustomerAccountsUseCase.execute(useCaseRequest);

        DinResponse<List<GetAllCustomerAccountsResponseDto>> response = GetAllCustomerAccountsMapper.fromUseCaseToDinResponse(
                request.getDinHeader(),
                useCaseResponse
        );

        HttpStatus status = response.getDinBody().isEmpty() ? HttpStatus.NO_CONTENT : HttpStatus.OK;

        return ResponseEntity.status(status).body(response);
    }
}
