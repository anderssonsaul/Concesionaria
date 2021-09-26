
package concesionaria;

import java.util.ArrayList;

public class Data {
    //manejo de los autos o gamas disponibles
    Gama gama;
    public  ArrayList<Gama> listaGama;
    
    //manejo de las transmisiones disponibles
    Transmision transmision;
    public ArrayList<Transmision> listaTransmision;
    
    //manoejo del color de la pintura exterior
    ColorPinturaExterior colorPinturaExterior;
    public ArrayList<ColorPinturaExterior> listaColorPinturaExterior;
    
    //manejo del color de la tapiceria
    ColorTapiceria colorTapiceria;
    public ArrayList<ColorTapiceria> listaColorTapiceria;

    //manejo de los aros
    Aro aro;
    public ArrayList<Aro> listaAro;

    //manejo de los accesorios exteriores
    AccesorioExterior accesorioExterior;
    public ArrayList<AccesorioExterior> listaAccesorioExterior;

    //manejor de los accesorios interiores
    AccesorioInterior accesorioInterior;
    public ArrayList<AccesorioInterior> listaAccesorioInterior;

    //manejo de los accesorios electronicos
    AccesorioElectronico accesorioElectronico;
    public ArrayList<AccesorioElectronico> listaAccesorioElectronico;
    
    //variables usadas al crear el texto a mostrar
    byte numeracion=0;//variable usada para numerar las opciones al momento de listarals
    String texto="";
    String moneda="";
    String gamaSeleccionada="";
    
    //Crea el listado de los autos disponibles y sus precios
    public  void llenarListaGama(){
    listaGama  = new ArrayList<>();
    listaTransmision = new ArrayList<>();
    listaColorPinturaExterior = new ArrayList<>();
    listaColorTapiceria= new ArrayList<>();
    listaAro= new ArrayList<>();
    listaAccesorioExterior= new ArrayList<>();
    listaAccesorioInterior= new ArrayList<>();
    listaAccesorioElectronico= new ArrayList<>();
    
    gama = new Gama();
    gama.setNombre("Sedán Económico");
    gama.setPrecio(18940.00);
    gama.setSeleccionado(false);
    listaGama.add(gama);
        
    gama = new Gama();
    gama.setNombre("Sedán");
    gama.setPrecio(23570.00);
    gama.setSeleccionado(false);
    listaGama.add(gama);
        
    gama = new Gama();
    gama.setNombre("Deportivo");
    gama.setPrecio(24100.00);
    gama.setSeleccionado(false);
    listaGama.add(gama);
    
    gama = new Gama();    
    gama.setNombre("Híbrido");
    gama.setPrecio(25100.00);
    gama.setSeleccionado(false);
    listaGama.add(gama);
        
    gama = new Gama();
    gama.setNombre("Coupe");
    gama.setPrecio(19350.00);
    gama.setSeleccionado(false);
    listaGama.add(gama);
        
    gama = new Gama();
    gama.setNombre("Coupe Deportivo");
    gama.setPrecio(24100.00);
    gama.setSeleccionado(false);
    listaGama.add(gama);
        
    gama = new Gama();
    gama.setNombre("Compacto");
    gama.setPrecio(16190.00);
    gama.setSeleccionado(false);
    listaGama.add(gama);
        
    gama = new Gama();
    gama.setNombre("Hatchback");
    gama.setPrecio(20150.00);
    gama.setSeleccionado(false);
    listaGama.add(gama);
        
    gama = new Gama();
    gama.setNombre("Económico versión Rally");
    gama.setPrecio(34700.00);
    gama.setSeleccionado(false);
    listaGama.add(gama);
    }//fin llenarListaGama
    
    //muestra el listado de autos disponibles
    public void mostrarListaGama(){   
        
        llenarListaGama();
        System.out.println("-----------------------------------------------------------------");
        System.out.println("                     CONSESIONARIO DE AUTOS                      ");
        System.out.println("                - SELECCION DE GAMA DE VEHICULO -                ");
        System.out.println("-----------------------------------------------------------------"); 
        numeracion=0;
        texto="";
        moneda="";
        for (int i = 0; i < listaGama.size(); i++) {
            numeracion++;
            texto=" ";
            moneda="Q"+texto.repeat(10 - String.format("%,.2f", listaGama.get(i).getPrecio()).length()) + String.format("%,.2f", listaGama.get(i).getPrecio());
            texto=listaGama.get(i).getNombre()+(texto.repeat(60-(listaGama.get(i).getNombre().length()+moneda.length())))+moneda;
            System.out.println("0"+numeracion+".- "+texto);
        }      
    }//fin void mostrarListaGama
    
