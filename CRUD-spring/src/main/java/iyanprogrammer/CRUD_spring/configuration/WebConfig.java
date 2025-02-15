package iyanprogrammer.CRUD_spring.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// Menandai kelas ini sebagai kelas konfigurasi Spring.
@Configuration
// Mengimplementasikan antarmuka WebMvcConfigurer untuk menyesuaikan konfigurasi Spring MVC.
public class WebConfig implements WebMvcConfigurer {

    // Menimpa (override) metode addResourceHandlers untuk menambahkan konfigurasi penanganan sumber daya statis.
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // Menambahkan pengaturan untuk menangani semua permintaan (/**) dengan sumber daya yang disimpan di folder "static".
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/static/");
    }
}
