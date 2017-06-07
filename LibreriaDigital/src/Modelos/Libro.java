/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author invitado
 */
public class Libro implements Serializable{
  
    private String isbn;
    private int numeroPaginas;
    private String titulo;
    private String resumen;
    private String autor;
    private ImageIcon imagen;
    private double precio;
    private String categoria;
    private boolean bestSeller;
    private int edadMinima;
    private int calificacion;
    private ArrayList contenido;
    
    public Libro(){
       
    }

    public Libro(String isbn, int numeroPaginas, String titulo, String resumen, String autor, ImageIcon imagen, double precio, String categoria, boolean bestSeller, int edadMinima, int calificacion, ArrayList contenido) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.resumen = resumen;
        this.autor = autor;
        this.imagen = imagen;
        this.precio = precio;
        this.categoria = categoria;
        this.bestSeller = bestSeller;
        this.edadMinima = edadMinima;
        this.calificacion = calificacion;
        this.contenido = contenido;
        this.numeroPaginas = contenido.size();
    }
    //-------METODOS GET---------
    public String getIsbn() {
        return isbn;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public String getAutor() {
        return autor;
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public boolean isBestSeller() {
        return bestSeller;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public ArrayList getContenido() {
        return contenido;
    }
    
    //-------METODOS SET----------
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setBestSeller(boolean bestSeller) {
        this.bestSeller = bestSeller;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public void setContenido(ArrayList contenido) {
        this.contenido = contenido;
    }
    
    public String toString(){
        return "Isbn: "+ getIsbn() + " Titulo: "+ getTitulo(); 
    }
    
    public static String contenidoLibro(){
        String contenido = "Sombras de desesperación" +

"Hubo presagios funestos desde el principio.\n" +

"Lo primero, yo no quería hacer un trabajo en la Posada de la Misión. Estaba\n" +

"dispuesto a cumplir en cualquier otro lugar, pero no en la Posada de la Misión \n" + 

"en la suite nupcial además, precisamente en esa habitación, mi habitación. Mala \n" +

"suerte, peor que mala, pensé. \n" + 

"Desde luego, mi jefe, el Hombre Justo, no tenía forma de saber, cuando me \n" + 

"asignó el encargo, que la Posada de la Misión era el lugar adonde iba cuando no \n" + 

"quería ser Lucky el Zorro, cuando no quería ser su sicario. \n" + 

"La Posada de la Misión formaba parte del minúsculo mundo en el que yo no \n" +

"llevaba disfraz. Cuando estaba allí era sencillamente yo mismo, metro noventa y \n" + 

"cinco de estatura, cabello rubio corto, ojos grises..., una persona similar a tantas \n" + 

"otras que no se parecía a nadie en particular. Cuando estaba allí no me molestaba \n" + 

"en alterar el tono de voz ni llevaba las gafas de sol de rigor que ocultaban mi \n" + 

"identidad en cualquier lugar que no fuese el apartamento y el barrio donde vivía.\n" + 

"Sólo era quien soy cuando iba allí, aunque en realidad no era nadie salvo el \n" + 

"hombre que llevaba todos esos complicados disfraces cuando hacía lo que el \n" + 

"Hombre Justo me había encargado que hiciese.\n" + 

"De modo que la Posada de la Misión me pertenecía, constituía el signo de lo \n" + 

"que yo era, y lo mismo ocurría con la suite nupcial, llamada suite Amistad, bajo \n" + 

"la cúpula. Y ahora me pedían que quemara aquel lugar. No para nadie en \n" + 

"particular, a excepción de mí mismo, claro. Yo nunca habría hecho nada que \n" + 

"pudiese perjudicar a la Posada de la Misión. \n" + 

"Era una tarta gigantesca, una quimera en forma de edificio donde solía \n" + 

"refugiarme. Un lugar extravagante y laberíntico que abarcaba dos manzanas de \n" + 

"la ciudad y en el que yo pretendía, durante uno, dos o tres días, que no me \n" + 

"buscaran ni el FBI, ni la Interpol, ni el Hombre Justo. Un lugar en el que podía \n" + 

"perderme y, de paso, perder mi conciencia. \n" + 

"Hacía mucho tiempo que Europa se había convertido en peligrosa para mí a \n" + 

"causa del aumento de la seguridad en todos los controles y el hecho de que los \n" + 

"organismos policiales que soñaban con atraparme habían decidido que y o estaba \n" +
                
                
                
"hombre moderno de menos de treinta años puede dejar de cotizar a la Seguridad\n" +

"Social es un accidente de tráfico.\n" +

"Personalmente, a mí me importó mucho mi primer coche, porque yo tenía X\n" +

"pesetas y el coche me costó X más 500.000. También porque el cabrón traía mal\n" +

"la inyección de fábrica y cada dos por tres me veía en el taller intentando\n" +

"tragarme que el problema era que aquí la gasolina era muy sucia, no como en\n" +

"Alemania, que era lo que siempre me decían a falta de imaginación para\n" +

"inventarse otra pamema más convincente.\n" +

"El segundo me importó menos, porque ya tenía más dinero y la inyección\n" +

"era como Dios manda que sean las inyecciones, o sea, resistentes a la porquería\n" +

"que pueda tener la gasolina en el país donde se vende el coche.\n" +

"El tercero, que fue el que le metí al de Sonsoles por detrás, ni me iba ni me\n" +

"venía. O eso creía yo. Si no recuerdo mal lo compré sólo porque era el más\n" +

"barato de los que tenían aire acondicionado y la potencia necesaria para\n" +

"adelantar a un camión sin jugarme la vida.\n" +

"Sin embargo, una noche que andaba yo con el estómago revuelto descubrí\n" +

"que allá por las entrañas los dos teníamos algo en común, algo tan peculiar que\n" +

"casi era para alarmarse: el olor de mis pedos debajo de la sábana era idéntico al\n" +

"de la gasolina sin plomo después de quemarse en mi coche y de pasar por su\n" +

"catalizador. Hacía poco que me lo había comprado y llevaba algunas semanas\n" +

"tratando de averiguar a qué me recordaba aquel hedor que inundaba todos los\n" +

"días mi plaza de garaje. Aunque nada tenga que ver con esta historia, creo que\n" +

"fue esa noche cuando decidí sumar a mis otras facetas que no me conviene\n" +

"enseñar la de enemigo de la ecología.\n" +

"También odio la pedagogía, el capitalismo liberal y el deporte. No sé por qué\n" +

"casi todo lo que aspira o dice aspirar a mejorar la vida de la gente acaba por\n" +

"estropearla más tarde o más temprano."    + 
                
                
"hombre moderno de menos de treinta años puede dejar de cotizar a la Seguridad\n" +

"Social es un accidente de tráfico.\n" +

"Personalmente, a mí me importó mucho mi primer coche, porque yo tenía X\n" +

"pesetas y el coche me costó X más 500.000. También porque el cabrón traía mal\n" +

"la inyección de fábrica y cada dos por tres me veía en el taller intentando\n" +

"tragarme que el problema era que aquí la gasolina era muy sucia, no como en\n" +

"Alemania, que era lo que siempre me decían a falta de imaginación para\n" +

"inventarse otra pamema más convincente.\n" +

"El segundo me importó menos, porque ya tenía más dinero y la inyección\n" +

"era como Dios manda que sean las inyecciones, o sea, resistentes a la porquería\n" +

"que pueda tener la gasolina en el país donde se vende el coche.\n" +

"El tercero, que fue el que le metí al de Sonsoles por detrás, ni me iba ni me\n" +

"venía. O eso creía yo. Si no recuerdo mal lo compré sólo porque era el más\n" +

"barato de los que tenían aire acondicionado y la potencia necesaria para\n" +

"adelantar a un camión sin jugarme la vida.\n" +

"Sin embargo, una noche que andaba yo con el estómago revuelto descubrí\n" +

"que allá por las entrañas los dos teníamos algo en común, algo tan peculiar que\n" +

"casi era para alarmarse: el olor de mis pedos debajo de la sábana era idéntico al\n" +

"de la gasolina sin plomo después de quemarse en mi coche y de pasar por su\n" +

"catalizador. Hacía poco que me lo había comprado y llevaba algunas semanas\n" +

"tratando de averiguar a qué me recordaba aquel hedor que inundaba todos los\n" +

"días mi plaza de garaje. Aunque nada tenga que ver con esta historia, creo que\n" +

"fue esa noche cuando decidí sumar a mis otras facetas que no me conviene\n" +

"enseñar la de enemigo de la ecología.\n" +

"También odio la pedagogía, el capitalismo liberal y el deporte. No sé por qué\n" +

"casi todo lo que aspira o dice aspirar a mejorar la vida de la gente acaba por\n" +

"estropearla más tarde o más temprano."; 
        ArrayList paginas = new ArrayList(); 
        return contenido; 
    }
    
    public static ArrayList convertirContenidoAPaginas(String contenido, int num_lineas_por_pagina){
         
        ArrayList paginas = new ArrayList(); 
        String lines[] = contenido.split("\\r?\\n");
        
        String pagina = "";
        for (int i = 0 ; i < lines.length ; i++) {
            
            if(i % num_lineas_por_pagina != 0)
                pagina += lines[i] +"\n";
            else
            {
                paginas.add(pagina);
                pagina = "";
            }
            //System.out.println("Elemento en indice " + i + ": " + lines[i]);
        }
        return paginas;
    
    }
    
    
    public static void main (String[] args){
        
        String contenido = contenidoLibro();
        ArrayList paginas = convertirContenidoAPaginas(contenido, 20);
        System.out.print(paginas.size());
        
    }
}
