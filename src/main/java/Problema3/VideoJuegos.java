package Problema3;
import java.io.Serializable;

public enum VideoJuegos implements Serializable {
    DEPORTIVOS("Futbol","con un balón y 11 jugadores", 1869) {
        @Override
        public String mostrarPosicionRanking() {
            return "Mostrar posición en el ranking de equipos deportivos";
        }

        @Override
        public String comprarMonedas() {
            return "Comprar monedas para mejorar el equipo deportivo";
        }
    },
    ESTRATEGIA("Ajedrez","De a dos jugadores moviendo fichas", 934) {
        @Override
        public String mostrarPosicionRanking() {
            return "Mostrar posición en el ranking de jugadores de ajedrez";
        }

        @Override
        public String comprarMonedas() {
            return "Comprar monedas para adquirir nuevas estrategias";
        }
    },
    MUSICALES("JustDance", "bailando canciones aleatoriamente", 2009) {
        @Override
        public String mostrarPosicionRanking() {
            return "Mostrar posición en el ranking de bailarines";
        }

        @Override
        public String comprarMonedas() {
            return "Comprar monedas para desbloquear nuevas canciones";
        }
    },
    AVENTURA("Tomb raider", "Modo historia, primera persona atravesando una serie de obstáculos en el mapa",2000) {
        @Override
        public String mostrarPosicionRanking() {
            return "Mostrar posición en el ranking de aventureros";
        }

        @Override
        public String comprarMonedas() {
            return "Comprar monedas para obtener nuevas herramientas y habilidades";
        }
    },
    SIMULACION("Asphalt 8","Juego de carreras multiplayer",2013) {
        @Override
        public String mostrarPosicionRanking() {
            return "Mostrar posición en el ranking de pilotos";
        }

        @Override
        public String comprarMonedas() {
            return "Comprar monedas para personalizar y mejorar vehículos";
        }
    };

    public String nombre;
    public String comoSeJuega;
    public int year;

    VideoJuegos(String nombre, String comoSeJuega, int year) {
        this.nombre = nombre;
        this.comoSeJuega = comoSeJuega;
        this.year = year;
    }

    public String getNombre() {
        return nombre;
    }

    public String getComoSeJuega() {
        return comoSeJuega;
    }

    public int getYear() {
        return year;
    }

    public abstract String mostrarPosicionRanking();

    public abstract String comprarMonedas();
}

