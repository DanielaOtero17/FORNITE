package modelo;

public interface Queue_Players{
	
	public int longitud();
	public boolean isVAcia();
    public void encolar(Object o);
    public Object desencolar();
    public Object cabezera();
    
}
