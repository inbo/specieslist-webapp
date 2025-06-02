package au.org.ala.specieslist

import grails.artefact.Interceptor
import groovy.transform.CompileStatic

@CompileStatic
class RequestLoggingInterceptor implements Interceptor{
    RequestLoggingInterceptor() {
        matchAll() // intercept all requests
    }

    boolean before() {
        log.info("Incoming request: ${request.method} ${request.requestURI} from IP: ${request.remoteAddr}")
        return true
    }
}
