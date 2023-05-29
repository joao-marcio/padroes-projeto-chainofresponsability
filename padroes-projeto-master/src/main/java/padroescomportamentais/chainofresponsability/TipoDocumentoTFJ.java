package padroescomportamentais.chainofresponsability;

public class TipoDocumentoTFJ implements TipoDocumento {

    private static TipoDocumentoTFJ tipoDocumentoTFJ = new TipoDocumentoTFJ();

    private TipoDocumentoTFJ() {};
    
    public static TipoDocumentoTFJ getTipoDocumentoBoleto() {
        return tipoDocumentoTFJ;
    }
}
