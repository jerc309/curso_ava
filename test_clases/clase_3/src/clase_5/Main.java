package clase_5;

public class Main {

    public static void main(String[] args) {
        Personas unaPersona = new Personas("johann", "reyes", "9592496");
        System.out.println(unaPersona.muestraPersona());
        System.out.println(unaPersona.getApellido());
        Producto cepillo = new Producto("cepillo", "1234", 200);
        Producto pasta = new Producto("pasta", "1235", 400);
        // Producto hilo = new Producto("hilo", "1235", 400);
        ItemCarrito cepillos = new ItemCarrito(cepillo, 2);
        ItemCarrito pastas = new ItemCarrito(pasta, 4);
        // ItemCarrito hilos = new ItemCarrito(hilo, 4);
        CarritoDeCompras carritoJohann = new CarritoDeCompras();
        carritoJohann.setComprador(unaPersona);
        carritoJohann.setItem1(cepillos);
        carritoJohann.setItem2(pastas);
        // carritoJohann.setItem3(hilos);

        System.out.println(carritoJohann.precioFinal());
    }
}