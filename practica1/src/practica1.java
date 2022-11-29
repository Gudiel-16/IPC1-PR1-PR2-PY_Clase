


import java.util.Random;
import java.util.Scanner;
public class practica1 {

    public static int opcion;
    public static void main(String[] args) {
       
        principal();
         
    }//Cierre de main
    
    public static void principal(){
     while(true){
        //int opcion; //variable para ingresar en scanner
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("MENU");
        System.out.println("1. Ingresar jugadores");
        System.out.println("2. Iniciar Juego");
        System.out.println("3. Regresar al juego");
        System.out.println("4. Configuracion");
        System.out.println("5. salir");
        System.out.println("ELIJA UNA OPCION:");
        
        opcion=entrada.nextInt();
        
        Menu();
        }//cierre de while    
    }
    
    public static void Menu(){
        
        switch(opcion) {
            
            case 1:
                practica1.Nombres();
                break;
                
            case 2:
                
                if(ya_ingreso==true){
                practica1.IniciarJuego();
                }else{
                System.out.println("Ingrese nombres!");   
                }
                
                break;
                
            case 3:
                System.out.println("No puede regresar al juego! aun no ha empezado a jugar!!");
                break;
                
            case 4:
                if(ya_ingreso==true){
                practica1.subMenuOpciones();
                }else{
                System.out.println("Ingrese nombres!");   
                }
                break;
                
            case 5:
                System.exit(0);
                break;
            
        }//Cierre de switch
    }//Cierre metodo menu
    
    
    //Variables globales para uso de nombres
    public static String jug1_2,jug2_2,jug1_3,jug2_3,jug3_3;   
    public static boolean ya_ingreso=false;
    
    //Metodo para el primer inciso (Ingresar jugadores)
    public static void Nombres(){
        
        Scanner nombress=new Scanner(System.in);
        
            System.out.println("Ingrese primer nombre:");
            String Op1nombre1 = nombress.next();
        
            System.out.println("Ingrese segundo nombre:");
            String Op1nombre2=nombress.next(); 
            
            //se guardan los nombres en las variables globales
            jug1_2=Op1nombre1; 
            jug2_2=Op1nombre2;
            ya_ingreso=true;
            
      }//Cierre metodo menu
    
        public static Random aleatorio=new Random();
        public static int a=0,b=1,c=2,d=3,e=4,f=5,g=6,h=7,k=8,l=9; //variables para los indices de las matrices
        public static int fi, co,fis1 = 0,cos1=0,fis2=0,cos2=0; //variables para recorrer las matrices
        public static int contador_jug1=0,contador_jug2=0;
        public static boolean verificar=false; //para vericuar si se encuentra el numero
        
        public static char final_juego='$';
        public static int n1=aleatorio.nextInt(10);
        public static int n2=aleatorio.nextInt(10);
        public static int n3=aleatorio.nextInt(10);
        public static int n4=aleatorio.nextInt(10);
        public static int n5=aleatorio.nextInt(10)-10;
        public static int n6=aleatorio.nextInt(10)-10;
        public static int n7=aleatorio.nextInt(10)-10;
        public static int n8=aleatorio.nextInt(10)-10;
        
        public static void IniciarJuego(){
                
            //         
            String x[][];
            x=new String[10][5];
            
            
            x[a][a]="-";
            x[a][b]=""+n2;
            x[a][c]="-";
            x[a][d]="-";
            x[a][e]=""+final_juego;
            x[b][a]="-";
            x[b][b]="-";
            x[b][c]="-";
            x[b][d]="-";
            x[b][e]="-";
            x[c][a]="-";
            x[c][b]=""+n1;
            x[c][c]="-";
            x[c][d]="-";
            x[c][e]="-";
            x[d][a]="-";
            x[d][b]="-";
            x[d][c]=""+n5;
            x[d][d]="-";
            x[d][e]="-";
            x[e][a]="-";
            x[e][b]="-";
            x[e][c]="-";
            x[e][d]=""+n7;
            x[e][e]="-";
            x[f][a]="-";
            x[f][b]="-";
            x[f][c]="-";
            x[f][d]="-";
            x[f][e]="-";
            x[g][a]="-";
            x[g][b]=""+n4;
            x[g][c]="-";
            x[g][d]="-";
            x[g][e]="-";
            x[h][a]=""+n8;
            x[h][b]="-";
            x[h][c]="-";
            x[h][d]="-";
            x[h][e]=""+n6;            
            x[k][a]="-";
            x[k][b]="-";
            x[k][c]="-";
            x[k][d]="-";
            x[k][e]="-";
            x[l][a]="-";
            x[l][b]="-";
            x[l][c]=""+n3;
            x[l][d]="-";
            x[l][e]="INICIO";  
            
            //ciclo para llenar la matriz
            for(fi=0;fi<10;fi++){
                for(co=0;co<5;co++){
                 
                   System.out.print(x[fi][co]+"          "); //no es println por el salto de linea
                }
               System.out.println("                ");//doble System para que que mas separada la matriz
               System.out.println("              ");
            }//final del ciclo for
            
            Iniciar_Juego2();
            
        }// cierre metodo IniciarJuego()
        
