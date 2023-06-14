
/**
 *
 * @author Mateo
 */

import java.util.Random;

public class GeneradorDePalabras {
   
    private String lenguaje;
    
    public GeneradorDePalabras(String lenguaje) {
        this.lenguaje = lenguaje;
    }
    
    public String generateWord() {
        // generador de palabras según se seleccione el idioma
        String word = "";
        
        if (lenguaje.equalsIgnoreCase("Inglés")) {
            String[] palabrasIngles = { "apple", "banana", "car", "dog", "elephant", "flower", "guitar", "house", "internet", "jazz",
            "key", "lion", "moon", "notebook", "orange", "pizza", "queen", "river", "sun", "tree",
            "umbrella", "violet", "window", "xylophone", "yellow", "zebra", "airplane", "butterfly", "cat", "dolphin",
            "ear", "fire", "globe", "hat", "island", "jungle", "kite", "lemon", "mountain", "nest",
            "ocean", "pencil", "quilt", "rabbit", "star", "train", "unicorn", "vase", "water", "xylophone",
            "yacht", "zeppelin", "arch", "bird", "carrot", "desk", "elephant", "fireplace", "guitar", "house",
            "igloo", "jacket", "kangaroo", "leopard", "monkey", "nut", "ostrich", "piano", "queen", "rose",
            "sailboat", "tiger", "umbrella", "violin", "whale", "xylophone", "yarn", "zebra", "ant", "bear",
            "camel", "dinosaur", "eagle", "fish", "gorilla", "hamster", "insect", "jellyfish", "koala", "lion",
            "mango", "ninja", "octopus", "penguin", "quail", "raccoon", "snake", "turtle", "unicorn", "vampire",
            "whale", "xylophone", "yak", "zebra", "alligator", "bat", "cat", "dog", "elephant", "frog",
            "giraffe", "hippo", "iguana", "jaguar", "kangaroo", "lion", "monkey", "newt", "owl", "panda",
            "quokka", "rhino", "snake", "tiger", "uakari", "vulture", "walrus", "xenopus", "yak", "zebra" };
            Random random = new Random();
            int randomIndex = random.nextInt(palabrasIngles.length);
            word = palabrasIngles[randomIndex];
        } else if (lenguaje.equalsIgnoreCase("español")) {
            String[] palabrasEspañol = { "abrazo", "aceite", "amigo", "anillo", "arbusto", "árbol", "arena", "aroma", "arte", "avenida",
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
            "étnico", "ágil", "água", "época", "óleo", "ópera", "óptimo", "óvalo", "óxido", "único"};
            Random random = new Random();
            int randomIndex = random.nextInt(palabrasEspañol.length);
            word = palabrasEspañol[randomIndex];
        }
        
        return word;
    }
}


