
package concesionaria;

import java.util.Scanner;

public class Operar {
    
    Data data = new Data();
    
    Scanner leer = new Scanner(System.in);//variable usada para la lectura del usuario
    String op="";//string usado para guardar el dato asignado por el usuario
   
    public void ventanaPrincipal(){
        System.out.println("-----------------------------------------------------------------");
        System.out.println("                     CONSESIONARIO DE AUTOS                      ");
        System.out.println("                       - MENU PRINCIPAL -                        ");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("\n01.- Seleccionar Automóvil");
        System.out.println("02.- Salir");
        System.out.print("\nIngrese la opción que desea ejecutar: ");
        op=leer.next();
        try{
            switch(Integer.valueOf(op)){
            case 1:
                this.gama();
                break;
            case 2:
                
                break;   
            default:
                System.out.println("*****************************************************************");
                System.out.println("OPCION NO VALIDA, INTENTE NUEVAMENTE");
                System.out.println("*****************************************************************");
                this.ventanaPrincipal();
        }
        } catch(Exception e){
            System.out.println("Ha ourrido un error: " + e.getMessage());
        }
        }//fin void ventana Principal
     
    //metodo que guarda la opción que selecciono el usuario, asignando true a la variable seleccion de la clase gama,
    //coloca el true en la lista de objeto de dicha clase
    public void gama(){
        try{
        data.mostrarListaGama();
        System.out.println("10.- Regresar a menú principal");
        System.out.print("\nIngrese la gama de vehículo: ");
        op=leer.next();
            if (Integer.valueOf(op)==10) {
                this.ventanaPrincipal();
            }else if(Integer.valueOf(op)<10){
                data.gamaSeleccionada=data.listaGama.get(Integer.valueOf(op)-1).getNombre();
                data.listaGama.get(Integer.valueOf(op)-1).setSeleccionado(true);
                this.deseaAmenidades();
            }else{
                System.out.println("*****************************************************************");
                System.out.println("OPCION NO VALIDA, INTENTE NUEVAMENTE");
                System.out.println("*****************************************************************");
                this.gama();
            }    
        }catch(Exception e){
          System.out.println("Ha ourrido un error: " + e.getMessage());
        }
    }//fin void gama
    
    //metodo que guarda la opción que selecciono el usuario, asignando true a la variable seleccion de la clase transmision,
    //coloca el true en la lista de objeto de dicha clase
    public void transmision(){
        try{
            data.mostrarListaTransmision();
            System.out.println("05.- Regresar a la selección de amenidades");
            System.out.print("\nIngrese el tipo de transmisión: ");
            op=leer.next();
                if (Integer.valueOf(op)==5) {
                    this.amenidades();
                }else if(Integer.valueOf(op)<5){
                    data.listaTransmision.get(Integer.valueOf(op)-1).setSeleccionado(true);
                    this.deseaAmenidades();
                }else{
                    System.out.println("*****************************************************************");
                    System.out.println("OPCION NO VALIDA, INTENTE NUEVAMENTE");
                    System.out.println("*****************************************************************");
                    this.transmision();
                }    
        }catch(Exception e){
          System.out.println("Ha ourrido un error: " + e.getMessage());
        }
    }//fin void transmision
    
    //metodo que guarda la opción que selecciono el usuario, asignando true a la variable seleccion de la clase ColorPinturaExterior,
    //coloca el true en la lista de objeto de dicha clase
    public void colorPinturaExterior(){
        try{
            data.mostrarListaColorPinturaExterior();
            System.out.println("13.- Regresar a la selección de amenidades");
            System.out.print("\nIngrese el color de pintura exterior: ");
            op=leer.next();
                if (Integer.valueOf(op)==13) {
                    this.amenidades();
                }else if(Integer.valueOf(op)<13){
                    data.listaColorPinturaExterior.get(Integer.valueOf(op)-1).setSeleccionado(true);
                    this.deseaAmenidades();
                }else{
                    System.out.println("*****************************************************************");
                    System.out.println("OPCION NO VALIDA, INTENTE NUEVAMENTE");
                    System.out.println("*****************************************************************");
                    this.colorPinturaExterior();
                }    
        }catch(Exception e){
          System.out.println("Ha ourrido un error: " + e.getMessage());
        }
    }//fin void ColorPinturaExterior
    
