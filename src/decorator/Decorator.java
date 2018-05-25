package decorator;

public class Decorator {

    public static void main(String[] args) {
        DataSource source = new FileDataSource("myFile.dat");
        source.writeData("Data");
        
        source = new CompressionDecorator(source);
        source.writeData("Compressed data");
        
        source = new EncryptionDecorator(source);
        source.writeData("Encrypted data");
    }

}
