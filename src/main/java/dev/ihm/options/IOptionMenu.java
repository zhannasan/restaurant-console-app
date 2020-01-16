package dev.ihm.options;

public interface IOptionMenu {
    String getTitre();

    void executer();
    
    default boolean isTerminate(){
    	return false;
    };
}
