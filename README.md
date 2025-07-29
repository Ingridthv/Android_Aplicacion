# 📱 Android Aplicación
**Integrante:**  
- **Ingrid Arcadio Aparicio** – Desarrolladora principal y diseñadora de interfaz

---

## 📌 ¿Qué hace la aplicación?

La aplicación **Android Aplicación** es una herramienta educativa diseñada para dispositivos móviles Android. Consiste en un portafolio de 10 ejercicios prácticos, cada uno enfocado en el dominio de un componente o interacción específica en Android.  
Desde acciones básicas como cambiar texto o colores, hasta el manejo de listas, formularios, controles deslizantes y botones dinámicos, esta app demuestra habilidades fundamentales en la programación de interfaces gráficas usando Java y XML.

Todo el contenido se encuentra accesible desde un menú principal, lo que facilita la navegación entre actividades y permite ejecutar cada ejercicio directamente desde el teléfono móvil.

---

## 💻 Tipo de sistema

**Proyecto Móvil en Java (Android Studio)**

---

## 🧰 Librerías externas implementadas

La versión actual del proyecto no incluye librerías externas adicionales, pero está preparado para integrar fácilmente herramientas como:

- `Glide` – Para la carga y visualización eficiente de imágenes.
- `Retrofit` – Para consumir servicios REST.
- `Material Components` – Para aplicar diseño moderno y responsivo.

Estas dependencias pueden declararse dentro del archivo `build.gradle`.

---

## 🧾 Instrucciones Generales

