package com.mscharhag.mvc.csrf;

import javax.mvc.security.Csrf;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashMap;
import java.util.Map;

@ApplicationPath("csrf")
public class CsrfApplication extends Application {

    @Override
    public Map<String, Object> getProperties() {
        Map<String, Object> props = new HashMap<>();

        props.put(Csrf.CSRF_PROTECTION, Csrf.CsrfOptions.IMPLICIT);
        return props;
    }
}
