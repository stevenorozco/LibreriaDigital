/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente.Vistas;

import Cliente.Controladores.Controlador;
import Modelos.Libro;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import javax.swing.text.Highlighter.HighlightPainter;

/**
 *
 * @author Steven
 */
public class InternalVistaLectura extends javax.swing.JInternalFrame {
    private Controlador controlador_cliente;
    /**
     * Creates new form InternalVistaLectura
     */
    public InternalVistaLectura(Controlador controlador_cliente) {
        initComponents();
        
        TextAreaLibro.setSize(400,400);
        TextAreaLibro.setLineWrap(true);
        TextAreaLibro.setEditable(false);
        TextAreaLibro.setVisible(true);
        jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        this.controlador_cliente = controlador_cliente;
        cargarInformacion();
    }
    
    public void cargarInformacion(){
        
        ArrayList contenido = new ArrayList();
        contenido.add(" ra lunes y como todos los lunes el alma me pesaba world ahí mismo, abajo del saquito\n" +
"\n" +
"de los cojones. Una tarde pensé que el alma era una tercera bola que llevaba ahí\n" +
"\n" +
"colgando y que me servía tan poco como me servían las otras dos. Desde\n" +
"\n" +
"entonces, cuando es lunes y el alma me pesa, cuando es otro día y el alma me\n" +
"\n" +
"pesa, hasta cuando no sé qué día es y el alma me pesa, siento ese bulto y esa\n" +
"\n" +
"carga abajo del todo, peleando con la tela elástica del slip.\n" +
"\n" +
"Yo no fui siempre un tipo con el alma entre los cojones. Durante bastantes\n" +
"\n" +
"años ni siquiera decía palabrotas, y hasta utilicé durante otros muchos un\n" +
"\n" +
"vocabulario abundante y selecto. Ahora he decidido que la vida no merece arriba\n" +
"\n" +
"de quinientas palabras y que las más a propósito son palabrotas, pero no es que\n" +
"\n" +
"nunca haya pasado de aquí, sino que he llegado aquí. Muchos capullos se atascan\n" +
"\n" +
"donde yo estoy ahora al poco de nacer y se quedan aquí para siempre. Yo he\n" +
"\n" +
"venido hasta aquí pasando por otros sitios antes, y algunos de ellos olían bastante\n" +
"\n" +
"mejor, aunque nunca duró demasiado. Puede parecer que más habría valido ser\n" +
"\n" +
"desde el principio uno de esos capullos que no ven mundo ni conocen otros sitios\n" +
"\n" +
"que huelen mejor. Y a mí me lo parece. Si toda mi vida hubiera sido un capullo\n" +
"\n" +
"ahora estaría contento, y no acordándome de que aquel día era lunes y el alma\n" +
"\n" +
"me pesaba encima del slip.\n" +
"\n" +
"El lunes del que me acuerdo empezaba con la misma mierda de todos los\n" +
"\n" +
"lunes. En la radio había cinco gilipollas que hablaban de lo que habían dicho otros\n" +
"\n" +
"cinco gilipollas para que al día siguiente cinco gilipollas más (algunos de ellos los\n" +
"\n" +
"mismos del día antes) hablaran de lo que estos cinco gilipollas habían dicho y así\n" +
"\n" +
"hasta el infinito, que es un batiburrillo de bandas de a cinco gilipollas. Como mi\n" +
"\n" +
"resistencia a las chorradas ha ido bajando con el tiempo, puse una cinta y resultó\n" +
"\n" +
"ser una de aquellas en las que hace años tenía grabado a ese pelma de Bach.\n" +
"\n" +
"Aunque he borrado todas, grabando encima otra música más apropiada, a veces\n" +
"\n" +
"salen trozos de sus apestosas cantatas que siempre tratan de lo mismo y suenan\n" +
"\n" +
"igual. Adelanté un poco la cinta y arrancó Breaking the Law, de Judas Priest. Lo\n" +
"\n" +
"dejé ahí, y no porque me gusten los individuos de Judas, que creo que son un\n" +
"\n" +
"hatajo de macarras que en su vida han tenido un par de ocurrencias, sino porque\n" +
"\n" +
"armaban mucho ruido y eso me impedía pensar. Ante todo, buscaba librarme de\n" +
"\n" +
"lo que hacía que me pesara el alma y que era lo mismo de siempre: es lunes (un\n" +
"\n" +
"www.LeerLibrosOnline.net\n" +
"\n" +
"puto lunes), temprano (la puta de temprano), estoy en el coche (el puto coche),\n" +
"\n" +
"en un atasco (puto atasco), sin saber si pasar por encima o por debajo del\n" +
"\n" +
"cinturón de seguridad la corbata (el puto cinturón, la puta corbata); voy camino\n" +
"\n" +
"del trabajo, donde pudriendo los días me dan a cambio dinero para comprar de\n" +
"\n" +
"comer y pagar el apartamento y el coche y la corbata y la radio y los\n" +
"\n" +
"compactos de donde grabo las cintas de Judas (puto trabajo, putos días, puto\n" +
"\n" +
"dinero, puta comida, puto apartamento, etc.); y ahora va el guardia y como\n" +
"\n" +
"siempre corta en Cibeles para que circulen los que bajan por Alcalá y nos\n" +
"\n" +
"jodamos los que venimos por el Prado (el puto guardia).\n" +
"\n" +
"De lo que venía pensando es fácil acordarme, porque lo hago mucho y me lo\n" +
"\n" +
"he aprendido de memoria. Del guardia también, porque todas las mañanas hace\n" +
"\n" +
"lo mismo. De Bach y de Judas, y aquí es donde empieza el asunto, me acuerdo\n" +
"\n" +
"porque fue al encontrar Breaking the Law cuando el coche que rodaba delante de\n" +
"\n" +
"mí frenó en seco y yo, que iba distraído con el radiocasete, me lo comí a unos\n" +
"\n" +
"veintidós por hora, que no es mucho para recorrer los diecisiete kilómetros que\n" +
"\n" +
"recorro cada mañana pero sí bastante para romper un coche contra otro.\n" +
"\n" +
"En ese momento el infierno se me echó encima, y el infierno era, por este\n" +
"\n" +
"orden: una zorra con trajecito chanel que se me baja del coche de delante y me\n" +
"\n" +
"empieza a llamar hijo de puta y maricón y yo qué sé cuántas cosas más que no\n" +
"\n" +
"le iban nada con la blusa; el mamón del guardia que abre mucho los ojos y sin\n" +
"\n" +
"sacarse el pito de la boca se viene hacia el lugar del siniestro con ganas de\n" +
"\n" +
"marcha; los de detrás que se ponen a darle al claxon a ver si consigo volverme\n" +
"\n" +
"loco de una vez; el cinturón que no obedece a mis intentos de separármelo del\n" +
"\n" +
"pecho para desabrocharlo porque debo de estar tirando un poco más de lo que el\n" +
"\n" +
"fabricante opina que se debe tirar; los de Judas que parecen empeñados en\n" +
"\n" +
"cargarse la batería, el bajo y todas sus guitarras.\n" +
"\n" +
"Cuando por fin conseguí librarme del cinturón y salir del coche la zorra del\n" +
"\n" +
"trajecito chanel y el guardia ya se habían aliado manifiestamente. El guardia me\n" +
"\n" +
"escupió apenas asomé el morro:\n" +
"\n" +
"—Antes de nada retire el coche. ¿No ve que está estorbando?\n" +
"\n" +
"—Ayudaría si lo quita primero ella —contesté, sin ninguna astucia—. Me he\n" +
"\n" +
"empotrado en su culo.\n" +
"\n" +
"—¿No le oy e al muy cabrón? —trinó la mujer—. Te habrás empotrado en el\n" +
"\n" +
"culo de tu puta madre.\n" +
"\n" +
"—Bueno, vale. Pero si usted no mueve el coche yo tampoco puedo moverlo\n" +
"\n" +
"y el guardia no va a poder despejar el tráfico, que es lo que a él le importa.\n" +
"\n" +
"—Señora —terció el guardia—, haga el favor y a ver si podemos arreglar\n" +
"\n" +
"esto lo antes posible.\n" +
"\n" +
"La mujer lo movió, yo lo moví y mientras tanto el guardia desviaba a los\n" +
"\n" +
"malnacidos que pasaban riéndose de la hostia que acababa de darme. Busqué los\n" +
"\n" +
"papeles del coche, el seguro, un bolígrafo, y lo encontré todo menos el bolígrafo.\n" +
"\n" +
"www.LeerLibrosOnline.net\n" +
"\n" +
"No me hacía maldita la gracia pedirle un bolígrafo a la mujer o al guardia, pero\n" +
"\n" +
"el parte amistoso y europeo de accidentes es autocopiativo y la Mont Blanc\n" +
"\n" +
"Meisterstück te la puedes meter donde te quepa cuando se trata de rellenarlo.\n" +
"\n" +
"Resignado, salí a aguantar la que estaba cay endo. La mujer seguía insultándome\n" +
"\n" +
"y cuando me bajé se permitió dudar:\n" +
"\n" +
"—¿Has conseguido estafar a alguien para que te haga un seguro, imbécil?\n" +
"\n" +
"—Si no estuviera el guardia no me llamaría eso.\n" +
"\n" +
"—¿Por qué? ¿Qué harías si no estuviera el guardia?\n" +
"\n" +
"Te pegaría quinientas patadas en el mismo coño, pensé, pero dije:\n" +
"\n" +
"—Me parece que me largaría y la dejaría que chillara sola.\n" +
"\n" +
"—Vaya bobada. Como que no iban a encontrarte.\n" +
"\n" +
"—Claro. Pero no está herida. No iría a la cárcel. Le daría el número del\n" +
"\n" +
"seguro a la policía y me ahorraría hablar con usted.\n" +
"\n" +
"En eso el guardia volvió donde estábamos y le dio por hacer una pregunta\n" +
"\n" +
"estúpida:\n" +
"\n" +
"—Vamos a ver. ¿Qué ha pasado?\n" +
"\n" +
"—Yo iba tan tranquila, freno porque se cierra el semáforo y éste va y me\n" +
"\n" +
"embiste por detrás.\n" +
"\n" +
"—No por gusto —me burlé—. Me he despistado con la radio. Si la hubiera\n" +
"\n" +
"visto no la habría embestido por detrás.\n" +
"\n" +
"—Exijo que le prohíba a este retrasado que se ría. No creo que esto sea para\n" +
"\n" +
"reírse precisamente.\n" +
"\n" +
"—Tengamos la fiesta en paz. Cálmense los dos.\n" +
"\n" +
"—Yo estoy calmado, agente.\n" +
"\n" +
"—Sólo faltaría, él que tiene la culpa.\n" +
"\n" +
"—Pues claro que tengo la culpa. ¿Por qué no hacemos primero los papeles y\n" +
"\n" +
"luego me fusilan?\n" +
"\n" +
"—Permiso de conducir y de circulación del coche.\n" +
"\n" +
"Le di los permisos al guardia y éste lamentó no poder multarme porque yo\n" +
"\n" +
"me los hubiera olvidado en casa o hubiera olvidado renovar el carné, que era lo\n" +
"\n" +
"máximo que podía haber conseguido con esa brillante comprobación. Mientras\n" +
"\n" +
"tanto Judas seguía tronando desde mi coche.\n" +
"\n" +
"—¿Es que no puedes quitar esa mierda de música?\n" +
"\n" +
"—Yo no la he tuteado hasta ahora. Y no me meto con la música que escucha.\n" +
"\n" +
"—Podías haber subido la ventanilla al menos.\n" +
"\n" +
"—Tengo roto el elevalunas. No sube de ahí. La próxima vez procuraré traer el\n" +
"\n" +
"coche arreglado.\n" +
"\n" +
"—Este tío es un hijo de perra y además disfruta.\n" +
"\n" +
"—Guardia, ya veo que está ocupado, pero ¿tengo que soportar que esta mujer\n" +
"\n" +
"no pare de insultarme?\n" +
"\n" +
"—Tranquilícense los dos. Saquen la documentación del seguro y rellenen el\n" +
"\n" +
"www.LeerLibrosOnline.net\n" +
"\n" +
"parte, por favor.\n" +
"\n" +
"El guardia me devolvió mis permisos, fastidiado por no haber podido\n" +
"\n" +
"empapelarme. Dirigiéndose a la mujer, dijo:\n" +
"\n" +
"—Usted saque también el permiso de conducir.\n" +
"\n" +
"Como a veces no sé estarme callado, le pregunté:\n" +
"\n" +
"—¿A ella no le pide los papeles del coche?\n" +
"\n" +
"—Ella no ha cometido ninguna infracción, señor.\n" +
"\n" +
"—¿Y yo?\n" +
"\n" +
"—No ha respetado el semáforo.\n" +
"\n" +
"—Suponiendo que eso sea como dice, ¿qué le hace pensar que si no respeto el\n" +
"\n" +
"semáforo es que no llevo permiso de circulación? A mí me parece más bien al\n" +
"\n" +
"revés. Si voy a chocarme con una histérica delante de un guardia y saltándome\n" +
"\n" +
"un semáforo, más me vale llevar todos los papeles en regla. A lo mejor ella no\n" +
"\n" +
"los lleva. Ella no sabía que y o le iba a dar.\n" +
"\n" +
"—Histérica. Esto es para cagarse.\n" +
"\n" +
"—No lo haga más difícil —dijo el guardia.\n" +
"\n" +
"—Lo que no entiendo es por qué se empeñan en putear a la gente inofensiva.\n" +
"\n" +
"Si estuviéramos en un descampado y usted estuviera solo y yo con cuatro\n" +
"\n" +
"colegas con bates de béisbol no me pediría nada.\n" +
"\n" +
"—Está bien, no lo líe, ande.\n" +
"\n" +
"—No le haga caso, agente. A este tío le ha debido dar un aire —soltó la\n" +
"\n" +
"mujer, serena de pronto.\n" +
"\n" +
"Entonces me quedé mirándola. Era una tía de unos treinta y cinco años, rubia\n" +
"\n" +
"de bote, esmirriada, con la piel tostada por la lámpara. Llevaba unas gafas de sol\n" +
"\n" +
"tres o cuatro veces más grandes que su cara y la blusa desabrochada hasta muy\n" +
"\n" +
"abajo, para que la tela de color claro contrastara con el pellejo quemado y los\n" +
"\n" +
"hombres le miraran entre las tetas. Para poder enfadarse cuando pasaba eso,\n" +
"\n" +
"supongo, llevaba un crucifijo de oro colgado encima del canalillo. También\n" +
"\n" +
"llevaba muchos anillos y pulseras y sus uñas nunca habían arrancado una costra\n" +
"\n" +
"de grasa de esas que resisten el limpiador especial para la vitrocerámica.\n" +
"\n" +
"—¿Qué miras? —volvió a ladrar.\n" +
"\n" +
"—Le ruego que colabore —insistió el guardia.\n" +
"\n" +
"En esta puta ciudad hay un millón de coches y voy y me choco con el de esta\n" +
"\n" +
"cerda, pensé. A lo mejor eso quería decir algo. En todo caso, no parecía que la\n" +
"\n" +
"ocasión fuera la mejor para darle al molino, así que decidí hacerle caso al\n" +
"\n" +
"guardia.\n" +
"\n" +
"—¿Tiene un bolígrafo? —pedí—. Es para el papel autocopiativo —y\n" +
"\n" +
"descapuché ante ellos mi Mont Blanc para acreditar su inutilidad.\n" +
"\n" +
"El guardia me dejó un bolígrafo y escribí mi dirección y todas las demás\n" +
"\n" +
"cosas que hay que poner en el parte. Me consideré responsable de todo el\n" +
"\n" +
"estropicio y empecé a dibujarlo. Pero entonces paré. Aunque el dibujo no era\n" +
"\n" +
"www.LeerLibrosOnline.net\n" +
"\n" +
"complicado, se me ocurrió que ella podía verlo de otra forma.\n" +
"\n" +
"—Haga usted el dibujo, si quiere. Ya he puesto que yo tuve la culpa.\n" +
"\n" +
"La mujer sacó un boligrafito Dupont de plata y algo molesta por no poder\n" +
"\n" +
"encargárselo a nadie escribió sus datos y terminó bastante mal mi dibujo. El\n" +
"\n" +
"policía comprobó los datos y copió parte de ellos en una hojita impresa en la que\n" +
"\n" +
"luego nos hizo firmar a los dos. Por cierto que antes de apuntar en su papel mi\n" +
"\n" +
"matrícula miró detenidamente la placa de mi coche. También la había mirado\n" +
"\n" +
"antes, cuando le había dado la documentación. No miró la placa del coche de la\n" +
"\n" +
"mujer. Cuando terminó separó las dos hojas del parte y nos devolvió una a cada\n" +
"\n" +
"uno.\n" +
"\n" +
"—Está bien. Usted puede marcharse —le dijo a la mujer.\n" +
"\n" +
"—No me lo diga dos veces. Hasta nunca —se despidió de mí.\n" +
"\n" +
"—¿Por qué yo no puedo irme?\n" +
"\n" +
"—A usted tengo que notificarle la denuncia.\n" +
"\n" +
"—Oiga, guardia. Si he hecho algo malo y a me ha castigado Dios bastante. ¿A\n" +
"\n" +
"qué viene ensañarse con una multa?\n" +
"\n" +
"—Es mi obligación. Y la suya ir más atento.\n" +
"\n" +
"La zorra del trajecito chanel se había subido a su coche, un descapotable\n" +
"\n" +
"blanco como los que siempre llevan las zorras como ella, y yo tuve que aguantar\n" +
"\n" +
"cómo colocaba el retrovisor y se colocaba el pelo y se lo ahuecaba hacia atrás,\n" +
"\n" +
"mientras el puto guardia me daba por culo y se ganaba gloriosamente su dinero\n" +
"\n" +
"de mierda, que mejor o peor es todo lo que nos ganamos los capullos, no importa\n" +
"\n" +
"si porque lo hemos sido desde siempre o porque al final nos hemos hecho así.\n" +
"\n" +
"Cuando volví a meterme en el coche había perdido veinte minutos y todo lo\n" +
"\n" +
"que había madrugado para que el atasco que me comiera no fuera el atasco\n" +
"\n" +
"asqueroso del lunes a las ocho y media. Eran las ocho y media y no sólo estaba\n" +
"\n" +
"en medio del atasco asqueroso sino que también iba a llegar tarde, lo que haría\n" +
"\n" +
"del lunes más lunes y que el alma me pesara entre los huevos el doble de lo que\n" +
"\n" +
"y a me venía pesando por el camino. Entonces fue cuando me di cuenta de que\n" +
"\n" +
"en la carpetilla con los papeles del seguro llevaba el nombre y la dirección de la\n" +
"\n" +
"zorra del trajecito chanel. A mi alrededor todos pitaban, los taxistas se me\n" +
"\n" +
"colaban y el atasco no avanzaba un maldito metro. Abrí la carpetilla y leí el\n" +
"\n" +
"nombre de la muy puerca: Sonsoles. Y el primer apellido: López-Díaz. Y el\n" +
"\n" +
"segundo: García-Navarro. O sea: una Sonsoles López García a la que le parecía\n" +
"\n" +
"una poca mierda llamarse López García y había rescatado del olvido a sus\n" +
"\n" +
"abuelas. O lo había hecho su padre o el padre de su padre, que era todavía peor.\n" +
"\n" +
"Por la calle que había puesto en el parte, vivía al lado de los Jerónimos. Cuando\n" +
"\n" +
"y o era un cretino sensible me gustaba esa zona. De noche es tranquila y de día\n" +
"\n" +
"apenas estorban un poco los rebaños de amarillos que llevan en autobús a ver las\n" +
"\n" +
"pinturas.\n" +
"\n" +
"Mientras seguía rumbo a la basura cotidiana, empecé a imaginar y me dio\n" +
"\n" +
"www.LeerLibrosOnline.net\n" +
"\n" +
"que lo mismo Sonsoles López García me servía para dejar un poco de aburrirme\n" +
"\n" +
"como un muerto. Yo no creo en el destino y más bien me parece que casi todas\n" +
"\n" +
"las cosas pasan porque uno se empeña en que pasen, a veces un poco a la fuerza,\n" +
"\n" +
"es verdad, pero eso no le hace a uno menos responsable ni gilipollas. Sin\n" +
"\n" +
"embargo, aquella mañana me había dado contra la furcia de Sonsoles de una\n" +
"\n" +
"manera absurda y sin habérmelo buscado. Algo me la había puesto por delante y\n" +
"\n" +
"y o me había estrellado contra ella. De momento sólo me había abollado el\n" +
"\n" +
"coche, que era una desgracia, pero quién sabía si no podía sacarle algún aliciente\n" +
"\n" +
"a la historia. Y cuando pensaba aliciente pensaba en divertirme, no demasiado,\n" +
"\n" +
"porque si por aquel entonces hubiera pensado que la vida podía ser realmente\n" +
"\n" +
"divertida no habría enterrado también todo Mozart debajo de los guitarrazos de\n" +
"\n" +
"Judas (y de Kreator, y de 77 Fucking Bastards y de Blame It On Your Dirty\n" +
"\n" +
"Sister). A medida que mi maldito coche abollado subía por la Castellana, un plan\n" +
"\n" +
"malvado se iba gestando en mi cerebro. Y yo me reía, lo juro que me reía como\n" +
"\n" +
"si aquello fuera el mejor chiste que me hubiesen contado nunca.\n" +
"\n" +
"De esta forma incomprensible entró Sonsoles en mi vida de gusano, y así,\n" +
"\n" +
"jugando como un bobo, me las apañé para convertir un simple accidente de\n" +
"\n" +
"tráfico en una ruina de tres pares de pelotas.\n" +
"\n" +
"www.LeerLibrosOnline.net\n" +
"\n" +
"Ahora que lo pienso, es curioso que todo empezara con el coche. El hombre\n" +
"\n" +
"moderno depende de la máquina y de todas las máquinas la que más tarado tiene\n" +
"\n" +
"al hombre moderno es el puto coche. El hombre moderno echa horas en el\n" +
"\n" +
"coche, se empeña para comprarlo, no duerme si le hace ruido o le da tirones\n" +
"\n" +
"cuando cambia de marcha. Muchos hombres modernos no pasan tanto tiempo\n" +
"\n" +
"con su familia como con el coche, gastan en su familia menos que en el coche y\n" +
"\n" +
"les importa un higo si uno de sus hijos tiene fiebre, que puede ser una avería,\n" +
"\n" +
"hablando de un niño, bastante más grave que un chirrido en los amortiguadores\n" +
"\n" +
"de un coche.\n" +
"\n" +
"Cuando cambia de fortuna, el hombre moderno se compra un coche. Cuando\n" +
"\n" +
"pasan más de cuatro o cinco años desde que compró el anterior y no se compra\n" +
"\n" +
"otro, la mayoría de los otros hombres modernos lo considera un comemierda.\n" +
"\n" +
"Una de las pocas razones por las que un hombre moderno puede matar a otro es\n" +
"\n" +
"porque le cierre el paso a su coche. Una de las pocas causas por las que un\n" +
"\n" +
"hombre moderno de menos de treinta años puede dejar de cotizar a la Seguridad\n" +
"\n" +
"Social es un accidente de tráfico.\n" +
"\n" +
"Personalmente, a mí me importó mucho mi primer coche, porque yo tenía X\n" +
"\n" +
"pesetas y el coche me costó X más 500.000. También porque el cabrón traía mal\n" +
"\n" +
"la inyección de fábrica y cada dos por tres me veía en el taller intentando\n" +
"\n" +
"tragarme que el problema era que aquí la gasolina era muy sucia, no como en\n" +
"\n" +
"Alemania, que era lo que siempre me decían a falta de imaginación para\n" +
"\n" +
"inventarse otra pamema más convincente.\n" +
"\n" +
"El segundo me importó menos, porque ya tenía más dinero y la inyección\n" +
"\n" +
"era como Dios manda que sean las inyecciones, o sea, resistentes a la porquería\n" +
"\n" +
"que pueda tener la gasolina en el país donde se vende el coche.\n" +
"\n" +
"El tercero, que fue el que le metí al de Sonsoles por detrás, ni me iba ni me\n" +
"\n" +
"venía. O eso creía yo. Si no recuerdo mal lo compré sólo porque era el más\n" +
"\n" +
"barato de los que tenían aire acondicionado y la potencia necesaria para\n" +
"\n" +
"adelantar a un camión sin jugarme la vida.\n" +
"\n" +
"Sin embargo, una noche que andaba yo con el estómago revuelto descubrí\n" +
"\n" +
"que allá por las entrañas los dos teníamos algo en común, algo tan peculiar que\n" +
"\n" +
"casi era para alarmarse: el olor de mis pedos debajo de la sábana era idéntico al\n" +
"\n" +
"www.LeerLibrosOnline.net\n" +
"\n" +
"de la gasolina sin plomo después de quemarse en mi coche y de pasar por su\n" +
"\n" +
"catalizador. Hacía poco que me lo había comprado y llevaba algunas semanas\n" +
"\n" +
"tratando de averiguar a qué me recordaba aquel hedor que inundaba todos los\n" +
"\n" +
"días mi plaza de garaje. Aunque nada tenga que ver con esta historia, creo que\n" +
"\n" +
"fue esa noche cuando decidí sumar a mis otras facetas que no me conviene\n" +
"\n" +
"enseñar la de enemigo de la ecología.\n" +
"\n" +
"También odio la pedagogía, el capitalismo liberal y el deporte. No sé por qué\n" +
"\n" +
"casi todo lo que aspira o dice aspirar a mejorar la vida de la gente acaba por\n" +
"\n" +
"estropearla más tarde o más temprano."); 
        Libro libro = new Libro(); 
        libro.setIsbn("1234");
        libro.setTitulo("La Flaqueza del Bolchevique");
        libro.setResumen("bduibdibfubcbcjidbcyfbcfjnurfncjfnvfubfnvjfnvfubvfijne");
        libro.setAutor("Pepito Perez");
        libro.setPrecio(50);
        libro.setCategoria("Romance");
        libro.setBestSeller(true);
        libro.setEdadMinima(10);
        libro.setCalificacion(5);
        libro.setContenido(contenido);
        
        this.LabelTituloLibro.setText(libro.getTitulo());
        this.TextAreaLibro.setText((String)libro.getContenido().get(0)); 
        
      
    }
    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonResaltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaLibro = new javax.swing.JTextArea();
        ButtonAgregarNota = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        LabelTamañoLetra = new javax.swing.JLabel();
        ComboColorFondo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        LabelTituloLibro = new javax.swing.JLabel();
        ComboTamañoLetra = new javax.swing.JComboBox<>();
        ComboColorLetra = new javax.swing.JComboBox<>();
        ComboFuenteLetra = new javax.swing.JComboBox<>();
        LabelColorLetra = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        ButtonResaltar.setText("Resaltar");
        ButtonResaltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonResaltarActionPerformed(evt);
            }
        });

        TextAreaLibro.setColumns(20);
        TextAreaLibro.setRows(5);
        TextAreaLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                TextAreaLibroMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(TextAreaLibro);

        ButtonAgregarNota.setText("Agregar Nota");

        jButton1.setText("Asignar Marcador");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        LabelTamañoLetra.setText("Tamaño Letra");

        ComboColorFondo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blanco", "Gris", "Negro" }));
        ComboColorFondo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboColorFondoActionPerformed(evt);
            }
        });

        jLabel1.setText("Color Fondo");

        LabelTituloLibro.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LabelTituloLibro.setText("Titulo Libro");

        ComboTamañoLetra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12", "14", "16", "24" }));
        ComboTamañoLetra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboTamañoLetraActionPerformed(evt);
            }
        });

        ComboColorLetra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Negro ", "Blanco ", "Gris" }));
        ComboColorLetra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboColorLetraActionPerformed(evt);
            }
        });

        ComboFuenteLetra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Times New Roman", "Arial", "Calibri" }));
        ComboFuenteLetra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboFuenteLetraActionPerformed(evt);
            }
        });

        LabelColorLetra.setText("Color Letra");

        jLabel2.setText("Fuente Letra");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LabelTituloLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                        .addGap(31, 31, 31)))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ButtonAgregarNota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonResaltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelTamañoLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboTamañoLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelColorLetra)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboFuenteLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboColorFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboColorLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(LabelTituloLibro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonResaltar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonAgregarNota, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelTamañoLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboTamañoLetra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboColorLetra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelColorLetra))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboColorFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboFuenteLetra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonResaltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonResaltarActionPerformed
        // TODO add your handling code here:
        if (TextAreaLibro.getSelectedText() != null) { // See if they selected something 
            String selected_text = TextAreaLibro.getSelectedText();
            //JOptionPane.showMessageDialog(null, selected_text);
            
            Highlighter highlighter = TextAreaLibro.getHighlighter();
            HighlightPainter painter = new DefaultHighlighter.DefaultHighlightPainter(Color.pink);
            int p0 = this.TextAreaLibro.getText().indexOf(selected_text);
            int p1 = p0 + selected_text.length();
            try {
                highlighter.addHighlight(p0, p1, painter );
            } catch (BadLocationException ex) {
                Logger.getLogger(InternalVistaLectura.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_ButtonResaltarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ComboColorFondoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboColorFondoActionPerformed
        // TODO add your handling code here:
        switch ((String)ComboColorFondo.getSelectedItem()){
            case "Blanco":
                TextAreaLibro.setBackground(Color.white);
                break;
            case "Gris": 
                TextAreaLibro.setBackground(Color.gray);
                break; 
            case "Negro": 
                TextAreaLibro.setBackground(Color.black);
                break; 
        }
    }//GEN-LAST:event_ComboColorFondoActionPerformed

    private void ComboTamañoLetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboTamañoLetraActionPerformed
        // TODO add your handling code here:     
        TextAreaLibro.setFont( new Font("Dialog", Font.ROMAN_BASELINE, Integer.parseInt((String)ComboTamañoLetra.getSelectedItem())) ); 
    }//GEN-LAST:event_ComboTamañoLetraActionPerformed

    private void TextAreaLibroMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextAreaLibroMouseReleased
        
    }//GEN-LAST:event_TextAreaLibroMouseReleased

    private void ComboColorLetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboColorLetraActionPerformed
        // TODO add your handling code here:
        switch ((String)ComboColorLetra.getSelectedItem()){
            case "Blanco":
                TextAreaLibro.setForeground(Color.white);
                break;
            case "Gris": 
                TextAreaLibro.setForeground(Color.gray);
                break; 
            case "Negro": 
                TextAreaLibro.setForeground(Color.black);
                break; 
        }
    }//GEN-LAST:event_ComboColorLetraActionPerformed

    private void ComboFuenteLetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboFuenteLetraActionPerformed
        // TODO add your handling code here
        switch ((String)ComboFuenteLetra.getSelectedItem()){
            case "Times New Roman": 
                TextAreaLibro.setFont( new Font("Times New Roman", Font.ROMAN_BASELINE, Integer.parseInt((String)ComboTamañoLetra.getSelectedItem())) ); 
                break;
            case "Arial": 
                TextAreaLibro.setFont( new Font("Arial", Font.ROMAN_BASELINE, Integer.parseInt((String)ComboTamañoLetra.getSelectedItem())) ); 
                break; 
            case "Calibri": 
                TextAreaLibro.setFont( new Font("Calibri", Font.ROMAN_BASELINE, Integer.parseInt((String)ComboTamañoLetra.getSelectedItem())) ); 
                break; 
        }
    }//GEN-LAST:event_ComboFuenteLetraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAgregarNota;
    private javax.swing.JButton ButtonResaltar;
    private javax.swing.JComboBox<String> ComboColorFondo;
    private javax.swing.JComboBox<String> ComboColorLetra;
    private javax.swing.JComboBox<String> ComboFuenteLetra;
    private javax.swing.JComboBox<String> ComboTamañoLetra;
    private javax.swing.JLabel LabelColorLetra;
    private javax.swing.JLabel LabelTamañoLetra;
    private javax.swing.JLabel LabelTituloLibro;
    private javax.swing.JTextArea TextAreaLibro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
