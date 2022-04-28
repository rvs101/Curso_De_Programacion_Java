package sooper.supermercado;

import sooper.alimentacion.Higienes;
import sooper.alimentacion.IProductos;
import sooper.alimentacion.descendientes.Congelados;
import sooper.alimentacion.descendientes.Frescos;
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
//      Hacer Pedidos 
//      Interface implementa la clase concreta Pedido
//	    Interface   obj          Clase concreta
		IPedidos miPedido = new Pedidos("pedido001");

// Interface implementa la clase hija : Bolsa
//	    Interface      obj         Clase Hija
		IContenedores bolsa1 = new Bolsas("B111", 40, 25);

// Interface implementa la clase hija : Caja
//	    Interface      obj        Clase Hija
		IContenedores caja1 = new Cajas("C222", 30, 50, 75);

		// Añadir objeto del tipo bolsa dentro de la colección de objetos de tipo contenedores
//		"objeto contenedor" añade en la "posición 0" → un objeto de "tipo bolsa1"
		miPedido.addContenedores(bolsa1);
		// Añadir objeto del tipo caja dentro de la colección
//		"objeto contenedor" añade en la "posición 1" → un objeto de "tipo caja1"
		miPedido.addContenedores(caja1);

//2º	Añadir Productos
//		Interface objeto         Clase Hija(Implementación)
		IProductos manzanas = new Frescos("MNZ", 1000, 1500);
		IProductos helado = new Congelados("HLD", 800, 1000);
		IProductos papelWC = new Higienes("PWC", 500, 2500);
		IProductos peras = new Frescos("PER", 800, 1000);

//3º 	Añadir Pedido y Contenedor del pedido
//		Interface objeto           = objeto del "tipo Pedido" que instancia un objeto de tipo colección contenedor
//		                                ↓     Metodo de la Interface Pedido que implementa la Clase Pedido que almacena 
//		                                ↓     un objeto del tipo Contenedor 
		IContenedores contManzanas = miPedido.addProductos(manzanas);
		IContenedores contHelado = miPedido.addProductos(helado);
		IContenedores contPapel = miPedido.addProductos(papelWC);
		IContenedores contPeras = miPedido.addProductos(peras);

		System.out.println("♦ SuperMercado ♦ ");

	}
}
