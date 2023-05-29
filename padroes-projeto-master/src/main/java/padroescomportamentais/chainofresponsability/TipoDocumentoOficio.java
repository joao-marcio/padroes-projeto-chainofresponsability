package padroescomportamentais.chainofresponsability;

public class TipoDocumentoOficio implements TipoDocumento {

    private static TipoDocumentoOficio tipoDocumentoOficio = new TipoDocumentoOficio();

    private TipoDocumentoOficio() {};

    public static TipoDocumentoOficio getTipoDocumentoOficio() {
        return tipoDocumentoOficio;
    }
}
