# Simulador de Cafetería ☕ – Proyecto de Patrones de Diseño

## Descripción del sistema

Este proyecto simula una cafetería por consola donde se pueden preparar bebidas, clonar pedidos, recibir notificaciones y aceptar pedidos desde sistemas externos. Se enfoca en mostrar la aplicación práctica de 4 patrones de diseño.

## Problema a resolver

Simular la gestión de una cafetería moderna que necesita:
- Centralizar la preparación de pedidos (Singleton)
- Aceptar pedidos de otras apps (Adapter)
- Notificar clientes cuando el pedido está listo (Observer)
- Clonar pedidos similares sin crear uno nuevo desde cero (Prototype)

## Patrones implementados

### 1. Singleton (Creacional)
**Clase:** `Cafeteria`  
Permite que exista una sola instancia de cafetería. Todos los pedidos pasan por esa instancia centralizada.

### 2. Adapter (Estructural)
**Clases:** `PedidoExterno`, `AdaptadorPedidoExterno`  
Convierte objetos de una fuente externa en objetos válidos del sistema (`Pedido`).

### 3. Observer (Comportamiento)
**Clases:** `Notificador`, `Observer`, `ClienteObservador`  
Permite que los clientes reciban mensajes cuando su pedido está listo.

### 4. Prototype (Libre elección)
**Clases:** `Pedido`, `Cafe`, `Latte`  
Permite clonar un pedido existente sin volver a crearlo desde cero.

## Instrucciones para compilar y ejecutar

1. Abre una terminal o consola en la carpeta raíz del proyecto (donde está la carpeta `src/`)
2. Compila el código con:

   ```bash
   javac -d out src/app/Main.java
   ```

3. Ejecuta el programa con:

   ```bash
   java -cp out app.Main
   ```

> Asegúrate de tener Java instalado (versión 8 o superior) y que esté en el PATH del sistema.

---
