/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Mateo
 */
public class SeleccionadorDePalabras {

    private String[] words = new String[]{
        "abrazo", "aceite", "amigo", "anillo", "arbusto", "arbol", "arena", "aroma", "arte", "avenida",
        "azul", "bailar", "barco", "beso", "bicicleta", "blanco", "boca", "bolsa", "botella", "brillante",
        "cabello", "cama", "caminar", "cancion", "carro", "carta", "casa", "celeste", "cerca", "cielo",
        "ciudad", "color", "comida", "conectar", "correr", "crecer", "crema", "cruzar", "cuerpo", "danza",
        "dia", "dibujo", "diente", "divertido", "dormir", "eco", "efecto", "elastico", "enamorado", "energia",
        "escalera", "espacio", "espejo", "familia", "flor", "frio", "fuego", "gato", "globo", "grande",
        "hoja", "hombre", "idea", "imagen", "jardin", "juego", "leche", "luz", "maleta", "mar",
        "mesa", "montana", "musica", "nadar", "nieve", "noche", "nube", "numero", "oso", "pajaro",
        "palabra", "pantalon", "papel", "parque", "pasion", "pato", "pelo", "perro", "pescado", "pluma",
        "puerta", "rio", "rojo", "saludar", "secreto", "silla", "sonido", "sueno", "taza", "television",
        "tierra", "tiempo", "tormenta", "trabajo", "universo", "verano", "verde", "vestido", "viento", "volar",
        "zanahoria", "zapato", "aguila", "ambar", "amigo", "ambar", "anfora", "animo", "ebano", "exito", "eter",
        "etnico", "agil", "agua", "epoca", "oleo", "opera", "optimo", "ovalo", "oxido", "unico", "inconstitucionalidad", "perpendicularidad", "esdrujula", "anticonstitucionalmente",
        "transubstanciacion", "prestidigitador", "ininteligibilidad", "gubernamentalmente",
        "electroencefalografia", "paleontologico", "autorretrato", "sobrealimentacion",
        "desoxirribonucleico", "desobstruccionismo", "eclesiasticamente", "descentralizacion",
        "paradigmatologico", "desproporcionadamente", "contrarrevolucionario", "paralelepipedo",
        "monosilabico", "aerodinamicamente", "ultramicroscopio", "autotransportable",
        "psicoanaliticamente", "arqueoastronomia", "desesperanzadoramente", "discrecionalidad",
        "hipopotomonstrosesquipedaliofobia", "encefalograma", "contrainteligencia", "hipopotamo",
        "hidroelectrolitico", "neuropsiquiatria", "reumatologico", "trascendentalismo",
        "macroeconomicamente", "autorregulacion", "paleontologo", "desarraigamiento",
        "transiluminacion", "fotodisociacion", "antisubversivo", "otorrinolaringologo",
        "hipocondriaco", "desfibrilador", "polarizacion", "desencadenante",
        "esternocleidomastoideo", "lexicograficamente", "hipermercado", "policromatico",
        "biotecnologico", "oftalmologico", "desmembramiento", "bucodental",
        "concientizadamente", "acantilado", "circunstancialmente", "colaboracionismo",
        "espectroscopio", "electrodomestico", "sociolinguistica", "subdirector",
        "desprestigio", "esternocleidomastoideitis", "geopoliticamente", "heterosexualidad",
        "infundadamente", "interpretativamente", "intelectualizacion", "microrred",
        "desestabilizacion", "perfeccionamiento", "policondritis", "semiotica",
        "oftalmopatia", "aracnofobia", "procrastinacion", "desestresante",
        "determinacion", "discriminacion", "efectivamente", "desfavorablemente",
        "expectativas", "frustracion", "generosamente", "habitualmente",
        "independientemente", "justificacion", "karma", "lamentablemente",
        "manipulacion", "necesariamente", "obstinadamente", "patologicamente",
        "querencia", "responsabilidad", "satisfactoriamente", "tumultuosamente",
        "ultrasonografia", "vulnerabilidad", "xenofobia", "yuxtaposicion",
        "zoogeografia", "absurdo", "benevolencia", "consecuencia", "delicado",
        "elogiante", "formidable", "gracioso", "hipotesis",
        "imparcial", "juicioso", "conocimiento", "luminoso",
        "meticuloso", "nutrir", "objetivo", "prevalente",
        "quemar", "resiliente", "sofisticado", "transparente",
        "ultimo", "vibrante", "vagar", "zelo",
        "adecuado", "brisk", "coherente", "diligente",
        "eclectico", "florecer", "genuino", "armonico",
        "iluminar", "jovial", "entusiasta", "lucido",
        "magnificar", "matiz", "optimista", "profundo",
        "pintoresco", "racional", "sereno", "tangible",
        "unificar", "versatil", "ingenioso", "celoso",
        "acumen", "valentia", "transmitir", "destreza",
        "eloquencia", "fortaleza", "gratitud", "humilde",
        "innovador", "juicio", "amabilidad", "animado",
        "modesto", "destacable", "optimismo", "apasionado",
        "curioso", "confiable", "sincero", "tenaz",
        "union", "vivido", "maravilloso", "juvenil",
        "entusiasmo", "afable", "felicidad", "compostura",
        "diligencia", "efervescente", "flexible", "gentil",
        "honestidad", "perspicaz", "alegre", "conocedor",
        "alabable", "sosegado", "noble", "observador",
        "practico", "curiosidad", "ingenioso", "firme",
        "diplomatico", "optimista", "vibrante", "oportuno",
        "valiente", "entusiasta", "comunicativo", "cooperativo",
        "paciente", "sociable", "colaborativo", "creativo"};

    public String getNextWord() {
        return words[(int) (Math.random() * words.length)];

    }

}
