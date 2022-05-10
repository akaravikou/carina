package com.solvd.carina;

import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.solvd.carina.api.DeleteRepositoryMethod;
import com.solvd.carina.api.PatchRepositoryMethod;
import com.solvd.carina.api.PostRepositoryMethod;
import com.solvd.carina.api.PutRepositoryMethod;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;

public class RepositoryTest {

    @Test
    public void verifyDeleteRepositoryTest() {
        DeleteRepositoryMethod deleteRepositoryMethod = new DeleteRepositoryMethod();
        deleteRepositoryMethod.setHeaders(String.format("Authorization=%s", "token xxx"));
        deleteRepositoryMethod.expectResponseStatus(HttpResponseStatusType.NO_CONTENT_204);
        deleteRepositoryMethod.callAPI();
    }

    @Test
    public void verifyPostRepositoryTest() {
        PostRepositoryMethod postRepositoryMethod = new PostRepositoryMethod();
        postRepositoryMethod.setHeaders(String.format("Authorization=%s", "token xxx"));
        postRepositoryMethod.expectResponseStatus(HttpResponseStatusType.CREATED_201);
        postRepositoryMethod.callAPI();
        postRepositoryMethod.validateResponse(JSONCompareMode.LENIENT);
    }

    @Test
    public void verifyPatchRepositoryTest() {
        PatchRepositoryMethod patchRepositoryMethod = new PatchRepositoryMethod();
        patchRepositoryMethod.setHeaders(String.format("Authorization=%s", "token xxx"));
        patchRepositoryMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        patchRepositoryMethod.callAPI();
        patchRepositoryMethod.validateResponse();
    }

    @Test
    public void verifyPutRepositoryTest() {
        PutRepositoryMethod putRepositoryMethod = new PutRepositoryMethod();
        putRepositoryMethod.setHeaders(String.format("Authorization=%s", "token xxx"));
        putRepositoryMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        putRepositoryMethod.callAPI();
        putRepositoryMethod.validateResponse();
    }
}
