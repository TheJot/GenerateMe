/*
 * generated by Xtext 2.20.0
 */
package uk.juliusz.generateme.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class GenerateMeAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("uk/juliusz/generateme/parser/antlr/internal/InternalGenerateMe.tokens");
	}
}