    //crea el listado de las transmisiones disponibles y sus precios
    public void llenarListaTransmision(){
    listaTransmision = new ArrayList<>();
    transmision = new Transmision();
    transmision.setNombre("Manual");
    transmision.setPrecio(0.00);
    transmision.setSeleccionado(false);
    listaTransmision.add(transmision);
    
    transmision = new Transmision();
    transmision.setNombre("CVT");
    transmision.setPrecio(800.00);
    transmision.setSeleccionado(false);
    listaTransmision.add(transmision);
    
    transmision = new Transmision();
    transmision.setNombre("Manual con Turbo");
    transmision.setPrecio(0.00);
    transmision.setSeleccionado(false);
    listaTransmision.add(transmision);
    
    transmision = new Transmision();
    transmision.setNombre("CVT con Turbo");
    transmision.setPrecio(800.00);
    transmision.setSeleccionado(false);
    listaTransmision.add(transmision);
    }//fin void llenarListaTransmision
    
    //muestra el listado de transmisiones disponibles
    public void mostrarListaTransmision(){
       llenarListaTransmision(); 
        System.out.println("-----------------------------------------------------------------");
        System.out.println("                     CONSESIONARIO DE AUTOS                      ");
        System.out.println("                   - SELECCION DE AMENIDADES -                   ");
        System.out.println("              - SELECCION DE TIPO DE TRANSMISION -               ");
        System.out.println("-----------------------------------------------------------------"); 
        System.out.println("\nHa seleccionado la gama: "+gamaSeleccionada);
        System.out.println("\nTipos de transmisión:\n");
        numeracion=0;
        texto="";
        moneda="";
        for (int i = 0; i < listaTransmision.size(); i++) {
            numeracion++;
            texto=" ";
            moneda="Q"+texto.repeat(10 - String.format("%,.2f", listaTransmision.get(i).getPrecio()).length())+String.format("%,.2f", listaTransmision.get(i).getPrecio());
            texto=listaTransmision.get(i).getNombre()+(texto.repeat(60 -(listaTransmision.get(i).getNombre().length()+moneda.length())))+moneda;
            System.out.println("0"+numeracion+".- "+texto);
        }
    }//fin void mostrarListaTransmision
    
