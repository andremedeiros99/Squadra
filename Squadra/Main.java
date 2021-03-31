package Squadra;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cozinha cozinhaMineira = new Cozinha(
                Cozinha.Especialidade.Mineira, 14, 20, "Feijoada"
        );

        var ingrediente = new Ingrediente("Feijão", LocalDate.of(2030, 12, 31));
        cozinhaMineira.adicionarIngrediente(ingrediente);
        ingrediente = new Ingrediente("Farinha", LocalDate.of(2030, 12, 31));
        cozinhaMineira.adicionarIngrediente(ingrediente);
        ingrediente = new Ingrediente("Arroz", LocalDate.of(2030, 12, 31));
        cozinhaMineira.adicionarIngrediente(ingrediente);
        ingrediente = new Ingrediente("Carne de porco", LocalDate.of(2020, 4, 14));
        cozinhaMineira.adicionarIngrediente(ingrediente);
        ingrediente = new Ingrediente("Linguiça", LocalDate.of(2020, 4, 14));
        cozinhaMineira.adicionarIngrediente(ingrediente);


        System.out.println(cozinhaMineira);

        Cozinha cozinhaChinesa = new Cozinha(
                Cozinha.Especialidade.Chinesa, 10, 21, "Yakissoba"
        );

        ingrediente = new Ingrediente("Champignon", LocalDate.of(2020, 4, 10));
        cozinhaChinesa.adicionarIngrediente(ingrediente);
        ingrediente = new Ingrediente("Brócolis", LocalDate.of(2020, 4, 7));
        cozinhaChinesa.adicionarIngrediente(ingrediente);
        ingrediente = new Ingrediente("Macarrão", LocalDate.of(2030, 12, 31));
        cozinhaChinesa.adicionarIngrediente(ingrediente);
        ingrediente = new Ingrediente("Carne", LocalDate.of(2020, 4, 14));
        cozinhaChinesa.adicionarIngrediente(ingrediente);


        System.out.println(cozinhaChinesa);

        Cozinha cozinhaItaliana = new Cozinha(
                Cozinha.Especialidade.Italiana, 13, 22, "Espaguete"
        );

        ingrediente = new Ingrediente("Molho", LocalDate.of(2020, 4, 21));
        cozinhaItaliana.adicionarIngrediente(ingrediente);
        ingrediente = new Ingrediente("Macarrão", LocalDate.of(2030, 12, 31));
        cozinhaItaliana.adicionarIngrediente(ingrediente);
        ingrediente = new Ingrediente("Carne", LocalDate.of(2020, 4, 14));
        cozinhaItaliana.adicionarIngrediente(ingrediente);

        System.out.println(cozinhaItaliana);
    }
}