# Tip Time

Aplicación Android con Jetpack Compose para calcular una propina personalizada.

## Funciones

- Captura el importe de la cuenta.
- Permite elegir cualquier porcentaje de propina.
- Usa acciones Siguiente y Listo en el teclado.
- Redondea opcionalmente la propina al entero superior.
- Conserva acceso al contenido en orientación horizontal mediante desplazamiento vertical.

## Abrir y probar

1. Abre esta carpeta desde Android Studio.
2. Espera a que termine la sincronización de Gradle.
3. Selecciona un emulador o teléfono Android.
4. Ejecuta la configuración `app`.
5. Prueba, por ejemplo, una cuenta de 100 con 15 por ciento: el resultado debe ser 15.00. Activa el redondeo con una cuenta de 57.25 y 18 por ciento: 10.305 debe mostrarse como 11.00.

## Historial

El repositorio incluye commits separados para la base, el porcentaje personalizado y las mejoras de redondeo, teclado y orientación.
