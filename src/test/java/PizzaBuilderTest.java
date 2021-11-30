
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PizzaBuilderTest {

    @Test
    void retornarExcecaoParaPizzaSemSabor() {
        try {
            PizzaBuilder pizzaBuilder = new PizzaBuilder();
            Pizza pizza = pizzaBuilder
                    .setTamanho(30)
                    .setTempero("Azeite")
                    .build();
        } catch (IllegalArgumentException e) {
            assertEquals("Sabor inválido", e.getMessage());
        }
    }

    @Test
    void retornarExcecaoParaPizzaSemTamanho() {
        try {
            PizzaBuilder pizzaBuilder = new PizzaBuilder();
            Pizza pizza = pizzaBuilder
                    .setSabor("Pepperoni")
                    .setMolho("Tomate com pimenta")
                    .build();
        } catch (IllegalArgumentException e) {
            assertEquals("Tamanho inválido", e.getMessage());
        }
    }

    @Test
    void retornarPizzaValida() {
        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        Pizza pizza = pizzaBuilder
                .setTamanho(40)
                .setSabor("Frango com catupiry")
                .setQueijo("Parmesao")
                .build();

        assertNotNull(pizza);
    }
}
