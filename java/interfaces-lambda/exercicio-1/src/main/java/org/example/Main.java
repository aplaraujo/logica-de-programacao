package org.example;

public class Main {
    public static void main(String[] args) {
        MensagemDeMarketing sms = (mensagem) -> mensagem;
        System.out.println(sms.enviarMensagem("Enviando mensagem por SMS"));

        MensagemDeMarketing email =  (mensagem) -> mensagem;
        System.out.println(email.enviarMensagem("Enviando mensagem por e-mail"));

        MensagemDeMarketing redeSocial = (mensagem) -> mensagem;
        System.out.println(redeSocial.enviarMensagem("Enviando mensagem por rede social"));

        MensagemDeMarketing whatsApp = (mensagem) -> mensagem;
        System.out.println(whatsApp.enviarMensagem("Enviando mensagem por WhatsApp"));
    }
}