    //crea el listado de colores de la pintrua exterior disponible
    public void llenarListaColorPinturaExterior(){
        listaColorPinturaExterior = new ArrayList<>();
        colorPinturaExterior = new ColorPinturaExterior();
        colorPinturaExterior.setNombre("Cosmic Blue");
        colorPinturaExterior.setPrecio(0.00);
        colorPinturaExterior.setSeleccionado(false);
        listaColorPinturaExterior.add(colorPinturaExterior);

        colorPinturaExterior = new ColorPinturaExterior();
        colorPinturaExterior.setNombre("Burgundy Night");
        colorPinturaExterior.setPrecio(0.00);
        colorPinturaExterior.setSeleccionado(false);
        listaColorPinturaExterior.add(colorPinturaExterior);

        colorPinturaExterior = new ColorPinturaExterior();
        colorPinturaExterior.setNombre("Rallye Red");
        colorPinturaExterior.setPrecio(0.00);
        colorPinturaExterior.setSeleccionado(false);
        listaColorPinturaExterior.add(colorPinturaExterior);

        colorPinturaExterior = new ColorPinturaExterior();
        colorPinturaExterior.setNombre("Crystal Black");
        colorPinturaExterior.setPrecio(0.00);
        colorPinturaExterior.setSeleccionado(false);
        listaColorPinturaExterior.add(colorPinturaExterior);

        colorPinturaExterior = new ColorPinturaExterior();
        colorPinturaExterior.setNombre("Modern Steel");
        colorPinturaExterior.setPrecio(0.00);
        colorPinturaExterior.setSeleccionado(false);
        listaColorPinturaExterior.add(colorPinturaExterior);

        colorPinturaExterior = new ColorPinturaExterior();
        colorPinturaExterior.setNombre("Taffeta White");
        colorPinturaExterior.setPrecio(0.00);
        colorPinturaExterior.setSeleccionado(false);
        listaColorPinturaExterior.add(colorPinturaExterior);

        colorPinturaExterior = new ColorPinturaExterior();
        colorPinturaExterior.setNombre("Energy Green");
        colorPinturaExterior.setPrecio(0.00);
        colorPinturaExterior.setSeleccionado(false);
        listaColorPinturaExterior.add(colorPinturaExterior);

        colorPinturaExterior = new ColorPinturaExterior();
        colorPinturaExterior.setNombre("Kona Coffee");
        colorPinturaExterior.setPrecio(0.00);
        colorPinturaExterior.setSeleccionado(false);
        listaColorPinturaExterior.add(colorPinturaExterior);

        colorPinturaExterior = new ColorPinturaExterior();
        colorPinturaExterior.setNombre("Orange Fury");
        colorPinturaExterior.setPrecio(0.00);
        colorPinturaExterior.setSeleccionado(false);
        listaColorPinturaExterior.add(colorPinturaExterior);

        colorPinturaExterior = new ColorPinturaExterior();
        colorPinturaExterior.setNombre("Helios Yellow");
        colorPinturaExterior.setPrecio(0.00);
        colorPinturaExterior.setSeleccionado(false);
        listaColorPinturaExterior.add(colorPinturaExterior);

        colorPinturaExterior = new ColorPinturaExterior();
        colorPinturaExterior.setNombre("Sonic Gray");
        colorPinturaExterior.setPrecio(0.00);
        colorPinturaExterior.setSeleccionado(false);
        listaColorPinturaExterior.add(colorPinturaExterior);

        colorPinturaExterior = new ColorPinturaExterior();
        colorPinturaExterior.setNombre("Polished Metal");
        colorPinturaExterior.setPrecio(0.00);
        colorPinturaExterior.setSeleccionado(false);
        listaColorPinturaExterior.add(colorPinturaExterior);
        }//fin void llenarListaColorPinturaExterior
    
    //muestra el listado de color de pintura exterior
    public void mostrarListaColorPinturaExterior(){
        llenarListaColorPinturaExterior();
        System.out.println("-----------------------------------------------------------------");
        System.out.println("                     CONSESIONARIO DE AUTOS                      ");
        System.out.println("                   - SELECCION DE AMENIDADES -                   ");
        System.out.println("       - SELECCION DE TIPO DE COLOR DE PINTURA EXTARIOR -        ");
        System.out.println("-----------------------------------------------------------------"); 
        System.out.println("\nHa seleccionado la gama: "+gamaSeleccionada);
        System.out.println("\nTipos de color de pintura exterior:\n");
        numeracion=0;
        texto="";
        moneda="";
        for (int i = 0; i < listaColorPinturaExterior.size(); i++) {
            numeracion++;
            texto=" ";
            moneda="Q"+texto.repeat(10 - String.format("%,.2f", listaColorPinturaExterior.get(i).getPrecio()).length())+String.format("%,.2f", listaColorPinturaExterior.get(i).getPrecio());
            texto=listaColorPinturaExterior.get(i).getNombre()+(texto.repeat(60 -(listaColorPinturaExterior.get(i).getNombre().length()+moneda.length())))+moneda;
            if (numeracion<10) {
                System.out.println("0"+numeracion+".- "+texto);               
            }else  {
            System.out.println(numeracion+".- "+texto);
            }           
        }

    }//fin void mostrarListaColorPinturaExterior
    
    //llena el listado de color de tapiceria disponible
    public void llenarListaColorTapiceria(){
        listaColorTapiceria = new ArrayList<>();
        colorTapiceria=new ColorTapiceria();
        colorTapiceria.setNombre("Gray Cloth");
        colorTapiceria.setPrecio(0.00);
        colorTapiceria.setSeleccionado(false);
        listaColorTapiceria.add(colorTapiceria);

        colorTapiceria=new ColorTapiceria();
        colorTapiceria.setNombre("Black Cloth");
        colorTapiceria.setPrecio(0.00);
        colorTapiceria.setSeleccionado(false);
        listaColorTapiceria.add(colorTapiceria);

        colorTapiceria=new ColorTapiceria();
        colorTapiceria.setNombre("Black/Gray Cloth");
        colorTapiceria.setPrecio(0.00);
        colorTapiceria.setSeleccionado(false);
        listaColorTapiceria.add(colorTapiceria);

        colorTapiceria=new ColorTapiceria();
        colorTapiceria.setNombre("Red/Black Suede Effect-Fabric");
        colorTapiceria.setPrecio(0.00);
        colorTapiceria.setSeleccionado(false);
        listaColorTapiceria.add(colorTapiceria);

    }//fin void llenarListaColorTapiceria
    
