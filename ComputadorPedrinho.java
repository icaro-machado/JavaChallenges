package PraticaPilaresPOO;

public class ComputadorPedrinho {
    public static void main(String[] args) {
		//abrindo MSN Messenger

        /* 
        System.out.println("MSN");
		MSNMessenger msn = new MSNMessenger();			
		msn.enviarMensagem();		
		msn.receberMensagem();

        System.out.println("FACEBOOK");
        FacebookMessenger fcb = new FacebookMessenger();
        fcb.enviarMensagem();		
		fcb.receberMensagem();
        
        System.out.println("TELEGRAM");
        Telegram tlg = new Telegram();
        tlg.enviarMensagem();		
		tlg.receberMensagem();
        */

        //Metodo polimorfismo

        ServicoMensagemInstantanea smi = null;
		
		/*
		    NÃO SE SABE QUAL APP 
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
		String appEscolhido="tlg"; 
		
		if(appEscolhido.equals("msn")) {
			smi = new MSNMessenger();
		} else if(appEscolhido.equals("fbm")) {
			smi = new FacebookMessenger();
		} else if(appEscolhido.equals("tlg")) {
			smi = new Telegram();
		}		
			
		smi.enviarMensagem();
		smi.receberMensagem();        
	}
}