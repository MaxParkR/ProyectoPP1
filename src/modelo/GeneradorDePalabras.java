package modelo;

/**
 *
 * @author Mateo
 */
import java.util.Random;

public class GeneradorDePalabras {

    private final String lenguaje;

    public GeneradorDePalabras(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public String generateWord() {
        // generador de palabras según se seleccione el idioma
        String word = "";

        if (lenguaje.equalsIgnoreCase("Inglés")) {
            String[] palabrasIngles = {"apple", "banana", "car", "dog", "elephant", "flower", "guitar", "house", "internet", "jazz",
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
                "quokka", "rhino", "snake", "tiger", "uakari", "vulture", "walrus", "xenopus", "yak", "zebra", "accommodate", "bureaucracy", "colleague", "dyslexia",
                "entrepreneur", "fluorescent", "graffiti", "hierarchy",
                "inoculate", "juxtaposition", "knapsack", "labyrinth",
                "mnemonic", "onomatopoeia", "parliament", "queue",
                "rhythm", "synchronize", "tchotchke", "unbelievable",
                "vulnerable", "weird", "xylophone", "yacht",
                "zealous", "abracadabra", "bamboozle", "cacophony",
                "daiquiri", "ephemeral", "fahrenheit", "galvanize",
                "haphazard", "incandescent", "jamboree", "kaleidoscope",
                "lackadaisical", "magnificent", "nonchalant", "onomatopoeic",
                "pizzazz", "quizzical", "rampant", "sassafras",
                "tchotchke", "ukulele", "vagabond", "whimsical",
                "xenophobia", "yippie", "zeppelin", "aardvark",
                "beekeeper", "cacophony", "diphthong", "euphemism",
                "fandango", "gobbledygook", "hullabaloo", "iconoclast",
                "jackalope", "kaleidoscope", "logorrhea", "mellifluous",
                "naphthalene", "onomatopoeia", "pneumonia", "quagmire",
                "rhubarb", "scrumptious", "triskaidekaphobia", "ululate",
                "vuvuzela", "whippersnapper", "xerarch", "yowza",
                "zymurgy", "amazing", "bewilder", "circumference",
                "delirious", "enthusiasm", "fantastic", "gratuitous",
                "hilarious", "inquisitive", "jubilant", "kangaroo",
                "ludicrous", "magnificent", "necessity", "obnoxious",
                "perpendicular", "quizzical", "ridiculous", "surreptitious",
                "triumphant", "unbelievable", "vivacious", "wonderful",
                "xylophone", "yearning", "zealous", "abstract", "benevolent", "consequence", "delicate",
                "eloquent", "formidable", "gracious", "hypothesis",
                "impartial", "judicious", "knowledge", "luminous",
                "meticulous", "nurture", "objective", "prevalent",
                "quench", "resilient", "sophisticated", "transparent",
                "ultimate", "vibrant", "wander", "zeal",
                "adequate", "brisk", "coherent", "diligent",
                "eclectic", "flourish", "genuine", "harmonious",
                "illuminate", "jovial", "keen", "lucid",
                "magnify", "nuance", "optimistic", "profound",
                "quaint", "rational", "serene", "tangible",
                "unify", "versatile", "witty", "zealous",
                "acumen", "bravery", "convey", "dexterity",
                "eloquence", "fortitude", "gratitude", "humble",
                "innovative", "judgment", "kindness", "lively",
                "modest", "noteworthy", "optimism", "passionate",
                "quizzical", "reliable", "sincere", "tenacious",
                "unison", "vivid", "wondrous", "youthful",
                "zest", "affable", "bliss", "composure",
                "diligence", "effervescent", "flexible", "gentle",
                "honesty", "insightful", "joyful", "knowledgeable",
                "laudable", "mellow", "noble", "observant",
                "practical", "quizzing", "resourceful", "steadfast",
                "tactful", "upbeat", "vibrant", "witty",
                "zealot"};
            Random random = new Random();
            int randomIndex = random.nextInt(palabrasIngles.length);
            word = palabrasIngles[randomIndex];
        } else if (lenguaje.equalsIgnoreCase("Español")) {
            String[] palabrasEspañol = {"abrazo", "aceite", "amigo", "anillo", "arbusto", "árbol", "arena", "aroma", "arte", "avenida",
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
                "zoogeografía", "absurdo", "benevolencia", "consecuencia", "delicado",
                "elogiante", "formidable", "gracioso", "hipótesis",
                "imparcial", "juicioso", "conocimiento", "luminoso",
                "meticuloso", "nutrir", "objetivo", "prevalente",
                "quemar", "resiliente", "sofisticado", "transparente",
                "último", "vibrante", "vagar", "zelo",
                "adecuado", "brisk", "coherente", "diligente",
                "eclectico", "florecer", "genuino", "armónico",
                "iluminar", "jovial", "entusiasta", "lúcido",
                "magnificar", "matiz", "optimista", "profundo",
                "pintoresco", "racional", "sereno", "tangible",
                "unificar", "versátil", "ingenioso", "celoso",
                "acumen", "valentía", "transmitir", "destreza",
                "eloquencia", "fortaleza", "gratitud", "humilde",
                "innovador", "juicio", "amabilidad", "animado",
                "modesto", "destacable", "optimismo", "apasionado",
                "curioso", "confiable", "sincero", "tenaz",
                "unión", "vívido", "maravilloso", "juvenil",
                "entusiasmo", "afable", "felicidad", "compostura",
                "diligencia", "efervescente", "flexible", "gentil",
                "honestidad", "perspicaz", "alegre", "conocedor",
                "alabable", "sosegado", "noble", "observador",
                "práctico", "curiosidad", "ingenioso", "firme",
                "diplomático", "optimista", "vibrante", "oportuno",
                "valiente", "entusiasta", "comunicativo", "cooperativo",
                "paciente", "sociable", "colaborativo", "creativo"};

            Random random = new Random();
            int randomIndex = random.nextInt(palabrasEspañol.length);
            word = palabrasEspañol[randomIndex];
        }

        return word;
    }
}
