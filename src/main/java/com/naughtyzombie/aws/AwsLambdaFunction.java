package com.naughtyzombie.aws;

import com.naughtyzombie.aws.domain.Request;
import com.naughtyzombie.aws.domain.Response;
import com.naughtyzombie.aws.service.AwsLambaService;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component("awsLambdaFunction")
public class AwsLambdaFunction implements Function<Request, Response> {

    private final AwsLambaService service;

    public AwsLambdaFunction(AwsLambaService service) {
        this.service = service;
    }

    @Override
    public Response apply(final Request request) {
        final Response result = new Response();
        result.setResult(service.uppercase(request.getInput()));
        return result;
    }
}
