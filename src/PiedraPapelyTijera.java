import java.util.Random;
import java.util.Scanner;

public class PiedraPapelyTijera {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //*********************************************************************************************
        //VARIABLES


        int eleccionUsuario = 0;
        int puntajeJugador = 0;
        int puntajeMaquina = 0;
        String mensajeInicial = """
                ¡¡Bienvenido a la competencia del siglo de PIEDRA, PAPEL O TIJERA!!
                (TAN TAN TAAAANNN TAAAAAAAAAAAN)
                
                Instrucciones:
                
                a) Presiona 1 para elegir PIEDRA
                b) Presiona 2 para elegir PAPEL
                c) Presiona 3 para elegir TIJERA
                
                
                
                Reglas del Juego:
                1 - Tendrás solo (3) tres oportunidades.
                2 - No hay más reglas.
                """;


        //*********************************************************************************************
        //MENSAJE DE BIENVENIDA
        System.out.println("********************************************************************************************\n");
        System.out.println(mensajeInicial);
        System.out.println("********************************************************************************************\n");
        System.out.println("Bienvenido, ingresa por favor tú nombre");
        String nombreUsuario = teclado.nextLine().toUpperCase();
        System.out.println("\nBienvenido " + nombreUsuario + ", hoy te enfrentaras contra la unica e inigualable VENEMACHINE, ¿Podrás ganar este desafio?");
        System.out.println("********************************************************************************************\n");


        //*********************************************************************************************
        //CODIGO

