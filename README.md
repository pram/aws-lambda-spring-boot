# aws-lambda-spring-boot
AWS Lambda Functions with Spring Boot

AWS Policy for deployment with Serverless
`
{
    "Version": "2012-10-17",
    "Statement": [
        {
            "Sid": "VisualEditor0",
            "Effect": "Allow",
            "Action": [
                "lambda:CreateFunction",
                "lambda:ListVersionsByFunction",
                "iam:CreateRole",
                "lambda:GetFunctionConfiguration",
                "cloudformation:DescribeStackResource",
                "iam:AttachRolePolicy",
                "iam:PutRolePolicy",
                "s3:ListObjects",
                "apigateway:DELETE",
                "iam:PassRole",
                "cloudformation:DescribeStackEvents",
                "iam:DetachRolePolicy",
                "iam:DeleteRolePolicy",
                "apigateway:PATCH",
                "cloudformation:UpdateStack",
                "lambda:DeleteFunction",
                "logs:FilterLogEvents",
                "apigateway:GET",
                "s3:HeadBucket",
                "lambda:GetAlias",
                "cloudformation:List*",
                "iam:GetRole",
                "lambda:ListFunctions",
                "logs:DescribeLogGroups",
                "apigateway:PUT",
                "lambda:InvokeFunction",
                "lambda:GetFunction",
                "lambda:UpdateFunctionConfiguration",
                "cloudformation:DescribeStackResources",
                "iam:DeleteRole",
                "cloudwatch:GetMetricStatistics",
                "logs:CreateLogGroup",
                "lambda:UpdateAlias",
                "cloudformation:DescribeStacks",
                "iam:CreatePolicy",
                "lambda:UpdateFunctionCode",
                "lambda:AddPermission",
                "s3:ListAllMyBuckets",
                "cloudformation:CreateStack",
                "cloudformation:GetTemplate",
                "cloudformation:DeleteStack",
                "lambda:PublishVersion",
                "apigateway:POST",
                "lambda:RemovePermission",
                "cloudformation:ValidateTemplate",
                "lambda:CreateAlias"
            ],
            "Resource": "*"
        },
        {
            "Sid": "VisualEditor1",
            "Effect": "Allow",
            "Action": "s3:*",
            "Resource": "arn:aws:s3:::*/*"
        },
        {
            "Sid": "VisualEditor2",
            "Effect": "Allow",
            "Action": "s3:*",
            "Resource": "arn:aws:s3:::*"
        }
    ]
}
`