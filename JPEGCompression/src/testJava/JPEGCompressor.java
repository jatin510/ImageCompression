/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testJava;

import java.awt.image.RenderedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageOutputStream;
import javax.imageio.stream.MemoryCacheImageOutputStream;

/**
 *
 * @author Jatin
 */
public class JPEGCompressor {
    
    public static void main(String[] args) {
        //File originalImage = new File("C:\\Users\\Jatin\\Desktop\\Fuck.jpeg");
        //File compressedImage = new File("C:\\Users\\Jatin\\Desktop\\Compressed.jpeg");
        
        /*
        try{
            compressJPEGImage(originalImage,compressedImage,0.5f);
            System.out.println("done");
        }
        catch(IOException e){
            e.printStackTrace();
            
        }
        */
    }
    
    public static int compressJPEGImage(File originalImage, File compressedImage, float compressionQuality,String extension)throws IOException{
        
        RenderedImage image = ImageIO.read(originalImage);
        ImageWriter jpegWriter = ImageIO.getImageWritersByFormatName(extension).next();
        ImageWriteParam jpegWriteParam = jpegWriter.getDefaultWriteParam();
        jpegWriteParam.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
        jpegWriteParam.setCompressionQuality(compressionQuality);
        
        try(ImageOutputStream output = ImageIO.createImageOutputStream(compressedImage)){
            jpegWriter.setOutput(output);
            IIOImage outputImage = new IIOImage(image,null,null);
            jpegWriter.write(null,outputImage,jpegWriteParam);
            
        }
        
        catch(Exception e){
            e.printStackTrace();
            return -1;
        }
        jpegWriter.dispose();
        
        return 1;
        
    }
    
}