    //muestra el listado de color de la tapiceria
    public void mostrarListaColorTapiceria(){
        llenarListaColorTapiceria();     
        System.out.println("-----------------------------------------------------------------");
        System.out.println("                     CONSESIONARIO DE AUTOS                      ");
        System.out.println("                   - SELECCION DE AMENIDADES -                   ");
        System.out.println("           - SELECCION DE TIPO DE COLOR DE TAPICERIA -           ");
        System.out.println("-----------------------------------------------------------------"); 
        System.out.println("\nHa seleccionado la gama: "+gamaSeleccionada);
        System.out.println("\nTipos de color de tapicería:\n");
        numeracion=0;
        texto="";
        moneda="";
        for (int i = 0; i < listaColorTapiceria.size(); i++) {
            numeracion++;
            texto=" ";
            moneda="Q"+texto.repeat(10 - String.format("%,.2f", listaColorTapiceria.get(i).getPrecio()).length())+String.format("%,.2f", listaColorTapiceria.get(i).getPrecio());
            texto=listaColorTapiceria.get(i).getNombre()+(texto.repeat(60 -(listaColorTapiceria.get(i).getNombre().length()+moneda.length())))+moneda;     
            System.out.println("0"+numeracion+".- "+texto);               
        }
    }//fin void mostrarListaColorTapiceria
    
    //llena el listado de los aros disponibles
    public void llenarListaAro(){
        listaAro = new ArrayList<>();
        aro=new Aro();
        aro.setNombre("15”");
        aro.setPrecio(0.00);
        aro.setSeleccionado(false);
        listaAro.add(aro);
        
        aro=new Aro();
        aro.setNombre("16”");
        aro.setPrecio(0.00);
        aro.setSeleccionado(false);
        listaAro.add(aro);
        
        aro=new Aro();
        aro.setNombre("17”");
        aro.setPrecio(1688.00);
        aro.setSeleccionado(false);
        listaAro.add(aro);
        
        aro=new Aro();
        aro.setNombre("18”");
        aro.setPrecio(1700.00);
        aro.setSeleccionado(false);
        listaAro.add(aro);
        
        aro=new Aro();
        aro.setNombre("19”");
        aro.setPrecio(3011.00);
        aro.setSeleccionado(false);
        listaAro.add(aro);
    }//fin void llenarListaAro
    
    //muestra el listado de aros disponibles
    public void mostrarListaAro(){
        llenarListaAro();          
        System.out.println("-----------------------------------------------------------------");
        System.out.println("                     CONSESIONARIO DE AUTOS                      ");
        System.out.println("                   - SELECCION DE AMENIDADES -                   ");
        System.out.println("                  - SELECCION DE TIPO DE ARO -                   ");
        System.out.println("-----------------------------------------------------------------"); 
        System.out.println("\nHa seleccionado la gama: "+gamaSeleccionada);
        System.out.println("\nTipos de aro:\n");
        numeracion=0;
        texto="";
        moneda="";
        for (int i = 0; i < listaAro.size(); i++) {
            numeracion++;
            texto=" ";
            moneda="Q"+texto.repeat(10 - String.format("%,.2f", listaAro.get(i).getPrecio()).length())+String.format("%,.2f", listaAro.get(i).getPrecio());
            texto=listaAro.get(i).getNombre()+(texto.repeat(60 -(listaAro.get(i).getNombre().length()+moneda.length())))+moneda;     
            System.out.println("0"+numeracion+".- "+texto);               
        }
    }//fin void mostrarListaAro
    
