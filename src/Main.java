import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        int opcion, iva, totaliva;
        String numero;
        int MOUSE = 85000;
        int TECLADO = 230000;
        int MONITOR = 940000;
        int DISCO = 220000;
        int USB = 60000;
        int cantMouse = 0;
        int cantTeclado = 0;
        int cantMonitor = 0;
        int cantDisco = 0;
        int cantUSB = 0;
        boolean salir = false;
        boolean continuarCompra = false;

        System.out.println("\n          TIENDA TECNOLÓGICA");

        System.out.print("Ingrese su nombre: ");
        nombre = teclado.nextLine();
        System.out.print("Ingrese su numero de telefono: ");
        numero = teclado.next();

        do {
            System.out.println("\n    Menú Principal");
            System.out.println("1. Comprar");
            System.out.println("2. Calcular compra");
            System.out.println("3. Salir");
            System.out.print("Seleccione opción: ");
            opcion = teclado.nextInt();

            switch(opcion) {
                case 1:

                    do {
                        System.out.println("\nProductos disponibles:");
                        System.out.println("1. Mouse       $85,000");
                        System.out.println("2. Teclado    $230,000");
                        System.out.println("3. Monitor    $940,000");
                        System.out.println("4. Disco duro $220,000");
                        System.out.println("5. USB         $60,000");
                        System.out.println("Seleccione producto: ");
                        int producto = teclado.nextInt();

                        switch(producto) {
                            case 1: cantMouse++; break;
                            case 2: cantTeclado++; break;
                            case 3: cantMonitor++; break;
                            case 4: cantDisco++; break;
                            case 5: cantUSB++; break;
                            default:
                                System.out.println("Opción inválida!");
                                continue;
                        }

                        System.out.print("¿Agregar otra compra? 1=Sí  2=No: ");
                        continuarCompra = (teclado.nextInt() == 1);

                    } while(continuarCompra);
                    break;

                case 2:
                    if(cantMouse == 0 && cantTeclado == 0 && cantMonitor == 0 && cantDisco == 0 && cantUSB == 0) {
                        System.out.println("\nNo ha realizado ninguna compra");
                        break;
                    }

                    System.out.println("\n          TIENDA TECNOLÓGICA");
                    System.out.println("  Nombre: " + nombre + ".    Telefono: " + numero);
                    System.out.println("PRODUCTO        CANT      V/UNIT     V/TOTAL   ");

                    int total = 0;

                    if(cantMouse > 0) {
                        int subtotal = cantMouse * MOUSE;
                        System.out.println("Mouse           " + cantMouse + "       " + MOUSE + "      " + subtotal);
                        total += subtotal;
                    }
                    if(cantTeclado > 0) {
                        int subtotal = cantTeclado * TECLADO;
                        System.out.println("Teclado         " + cantTeclado + "       " + TECLADO + "     " + subtotal);
                        total += subtotal;
                    }
                    if(cantMonitor > 0) {
                        int subtotal = cantMonitor * MONITOR;
                        System.out.println("Monitor         " + cantMonitor + "       " + MONITOR + "    " + subtotal);
                        total += subtotal;
                    }
                    if(cantDisco > 0) {
                        int subtotal = cantDisco * DISCO;
                        System.out.println("Disco Duro      " + cantDisco + "       " + DISCO + "     " + subtotal);
                        total += subtotal;
                    }
                    if(cantUSB > 0) {
                        int subtotal = cantUSB * USB;
                        System.out.println("USB             " + cantUSB + "       " + USB + "      " + subtotal);
                        total += subtotal;
                    }

                    System.out.println("--------------------------------------------");
                    iva = (total/100) *16;
                    totaliva = iva + total;
                    System.out.println("TOTAL A PAGAR: " + totaliva);
                    break;

                case 3:
                    salir = true;
                    break;

                default:
                    System.out.println("Opción inválida!");
            }
        } while(!salir);

        System.out.println("Gracias por su compra!");
    }
}