    //metodo que guarda la opción que selecciono el usuario, asignando true a la variable seleccion de la clase ColorTapiceria,
    //coloca el true en la lista de objeto de dicha clase
    public void colorTapiceria(){
        try{
            data.mostrarListaColorTapiceria();
            System.out.println("05.- Regresar a la selección de amenidades");
            System.out.print("\nIngrese el color de la tapicería: ");
            op=leer.next();
                if (Integer.valueOf(op)==5) {
                    this.amenidades();
                }else if(Integer.valueOf(op)<5){
                    data.listaColorTapiceria.get(Integer.valueOf(op)-1).setSeleccionado(true);
                    this.deseaAmenidades();
                }else{
                    System.out.println("*****************************************************************");
                    System.out.println("OPCION NO VALIDA, INTENTE NUEVAMENTE");
                    System.out.println("*****************************************************************");
                    this.colorTapiceria();
                }    
        }catch(Exception e){
          System.out.println("Ha ourrido un error: " + e.getMessage());
        }
    }//fin void ColorTapiceria

    //metodo que guarda la opción que selecciono el usuario, asignando true a la variable seleccion de la clase Aro,
    //coloca el true en la lista de objeto de dicha clase
    public void aro(){
        try{
            data.mostrarListaAro();
            System.out.println("06.- Regresar a la selección de amenidades");
            System.out.print("\nIngrese el tipo de aro: ");
            op=leer.next();
                if (Integer.valueOf(op)==6) {
                    this.amenidades();
                }else if(Integer.valueOf(op)<6){
                    data.listaAro.get(Integer.valueOf(op)-1).setSeleccionado(true);
                    this.deseaAmenidades();
                }else{
                    System.out.println("*****************************************************************");
                    System.out.println("OPCION NO VALIDA, INTENTE NUEVAMENTE");
                    System.out.println("*****************************************************************");
                    this.aro();
                }    
        }catch(Exception e){
          System.out.println("Ha ourrido un error: " + e.getMessage());
        }
    }//fin void aro
    
        //metodo que guarda la opción que selecciono el usuario, asignando true a la variable seleccion de la clase AccesorioExterior,
    //coloca el true en la lista de objeto de dicha clase
    public void accesorioExterior(){
        try{
            data.mostrarListaAccesorioExterior();
            System.out.println("16.- Regresar a la selección de amenidades");
            System.out.print("\nIngrese el tipo de accesorio exterior: ");
            op=leer.next();
                if (Integer.valueOf(op)==16) {
                    this.amenidades();
                }else if(Integer.valueOf(op)<16){
                    data.listaAccesorioExterior.get(Integer.valueOf(op)-1).setSeleccionado(true);
                    this.deseaAmenidades();
                }else{
                    System.out.println("*****************************************************************");
                    System.out.println("OPCION NO VALIDA, INTENTE NUEVAMENTE");
                    System.out.println("*****************************************************************");
                    this.accesorioExterior();
                }    
        }catch(Exception e){
          System.out.println("Ha ourrido un error: " + e.getMessage());
        }
    }//fin void accesorioExterior
    
        //metodo que guarda la opción que selecciono el usuario, asignando true a la variable seleccion de la clase accesorioInterior,
    //coloca el true en la lista de objeto de dicha clase
    public void accesorioInterior(){
        try{
            data.mostrarListaAccesorioInterior();
            System.out.println("12.- Regresar a la selección de amenidades");
            System.out.print("\nIngrese el tipo de accesorio interior: ");
            op=leer.next();
                if (Integer.valueOf(op)==12) {
                    this.amenidades();
                }else if(Integer.valueOf(op)<12){
                    data.listaAccesorioInterior.get(Integer.valueOf(op)-1).setSeleccionado(true);
                    this.deseaAmenidades();
                }else{
                    System.out.println("*****************************************************************");
                    System.out.println("OPCION NO VALIDA, INTENTE NUEVAMENTE");
                    System.out.println("*****************************************************************");
                    this.accesorioInterior();
                }    
        }catch(Exception e){
          System.out.println("Ha ourrido un error: " + e.getMessage());
        }
    }//fin void accesorioInterior
    
