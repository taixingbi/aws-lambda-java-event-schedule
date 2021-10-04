package com.hello;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

import com.amazonaws.services.lambda.runtime.events.ScheduledEvent;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

//public class Handler implements RequestStreamHandler{
//    private static final Logger logger = LoggerFactory.getLogger(Handler.class.getName());
//    Gson gson = new GsonBuilder().setPrettyPrinting().create();
//
//    @Override
//    public void handleRequest(InputStream input, OutputStream output,
//                              Context context)    {
//        logger.debug("\n------------------start---------------------");
//
//        logger.debug("------------------end---------------------\n");
//    }
//}

public class Handler implements RequestHandler<ScheduledEvent, Void> {
    private static final Logger logger = LoggerFactory.getLogger(Handler.class.getName());

    @Override
    public Void handleRequest(ScheduledEvent input, Context context) {
        logger.debug("\n------------------start---------------------");

        logger.debug("In Handler: Executing " + context.getFunctionName() + ", " + context.getFunctionVersion());
        logger.debug("ScheduledEvent: ", input.toString()); //This input is not really used now

        logger.debug("------------------end---------------------\n");
        return null;
    }
}



