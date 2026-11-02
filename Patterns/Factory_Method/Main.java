package Patterns.Factory_Method;

public class Main {
    public static void main(String[] args) {
        FabricaNotificacoes fabricaEmail = new FabricaEmail();
        FabricaNotificacoes fabricaSMS = new FabricaSMS();

        fabricaEmail.notificar();
        fabricaSMS.notificar();
    }
}