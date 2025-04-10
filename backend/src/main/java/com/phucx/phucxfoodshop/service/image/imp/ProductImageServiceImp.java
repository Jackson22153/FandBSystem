package com.phucx.phucxfoodshop.service.image.imp;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.phucx.phucxfoodshop.config.FileProperties;
import com.phucx.phucxfoodshop.exceptions.NotFoundException;
import com.phucx.phucxfoodshop.model.entity.CurrentProduct;
import com.phucx.phucxfoodshop.model.entity.ExistedProduct;
import com.phucx.phucxfoodshop.model.entity.Product;
import com.phucx.phucxfoodshop.model.entity.ProductDetail;
import com.phucx.phucxfoodshop.service.image.ProductImageService;
import com.phucx.phucxfoodshop.utils.ImageUtils;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ProductImageServiceImp implements ProductImageService{
    @Autowired
    private FileProperties fileProperties;
    @Value("${spring.application.name}")
    private String serverName;

    private final String imageUri = "/api/v1/image/product";

    @Override
    public byte[] getProductImage(String imageName) throws IOException {
        log.info("getProductImage({})", imageName);
        return ImageUtils.getImage(imageName, fileProperties.getProductImageLocation());
    }

    @Override
    public String uploadProductImage(MultipartFile file) throws IOException, NotFoundException {
        log.info("uploadProductImage({})", file);
        return ImageUtils.uploadImage(file, fileProperties.getProductImageLocation());
    }

    @Override
    public String getProductMimeType(String file) throws IOException {
        log.info("getProductMimeType({})", file);
        return ImageUtils.getMimeType(file, fileProperties.getProductImageLocation());
    }

    @Override
    public List<Product> setProductsImage(List<Product> products) {
        products.forEach(product ->{
            if(product.getPicture()!=null && !product.getPicture().isEmpty()){
                String picture = product.getPicture();
                // setting image with image uri
                String uri = "/" + serverName + imageUri;
                if(!picture.contains(uri)){
                    product.setPicture(uri + "/" + product.getPicture());
                }
            }
        });
        return products;
    }

    @Override
    public Product setProductImage(Product product) {
        // filtering product 
        if(!(product.getPicture()!=null && !product.getPicture().isEmpty())) return product;
        // product has image
        String picture = product.getPicture();
        // setting image with image uri
        String uri = "/" + serverName + imageUri;
        if(!picture.contains(uri)){
            product.setPicture(uri + "/" + product.getPicture());
        }
        return product;
    }

    @Override
    public CurrentProduct setCurrentProductImage(CurrentProduct product) {
        // filtering product 
        if(!(product.getPicture()!=null && !product.getPicture().isEmpty())) return product;
        String picture = product.getPicture();
        // setting image with image uri
        String uri = "/" + serverName + imageUri;
        if(!picture.contains(uri)){
            product.setPicture(uri + "/" + product.getPicture());
        }
        return product;
    }

    @Override
    public List<CurrentProduct> setCurrentProductsImage(List<CurrentProduct> products) {
        products.forEach(product ->{
            if(product.getPicture()!=null && !product.getPicture().isEmpty()){
                String picture = product.getPicture();
                // setting image with image uri
                String uri = "/" + serverName + imageUri;
                if(!picture.contains(uri)){
                    product.setPicture(uri + "/" + product.getPicture());
                }
            }
        });
        return products;
    }

    @Override
    public ProductDetail setProductDetailImage(ProductDetail product) {
        // filtering product 
        if(!(product.getPicture()!=null && !product.getPicture().isEmpty())) return product;
        String picture = product.getPicture();
        // setting image with image uri
        String uri = "/" + serverName + imageUri;
        if(!picture.contains(uri)){
            product.setPicture(uri + "/" + product.getPicture());
        }
        return product;
    }

    @Override
    public List<ProductDetail> setProductDetailsImage(List<ProductDetail> products) {
        products.forEach(product ->{
            if(product.getPicture()!=null && !product.getPicture().isEmpty()){
                String picture = product.getPicture();
                // setting image with image uri
                String uri = "/" + serverName + imageUri;
                if(!picture.contains(uri)){
                    product.setPicture(uri + "/" + product.getPicture());
                }
            }
        });
        return products;
    }

    @Override
    public String getCurrentUrl(HttpServletRequest request) {
        String uri = request.getRequestURI();
        String url = request.getRequestURL().toString();
        String baseurl = url.substring(0, url.length()-uri.length());
        return baseurl + "/" + serverName +  imageUri;
    }

    @Override
    public ExistedProduct setExistedProductImage(ExistedProduct product) {
        // filtering product 
        if(!(product.getPicture()!=null && !product.getPicture().isEmpty())) return product;
        String picture = product.getPicture();
        // setting image with image uri
        String uri = "/" + serverName + imageUri;
        if(!picture.contains(uri)){
            product.setPicture(uri + "/" + product.getPicture());
        }
        return product;
    }

    @Override
    public List<ExistedProduct> setExistedProductsImage(List<ExistedProduct> products) {
        products.forEach(product ->{
            if(product.getPicture()!=null && !product.getPicture().isEmpty()){
                String picture = product.getPicture();
                // setting image with image uri
                String uri = "/" + serverName + imageUri;
                if(!picture.contains(uri)){
                    product.setPicture(uri + "/" + product.getPicture());
                }
            }
        });
        return products;
    }

    @Override
    public String getPictureUri(String imageName) {
        String uri = "/" + serverName + imageUri;
        return uri + "/" + imageName;
    }
    
}
