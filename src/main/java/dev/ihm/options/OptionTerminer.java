package dev.ihm.options;

import org.springframework.stereotype.Component;

import dev.exception.PlatException;
@Component
public class OptionTerminer implements IOptionMenu {
    @Override
    public String getTitre() {
        return "Terminer";
    }

    @Override
    public void executer() {
        throw new PlatException("Aurevoir");
    }

	/* (non-Javadoc)
	 * @see dev.ihm.options.IOptionMenu#isTerminate()
	 */
	@Override
	public boolean isTerminate() {
		return true;
	}
   
    
}
