/*
* generated by Xtext
*/
package at.ac.tuwien.big.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class QuestionnaireAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.tokens");
	}
}