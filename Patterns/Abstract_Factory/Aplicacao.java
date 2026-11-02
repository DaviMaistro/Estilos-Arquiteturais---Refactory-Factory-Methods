package Patterns.Abstract_Factory;

public class Aplicacao {
    private final Fabricas fabrica;

    public Aplicacao(Fabricas fabrica) {
        this.fabrica = fabrica;
    }

    public void renderizar() {
        Botao botao = fabrica.criarBotao();
        Input input = fabrica.criarInput();

        botao.renderizarBotao();
        input.renderizarInput();
    }
}