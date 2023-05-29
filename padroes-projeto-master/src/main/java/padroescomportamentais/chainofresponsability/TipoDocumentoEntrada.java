package padroescomportamentais.chainofresponsability;

public class TipoDocumentoEntrada implements TipoDocumento {

    private static TipoDocumentoEntrada tipoDocumentoEntrada = new TipoDocumentoEntrada();

    private TipoDocumentoEntrada() {};
    
    public static TipoDocumentoEntrada getTipoDocumentoEntrada() {
        return tipoDocumentoEntrada;
    }

}
