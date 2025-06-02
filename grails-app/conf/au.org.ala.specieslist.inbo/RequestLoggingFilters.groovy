package au.org.ala.specieslist.inbo

class RequestLoggingFilters {
    def filters = {
        all(controller: '*', action: '*') {
            before = {
                log.info "Inbo-debug: Incoming request: ${request.method} ${request.requestURI} | params: ${params}"
                return true
            }
        }
    }
}
