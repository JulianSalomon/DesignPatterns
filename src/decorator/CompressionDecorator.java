package decorator;

public class CompressionDecorator extends DataSourceDecorator {
    
    public CompressionDecorator(DataSource source) {
        super(source);
    }
    
    @Override
    public void writeData(String data) {
        // Compress data and send to super
        super.wrappee.writeData(data);
    }

    @Override
    public String readData() {
        // Decompress data
        return super.wrappee.readData();
    }
    
}
