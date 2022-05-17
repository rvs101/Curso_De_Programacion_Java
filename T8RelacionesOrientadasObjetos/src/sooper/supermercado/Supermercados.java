package sooper.supermercado;

import sooper.alimentacion.Droguerias;
import sooper.alimentacion.Higienes;
import sooper.alimentacion.IProductos;
import sooper.alimentacion.Mascotas;
import sooper.alimentacion.descendientes.Congelados;
import sooper.alimentacion.descendientes.Frescos;
import sooper.alimentacion.descendientes.NoPerecederos;
import sooper.contenedores.Bolsas;
import sooper.contenedores.Cajas;
import sooper.contenedores.IContenedores;
import sooper.pedidos.IPedidos;
import sooper.pedidos.Pedidos;

/**
 * 
 * @author RVS
 * @time 25 abr 2022 - 14:22:07
 *
 */
public class Supermercados {

	public static void main(String[] args) {
		System.out.println("\t \t \t ♦ SuperMercado ♦ ");

//      Hacer Pedidos 
//      Interface implementa la clase concreta Pedido
//	    Interface   obj          Clase concreta
		IPedidos miPedido = new Pedidos("pedido001");

// Interface implementa la clase hija : Bolsa
//	    Interface      obj         Clase Hija
		IContenedores bolsa1 = new Bolsas("B111", 40, 25, 900);

// Interface implementa la clase hija : Caja
//	    Interface      obj        Clase Hija
		IContenedores caja1 = new Cajas("C222", 30, 50, 75);

		System.out.println("•• Bolsa: " + bolsa1);
		System.out.println("○○ Caja: " + caja1);

		// Añadir objeto del tipo bolsa dentro de la colección de objetos de tipo
		// contenedores
//		"objeto contenedor" añade en la "posición 0" → un objeto de "tipo bolsa1"
		miPedido.addContenedores(bolsa1);
		// Añadir objeto del tipo caja dentro de la colección
//		"objeto contenedor" añade en la "posición 1" → un objeto de "tipo caja1"
		miPedido.addContenedores(caja1);
//5º - Pag 205 - Caja Grande Comida De Gatos
		miPedido.addContenedores(new Cajas("C333", 50, 60, 75));

		System.out.println(" © Mi pedido con contenedores: " + miPedido);

//2º	Añadir Productos
//		Interface objeto         Clase Hija(Implementación)
		IProductos manzanas = new Frescos("MNZ", 1000, 1500);
		IProductos helados = new Congelados("HLD", 800, 1000);
		IProductos papelWCs = new Higienes("PWC", 500, 2500);
		IProductos peras = new Frescos("PER", 800, 1000);

//3º 	Añadir Pedido y Contenedor del pedido
//		Interface objeto           = objeto del "tipo Pedido" que instancia un objeto de tipo colección contenedor
//		                                ↓     Metodo de la Interface Pedido que implementa la Clase Pedido que almacena 
//		                                ↓     un objeto del tipo Contenedor 
		IContenedores contManzanas = miPedido.addProductos(manzanas);
		IContenedores contHelado = miPedido.addProductos(helados);
		IContenedores contPapel = miPedido.addProductos(papelWCs);
		IContenedores contPeras = miPedido.addProductos(peras);

//4º Pag 203 - 3 cajas y 3 bolsas
		System.out.println("\t \t \t ○ Nueva Lista de la Compra ○ ");

		for (int i = 0; i < 3; i++) {
			IContenedores cajas = new Cajas("C23" + i, 30, 40, 30);
			miPedido.addContenedores(cajas);
		}

		for (int i = 0; i < 5; i++) {
			IContenedores bolsas = new Bolsas("B12" + i, 3000, 30, 25);
			miPedido.addContenedores(bolsas);
		}

//4º Pag 203 - Otro productos

		for (int i = 0; i < 12; i++) {
			IProductos leches = new NoPerecederos("LCH" + i, 6600, 7000);
			miPedido.addProductos(leches);
		}

		miPedido.addProductos(new Mascotas("GAT", 5000, 10000)); // comida para gatos
		miPedido.addProductos(new Mascotas("PER1", 10000, 20000)); // comida para perros
		miPedido.addProductos(new Mascotas("PER2", 10000, 20000)); // comida para perros

		miPedido.addProductos(new Higienes("GEL", 1500, 1600)); // gel de ducha

		miPedido.addProductos(new Droguerias("DET", 2000, 1600)); // detergente lavadora
		miPedido.addProductos(new Droguerias("LEJ", 1000, 1000)); // lejía

		for (int i = 0; i < 24; i++) {
			miPedido.addProductos(new Frescos("YOG" + i, 250, 300)); // yogures
		}

		miPedido.addProductos(new NoPerecederos("ARR", 1000, 1000)); // arroz

		for (int i = 0; i < 5; i++) {
			miPedido.addProductos(new NoPerecederos("PAS" + i, 1000, 1200)); // pasta
		}

		System.out.println(" ® Mi pedido con productos : " + miPedido);

//		-------------------------------- Pruebas ------------------------------------------
//		Salida Por pantala de los objetos
//		System.out.println("Mi pedido con contenedores: " + miPedido);
//		System.out.println("Mi pedido con productos : " + miPedido);
//		
//		                                           Inteface IPedidos que paso a Pedidos al instanciar un objeto desde ella
//													  ↓	  Codigo Hexadecimal del código hash del objeto (id interno)		                                            
//		                                              ↓      ↓
//		Mi pedido con contenedores: sooper.pedidos.Pedidos@182decdb
//		Mi pedido con productos : sooper.pedidos.Pedidos@182decdb

	}
}
