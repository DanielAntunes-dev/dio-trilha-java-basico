public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.aumetarVolume();
        smartTv.aumetarVolume();
        smartTv.diminuirVolume();
        smartTv.aumetarVolume();
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.mudarDeCanal(11);
        System.out.println("Canal Atual : " + smartTv.canal);


        smartTv.ligar();
        System.out.println("Novo status => TV ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status => TV desligada ? " + smartTv.ligada);
        
    }
}
