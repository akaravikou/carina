package com.solvd.carina;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.ContentType;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

import javax.annotation.PropertyKey;


@Endpoint(url = "${base_url}/user", methodType = HttpMethodType.GET)
@ContentType(type = "application/json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)

public class GetUserMethod extends AbstractApiMethodV2 {

    public GetUserMethod() {
        super(null, "users/getuserresponse.json", "users/user.properties");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}
