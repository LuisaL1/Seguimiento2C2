public class Main {
    public static void main(String[] args) {
        Vestuario vestuario = Vestuario.JEAN;
        Vestuario vestuario1 = Vestuario.BLUSA;
        Vestuario vestuario2 = Vestuario.CAMISA;
        System.out.println(vestuario.getNombre() +  vestuario.getDescripcion() + vestuario.getNumeroEstante());
        System.out.println(vestuario1.getNombre() + vestuario1.getDescripcion() + vestuario1.getNumeroEstante());
        System.out.println(vestuario2.getNombre() + vestuario2.getDescripcion() + vestuario2.getNumeroEstante());
    }
}