        //metodo que guarda la opción que selecciono el usuario, asignando true a la variable seleccion de la clase Aro,
    //coloca el true en la lista de objeto de dicha clase
    public void accesorioElectronico(){
        try{
            data.mostrarListaAccesorioElectronico();
            System.out.println("05.- Regresar a la selección de amenidades");
            System.out.print("\nIngrese el tipo de accesorio electrónico: ");
            op=leer.next();
                if (Integer.valueOf(op)==5) {
                    this.amenidades();
                }else if(Integer.valueOf(op)<5){
                    data.listaAccesorioElectronico.get(Integer.valueOf(op)-1).setSeleccionado(true);
                    this.deseaAmenidades();
                }else{
                    System.out.println("*****************************************************************");
                    System.out.println("OPCION NO VALIDA, INTENTE NUEVAMENTE");
                    System.out.println("*****************************************************************");
                    this.accesorioElectronico();
                }    
        }catch(Exception e){
          System.out.println("Ha ourrido un error: " + e.getMessage());
        }
    }//fin void accesorioElectronico
    
    public void deseaAmenidades(){
        try{
        this.resumen();
        System.out.print("Desea agregar otra amenidad? (s/n): ");
        op=leer.next();
        if (op.trim().toUpperCase().equals("S")){
            this.amenidades();
        }else if(op.trim().toUpperCase().equals("N")){
            this.compraFinal();
        }else{
            System.out.println("*****************************************************************");
            System.out.println("OPCION NO VALIDA, INTENTE NUEVAMENTE");
            System.out.println("*****************************************************************");
            this.deseaAmenidades();
        }
        }catch (Exception e){System.out.println("Ha ourrido un error: " + e.getMessage());}
        }//fin void deseaAmenidades 
    
    public void amenidades(){
        try{
        System.out.println("-----------------------------------------------------------------");
        System.out.println("                     CONSESIONARIO DE AUTOS                      ");
        System.out.println("                   - SELECCION DE AMENIDADES -                   ");
        System.out.println("-----------------------------------------------------------------\n");
        System.out.println("\nHa seleccionado la gama: "+data.gamaSeleccionada);
        System.out.println("\nTipos de amenidades:\n");
        System.out.println("01.- Tipo de transmisión");
        System.out.println("02.- Color de pintura exterior");
        System.out.println("03.- Color de tapicería");
        System.out.println("04.- Aros");
        System.out.println("05.- Accesorios exteriores");
        System.out.println("06.- Accesorios interiores");
        System.out.println("07.- Accesorios electrónicos");
        System.out.println("08.- Regresar a selección de gama de vehículo");
        System.out.print("\nIngrese el tipo de amenidad: ");
        op=leer.next();
        switch(Integer.valueOf(op)){
            case 1:
                this.transmision();
                break;
            case 2:
                this.colorPinturaExterior();
                break;
            case 3:
                this.colorTapiceria();
                break;
            case 4:
                this.aro();
                break;
            case 5:
                this.accesorioExterior();
                break;
            case 6:
                this.accesorioInterior();
                break;
            case 7:
                this.accesorioElectronico();
               break;
            case 8:
                this.gama();
                break;
            default:
                System.out.println("*****************************************************************");
                System.out.println("OPCION NO VALIDA, INTENTE NUEVAMENTE");
                System.out.println("*****************************************************************");
                this.amenidades();
        }
        }catch (Exception e){System.out.println("Ha ourrido un error: " + e.getMessage());}
    }//fin void amenidades
    
    //llama a la ventana de resumen de los articulos comprados y seleccionados
    public void compraFinal(){
        System.out.println("-----------------------------------------------------------------");
        System.out.println("                     CONSESIONARIO DE AUTOS                      ");
        System.out.println("                     - VENTA DE VEHICULOS -                      ");
        System.out.println("-----------------------------------------------------------------\n");
        this.compra();
    }//fin void compraFinal
    
