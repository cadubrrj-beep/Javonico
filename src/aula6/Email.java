package aula6;

public class Email extends Notificacao{
    private String assunto;

    public Email(String destinatario, String mensagem, String assunto) {
        super(destinatario, mensagem);
        this.assunto = assunto;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    @Override // Sobrescreve o metodo enviar do pai
    public void enviar() {
        System.out.println("---> Enviando email ---");
        System.out.println("Assunto: " + this.assunto);
        System.out.println("Destinatário: " + getDestinatario());
        System.out.println("Mensagem: " + getMensagem());
    }
}
