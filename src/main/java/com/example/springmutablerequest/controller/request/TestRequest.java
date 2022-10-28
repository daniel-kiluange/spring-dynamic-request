package com.example.springmutablerequest.controller.request;

import java.util.Map;

public record TestRequest(String context, Map<String,?> content) {

}
