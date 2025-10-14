package tp.punto14;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PiezaTest {
	ReporteDeConstruccion prueba;
	
@BeforeEach
void setUp() {
	Cilindro cil1=new Cilindro(2,4,"Metal", "rojo");
	Cilindro cil2=new Cilindro(7,5,"Cobre", "Violeta");
	Esfera esf1=new Esfera(8,"Plata","Rojo");
	Esfera esf2=new Esfera(6,"cobre","violeta");
	PrismaRectangular pris1= new PrismaRectangular(3,6,2,"plata","naranja");
	PrismaRectangular pris2= new PrismaRectangular(1,4,6,"cobre","Naranja");
	prueba.agregarPieza(cil1);
	prueba.agregarPieza(cil2);
	prueba.agregarPieza(esf1);
	prueba.agregarPieza(esf2);
	prueba.agregarPieza(pris1);
	prueba.agregarPieza(pris2);
	
}
@Test
public void testVolumen() {
	System.out.print(prueba.volumenDeMateril("metal"));
}
@Test 
public void testSuperficie(){
	System.out.print(prueba.superficeDeColor("rojo"));
}
}
