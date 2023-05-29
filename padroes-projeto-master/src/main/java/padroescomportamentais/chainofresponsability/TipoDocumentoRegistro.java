package padroescomportamentais.chainofresponsability;

public class TipoDocumentoRegistro implements TipoDocumento {

    private static TipoDocumentoRegistro tipoDocumentoRegistro = new TipoDocumentoRegistro();

    private TipoDocumentoRegistro() {};

    public static TipoDocumentoRegistro getTipoDocumentoRegistro() {
        return tipoDocumentoRegistro;
    }
}
