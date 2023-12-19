
public class SwaggerConfig{
    public Docket productApi(){
        return new Docket(DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors.withClassAnnotaion(RestController.class))
        .build();
    }
}