import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class ProductManager {
    private final Path productsPath;

    public ProductManager() throws URISyntaxException{
        ClassLoader classLoader = ProductManager.class.getClassLoader();
       productsPath = Paths.get(Objects.requireNonNull(classLoader.getResource("products.txt")).toURI());
    }



    public List<String> getAllProducts() throws  IOException {

       return Files.readAllLines(productsPath, StandardCharsets.UTF_8);
    }

    public void addProduct(String product) throws  IOException {
        HashSet<String> products = new HashSet<>(getAllProducts());

        if(!products.contains(product)){
            Files.writeString(productsPath,System.lineSeparator() + product, StandardOpenOption.APPEND);
        } else {
            System.out.println("Produkt już dodany");
        }
    }
}