    //llena el listado de accesorio exterior disponible
    public void llenarListaAccesorioExterior(){
        listaAccesorioExterior = new ArrayList<>();
        accesorioExterior = new AccesorioExterior();
        accesorioExterior.setNombre("Body Side Molding");
        accesorioExterior.setPrecio(217.00);
        accesorioExterior.setSeleccionado(false);
        listaAccesorioExterior.add(accesorioExterior);

        accesorioExterior = new AccesorioExterior();
        accesorioExterior.setNombre("Car Cover");
        accesorioExterior.setPrecio(230.00);
        accesorioExterior.setSeleccionado(false);
        listaAccesorioExterior.add(accesorioExterior);

        accesorioExterior = new AccesorioExterior();
        accesorioExterior.setNombre("Decklid Spoiler");
        accesorioExterior.setPrecio(299.99);
        accesorioExterior.setSeleccionado(false);
        listaAccesorioExterior.add(accesorioExterior);

        accesorioExterior = new AccesorioExterior();
        accesorioExterior.setNombre("Door Edge Film");
        accesorioExterior.setPrecio(42.00);
        accesorioExterior.setSeleccionado(false);
        listaAccesorioExterior.add(accesorioExterior);

        accesorioExterior = new AccesorioExterior();
        accesorioExterior.setNombre("Door Edge Guards");
        accesorioExterior.setPrecio(84.00);
        accesorioExterior.setSeleccionado(false);
        listaAccesorioExterior.add(accesorioExterior);

        accesorioExterior = new AccesorioExterior();
        accesorioExterior.setNombre("Door Trim Chrome");
        accesorioExterior.setPrecio(285.00);
        accesorioExterior.setSeleccionado(false);
        listaAccesorioExterior.add(accesorioExterior);

        accesorioExterior = new AccesorioExterior();
        accesorioExterior.setNombre("Door Visor");
        accesorioExterior.setPrecio(185.00);
        accesorioExterior.setSeleccionado(false);
        listaAccesorioExterior.add(accesorioExterior);

        accesorioExterior = new AccesorioExterior();
        accesorioExterior.setNombre("Front Fender Emblems");
        accesorioExterior.setPrecio(50.00);
        accesorioExterior.setSeleccionado(false);
        listaAccesorioExterior.add(accesorioExterior);

        accesorioExterior = new AccesorioExterior();
        accesorioExterior.setNombre("Rear Bumper Applique");
        accesorioExterior.setPrecio(70.00);
        accesorioExterior.setSeleccionado(false);
        listaAccesorioExterior.add(accesorioExterior);

        accesorioExterior = new AccesorioExterior();
        accesorioExterior.setNombre("Fog Lights");
        accesorioExterior.setPrecio(325.00);
        accesorioExterior.setSeleccionado(false);
        listaAccesorioExterior.add(accesorioExterior);

        accesorioExterior = new AccesorioExterior();
        accesorioExterior.setNombre("Nose Mascs");
        accesorioExterior.setPrecio(158.00);
        accesorioExterior.setSeleccionado(false);
        listaAccesorioExterior.add(accesorioExterior);

        accesorioExterior = new AccesorioExterior();
        accesorioExterior.setNombre("Moonrof Visor");
        accesorioExterior.setPrecio(138.00);
        accesorioExterior.setSeleccionado(false);
        listaAccesorioExterior.add(accesorioExterior);

        accesorioExterior = new AccesorioExterior();
        accesorioExterior.setNombre("Splash Guard Set");
        accesorioExterior.setPrecio(104.00);
        accesorioExterior.setSeleccionado(false);
        listaAccesorioExterior.add(accesorioExterior);

        accesorioExterior = new AccesorioExterior();
        accesorioExterior.setNombre("Dust Cover");
        accesorioExterior.setPrecio(350.00);
        accesorioExterior.setSeleccionado(false);
        listaAccesorioExterior.add(accesorioExterior);

        accesorioExterior = new AccesorioExterior();
        accesorioExterior.setNombre("Door Mirror Cover - Carbon Fiber");
        accesorioExterior.setPrecio(520.00);
        accesorioExterior.setSeleccionado(false);
        listaAccesorioExterior.add(accesorioExterior);
    
    }//fin void llenarListaAccesorioExterior
    
