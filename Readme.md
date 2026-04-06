### 🐳 Construcción de Imágenes Docker (Importante)

Este proyecto utiliza una arquitectura multi-módulo de Maven. Esto significa que los microservicios dependen del `pom.xml` padre (ubicado en la raíz) y de la librería compartida (`common-lib`).

Por este motivo, **el contexto de construcción de Docker siempre debe ser la raíz del proyecto**, incluso si estás construyendo el Dockerfile de un microservicio específico. Si limitas el contexto solo a la carpeta del microservicio, Maven fallará porque no podrá encontrar el POM padre ni las dependencias comunes.

#### 💻 Construcción manual por Consola (CLI)
Si vas a construir la imagen manualmente en tu terminal, asegúrate de estar posicionado en la carpeta raíz del proyecto (`ddsi-tp-template`) y ejecuta el comando pasando el archivo `-f` específico, pero dejando el contexto `.` al final:

```bash
# Ejemplo para donaciones-service:
# Nota el "." al final, indicando que el contexto es la raíz.
docker build -t donaciones-img -f donaciones-service/Dockerfile .