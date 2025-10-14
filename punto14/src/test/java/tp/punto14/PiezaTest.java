package tp.punto14;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PiezaTest {
	ReporteDeConstruccion reporte;
	
@BeforeEach
void setUp() {
	reporte=new ReporteDeConstruccion();
	Cilindro cil1=new Cilindro(2,4,"Metal", "rojo");
	Cilindro cil2=new Cilindro(7,5,"Cobre", "Violeta");
	Esfera esf1=new Esfera(8,"Plata","Rojo");
	Esfera esf2=new Esfera(6,"cobre","violeta");
	PrismaRectangular pris1= new PrismaRectangular(3,6,2,"plata","naranja");
	PrismaRectangular pris2= new PrismaRectangular(1,4,6,"cobre","Naranja");
	reporte.agregarPieza(cil1);
	reporte.agregarPieza(cil2);
	reporte.agregarPieza(esf1);
	reporte.agregarPieza(esf2);
	reporte.agregarPieza(pris1);
	reporte.agregarPieza(pris2);
	
}
@Test
public void testVolumen() {
	assertEquals(reporte.volumenDeMateril("metal"),50.26548245743669);
}
@Test 
public void testSuperficie(){
	assertEquals(reporte.superficeDeColor("rojo"),0);
}
}
