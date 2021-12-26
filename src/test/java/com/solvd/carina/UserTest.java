package com.solvd.carina;

import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import org.testng.annotations.Test;

public class UserTest {

    @Test
    public void verifyUserTest(){
        GetUserMethod getUserMethod = new GetUserMethod();
        getUserMethod.setHeaders(String.format("Authorization=%s","token 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"));
        getUserMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        getUserMethod.callAPI();
        getUserMethod.validateResponse();
    }
}
