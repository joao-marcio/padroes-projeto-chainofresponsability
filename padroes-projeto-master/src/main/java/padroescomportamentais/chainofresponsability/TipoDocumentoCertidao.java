package padroescomportamentais.chainofresponsability;

public class TipoDocumentoCertidao implements TipoDocumento {

    private static TipoDocumentoCertidao tipoDocumentoCertidao = new TipoDocumentoCertidao();

    private TipoDocumentoCertidao() {};
    
    public static TipoDocumentoCertidao getTipoDocumentoCertidao() {
        return tipoDocumentoCertidao;
    }

}