        public static int opcionCopia;
        public static Scanner entradaCopia=new Scanner(System.in);
        
        public static void MenuPrincipalCopia(){
        
        System.out.println("MENU");
        System.out.println("1. Ingresar jugadores");
        System.out.println("2. Iniciar Juego");
        System.out.println("3. Regresar al juego");
        System.out.println("4. Configuracion");
        System.out.println("5. salir");
        System.out.println("ELIJA UNA OPCION:");
        
        opcionCopia=entradaCopia.nextInt();
        
        switch(opcionCopia){
            
                case 1:
                      System.out.println("Esta opcion no es valida");  
                      MenuPrincipalCopia();
                    break;
                    
                case 2:
                      System.out.println("Esta opcion no es valida");
                      MenuPrincipalCopia();
                    break;
                    
                case 3:
                      SubRegresar();  
                    break;
                
                case 4:
                      System.out.println("Esta opcion no es valida");
                      MenuPrincipalCopia();
                    break;
                
                case 5:
                      System.exit(0);
                    break;
                }
            }//cierre metodo copia
        
        //variables opciones de avance jugador 1
        public static int opcion1, opcion2, opcion3, opcion4, opcion5, opcion6; //variable para ingresar en scanner, 1=entrada, 2= jugador a elegir, 3=cuantas avanza jug1, 4= cuantas avanza jug2
        public static int avanza_jug1=0,avanza_jug2=0,retro_jug1=0,retro_jug2=0; // Estas tomaran el valor de opcion's para avanzar o retroceder
        public static Scanner entrada2=new Scanner(System.in);
        
        public static void subMenuOpciones(){
            
        while(true){
        
        System.out.println("MENU CONFIGURACION");
        System.out.println("1. Subida");
        System.out.println("2. Bajada");
        System.out.println("3. Regresar");
        System.out.println("ELIJA UNA OPCION:");
        
        opcion1=entrada2.nextInt();
        
        switch(opcion1){
            
                case 1:
                        SubSubidas();
                    break;
                    
                case 2:
                        SubBajadas();
                   
                    break;
                    
                case 3:
                        principal();
                    break;
                }
             }//cierre de while  
      }//cierre metodo subMenu
       
       //Metodo para subidas de los jugadores
       public static void SubSubidas(){
           
           System.out.println("A que jugador quiere avanzar?");
           System.out.println("1. el jugador: "+jug1_2);
           System.out.println("2. el jugador: "+jug2_2);
                    
           opcion2=entrada2.nextInt();
                    
           if(opcion2==1){
           System.out.println("Cuantas casillas quiere que avance el jugador: "+jug1_2+" ?");
           opcion3=entrada2.nextInt();
           System.out.println("Bien! el jugador: "+jug1_2+" avanzo "+opcion3+" casillas.");
           avanza_jug1=opcion3;
           
          }
                   
           if(opcion2==2){
           System.out.println("Cuantas casillas quiere que avance el jugador: "+jug2_2+" ?");
           opcion4=entrada2.nextInt();
           System.out.println("Bien! el jugador: "+jug2_2+" avanzo "+opcion4+" casillas.");
           avanza_jug2=opcion4;
         }  
       } 
       
