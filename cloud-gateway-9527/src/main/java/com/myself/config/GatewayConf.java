package com.myself.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zxq
 * 2020/4/9
 */
//@Configuration
public class GatewayConf {

    @Bean
    public RouteLocator myRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("gateway_1",
                r->r.path("/getEmp/**").uri("http://localhost:8001")).build();
        return routes.build();
    }


}
