package Problema3;

public class Main {
    public static void main(String[] args) {
        VideoJuegos videoJuegos = VideoJuegos.AVENTURA;
        VideoJuegos videoJuegos1 = VideoJuegos.MUSICALES;
        VideoJuegos videoJuegos2 = VideoJuegos.DEPORTIVOS;
        VideoJuegos videoJuegos3 = VideoJuegos.ESTRATEGIA;
        VideoJuegos videoJuegos4 = VideoJuegos.SIMULACION;

        System.out.println(videoJuegos1.getNombre() + videoJuegos1.getComoSeJuega() + videoJuegos1.getYear());
        System.out.println(videoJuegos.getNombre() + videoJuegos.getComoSeJuega() + videoJuegos.getYear());
        System.out.println(videoJuegos2.getNombre() + videoJuegos2.getComoSeJuega() + videoJuegos2.getYear());
        System.out.println(videoJuegos3.getNombre() + videoJuegos3.getComoSeJuega() + videoJuegos3.getYear());
        System.out.println(videoJuegos4.getNombre() + videoJuegos4.getComoSeJuega() + videoJuegos4.getYear());


        System.out.println(VideoJuegos.AVENTURA.mostrarPosicionRanking() + VideoJuegos.AVENTURA.comprarMonedas());
        System.out.println(VideoJuegos.DEPORTIVOS.mostrarPosicionRanking() + VideoJuegos.DEPORTIVOS.comprarMonedas());
        System.out.println(VideoJuegos.ESTRATEGIA.mostrarPosicionRanking() + VideoJuegos.ESTRATEGIA.comprarMonedas());
        System.out.println(VideoJuegos.SIMULACION.mostrarPosicionRanking() + VideoJuegos.SIMULACION.comprarMonedas());
    }

}
