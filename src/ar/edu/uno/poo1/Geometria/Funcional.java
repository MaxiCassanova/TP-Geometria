package ar.edu.uno.poo1.Geometria;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeMap;


public class Funcional {

	
	private Map<String, ArrayList<Double>> figuras;
	private Map<String, ArrayList<Double>> paralelos;
	private Map<String, ArrayList<Double>> grandotes;
	private Map<String, ArrayList<Double>> areas;
	public Funcional(String archivo) throws FileNotFoundException {
		  setFiguras(archivo);
		  setGrandote(archivo);
		  
	
	}
	
	private void setFiguras(String archivo) throws FileNotFoundException {
		int c=1;
		int r=1;
		int t=1;
		int ci=1;
		int e=1;
		int s=1;
		figuras = new HashMap<String, ArrayList<Double>>();
		paralelos= new HashMap<String, ArrayList<Double>>();
		
		Scanner sc = new Scanner(new File(archivo));
		while (sc.hasNext()) {
			String[] datos = sc.nextLine().split(",");
			String key = datos[0];
			
			
			if(key.equals("CUADRADO")){	
				
				//key="CUADRADO"+String.valueOf(i);
				Double ladoCuadrado = Double.parseDouble(datos[1]);
				Double xCuadrado= Double.parseDouble(datos[2]);
				Double yCuadrado= Double.parseDouble(datos[3]);
				Cuadrado cuadrado = new Cuadrado(ladoCuadrado,xCuadrado,yCuadrado);
				ArrayList<Double> valores=new ArrayList<Double>();
				valores.add(ladoCuadrado);
				valores.add(xCuadrado);
				valores.add(yCuadrado);
				 if(figuras.containsKey(key)) {
					 key="CUADRADO"+String.valueOf(c);
					 
				 }
				
				
				figuras.put(key, valores);
				c++;
			}
			
			if(key.equalsIgnoreCase("RECTANGULO")) {
				Double x1Rectangulo= Double.parseDouble(datos[1]);
				Double y1Rectangulo= Double.parseDouble(datos[2]);	
				Double x2Rectangulo= Double.parseDouble(datos[3]);
				Double y2Rectangulo= Double.parseDouble(datos[4]);	
				Rectangulo rectangulo = new Rectangulo (x1Rectangulo,y1Rectangulo,x2Rectangulo,y2Rectangulo);
				ArrayList<Double> valores=new ArrayList<Double>();
				valores.add(x1Rectangulo);
				valores.add(y1Rectangulo);
				valores.add(x2Rectangulo);
				valores.add(y2Rectangulo);
				if(figuras.containsKey(key)) {
					 key="RECTANGULO"+String.valueOf(r);
					 
				 }
				
				
				figuras.put(key, valores);
				r++;
				
			}
			if (key.equalsIgnoreCase("SEGMENTO")) {
				Double x1Segmento= Double.parseDouble(datos[1]);
				Double y1Segmento= Double.parseDouble(datos[2]);	
				Double x2Segmento= Double.parseDouble(datos[3]);
				Double y2Segmento= Double.parseDouble(datos[4]);
				Segmento segmento = new Segmento (x1Segmento, y1Segmento,x2Segmento,y2Segmento);
				ArrayList<Double> valores=new ArrayList<Double>();
				valores.add(x1Segmento);
				valores.add(y1Segmento);
				valores.add(x2Segmento);
				valores.add(y2Segmento);
				if(figuras.containsKey(key)) {
					 key="SEGMENTO"+String.valueOf(s);
					 
				 }
				
				
				figuras.put(key, valores);
				if(segmento.esParaleloAX()||segmento.esParaleloAY()) {
					paralelos.put(key, valores);
				}
				s++;
				
			}
			if (key.equalsIgnoreCase("TRIANGULO")) {
				Double x1Triangulo= Double.parseDouble(datos[1]);
				Double y1Triangulo= Double.parseDouble(datos[2]);	
				Double x2Triangulo= Double.parseDouble(datos[3]);
				Double y2Triangulo= Double.parseDouble(datos[4]);
				Double x3Triangulo= Double.parseDouble(datos[5]);
				Double y3Triangulo= Double.parseDouble(datos[6]);
				Triangulo triangulo = new Triangulo (x1Triangulo,y1Triangulo,x2Triangulo,y2Triangulo,x3Triangulo,y3Triangulo);
				ArrayList<Double> valores=new ArrayList<Double>();
				valores.add(x1Triangulo);
				valores.add(y1Triangulo);
				valores.add(x2Triangulo);
				valores.add(y2Triangulo);
				valores.add(x3Triangulo);
				valores.add(y3Triangulo);
				if(figuras.containsKey(key)) {
					 key="TRIANGULO"+String.valueOf(t);
					 
				 }
				
				
				figuras.put(key, valores);
				if(triangulo.esParaleloAX()||triangulo.esParaleloAY()) {
					paralelos.put(key, valores);
				}
				t++;
			}
			if(key.equalsIgnoreCase("CIRCULO")) {
				Double radioCirculo = Double.parseDouble(datos[1]);
				Double xCirculo= Double.parseDouble(datos[2]);
				Double yCirculo= Double.parseDouble(datos[3]);	
				Circulo circulo = new Circulo(radioCirculo,xCirculo,yCirculo);
				ArrayList<Double> valores=new ArrayList<Double>();
				valores.add(radioCirculo);
				valores.add(xCirculo);
				valores.add(yCirculo);
				if(figuras.containsKey(key)) {
					 key="CIRCULO"+String.valueOf(ci);
					 
				 }
				
				
				figuras.put(key, valores);
				ci++;
				
			}
			if (key.equalsIgnoreCase("ELIPSE")) {
				Double radio1Elipse= Double.parseDouble(datos[1]);
				Double radio2Elipse= Double.parseDouble(datos[2]);	
				Double xElipse= Double.parseDouble(datos[3]);
				Double yElipse= Double.parseDouble(datos[4]);
				Elipse elipse = new Elipse(radio1Elipse,radio2Elipse,xElipse,yElipse);
				ArrayList<Double> valores=new ArrayList<Double>();
				valores.add(radio1Elipse);
				valores.add(radio2Elipse);
				valores.add(xElipse);
				valores.add(yElipse);
				if(figuras.containsKey(key)) {
					 key="ELIPSE"+String.valueOf(e);
					 
				 }
				
				
				figuras.put(key, valores);
				e++;
			}
			
			
		}
		
	}
	