        while (puntajeJugador < 3 && puntajeMaquina < 3){
            int numeroAleatorio = new Random().nextInt(3) + 1;
            System.out.println("Aca te muestro el numerito para que testees  " + numeroAleatorio + "  El numerito de la suerte siiiuuuuu");
            System.out.println("\n********************************************************************************************");
            System.out.println("Presiona 1 para elegir PIEDRA, presiona 2 para elegir PAPEL o presiona 3 para elegir TIJERA");
            eleccionUsuario = teclado.nextInt();
            System.out.println("********************************************************************************************\n");

            switch (eleccionUsuario){
                case 1:
                    if (eleccionUsuario == numeroAleatorio){
                        String mensajeEmpate = String.format("%s elegiste PIEDRA y la VENEMACHINE eligió PIEDRA", nombreUsuario);
                        System.out.println(mensajeEmpate + "\n");
                        System.out.println("¡Empate, nadie recibe puntos!\n");
                        String totalidadPuntaje = String.format("%s %d %s - VENEMACHINE %d %s ",nombreUsuario,puntajeJugador,(puntajeJugador == 1 ? "punto" : "puntos"),puntajeMaquina,(puntajeMaquina == 1 ? "punto" : "puntos"));
                        System.out.println(totalidadPuntaje + "\n");
                    } else if (eleccionUsuario == 1 && numeroAleatorio == 3) {
                        String mensajeGana = String.format("%s elegiste PIEDRA y la VENEMACHINE eligió TIJERA", nombreUsuario);
                        System.out.println(mensajeGana + "\n");
                        System.out.println("¡¡INCREIBLE!! La PIEDRA ha destrozado en mil pedazos a la TIJERA.. Enhorabuena lo lograste, has ganado un punto. \n");
                        puntajeJugador++;
                        String totalidadPuntaje = String.format("%s %d %s - VENEMACHINE %d %s ",nombreUsuario,puntajeJugador,(puntajeJugador == 1 ? "punto" : "puntos"),puntajeMaquina,(puntajeMaquina == 1 ? "punto" : "puntos"));
                        System.out.println(totalidadPuntaje + "\n");
                    } else if (eleccionUsuario == 1 && numeroAleatorio == 2) {
                        String mensajePierde = String.format("%s elegiste PIEDRA y la VENEMACHINE eligió PAPEL", nombreUsuario);
                        System.out.println(mensajePierde + "\n");
                        System.out.println("¡¡ASOMBROSO!! La PIEDRA ha sido asfixiada por el PAPEL.. Lo lamento, perdiste, VENEMACHINE ha ganado un punto. \n");
                        puntajeMaquina++;
                        String totalidadPuntaje = String.format("%s %d %s - VENEMACHINE %d %s ",nombreUsuario,puntajeJugador,(puntajeJugador == 1 ? "punto" : "puntos"),puntajeMaquina,(puntajeMaquina == 1 ? "punto" : "puntos"));
                        System.out.println(totalidadPuntaje + "\n");
                    };
                    break;
                case 2:
                    if (eleccionUsuario == numeroAleatorio) {
                        String mensajeEmpate = String.format("%s elegiste PAPEL y la VENEMACHINE eligió PAPEL", nombreUsuario);
                        System.out.println(mensajeEmpate + "\n");
                        System.out.println("¡Empate, nadie recibe puntos!\n");
                        String totalidadPuntaje = String.format("%s %d %s - VENEMACHINE %d %s ",nombreUsuario,puntajeJugador,(puntajeJugador == 1 ? "punto" : "puntos"),puntajeMaquina,(puntajeMaquina == 1 ? "punto" : "puntos"));
                        System.out.println(totalidadPuntaje + "\n");
                    }else if (eleccionUsuario == 2 && numeroAleatorio == 1) {
                        String mensajeGana = String.format("%s elegiste PAPEL y la VENEMACHINE eligió PIEDRA", nombreUsuario);
                        System.out.println(mensajeGana + "\n");
                        System.out.println("¡¡NO LO PUEDO CREER!! El PAPEL ha dejado sin oxigeno a la PIEDRA.. Enhorabuena lo lograste, has ganado un punto.\n");
                        puntajeJugador++;
                        String totalidadPuntaje = String.format("%s %d %s - VENEMACHINE %d %s ",nombreUsuario,puntajeJugador,(puntajeJugador == 1 ? "punto" : "puntos"),puntajeMaquina,(puntajeMaquina == 1 ? "punto" : "puntos"));
                        System.out.println(totalidadPuntaje + "\n");
                    }else if (eleccionUsuario == 2 && numeroAleatorio == 3) {
                        String mensajePierde = String.format("%s elegiste PAPEL y la VENEMACHINE eligió TIJERA", nombreUsuario);
                        System.out.println(mensajePierde + "\n");
                        System.out.println("¡¡WOW!! Las TIJERAS le han cortado las esperanzas al PAPEL.. Lo lamento, perdiste, VENEMACHINE ha ganado un punto.\n");
                        puntajeMaquina++;
                        String totalidadPuntaje = String.format("%s %d %s - VENEMACHINE %d %s ",nombreUsuario,puntajeJugador,(puntajeJugador == 1 ? "punto" : "puntos"),puntajeMaquina,(puntajeMaquina == 1 ? "punto" : "puntos"));
                        System.out.println(totalidadPuntaje + "\n");
                    };
                    break;
                case 3:
                    if (eleccionUsuario == numeroAleatorio) {
                        String mensajeEmpate = String.format("%s elegiste TIJERA y la VENEMACHINE eligió TIJERA", nombreUsuario);
                        System.out.println(mensajeEmpate + "\n");
                        System.out.println("¡Empate, nadie recibe puntos!\n");
                        String totalidadPuntaje = String.format("%s %d %s - VENEMACHINE %d %s ",nombreUsuario,puntajeJugador,(puntajeJugador == 1 ? "punto" : "puntos"),puntajeMaquina,(puntajeMaquina == 1 ? "punto" : "puntos"));
                        System.out.println(totalidadPuntaje + "\n");
                    }else if (eleccionUsuario == 3 && numeroAleatorio == 2) {
                        String mensajeGana = String.format("%s elegiste TIJERA y la VENEMACHINE eligió PAPEL", nombreUsuario);
                        System.out.println(mensajeGana + "\n");
                        System.out.println("¡¡QUE BARBARIDAD!! La TIJERA desgarra al PAPEL con facilidad.. Enhorabuena lo lograste, has ganado un punto.\n");
                        puntajeJugador++;
                        String totalidadPuntaje = String.format("%s %d %s - VENEMACHINE %d %s ",nombreUsuario,puntajeJugador,(puntajeJugador == 1 ? "punto" : "puntos"),puntajeMaquina,(puntajeMaquina == 1 ? "punto" : "puntos"));
                        System.out.println(totalidadPuntaje + "\n");
                    }else if (eleccionUsuario == 3 && numeroAleatorio == 1) {
                        String mensajePierde = String.format("%s elegiste TIJERA y la VENEMACHINE eligió PIEDRA", nombreUsuario);
                        System.out.println(mensajePierde + "\n");
                        System.out.println("¡¡DE PELICULA!! La PIEDRA arremete sin piedad y destroza a las TIJERAS.. Lo lamento, perdiste, VENEMACHINE ha ganado un punto.\n");
                        puntajeMaquina++;
                        String totalidadPuntaje = String.format("%s %d %s - VENEMACHINE %d %s ",nombreUsuario,puntajeJugador,(puntajeJugador == 1 ? "punto" : "puntos"),puntajeMaquina,(puntajeMaquina == 1 ? "punto" : "puntos"));
                        System.out.println(totalidadPuntaje + "\n");
                    };
                    break;
                default:
                    System.out.println("Elección invalida, presiona 1 para elegir PIEDRA, presiona 2 para elegir PAPEL o presiona 3 para elegir TIJERA");
                    break;
            }
        }
    }
}