    //muestra el listado de accesorio exterior
    public void mostrarListaAccesorioExterior(){
        llenarListaAccesorioExterior();
        System.out.println("-----------------------------------------------------------------");
        System.out.println("                     CONSESIONARIO DE AUTOS                      ");
        System.out.println("                   - SELECCION DE AMENIDADES -                   ");
        System.out.println("              - SELECCION DE ACCESORIO EXTERIOR -                ");
        System.out.println("-----------------------------------------------------------------"); 
        System.out.println("\nHa seleccionado la gama: "+gamaSeleccionada);
        System.out.println("\nTipos de accesorio exterior:\n");
        numeracion=0;
        texto="";
        moneda="";
        for (int i = 0; i < listaAccesorioExterior.size(); i++) {
            numeracion++;
            texto=" ";
            moneda="Q"+texto.repeat(10 - String.format("%,.2f", listaAccesorioExterior.get(i).getPrecio()).length())+String.format("%,.2f", listaAccesorioExterior.get(i).getPrecio());
            texto=listaAccesorioExterior.get(i).getNombre()+(texto.repeat(60 -(listaAccesorioExterior.get(i).getNombre().length()+moneda.length())))+moneda;
            if (numeracion<10) {
                System.out.println("0"+numeracion+".- "+texto);               
            }else  {
            System.out.println(numeracion+".- "+texto);
            }           
        }
    }//fin void mostrarListaAccesorioExterior

    //llena el listado de accesorio interior disponible    
    public void llenarListaAccesorioInterior(){
        listaAccesorioInterior = new ArrayList<>();
        accesorioInterior = new AccesorioInterior();
        accesorioInterior.setNombre("All-Seasons Floor Mats");
        accesorioInterior.setPrecio(142.00);
        accesorioInterior.setSeleccionado(false);
        listaAccesorioInterior.add(accesorioInterior);
        
        accesorioInterior = new AccesorioInterior();
        accesorioInterior.setNombre("Automatic-Dimming Mirror");
        accesorioInterior.setPrecio(219.00);
        accesorioInterior.setSeleccionado(false);
        listaAccesorioInterior.add(accesorioInterior);
        
        accesorioInterior = new AccesorioInterior();
        accesorioInterior.setNombre("Cargo Hook");
        accesorioInterior.setPrecio(12.00);
        accesorioInterior.setSeleccionado(false);
        listaAccesorioInterior.add(accesorioInterior);
        
        accesorioInterior = new AccesorioInterior();
        accesorioInterior.setNombre("Cargo Net");
        accesorioInterior.setPrecio(49.00);
        accesorioInterior.setSeleccionado(false);
        listaAccesorioInterior.add(accesorioInterior);
        
        accesorioInterior = new AccesorioInterior();
        accesorioInterior.setNombre("Console Illumination");
        accesorioInterior.setPrecio(250.00);
        accesorioInterior.setSeleccionado(false);
        listaAccesorioInterior.add(accesorioInterior);
        
        accesorioInterior = new AccesorioInterior();
        accesorioInterior.setNombre("Cargo Organizer");
        accesorioInterior.setPrecio(87.00);
        accesorioInterior.setSeleccionado(false);
        listaAccesorioInterior.add(accesorioInterior);
        
        accesorioInterior = new AccesorioInterior();
        accesorioInterior.setNombre("Door Panel Protector");
        accesorioInterior.setPrecio(149.00);
        accesorioInterior.setSeleccionado(false);
        listaAccesorioInterior.add(accesorioInterior);
        
        accesorioInterior = new AccesorioInterior();
        accesorioInterior.setNombre("Armrest Compartiment");
        accesorioInterior.setPrecio(337.00);
        accesorioInterior.setSeleccionado(false);
        listaAccesorioInterior.add(accesorioInterior);
        
        accesorioInterior = new AccesorioInterior();
        accesorioInterior.setNombre("Door Sill Trim-Illuminated");
        accesorioInterior.setPrecio(290.00);
        accesorioInterior.setSeleccionado(false);
        listaAccesorioInterior.add(accesorioInterior);
       
        accesorioInterior = new AccesorioInterior();
        accesorioInterior.setNombre("Cargo Cover");
        accesorioInterior.setPrecio(166.00);
        accesorioInterior.setSeleccionado(false);
        listaAccesorioInterior.add(accesorioInterior);
    
        accesorioInterior = new AccesorioInterior();
        accesorioInterior.setNombre("Cargo Liner");
        accesorioInterior.setPrecio(187.00);
        accesorioInterior.setSeleccionado(false);
        listaAccesorioInterior.add(accesorioInterior); 
    }//fin void llenarListaAccesorioInterior

