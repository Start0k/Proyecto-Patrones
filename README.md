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
**Clases:** `Pedido`, `Cafe`  
Permite clonar un pedido existente sin volver a crearlo desde cero.

## Instrucciones para compilar y ejecutar

1. Abre el proyecto en NetBeans
2. Asegúrate de que el archivo `Main.java` esté en el paquete `app`
3. Haz clic derecho en `Main.java` y elige **Run File**
4. Deberías ver los mensajes de preparación y notificación en la consola

---
