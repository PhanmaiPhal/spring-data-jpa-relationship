package org.example.ide2markingapi.mapper;

import org.example.ide2markingapi.domain.Account;
import org.example.ide2markingapi.domain.User;
import org.example.ide2markingapi.domain.UserAccount;
import org.example.ide2markingapi.feature.account.dto.AccountCreateRequest;
import org.example.ide2markingapi.feature.account.dto.AccountResponse;
<<<<<<< HEAD
import org.example.ide2markingapi.feature.account.dto.AccountSnippetResponse;
=======
>>>>>>> origin/homework4
import org.example.ide2markingapi.feature.users.dto.UserResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring",uses = {
        UserMapper.class,AccountTypeMapper.class
})
public interface AccountMapper {
    //dto to entity
    Account fromAccountCreateRequest(AccountCreateRequest accountCreateRequest);
<<<<<<< HEAD
    @Mapping (source = "userAccountList",target = "user",qualifiedByName = "mapUserResponse")
    AccountResponse toAccountResponse(Account account);
    @Mapping(source = "userAccountList",target = "user",qualifiedByName = "mapUserResponse")
    List<AccountResponse> toAccountResponse(List<Account> accounts);
    AccountSnippetResponse toAccountSnippetResponse(Account account);
=======


    @Mapping (source = "userAccountList",target = "user",qualifiedByName = "mapUserResponse")
    AccountResponse toAccountResponse(Account account);

    @Mapping(source = "userAccountList",target = "user",qualifiedByName = "mapUserResponse")
    List<AccountResponse> toAccountResponse(List<Account> accounts);
>>>>>>> origin/homework4

//    UserResponse toUserResponse(User user);

}



