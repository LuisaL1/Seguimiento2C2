public enum Vestuario {
    BLUSA("Blusa Koaj","Manga larga",03) {
        @Override
        public String mostrarDescripcionPrenda() {
            return null;
        }
    },
    JEAN("Jean Big John","Ancho",04) {
        @Override
        public String mostrarDescripcionPrenda() {
            return null;
        }
    },
    CAMISETA("Camiseta Quest","Oversize",05) {
        @Override
        public String mostrarDescripcionPrenda() {
            return null;
        }
    },
    CAMISA("Camisa Ralph Lauren","Manga corta", 06) {
        @Override
        public String mostrarDescripcionPrenda() {
            return null;
        }
    };

    public String Nombre;
    public String Descripcion;
    public int numeroEstante;

    Vestuario(String nombre, String descripcion, int numeroEstante) {
        Nombre = nombre;
        Descripcion = descripcion;
        this.numeroEstante = numeroEstante;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public int getNumeroEstante() {
        return numeroEstante;
    }

    public abstract String mostrarDescripcionPrenda();
}
