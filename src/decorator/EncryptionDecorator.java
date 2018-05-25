package decorator;

public class EncryptionDecorator extends DataSourceDecorator {
    
    public EncryptionDecorator(DataSource source) {
        super(source);
    }
    
    @Override
    public void writeData(String data) {
        // Encrypt data and send to super
        super.wrappee.writeData(data);
    }

    @Override
    public String readData() {
        // Decrypt data
        return super.wrappee.readData();
    }
    
}
