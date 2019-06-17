
java -cp gene-codegen/target/java-gene-swagger-codegen-1.0.0.jar:swagger-codegen/modules/swagger-codegen-cli/target/swagger-codegen-cli.jar \
  io.swagger.codegen.SwaggerCodegen generate \
  -l java-gene \
  -i ./open-api/web-oe.yaml \
  -o ./generated-code \
  -c ./config.json

