package Patterns.Factory_Method;

public abstract class FabricaNotificacoes {

    // Factory Method: cada fabrica concreta decide qual produto criar
    protected abstract IntNotificacoes criarNotificacoes();

    // Fluxo comum: nao conhece nenhuma classe concreta
    public void notificar() {
        IntNotificacoes notificacoes = criarNotificacoes();
        notificacoes.enviar();
    }
}