       //Metodo para bajadas de los jugadores
       public static void SubBajadas(){
       
             System.out.println("A que jugador quiere retroceder?");
             System.out.println("1. el jugador: "+jug1_2);
             System.out.println("2. el jugador: "+jug2_2);
                    
             opcion2=entrada2.nextInt();
                    
             if(opcion2==1){
             System.out.println("Cuantas casillas quiere que retroceda el jugador: "+jug1_2+" ?");
             opcion5=entrada2.nextInt();
             System.out.println("Bien! el jugador: "+jug1_2+" retrocedio "+opcion5+" casillas.");
             retro_jug1=opcion5;
           }
             if(opcion2==2){
             System.out.println("Cuantas casillas quiere que avance el jugador: "+jug2_2+" ?");
             opcion6=entrada2.nextInt();
             System.out.println("Bien! el jugador: "+jug2_2+" retrocedio "+opcion6+" casillas.");
             retro_jug2=opcion6;
          } 
       } // cierre metodo bajada
       
       //metodo regresar al juego (no tiene nada para que me regrese al juego de nuevo)
       public static void SubRegresar(){
           
       }

        public static void Iniciar_Juego2(){   
        
        Scanner turnos=new Scanner(System.in);   
        
        int aleatorio_avance1,aleatorio_avance2;
        Integer por_tecla1; //variable para cambiar el numero aleatorio
        
        
        aleatorio_avance1=aleatorio.nextInt(11)+1;
        aleatorio_avance2=aleatorio.nextInt(11)+1;
        
        System.out.println("El simbolo de:"+jug1_2+" es @");
        System.out.println("El simbolo de:"+jug2_2+" es #");
        
        System.out.println("Es el turno de:"+jug1_2+" , presione ENTER obtener numero de avance ");
        
        String nombre;// variable para comparar con la ingresada por telado
        String nombre_teclado=turnos.nextLine();// variable ingresada por teclado
        nombre=nombre_teclado; // me guarda la variable nombre_telcado en nombre
        String pausa="p";
       
        if(nombre.equals(pausa)){ //Me compara si "nombre" es igual a "pausa", "pausa" tiene el valor de "p"
            
            MenuPrincipalCopia(); //Si teclea "p" me llama el Menu Copia
            SubRegresar(); //Metodo para regresar al juego sin ejecutar nada
         }
        
        System.out.println("El numero obtenido es "+aleatorio_avance1);
        
        System.out.println("Precione 0 para el turno del siguiente jugador");
        
        
        
        por_tecla1=turnos.nextInt();
        
        //para cambiar el aleatorio por un nuevo valor
        if(por_tecla1 != 0){
            aleatorio_avance1=por_tecla1;
            System.out.println("Su nuevo numero es: "+aleatorio_avance1);
        }
        
        //PARA EL JUGADOR 2
        
        turnos.nextLine();// Precionar enter para avancar
        
        System.out.println("Es el turno de:"+jug2_2+" , presione ENTER para obtener numero de avance: ");
        
        String nombre2;// variable para comparar con la ingresada por telado
        String nombre_teclado2=turnos.nextLine();// variable ingresada por teclado
        nombre=nombre_teclado2; // me guarda la variable nombre_telcado en nombre
        String pausa2="p";
        
        if(nombre.equals(pausa2)){ //Me compara si "nombre" es igual a "pausa", "pausa" tiene el valor de "p"
            
            MenuPrincipalCopia();
            SubRegresar();
         }
        
        System.out.println("El numero obtenido es "+aleatorio_avance2);
        
        System.out.println("Precione 0 para mostrar el tablero");
        por_tecla1=turnos.nextInt();
        
        //para cambiar el aleatorio por un nuevo valor
        if(por_tecla1 != 0){
            aleatorio_avance2=por_tecla1;
            System.out.println("Su nuevo numero es: "+aleatorio_avance2);
        }
        
        
        //MATRIZ PARA QUE BUSQUE EL VALOR ALEATORIO DEL JUGADOR
              
            int y[][];
            y=new int[10][5];
            
            y[a][a]=46;
            y[a][b]=47;
            y[a][c]=48;
            y[a][d]=49;
            y[a][e]=50;
            y[b][a]=45;
            y[b][b]=44;
            y[b][c]=43;
            y[b][d]=42;
            y[b][e]=41;
            y[c][a]=36;
            y[c][b]=37;
            y[c][c]=38;
            y[c][d]=39;
            y[c][e]=40;
            y[d][a]=35;
            y[d][b]=34;
            y[d][c]=33;
            y[d][d]=32;
            y[d][e]=31;
            y[e][a]=26;
            y[e][b]=27;
            y[e][c]=28;
            y[e][d]=29;
            y[e][e]=30;
            y[f][a]=25;
            y[f][b]=24;
            y[f][c]=23;
            y[f][d]=22;
            y[f][e]=21;
            y[g][a]=26;
            y[g][b]=17;
            y[g][c]=18;
            y[g][d]=19;
            y[g][e]=20;
            y[h][a]=15;
            y[h][b]=14;
            y[h][c]=13;
            y[h][d]=12;
            y[h][e]=11;            
            y[k][a]=6;
            y[k][b]=7;
            y[k][c]=8;
            y[k][d]=9;
            y[k][e]=10;
            y[l][a]=5;
            y[l][b]=4;
            y[l][c]=3;
            y[l][d]=2;
            y[l][e]=1;  
           
            //ciclo para recorrer la matriz y[][]
            for(fi=0;fi<10;fi++){
                for(co=0;co<5;co++){
                 
                } 
            }
            
             
            //Contador para que vaya acumulando los turnos de los jugadores
            contador_jug1=contador_jug1+aleatorio_avance1+avanza_jug1;
            contador_jug2=contador_jug2+aleatorio_avance2+avanza_jug2;
            
            //IF para verificar si esta en una casilla especial el jugador 1
            if(contador_jug1==3){
                System.out.println("El jugador: "+jug1_2+" Esta posicionado en una casilla especial \nAvanza o retrocede: "+n3+" Posiciones."); 
                contador_jug1=contador_jug1+n3;
            }
            if(contador_jug1==11){
                System.out.println("El jugador: "+jug1_2+" Esta posicionado en una casilla especial \nAvanza o retrocede: "+n6+" Posiciones."); 
                contador_jug1=contador_jug1+n6;
            }
            if(contador_jug1==15){
                System.out.println("El jugador: "+jug1_2+" Esta posicionado en una casilla especial \nAvanza o retrocede: "+n8+" Posiciones."); 
                contador_jug1=contador_jug1+n8;
            }
            if(contador_jug1==17){
                System.out.println("El jugador: "+jug1_2+" Esta posicionado en una casilla especial \nAvanza o retrocede: "+n4+" Posiciones."); 
                contador_jug1=contador_jug1+n4;
            }
            if(contador_jug1==29){
                System.out.println("El jugador: "+jug1_2+" Esta posicionado en una casilla especial \nAvanza o retrocede: "+n7+" Posiciones."); 
                contador_jug1=contador_jug1+n7;
            }
            if(contador_jug1==33){
                System.out.println("El jugador: "+jug1_2+" Esta posicionado en una casilla especial \nAvanza o retrocede: "+n5+" Posiciones."); 
                contador_jug1=contador_jug1+n5;
            }
            if(contador_jug1==37){
                System.out.println("El jugador: "+jug1_2+" Esta posicionado en una casilla especial \nAvanza o retrocede: "+n1+" Posiciones."); 
                contador_jug1=contador_jug1+n1;
            }
            if(contador_jug1==47){
                System.out.println("El jugador: "+jug1_2+" Esta posicionado en una casilla especial \nAvanza o retrocede: "+n2+" Posiciones."); 
                contador_jug1=contador_jug1+n2;
            }
            
            //IF para verificar si esta en una casilla especial el jugador 2
            if(contador_jug2==3){
                System.out.println("El jugador: "+jug2_2+" Esta posicionado en una casilla especial \nAvanza o retrocede: "+n3+" Posiciones."); 
                contador_jug2=contador_jug2+(n3);
            }
            if(contador_jug2==11){
                System.out.println("El jugador: "+jug2_2+" Esta posicionado en una casilla especial \nAvanza o retrocede: "+n6+" Posiciones."); 
                contador_jug2=contador_jug2+(n6);
            }
            if(contador_jug2==15){
                System.out.println("El jugador: "+jug2_2+" Esta posicionado en una casilla especial \nAvanza o retrocede: "+n8+" Posiciones."); 
                contador_jug2=contador_jug2+(n8);
            }
            if(contador_jug2==17){
                System.out.println("El jugador: "+jug2_2+" Esta posicionado en una casilla especial \nAvanza o retrocede: "+n4+" Posiciones."); 
                contador_jug2=contador_jug2+(n4);
            }
            if(contador_jug2==29){
                System.out.println("El jugador: "+jug2_2+" Esta posicionado en una casilla especial \nAvanza o retrocede: "+n7+" Posiciones."); 
                contador_jug2=contador_jug2+(n7);
            }
            if(contador_jug2==33){
                System.out.println("El jugador: "+jug2_2+" Esta posicionado en una casilla especial \nAvanza o retrocede: "+n5+" Posiciones."); 
                contador_jug2=contador_jug2+(n5);
            }
            if(contador_jug2==37){
                System.out.println("El jugador: "+jug2_2+" Esta posicionado en una casilla especial \nAvanza o retrocede: "+n1+" Posiciones."); 
                contador_jug2=contador_jug2+(n1);
            }
            if(contador_jug2==47){
                System.out.println("El jugador: "+jug2_2+" Esta posicionado en una casilla especial \nAvanza o retrocede: "+n2+" Posiciones."); 
                contador_jug2=contador_jug2+(n2);
            }
            if(contador_jug1==contador_jug2){
                contador_jug1=contador_jug2-1;
            }
            
            //ciclo para recorer la matriz y[][] y comparar el numero aleatorio obtenido y buscar la posicion en la matriz y[][] para jugador 1
            
            for(fi=0;fi<10;fi++){
                for(co=0;co<5;co++){
                 if(contador_jug1==y[fi][co]){
                     fis1=fi;
                     cos1=co;
                     verificar=true;
                     
                 }//cierre if
                } 
            }//cierre ciclo
            
            //ciclo para recorer la matriz y[][] y comparar el numero aleatorio obtenido y buscar la posicion en la matriz y[][] para jugador 2
            
            for(fi=0;fi<10;fi++){
                for(co=0;co<5;co++){
                 if(contador_jug2==y[fi][co]){
                     fis2=fi;
                     cos2=co;
                     verificar=true;
                     
                 }//cierre if
                } 
            }//cierre ciclo
                       
           VIM();
        }
        
