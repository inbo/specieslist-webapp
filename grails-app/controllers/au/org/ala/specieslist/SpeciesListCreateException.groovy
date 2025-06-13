package au.org.ala.specieslist

class SpeciesListCreateException extends Exception{
    SpeciesListCreateException(String message) {
        super(message)
    }

    SpeciesListCreateException(String message, Throwable cause) {
        super(message, cause)
    }
}
