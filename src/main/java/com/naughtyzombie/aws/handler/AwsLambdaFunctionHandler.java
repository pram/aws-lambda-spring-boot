package com.naughtyzombie.aws.handler;

import com.naughtyzombie.aws.domain.Request;
import com.naughtyzombie.aws.domain.Response;
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

public class AwsLambdaFunctionHandler extends SpringBootRequestHandler<Request, Response> {
}
