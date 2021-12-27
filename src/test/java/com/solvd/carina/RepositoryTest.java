package com.solvd.carina;

import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import org.testng.annotations.Test;

public class RepositoryTest {

    @Test
    public void verifyDeleteRepositoryTest() {
        DeleteRepositoryMethod deleteRepositoryMethod = new DeleteRepositoryMethod();
        deleteRepositoryMethod.setHeaders(String.format("Authorization=%s","token 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"));
        deleteRepositoryMethod.expectResponseStatus(HttpResponseStatusType.NO_CONTENT_204);
        deleteRepositoryMethod.callAPI();
    }
}
