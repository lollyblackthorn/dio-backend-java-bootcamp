public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal++;
        System.out.println("Canal atual: " + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Canal atual: " + canal);
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume: " + volume);
    }

    public void ligar(){//método
        ligada = true;
    }

    public void desligar(){//método
        ligada = false;
    }
}