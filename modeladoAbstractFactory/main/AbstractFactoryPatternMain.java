package modeladoAbstractFactory.main;

public class AbstractFactoryPatternMain {

	public static void main(String[] args) {
		// USANDO LA FÁBRICA ABSTRACTA
		// get shape factory
		// Creo una fábrica abstracta e indico si quiero producir una fábrica normal o de figura redondeada.
		// true = rounded, false = normal.
	    AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
	    
	    //get an object of Shape Rectangle
	    // Obtener objeto de forma (Shape) "Rectangle"
	    Shape shape1 = shapeFactory.getShape("RECTANGLE");
	    
	    // LLamada al metodo draw de Shape Rectangle
	    //call draw method of Shape Rectangle
	    shape1.draw();
	    
	    //get an object of Shape Square 
	    Shape shape2 = shapeFactory.getShape("SQUARE");
	    
	    //call draw method of Shape Square
	    shape2.draw();
	    
	    //get shape factory
	    AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
	    
	    //get an object of Shape Rectangle
	    Shape shape3 = shapeFactory1.getShape("RECTANGLE");
	    
	    //call draw method of Shape Rectangle
	    shape3.draw();
	    
	    //get an object of Shape Square 
	    Shape shape4 = shapeFactory1.getShape("SQUARE");
	    
	    //call draw method of Shape Square
	    shape4.draw();
	      
	    //SIN USAR PATRÓN DE FÁBRICA ABSTRACTA
	    System.out.println("SIN USAR PATRÓN");
	    Shape shape5 = new Rectangle();
	    shape5.draw();
	}
	
	public void crearFigura(String type, boolean rounded) {
		if(type == "RECTANGLE" && rounded) {
			
		}
	}

}
