# Tarea Encuesta JavaFX

## Estudiante
Melany Brillith

## Descripción

Este proyecto consiste en una aplicación desarrollada en JavaFX que implementa una encuesta de 4 preguntas de opción múltiple. El sistema permite seleccionar respuestas, calcular automáticamente el puntaje obtenido y mostrar los resultados al usuario.

## Funcionalidades

- Encuesta con 4 preguntas.
- Selección de una respuesta por pregunta mediante RadioButton.
- Cálculo automático del puntaje.
- Visualización de respuestas correctas e incorrectas.
- Botón para cerrar la aplicación.

## Regla de Calificación

- Respuesta correcta: 5 puntos.
- Respuesta incorrecta: 0 puntos.
- Puntaje máximo: 20 puntos.

## Tecnologías Utilizadas

- Java
- JavaFX
- Scene Builder
- Maven
- IntelliJ IDEA

## Estructura del Proyecto

### Archivos principales

- `Encuesta.fxml`
  - Contiene la interfaz gráfica de la encuesta.

- `EncuestaController.java`
  - Gestiona los eventos y realiza el cálculo del puntaje.

- `MainApp.java`
  - Clase principal encargada de iniciar la aplicación.

## Funcionamiento

1. El usuario responde las 4 preguntas.
2. Presiona el botón **Calcular Puntaje**.
3. El sistema verifica las respuestas seleccionadas.
4. Se calcula el puntaje total.
5. Se muestran:
   - Puntaje obtenido.
   - Número de respuestas correctas.
   - Número de respuestas incorrectas.
6. El usuario puede cerrar la aplicación mediante el botón **Salir**.