    public void resumen(){
        System.out.println("-----------------------------------------------------------------");
        System.out.println("                     CONSESIONARIO DE AUTOS                      ");
        System.out.println("                    - RESUMEN DE AMENIDADES -                    ");
        System.out.println("-----------------------------------------------------------------\n");
        this.compra();
    }//fin void resumen
        
    //hace un listado de todos los articulos seleccionados para la compra
    public void compra(){
        try{
            String gama,amenidades,moneda,texto,espacio;
              Double montoTotal=0.00;
               Boolean TieneAmenidad=false;
               for (int i = 0; i<data.listaGama.size(); i++) {
                   moneda="";
                   espacio=" ";
                   if (data.listaGama.get(i).getSeleccionado()==true) {
                       texto="Ha seleccionado la gama: "+data.listaGama.get(i).getNombre();
                       montoTotal = montoTotal+data.listaGama.get(i).getPrecio();
                       moneda="Q"+espacio.repeat(10 - String.format("%,.2f", data.listaGama.get(i).getPrecio()).length()) + String.format("%,.2f", data.listaGama.get(i).getPrecio());
                       espacio=texto+espacio.repeat(65-(texto.length() +moneda.length()))+moneda;
                       System.out.println(espacio);
                   }
               }
               System.out.println("Amenidades: ");
               if (data.listaTransmision != null) {
                   for (int i = 0; i<data.listaTransmision.size(); i++) {
                       moneda="";
                       espacio=" ";
                       if (data.listaTransmision.get(i).getSeleccionado()==true) {
                           TieneAmenidad=true;
                           texto="     Transmisión: "+data.listaTransmision.get(i).getNombre();
                           montoTotal = montoTotal+data.listaTransmision.get(i).getPrecio();
                           moneda="Q"+espacio.repeat(10 - String.format("%,.2f", data.listaTransmision.get(i).getPrecio()).length()) + String.format("%,.2f", data.listaTransmision.get(i).getPrecio());
                           espacio=texto+espacio.repeat(65-(texto.length() +moneda.length()))+moneda;
                           System.out.println(espacio);
                       }
                   }
               }
               if (data.listaColorPinturaExterior != null) {
                   for (int i = 0; i<data.listaColorPinturaExterior.size(); i++) {
                       moneda="";
                       espacio=" ";
                       if (data.listaColorPinturaExterior.get(i).getSeleccionado()==true) {
                           TieneAmenidad=true;
                           texto="     Color de pintura exterior: "+data.listaColorPinturaExterior.get(i).getNombre();
                           montoTotal = montoTotal+data.listaColorPinturaExterior.get(i).getPrecio();
                           moneda="Q"+espacio.repeat(10 - String.format("%,.2f", data.listaColorPinturaExterior.get(i).getPrecio()).length()) + String.format("%,.2f", data.listaColorPinturaExterior.get(i).getPrecio());
                           espacio=texto+espacio.repeat(65-(texto.length() +moneda.length()))+moneda;
                           System.out.println(espacio);

                       }
                   }
               }     
               if (data.listaColorTapiceria != null) {
                   for (int i = 0; i<data.listaColorTapiceria.size(); i++) {
                       moneda="";
                       espacio=" ";
                       if (data.listaColorTapiceria.get(i).getSeleccionado()==true) {
                           TieneAmenidad=true;
                           texto="     Color de tapicería: "+data.listaColorTapiceria.get(i).getNombre();
                           montoTotal = montoTotal+data.listaColorTapiceria.get(i).getPrecio();
                           moneda="Q"+espacio.repeat(10 - String.format("%,.2f", data.listaColorTapiceria.get(i).getPrecio()).length()) + String.format("%,.2f", data.listaColorTapiceria.get(i).getPrecio());
                           espacio=texto+espacio.repeat(65-(texto.length() +moneda.length()))+moneda;
                           System.out.println(espacio);

                       }
                   }
               }
               if (data.listaAro != null) {
                   for (int i = 0; i<data.listaAro.size(); i++) {
                       moneda="";
                       espacio=" ";
                       if (data.listaAro.get(i).getSeleccionado()==true) {
                           TieneAmenidad=true;
                           texto="     Aro: "+data.listaAro.get(i).getNombre();
                           montoTotal = montoTotal+data.listaAro.get(i).getPrecio();
                           moneda="Q"+espacio.repeat(10 - String.format("%,.2f", data.listaAro.get(i).getPrecio()).length()) + String.format("%,.2f", data.listaAro.get(i).getPrecio());
                           espacio=texto+espacio.repeat(65-(texto.length() +moneda.length()))+moneda;
                           System.out.println(espacio);

                       }
                   }
               }
               if (data.listaAccesorioExterior != null) {
                   for (int i = 0; i<data.listaAccesorioExterior.size(); i++) {
                       moneda="";
                       espacio=" ";
                       if (data.listaAccesorioExterior.get(i).getSeleccionado()==true) {
                           TieneAmenidad=true;
                           texto="     Accesorio ext.: "+data.listaAccesorioExterior.get(i).getNombre();
                           montoTotal = montoTotal+data.listaAccesorioExterior.get(i).getPrecio();
                           moneda="Q"+espacio.repeat(10 - String.format("%,.2f", data.listaAccesorioExterior.get(i).getPrecio()).length()) + String.format("%,.2f", data.listaAccesorioExterior.get(i).getPrecio());
                           espacio=texto+espacio.repeat(65-(texto.length() +moneda.length()))+moneda;
                           System.out.println(espacio);

                       }
                   }
               }
               if (data.listaAccesorioInterior != null) {
                   for (int i = 0; i<data.listaAccesorioInterior.size(); i++) {
                       moneda="";
                       espacio=" ";
                       if (data.listaAccesorioInterior.get(i).getSeleccionado()==true) {
                           TieneAmenidad=true;
                           texto="     Accesorio interior: "+data.listaAccesorioInterior.get(i).getNombre();
                           montoTotal = montoTotal+data.listaAccesorioInterior.get(i).getPrecio();
                           moneda="Q"+espacio.repeat(10 - String.format("%,.2f", data.listaAccesorioInterior.get(i).getPrecio()).length()) + String.format("%,.2f", data.listaAccesorioInterior.get(i).getPrecio());
                           espacio=texto+espacio.repeat(65-(texto.length() +moneda.length()))+moneda;
                           System.out.println(espacio);

                       }
                   }
               }
               //Electrónicos
                   if (data.listaAccesorioElectronico != null) {
                   for (int i = 0; i<data.listaAccesorioElectronico.size(); i++) {
                       moneda="";
                       espacio=" ";
                       if (data.listaAccesorioElectronico.get(i).getSeleccionado()==true) {
                           TieneAmenidad=true;
                           texto="     Accesorio electrónico: "+data.listaAccesorioElectronico.get(i).getNombre();
                           montoTotal = montoTotal+data.listaAccesorioElectronico.get(i).getPrecio();
                           moneda="Q"+espacio.repeat(10 - String.format("%,.2f", data.listaAccesorioElectronico.get(i).getPrecio()).length()) + String.format("%,.2f", data.listaAccesorioElectronico.get(i).getPrecio());
                           espacio=texto+espacio.repeat(65-(texto.length() +moneda.length()))+moneda;
                           System.out.println(espacio);

                       }
                   }
               }
               if (!TieneAmenidad) {
                   System.out.println("                             Ninguna                             ");
               }
               System.out.println("                                                     _____________");
               espacio=" ";
               moneda="";
               texto="Total:";
               moneda="Q"+espacio.repeat(10 - String.format("%,.2f", montoTotal).length())+String.format("%,.2f", montoTotal);
               espacio=" ";
               espacio=texto+espacio.repeat(65 - (texto.length() + moneda.length()))+moneda;
               System.out.println(espacio);   
            }catch (Exception e){System.out.println("Ha ourrido un error: " + e.getMessage());}
    }//fin void compra
}
