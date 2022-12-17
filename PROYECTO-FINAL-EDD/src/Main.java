
import javax.swing.JOptionPane;

//import Clientes.Atributos;
//import Clientes.clsNodoCliente;
public class Main {

    public static void main(String[] args) {
        //solamente el llamado a instancias.
        clsGestionVehiculo gv = new clsGestionVehiculo();


        /* String nombre = " ", cedula = " ", mes = " ", correo = " ", categoria = " ";
       nombre = JOptionPane.showInputDialog(null,"Ingrese su nombre");
       
       cedula = JOptionPane.showInputDialog(null,"Ingrese su cedula");

mes = JOptionPane.showInputDialog(null,"Ingrese su mes");
       
       correo = JOptionPane.showInputDialog(null,"Ingrese su correo");

   categoria = JOptionPane.showInputDialog(null,"Ingrese su categoria");*/

        gv.registrar(new clsVehiculos("111", "1900", "0", "4", "3000", "a", "a", "a", "a", "a", "a"));
        //gv.registrar(new clsVehiculos("222", "1998", "0", "0", "0", "b", "b", "b", "b", "b", "b"));
        /*gv.registrar(new clsVehiculos("333", "2020", "0", "0", "0", "b", "b", "b", "b", "b", "b"));
        gv.registrar(new clsVehiculos("444", "2022", "0", "0", "0", "c", "c", "c", "c", "c", "c"));*/

        //System.out.println(gv);
        gv.mostrarListaInicioFin();
 //gv.mostrarListaInicioFin();

//        gv.removerEnPosicion("333");
//        gv.mostrarListaInicioFin();
//        gv.modificarVehiculo(new clsVehiculos("1", "5", "5", "5", "5", "Hola", "Hola", "Hola", "Hola", "Hola", "Hola"));
//        // System.out.println(gv);
//        gv.mostrarListaInicioFin();
//        gv.consultar("444");
        clsGestionCliente gc = new clsGestionCliente();
        clsGestionAlquiler ga = new clsGestionAlquiler();

        System.out.println("\n");

//---------------Pide Cliente ---------------------------
        //gc.registrarCliente(new clsCliente(cedula,nombre, mes, correo, categoria));
        gc.registrarCliente(new clsCliente("1", "Juan", "Junio", "@juan", "Plata"));
        gc.desplegarlista();
//-----------------Solicita o bien registra el Alquiler----------------------       
        ga.solicitudAlquiler(new clsAtributosAlquiler("1", 157612, 40, 4, "BMW", "No", "NoRegistrado"));
        System.out.println(ga);
        System.out.println("\n");
        ga.cantidadDiasS("1");
        gc.desplegarlista();
//------------------------Nuevo Cliente y Alquiler ----------------------------------
        gc.registrarCliente(new clsCliente("2", "Pedro", "Junio", "@pedro", "Plata"));
        gc.desplegarlista();
        ga.registrar(new clsAtributosAlquiler("2", 193901, 40, 4, "BMW", "No", "NoRegistrado"));
        System.out.println(ga);
        System.out.println("\n");
        ga.cantidadDiasS("2");
        gc.desplegarlista();


//------------------------Asigna Vehiculo----------------------
        ga.asignaVehiculos(new clsAtributosAlquiler("3", 183921, 40, 4, "BMW", "No", "NoRegistrado"));
        System.out.println(ga);

//--------------------Monto Superior--------------------
ga.montoSuperior("2");
gc.desplegarlista();

//--------------------Consultar Alquiler Placa----------------
//ga.consultaAlquilerPlaca(157612);

//--------------------Devolucion Vehiculo------------------------
ga.devolucionVehiculo("2", 193901);
System.out.println(ga);
   gv.mostrarListaInicioFin();














        // gc.desplegarlista();   
        //  gc.registrarCliente(new clsCliente("2", "Pedro", "Junio", "@pedro", "Plata"));
        //
        // gc.registrarCliente(new clsCliente("3", "Luis", "Junio", "@luis", "Plata"));
        // gc.registrarCliente(new clsCliente("4", "Ana", "Junio", "@ana", "Plata"));
        //   ga.cantidadDiasS("3");
        //   gc.desplegarlista();
        //   ga.cantidadDiasS("4");
        //gc.desplegarlista();
        // gc.desplegarlista();
        //  System.out.println(ga);

        /* System.out.println("\n");

      //  gc.eliminarCliente("2");
        gc.modificarCliente(new clsCliente("1", "Yoyo", "Junio", "@yoyo", "Plata"));
        gc.desplegarlista();
        System.out.println("\n");

        // System.out.println(gc);
        // System.out.println(gc.search("4"));
        System.out.println("Consulta: ");
        gc.ConsultarCliente("3");
        // gc.desplegarlista();
        System.out.println("\n");*/
        // ga.registrar(new clsAtributosAlquiler("2", 193901, 40, 4, "BMW", "No", "NoRegistrado" ));
//ga.desplegarlista();
//System.out.println(ga);
//ga.mostrarListaInicioFin();
// gc.desplegarlista();
//gc.desplegarlista();
        //  ga.desplegarlista();
    }

}