        public static void VIM(){
            
            String x[][];
            x=new String[10][5];
             
            x[a][a]="-";
            x[a][b]=""+n2;
            x[a][c]="-";
            x[a][d]="-";
            x[a][e]=""+final_juego;
            x[b][a]="-";
            x[b][b]="-";
            x[b][c]="-";
            x[b][d]="-";
            x[b][e]="-";
            x[c][a]="-";
            x[c][b]=""+n1;
            x[c][c]="-";
            x[c][d]="-";
            x[c][e]="-";
            x[d][a]="-";
            x[d][b]="-";
            x[d][c]=""+n5;
            x[d][d]="-";
            x[d][e]="-";
            x[e][a]="-";
            x[e][b]="-";
            x[e][c]="-";
            x[e][d]=""+n7;
            x[e][e]="-";
            x[f][a]="-";
            x[f][b]="-";
            x[f][c]="-";
            x[f][d]="-";
            x[f][e]="-";
            x[g][a]="-";
            x[g][b]=""+n4;
            x[g][c]="-";
            x[g][d]="-";
            x[g][e]="-";
            x[h][a]=""+n8;
            x[h][b]="-";
            x[h][c]="-";
            x[h][d]="-";
            x[h][e]=""+n6;            
            x[k][a]="-";
            x[k][b]="-";
            x[k][c]="-";
            x[k][d]="-";
            x[k][e]="-";
            x[l][a]="-";
            x[l][b]="-";
            x[l][c]=""+n3;
            x[l][d]="-";
            x[l][e]="INICIO";   
                         
            x[fis1][cos1]="@"; //Nueva posicion para el valor de jugador 1
            x[fis2][cos2]="#"; //Nueva posicion para el valor de jugador 2
            
            // Para volver imprimir matriz
            for(fi=0;fi<10;fi++){
                for(co=0;co<5;co++){
                 
                   System.out.print(x[fi][co]+"          "); //no es println por el salto de linea
                }
               System.out.println("                ");//doble System para que que mas separada la matriz
               System.out.println("              ");
            }//final del ciclo for
            
            //Para que el avance en la configuracion se vuelva cero y no me siga acumulando el valor
            avanza_jug1=0;
            avanza_jug2=0;
            
           //Para terminar el juego 
           if((contador_jug1>=50) || (contador_jug2>=50)){
               System.out.println("HAS GANADO EL JUEGO");
               
               //Para que cuando termine el juego, vuelvan a la posicion inicial
               contador_jug1=0;
               contador_jug2=0;
               
           }else{
                   
             Iniciar_Juego2();
           }
        }//cierre metodo VIM
         
}//cierre clase
