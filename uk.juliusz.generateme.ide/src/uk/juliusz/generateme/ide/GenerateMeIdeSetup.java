/*
 * generated by Xtext 2.20.0
 */
package uk.juliusz.generateme.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import uk.juliusz.generateme.GenerateMeRuntimeModule;
import uk.juliusz.generateme.GenerateMeStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class GenerateMeIdeSetup extends GenerateMeStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new GenerateMeRuntimeModule(), new GenerateMeIdeModule()));
	}
	
}
