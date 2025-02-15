package iyanprogrammer.CRUD_spring.controller;

import iyanprogrammer.CRUD_spring.model.Product;
import iyanprogrammer.CRUD_spring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller // Menandai kelas ini sebagai Spring MVC Controller.
@RequestMapping("/products") // Menetapkan prefix "/products" untuk semua route di dalam controller ini.
public class ProductController {

    @Autowired // Menyuntikkan dependency dari ProductService ke dalam controller ini.
    private ProductService service;

    // Metode untuk menambahkan produk baru.
    @PostMapping // Menangani permintaan HTTP POST ke URL "/products".
    public String addProduct(@ModelAttribute Product product, BindingResult result) {

        // Memeriksa apakah ada error dalam validasi data yang dikirimkan.
        if (result.hasErrors()) {
            // Jika ada error, kembali ke halaman "products" (misalnya untuk memperbaiki input).
            return "products";
        }
        // Jika tidak ada error, simpan produk melalui ProductService.
        service.saveProduct(product);
        // Redirect ke halaman "/products" setelah produk berhasil disimpan.
        return "redirect:/products";

    }

    // Metode untuk memperbarui produk yang sudah ada.
    @PostMapping("/{id}") // Menangani permintaan HTTP POST ke URL "/products/{id}".
    public String updateProduct(@PathVariable Long id, @ModelAttribute Product product, Model model) {

        // Memeriksa apakah nama produk kosong atau tidak.
        if (product.getName() == null || product.getName().trim().isEmpty()) {
            // Jika nama produk kosong, tambahkan pesan error dan kembalikan ke halaman "editProduct".
            model.addAttribute("error", "Name cannot be empty");
            model.addAttribute("product", product);
            return "editProduct";
        }
        // Jika validasi sukses, atur ID produk yang akan diperbarui.
        product.setId(id);
        // Simpan perubahan produk melalui ProductService.
        service.saveProduct(product);
        // Redirect ke halaman "/products" setelah produk berhasil diperbarui.
        return "redirect:/products";

    }

    @GetMapping("/{id}/edit")
    public String editProduct(@PathVariable Long id, Model model) {
        Product product = service.getProductById(id); // Mengambil produk berdasarkan ID
        model.addAttribute("product", product); // Mengirimkan data produk ke view
        return "editProduct"; // Mengembalikan nama template untuk ditampilkan
    }


    // Metode untuk menghapus produk.
    @PostMapping("/{id}/delete") // Menangani permintaan HTTP POST ke URL "/products/{id}/delete".

    public String deleteProduct(@PathVariable Long id) {

        // Hapus produk berdasarkan ID yang diberikan melalui ProductService.
        service.deleteProduct(id);
        // Redirect ke halaman "/products" setelah produk berhasil dihapus.
        return "redirect:/products";

    }

    @GetMapping
    public String listProducts(Model model) {

        model.addAttribute("products", service.getAllProducts());
        return "products";

    }


}
