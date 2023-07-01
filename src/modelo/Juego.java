package modelo;


import modelo.Jugador;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mateo
 */
public class Juego {
    
    /* 
    
    LOGICA DEL JUEGO:
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //areglo con las palabras en español que se van a mostrar aleatoriamente 
        String[] palabras = {"abrazo", "aceite", "amigo", "anillo", "arbusto", "árbol", "arena", "aroma", "arte", "avenida",
            "azul", "bailar", "barco", "beso", "bicicleta", "blanco", "boca", "bolsa", "botella", "brillante",
            "cabello", "cama", "caminar", "canción", "carro", "carta", "casa", "celeste", "cerca", "cielo",
            "ciudad", "color", "comida", "conectar", "correr", "crecer", "crema", "cruzar", "cuerpo", "danza",
            "día", "dibujo", "diente", "divertido", "dormir", "eco", "efecto", "elástico", "enamorado", "energía",
            "escalera", "espacio", "espejo", "familia", "flor", "frío", "fuego", "gato", "globo", "grande",
            "hoja", "hombre", "idea", "imagen", "jardín", "juego", "leche", "luz", "maleta", "mar",
            "mesa", "montaña", "música", "nadar", "nieve", "noche", "nube", "número", "oso", "pájaro",
            "palabra", "pantalón", "papel", "parque", "pasión", "pato", "pelo", "perro", "pescado", "pluma",
            "puerta", "río", "rojo", "saludar", "secreto", "silla", "sonido", "sueño", "taza", "televisión",
            "tierra", "tiempo", "tormenta", "trabajo", "universo", "verano", "verde", "vestido", "viento", "volar",
            "zanahoria", "zapato", "águila", "ámbar", "ámigo", "ámbar", "ánfora", "ánimo", "ébano", "éxito", "éter",
            "étnico", "ágil", "água", "época", "óleo", "ópera", "óptimo", "óvalo", "óxido", "único", "inconstitucionalidad", "perpendicularidad", "esdrújula", "anticonstitucionalmente",
            "transubstanciación", "prestidigitador", "ininteligibilidad", "gubernamentalmente",
            "electroencefalografía", "paleontológico", "autorretrato", "sobrealimentación",
            "desoxirribonucleico", "desobstruccionismo", "eclesiásticamente", "descentralización",
            "paradigmatológico", "desproporcionadamente", "contrarrevolucionario", "paralelepípedo",
            "monosilábico", "aerodinámicamente", "ultramicroscopio", "autotransportable",
            "psicoanalíticamente", "arqueoastronomía", "desesperanzadoramente", "discrecionalidad",
            "hipopotomonstrosesquipedaliofobia", "encefalograma", "contrainteligencia", "hipopótamo",
            "hidroelectrolítico", "neuropsiquiatría", "reumatológico", "trascendentalismo",
            "macroeconómicamente", "autorregulación", "paleontólogo", "desarraigamiento",
            "transiluminación", "fotodisociación", "antisubversivo", "otorrinolaringólogo",
            "hipocondríaco", "desfibrilador", "polarización", "desencadenante",
            "esternocleidomastoideo", "lexicográficamente", "hipermercado", "policromático",
            "biotecnológico", "oftalmológico", "desmembramiento", "bucodental",
            "concientizadamente", "acantilado", "circunstancialmente", "colaboracionismo",
            "espectroscopio", "electrodoméstico", "sociolingüística", "subdirector",
            "desprestigio", "esternocleidomastoideitis", "geopolíticamente", "heterosexualidad",
            "infundadamente", "interpretativamente", "intelectualización", "microrred",
            "desestabilización", "perfeccionamiento", "policondritis", "semiología",
            "oftalmopatía", "aracnofobia", "procrastinación", "desestresante",
            "determinación", "discriminación", "efectivamente", "desfavorablemente",
            "expectativas", "frustración", "generosamente", "habitualmente",
            "independientemente", "justificación", "karma", "lamentablemente",
            "manipulación", "necesariamente", "obstinadamente", "patológicamente",
            "querencia", "responsabilidad", "satisfactoriamente", "tumultuosamente",
            "ultrasonografía", "vulnerabilidad", "xenofobia", "yuxtaposición",
            "zoogeografía"};

        //Esta variable guarda la cantidad de palabras que se encuentran en el arreglo word
        int totalPalabras = palabras.length;

        System.out.println("¡Bienvenido al juego de Typing!");
        System.out.println("Escribe las palabras lo más rápido posible.");
        System.out.println("Escribe el tiempo que quieres jugar (en minutos): ");
        int duracionEnMinutos = scanner.nextInt();
        //convierte los minutos dados en segundos
        int duracionEnSegundos = duracionEnMinutos * 60;
        System.out.println("Presiona enter para empezar...");
        scanner.nextLine();

        //esta variable calcula el tiempo de finalizacion sumando los segundos al tiempo actual
        long finalTiempo = System.currentTimeMillis() + (duracionEnSegundos * 1000);

        //Esta variable será la encargada de llevar la cuenta de palabras correctas
        int palabrasCorrectas = 0;

        scanner.nextLine();

        // Este ciclo tiene varias sentencias:
        //  Primero se declara una variable "word" que lo que hace es obtener un indice aleatorio del arreglo "palabras"
        //para luego mostrarla en pantalla.
        //se almacena la palabra ingresada en la variable "input" y después se pasa por el ciclo if para evaluarla
        //con la palabra del arreglo "palabras", si las palabras coinciden la variable "palabrasCorrectas" aumenta en 1.
         
        while (System.currentTimeMillis() < finalTiempo) {
            String word = palabras[(int) (Math.random() * totalPalabras)];
            System.out.println(word + ": ");
            String input = scanner.nextLine();

            if (input.equals(word)) {
                palabrasCorrectas++;
            }
        }

        long tiempoTotal = (finalTiempo - System.currentTimeMillis()) / 1000;
        double precisión = (palabrasCorrectas / (double) totalPalabras) * 100;
        double palabrasPorMinuto = (palabrasCorrectas / (tiempoTotal / 1000.0) * 60);

        System.out.println("¡Juego terminado!");
        System.out.println("Palabras correctas: " + palabrasCorrectas);
        System.out.println("Precisión: " + precisión + "%");
        System.out.println("Palabras por minuto: " + palabrasPorMinuto);

        scanner.close();
    }
}

 
    */
    
 
    private int duracion;
    private String lenguaje;
    private int puntos;
    

    
    public void setDuracion(int duracion){
        this.duracion = duracion;
    }
    
   public int getDuracion(){
       return duracion;
   }
    
    public void setLenguaje(String lenguaje){
        this.lenguaje = lenguaje;
    }
    
    
    
    public void iniciarJuego(){
        
        
        
    }
    
    public void terminarJuego(){
        
    }
    
    
    
}