    //muestra el listado de accesorio interior    
    public void mostrarListaAccesorioInterior(){
        llenarListaAccesorioInterior();
        System.out.println("-----------------------------------------------------------------");
        System.out.println("                     CONSESIONARIO DE AUTOS                      ");
        System.out.println("                   - SELECCION DE AMENIDADES -                   ");
        System.out.println("              - SELECCION DE ACCESORIO INTERIOR -                ");
        System.out.println("-----------------------------------------------------------------"); 
        System.out.println("\nHa seleccionado la gama: "+gamaSeleccionada);
        System.out.println("\nTipos de accesorio interior:\n");
        numeracion=0;
        texto="";
        moneda="";
        for (int i = 0; i < listaAccesorioInterior.size(); i++) {
            numeracion++;
            texto=" ";
            moneda="Q"+texto.repeat(10 - String.format("%,.2f", listaAccesorioInterior.get(i).getPrecio()).length())+String.format("%,.2f", listaAccesorioInterior.get(i).getPrecio());
            texto=listaAccesorioInterior.get(i).getNombre()+(texto.repeat(60 -(listaAccesorioInterior.get(i).getNombre().length()+moneda.length())))+moneda;
            if (numeracion<10) {
                System.out.println("0"+numeracion+".- "+texto);               
            }else  {
            System.out.println(numeracion+".- "+texto);
            }           
        }
    }//fin void mostrarListaAccesorioInterior
    
    //llena el listado de accesorio electronico disponible
    public void llenarListaAccesorioElectronico(){
        listaAccesorioElectronico = new ArrayList<>();
        accesorioElectronico= new AccesorioElectronico();
        accesorioElectronico.setNombre("Wireless Phone Charger");
        accesorioElectronico.setPrecio(305.00);
        accesorioElectronico.setSeleccionado(false);
        listaAccesorioElectronico.add(accesorioElectronico); 
        
        accesorioElectronico= new AccesorioElectronico();
        accesorioElectronico.setNombre("USB Charger - 2.1 Amp.");
        accesorioElectronico.setPrecio(120.00);
        accesorioElectronico.setSeleccionado(false);
        listaAccesorioElectronico.add(accesorioElectronico);
        
        accesorioElectronico= new AccesorioElectronico();
        accesorioElectronico.setNombre("Puddle Light");
        accesorioElectronico.setPrecio(185.00);
        accesorioElectronico.setSeleccionado(false);
        listaAccesorioElectronico.add(accesorioElectronico);
        
        accesorioElectronico= new AccesorioElectronico();
        accesorioElectronico.setNombre("Parking Sensors");
        accesorioElectronico.setPrecio(514.00);
        accesorioElectronico.setSeleccionado(false);
        listaAccesorioElectronico.add(accesorioElectronico);
       
    }//fin void llenarListaAccesorioElectronico
        
    //muestra el listado de accesorio electronico
     public void mostrarListaAccesorioElectronico(){
        llenarListaAccesorioElectronico();          
        System.out.println("-----------------------------------------------------------------");
        System.out.println("                     CONSESIONARIO DE AUTOS                      ");
        System.out.println("                   - SELECCION DE AMENIDADES -                   ");
        System.out.println("             - SELECCION DE ACCESORIO ELECTRONICO -              ");
        System.out.println("-----------------------------------------------------------------"); 
        System.out.println("\nHa seleccionado la gama: "+gamaSeleccionada);
        System.out.println("\nTipos de accesorio electrónico:\n");
        numeracion=0;
        texto="";
        moneda="";
        for (int i = 0; i < listaAccesorioElectronico.size(); i++) {
            numeracion++;
            texto=" ";
            moneda="Q"+texto.repeat(10 - String.format("%,.2f", listaAccesorioElectronico.get(i).getPrecio()).length())+String.format("%,.2f", listaAccesorioElectronico.get(i).getPrecio());
            texto=listaAccesorioElectronico.get(i).getNombre()+(texto.repeat(60 -(listaAccesorioElectronico.get(i).getNombre().length()+moneda.length())))+moneda;     
            System.out.println("0"+numeracion+".- "+texto);               
        }
    }//fin void mostrarListaAccesorioElectronico
}//Fin class Data