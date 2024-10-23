package iyanprogrammer.CRUD_spring.service;

// Mengimpor kelas-kelas yang diperlukan dari model, repository, dan Spring Framework.
import iyanprogrammer.CRUD_spring.model.Product;
import iyanprogrammer.CRUD_spring.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // Menandai kelas ini sebagai service di Spring, yang berfungsi sebagai lapisan logika bisnis dalam aplikasi.
public class ProductService {

    @Autowired // Menyuntikkan dependensi ProductRepository ke dalam ProductService secara otomatis.
    private ProductRepository repository;

    // Metode untuk mendapatkan semua produk dari database.
    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    // Metode untuk menyimpan produk baru atau memperbarui produk yang sudah ada.
    public void saveProduct(Product product) {
        if (product.getName() == null || product.getName().trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty"); // Memvalidasi bahwa nama produk tidak kosong atau null.
        }

        repository.save(product); // Menyimpan produk ke database.
    }

    // Metode untuk menghapus produk berdasarkan ID.
    public void deleteProduct(Long id) {
        repository.deleteById(id); // Menghapus produk dari database berdasarkan ID.
    }

    // Memperbarui ID produk setelah penghapusan
    private void updateProductIds() {
        List<Product> products = getAllProducts();
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            product.setId((long) (i + 1)); // Atur ID berurutan dari 1
            repository.save(product); // Simpan perubahan
        }
    }

    // Metode untuk mendapatkan produk berdasarkan ID.
    public Product getProductById(Long id) {
        Optional<Product> product = repository.findById(id); // Mencari produk berdasarkan ID.
        if (product.isPresent()) { // Memeriksa apakah produk ditemukan.
            return product.get(); // Mengembalikan produk jika ditemukan.
        } else {
            throw new IllegalArgumentException("Product not found with id: " + id); // Melempar exception jika produk tidak ditemukan.
        }
    }
}