	public void setGrandote (String archivo) throws FileNotFoundException {
		
	           
		        grandotes =new HashMap<String, ArrayList<Double>>();
		        areas= new HashMap<String, ArrayList<Double>>();
				Scanner sc = new Scanner(new File(archivo));
				
				Cuadrado auxC= new Cuadrado(0,0,0);
				Rectangulo auxR= new Rectangulo(0,0,0,0);
				Circulo auxCi= new Circulo(0,0,0);
				Elipse auxE= new Elipse(0,0,0,0);
				Segmento auxS = new Segmento(0,0,0,0);
				Triangulo auxT = new Triangulo(0,0,0,0,0,0);
				ArrayList<Double> listaOrdCuad = new ArrayList<Double>();
				ArrayList<Double> listaOrdRec = new ArrayList<Double>();
				ArrayList<Double> listaOrdCir = new ArrayList<Double>();
				ArrayList<Double> listaOrdElip = new ArrayList<Double>();
				ArrayList<Double> listaOrdTriang = new ArrayList<Double>();
				
				
				while (sc.hasNext()) {
					String[] datos = sc.nextLine().split(",");
					String key = datos[0];
					
					
					if(key.equals("CUADRADO")){	
						ArrayList<Double> valores=new ArrayList<Double>();
						
						Double ladoCuadrado = Double.parseDouble(datos[1]);
						Double xCuadrado= Double.parseDouble(datos[2]);
						Double yCuadrado= Double.parseDouble(datos[3]);
						Cuadrado cuadrado = new Cuadrado(ladoCuadrado,xCuadrado,yCuadrado);
						if(cuadrado.compareTo(auxC)==1) {
							
							auxC=cuadrado;
							
							valores.add(ladoCuadrado);
							valores.add(xCuadrado);
							valores.add(yCuadrado);

							grandotes.put(key, valores);
							
						}
						
					    
					
						listaOrdCuad.add(cuadrado.getArea());
						Comparator<Object> comparador = Collections.reverseOrder();
						Collections.sort(listaOrdCuad, comparador);
						
						
						areas.put(key, listaOrdCuad);
					}
					
					if(key.equalsIgnoreCase("RECTANGULO")) {
						Double x1Rectangulo= Double.parseDouble(datos[1]);
						Double y1Rectangulo= Double.parseDouble(datos[2]);	
						Double x2Rectangulo= Double.parseDouble(datos[3]);
						Double y2Rectangulo= Double.parseDouble(datos[4]);	
						Rectangulo rectangulo = new Rectangulo (x1Rectangulo,y1Rectangulo,x2Rectangulo,y2Rectangulo);
						ArrayList<Double> valores=new ArrayList<Double>();
                        if(rectangulo.compareTo(auxR)==1) {
							
							auxR=rectangulo;
							
							valores.add(x1Rectangulo);
							valores.add(y1Rectangulo);
							valores.add(x2Rectangulo);
							valores.add(y2Rectangulo);
							
							grandotes.put(key, valores);
						}
                        
                        listaOrdRec.add(rectangulo.getArea());
						Comparator<Object> comparador = Collections.reverseOrder();
						Collections.sort(listaOrdRec, comparador);
						
						
						areas.put(key, listaOrdRec);
						
						
					
						
						
					}
					if (key.equalsIgnoreCase("SEGMENTO")) {
						Double x1Segmento= Double.parseDouble(datos[1]);
						Double y1Segmento= Double.parseDouble(datos[2]);	
						Double x2Segmento= Double.parseDouble(datos[3]);
						Double y2Segmento= Double.parseDouble(datos[4]);
						Segmento segmento = new Segmento (x1Segmento, y1Segmento,x2Segmento,y2Segmento);
						ArrayList<Double> valores=new ArrayList<Double>();
                            if(segmento.compareTo(auxS)==1) {
							
							auxS=segmento;
							
							valores.add(x1Segmento);
							valores.add(y1Segmento);
							valores.add(x2Segmento);
							valores.add(y2Segmento);
							
							grandotes.put(key, valores);
						}
					
						
						
					
						
						
					}
					if (key.equalsIgnoreCase("TRIANGULO")) {
						Double x1Triangulo= Double.parseDouble(datos[1]);
						Double y1Triangulo= Double.parseDouble(datos[2]);	
						Double x2Triangulo= Double.parseDouble(datos[3]);
						Double y2Triangulo= Double.parseDouble(datos[4]);
						Double x3Triangulo= Double.parseDouble(datos[5]);
						Double y3Triangulo= Double.parseDouble(datos[6]);
						Triangulo triangulo = new Triangulo (x1Triangulo,y1Triangulo,x2Triangulo,y2Triangulo,x3Triangulo,y3Triangulo);
						ArrayList<Double> valores=new ArrayList<Double>();
						 if(triangulo.compareTo(auxT)==1) {
								
								auxT=triangulo;
								
								valores.add(x1Triangulo);
								valores.add(y1Triangulo);
								valores.add(x2Triangulo);
								valores.add(y2Triangulo);
								valores.add(x3Triangulo);
								valores.add(y3Triangulo);
								
								grandotes.put(key, valores);
							}
						
						 listaOrdTriang.add(triangulo.getArea());
							Comparator<Object> comparador = Collections.reverseOrder();
							Collections.sort(listaOrdTriang, comparador);
							
							
							areas.put(key, listaOrdTriang);
						
						
					
						
					}
					if(key.equalsIgnoreCase("CIRCULO")) {
						Double radioCirculo = Double.parseDouble(datos[1]);
						Double xCirculo= Double.parseDouble(datos[2]);
						Double yCirculo= Double.parseDouble(datos[3]);	
						Circulo circulo = new Circulo(radioCirculo,xCirculo,yCirculo);
						ArrayList<Double> valores=new ArrayList<Double>();
						if(circulo.compareTo(auxCi)==1) {
								
								auxCi=circulo;
								
								valores.add(radioCirculo);
								valores.add(xCirculo);
								valores.add(yCirculo);
								
								grandotes.put(key, valores);
							}
						
						listaOrdCir.add(circulo.getArea());
						Comparator<Object> comparador = Collections.reverseOrder();
						Collections.sort(listaOrdCir, comparador);
						
						
						areas.put(key, listaOrdCir);
						
						
						
						
						
					}
					if (key.equalsIgnoreCase("ELIPSE")) {
						Double radio1Elipse= Double.parseDouble(datos[1]);
						Double radio2Elipse= Double.parseDouble(datos[2]);	
						Double xElipse= Double.parseDouble(datos[3]);
						Double yElipse= Double.parseDouble(datos[4]);
						Elipse elipse = new Elipse(radio1Elipse,radio2Elipse,xElipse,yElipse);
						ArrayList<Double> valores=new ArrayList<Double>();
						if(elipse.compareTo(auxE)==1) {
							
							auxE=elipse;
							
							valores.add(radio1Elipse);
							valores.add(radio2Elipse);
							valores.add(xElipse);
							valores.add(yElipse);
							
							grandotes.put(key, valores);
						}
						
						listaOrdElip.add(elipse.getArea());
						Comparator<Object> comparador = Collections.reverseOrder();
						Collections.sort(listaOrdElip, comparador);
						
						
						areas.put(key, listaOrdElip);
						
						
						
					
					}
					
					
				}
				
			
	
	}
	
	
		
		
	public void getSalidaGrandotes() throws IOException {
		Iterator<Map.Entry<String, ArrayList<Double>>> itr = this.grandotes.entrySet().iterator();
	    FileWriter  archivo= new FileWriter(new File("C:\\Users\\End\\eclipse-workspace\\ProyectoGeometria\\src\\grandote.out"));
		PrintWriter salida = new PrintWriter(archivo);
		
		while (itr.hasNext()) {
			Map.Entry<String, ArrayList<Double>> entry = itr.next();
			System.out.println(entry.getKey() +" "+entry.getValue());
			salida.println(entry.getKey() + " " + entry.getValue());
		
		}
		salida.close();
	}
	public void getSalidaParalelos() throws IOException {
		Iterator<Map.Entry<String, ArrayList<Double>>> itr = this.paralelos.entrySet().iterator();
	    FileWriter  archivo= new FileWriter(new File("C:\\Users\\End\\eclipse-workspace\\ProyectoGeometria\\src\\paralelos.out"));
		PrintWriter salida = new PrintWriter(archivo);
		
		while (itr.hasNext()) {
			Map.Entry<String, ArrayList<Double>> entry = itr.next();
			System.out.println(entry.getKey() +" "+entry.getValue());
			salida.println(entry.getKey() + " " + entry.getValue());
		
		}
		salida.close();
	}
	public void getSalidaPorArea() throws IOException {
		Iterator<Map.Entry<String, ArrayList<Double>>> itr = this.areas.entrySet().iterator();
	    FileWriter  archivo= new FileWriter(new File("C:\\Users\\End\\eclipse-workspace\\ProyectoGeometria\\src\\figuras.out"));
		PrintWriter salida = new PrintWriter(archivo);
		
		while (itr.hasNext()) {
			Map.Entry<String, ArrayList<Double>> entry = itr.next();
			System.out.println(entry.getKey() +"\n"+entry.getValue());
			salida.println(entry.getKey() + "\n" + entry.getValue());
		
		}
		salida.close();
	}
		

	public static void main (String [] arg) throws IOException {
		
		Funcional funcional = new Funcional("C:\\Users\\End\\eclipse-workspace\\ProyectoGeometria\\src\\input.csv");
		
		funcional.getSalidaGrandotes();
		funcional.getSalidaParalelos();
		funcional.getSalidaPorArea();
	}
}