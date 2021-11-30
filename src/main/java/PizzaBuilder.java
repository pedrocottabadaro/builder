public class PizzaBuilder {

    private Pizza pizza;
    public PizzaBuilder() {

        pizza=new Pizza();
    }

    public Pizza build(){
        if (pizza.getTamanho() == 0) {
            throw new IllegalArgumentException("Tamanho inválido");
        }
        if (pizza.getSabor().equals("")) {
            throw new IllegalArgumentException("Sabor inválido");
        }
        return pizza;
    }

    public PizzaBuilder setTamanho(int tamanho) {
        pizza.setTamanho(tamanho);
        return this;
    }

    public PizzaBuilder setSabor(String sabor) {
        pizza.setSabor(sabor);
        return this;
    }

    public PizzaBuilder setBorda(String borda) {
        pizza.setBorda(borda);
        return this;
    }
    public PizzaBuilder setQueijo(String queijo) {
        pizza.setQueijo(queijo);
        return this;
    }
    public PizzaBuilder setMolho(String molho) {
        pizza.setMolho(molho);
        return this;
    }
    public PizzaBuilder setTempero(String tempero) {
        pizza.setTempero(tempero);
        return this;
    }
    public PizzaBuilder setPimenta(String pimenta) {
        pizza.setPimenta(pimenta);
        return this;
    }



}
