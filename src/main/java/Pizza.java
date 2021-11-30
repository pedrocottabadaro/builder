public class Pizza {
    private String sabor;
    private String tempero;
    private String queijo;
    private String pimenta;
    private Integer tamanho;
    private String borda;
    private String molho;


    public Pizza() {
        this.tamanho=15;
        this.sabor="mussarela";
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getTempero() {
        return tempero;
    }

    public void setTempero(String tempero) {
        this.tempero = tempero;
    }

    public String getQueijo() {
        return queijo;
    }

    public void setQueijo(String queijo) {
        this.queijo = queijo;
    }

    public String getPimenta() {
        return pimenta;
    }

    public void setPimenta(String pimenta) {
        this.pimenta = pimenta;
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    public String getBorda() {
        return borda;
    }

    public void setBorda(String borda) {
        this.borda = borda;
    }

    public String getMolho() {
        return molho;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }




}

