package clase_5;

public class CarritoDeCompras {
    private Personas comprador;
    private ItemCarrito item1;
    private ItemCarrito item2;
    private ItemCarrito item3;

    public float precioFinal() {
        float precioFinalCarrito = 0;
        if (this.item1 != null) {
            precioFinalCarrito += this.item1.precioDelItem();
        }
        if (this.item2 != null) {
            precioFinalCarrito += this.item2.precioDelItem();
        }
        if (this.item3 != null) {
            precioFinalCarrito += this.item3.precioDelItem();
        }
        return precioFinalCarrito;
    }

    public Personas getComprador() {
        return comprador;
    }

    public void setComprador(Personas comprador) {
        this.comprador = comprador;
    }

    public ItemCarrito getItem1() {
        return item1;
    }

    public void setItem1(ItemCarrito item1) {
        this.item1 = item1;
    }

    public ItemCarrito getItem2() {
        return item2;
    }

    public void setItem2(ItemCarrito item2) {
        this.item2 = item2;
    }

    public ItemCarrito getItem3() {
        return item3;
    }

    public void setItem3(ItemCarrito item3) {
        this.item3 = item3;
    }

}
