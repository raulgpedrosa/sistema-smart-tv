public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada: " + smartTv.ligada);
        
        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.mudarCanal(45);
        System.out.println("Canal Atual: " + smartTv.canal);

        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("TV ligada -> Novo Status: " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("TV ligada -> Novo Status 2: " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Volume aumentado: " + smartTv.volume);
        
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume diminuido: " + smartTv.volume);

    }
}
