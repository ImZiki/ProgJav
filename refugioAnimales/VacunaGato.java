public enum VacunaGato implements Vacuna {
    HERPES("Herpes Felino Tipo 1", true, 36),
    CALICIVIRUS("Calicivirus", true, 36),
    PANLEUCOPENIA("Panleucopenia", true, 36),
    FCORONAVIRUS("Coronavirus", false, 0),
    PERITONITIS("Peritonitis Infecciosa", false, 12);
    
    private String nombre;
    private boolean esencial;
    private int revacunacion;

    VacunaGato(String nombre, boolean esencial, int revacunacion) {
        this.nombre = nombre;
        this.esencial = esencial;
        this.revacunacion = revacunacion;
    }

    @Override
    public String nombre() {
        return nombre;
    }

    @Override
    public boolean esEsencial() {
        return esencial;
    }
}