### Pantalla de inicio (LoginActivity):
![Login](https://github.com/Ingridthv/Android_Aplicacion/raw/main/imagenes/lo1.jpeg)
> Interfaz de acceso con campos de correo y contraseña.
![Login](https://github.com/Ingridthv/Android_Aplicacion/raw/main/imagenes/lo2.jpeg)

### Pantalla principal (MainActivity):

![Login](https://github.com/Ingridthv/Android_Aplicacion/raw/main/imagenes/boton.jpeg)
> Interfaz de navegación con botones para cada ejercicio.


### Pantalla de inicio (LoginActivity):
- Solicita dos campos: **correo electrónico** y **contraseña**.
- El acceso solo será permitido si:
  - El correo ingresado es exactamente: `tap2025@example.com`
  - La contraseña es exactamente: `tap*2025`
- Si los datos no coinciden, se mostrará un **mensaje de error** y **no se permitirá el acceso** a la aplicación.

### Pantalla principal (MainActivity):
- Una vez autenticado, se despliega una interfaz con **10 botones** (o componentes visuales equivalentes como `CardView`, `ImageButton`, etc.).
- Cada botón está etiquetado de forma clara como: **“Ejercicio 1”**, **“Ejercicio 2”**, ..., hasta **“Ejercicio 10”**.
- Al presionar cualquiera de los botones, el usuario será dirigido a la actividad correspondiente con la funcionalidad desarrollada.

---

## 📂 Ejercicios incluidos

> Esta sección detalla las funcionalidades clave de cada uno de los 10 ejercicios integrados en la aplicación. Cada ejercicio fue diseñado para demostrar el dominio de diferentes componentes gráficos y técnicas de interacción en Android:

1. **Ejercicio 1 – Cambio de texto en una etiqueta**  
   Permite modificar dinámicamente el texto de una `TextView` al interactuar con un botón. Introduce al usuario en la manipulación básica de elementos de interfaz.
![Login](https://github.com/Ingridthv/Android_Aplicacion/raw/main/imagenes/ima1.jpeg)

2. **Ejercicio 2 – Cambio de color de fondo con un botón**  
   Demuestra cómo cambiar el color de fondo de un layout de forma dinámica mediante eventos de clic. Enseña el control visual básico de la UI.
   
![Login](https://github.com/Ingridthv/Android_Aplicacion/raw/main/imagenes/ima2.jpeg)

![Login](https://github.com/Ingridthv/Android_Aplicacion/raw/main/imagenes/ima2(1).jpeg)

4. **Ejercicio 3 – Selección de deportes con CheckBoxes**  
   Presenta una lista de deportes mediante `CheckBox` y permite al usuario seleccionar múltiples opciones. Las selecciones se reflejan en una etiqueta, promoviendo la gestión de entradas múltiples.
![Login](https://github.com/Ingridthv/Android_Aplicacion/raw/main/imagenes/ima3.jpeg)

5. **Ejercicio 4 – Método de pago con RadioButtons**  
   Simula un formulario de pago donde el usuario elige un método entre varias opciones exclusivas usando `RadioButton`. La elección se muestra claramente como confirmación.
![Login](https://github.com/Ingridthv/Android_Aplicacion/raw/main/imagenes/ima4.jpeg)

6. **Ejercicio 5 – Selección de ciudad desde una lista**  
   Utiliza un componente `ListView` para mostrar una lista de ciudades. Al seleccionar una opción, esta se presenta en una etiqueta, fortaleciendo el uso de listas interactivas.
![Login](https://github.com/Ingridthv/Android_Aplicacion/raw/main/imagenes/ima5.jpeg)

7. **Ejercicio 6 – Transferencia de cursos entre dos listas**  
   Implementa dos listas junto con botones para permitir al usuario mover cursos entre ambas. Enseña el control y actualización dinámica del contenido de múltiples listas.
![Login](https://github.com/Ingridthv/Android_Aplicacion/raw/main/imagenes/ima6.jpeg)

8. **Ejercicio 7 – Selección de sistema operativo con ComboBox**  
   Muestra una lista desplegable (`ComboBox`) para seleccionar un sistema operativo. Al elegir una opción, se actualiza una etiqueta con la información seleccionada.
![Login](https://github.com/Ingridthv/Android_Aplicacion/raw/main/imagenes/ima7.jpeg)

9. **Ejercicio 8 – Control de volumen con Slider**  
   Emplea un `SeekBar` que permite al usuario ajustar un nivel de volumen. El valor actual se refleja en tiempo real, ejemplificando la retroalimentación dinámica de entrada.
![Login](https://github.com/Ingridthv/Android_Aplicacion/raw/main/imagenes/ima8.jpeg)

10. **Ejercicio 9 – Uso de ToggleButtons**  
   Introduce los `ToggleButton`, que mantienen su estado activado o desactivado. Permite evaluar si están seleccionados y controlarlos mediante programación (`isSelected`, `setSelected`).
![Login](https://github.com/Ingridthv/Android_Aplicacion/raw/main/imagenes/ima9.jpeg)

11. **Ejercicio 10 – Manipulación numérica con Spinner**  
    Utiliza un `JSpinner` con modelo numérico (`SpinnerNumberModel`) para seleccionar valores dentro de un rango definido. Permite establecer valores mínimos, máximos e incrementos personalizados.
![Login](https://github.com/Ingridthv/Android_Aplicacion/raw/main/imagenes/ima10.jpeg)

---

## 🛠️ Requisitos Técnicos

- **Mínimo SDK requerido:** API 24 (Android 7.0 Nougat) o superior  
- **Lenguaje:** Java  
- **IDE:** Android Studio (Arctic Fox o superior recomendado)

**Buenas prácticas aplicadas:**

- Variables descriptivas y autoexplicativas
- Código limpio con comentarios relevantes
- Estructura modular basada en actividades independientes

---

## ⚙️ Pasos para instalar / ejecutar

1. Clona el repositorio:
   ```bash
   git clone https://github.com/Ingridthv/Android_Aplicacion 
   ```
2. Abre el proyecto en **Android Studio**
3. Espera a que finalice la sincronización de `Gradle`
4. Conecta tu dispositivo Android o emulador virtual
5. Haz clic en **Run ▶** para compilar y ejecutar la aplicación
6. Desde el menú principal, accede a cualquier ejercicio del portafolio

---

**📲 Observaciones finales**

- La aplicación está diseñada para evaluarse directamente en un celular físico Android.
- Cada ejercicio funciona como módulo independiente con propósito didáctico.
- La navegación es clara y el código fuente está debidamente estructurado y comentado.

---

_“Construyendo paso a paso con cada línea de código.”_ 🚀
